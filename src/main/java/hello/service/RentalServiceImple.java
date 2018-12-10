package hello.service;

import hello.RentalRest;
import hello.tables.*;

import hello.tables.daos.RentalDao;
import hello.tables.pojos.Film;
import hello.tables.pojos.Rental;

import hello.tables.records.RentalRecord;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Component
public class RentalServiceImple extends AbstractService<Rental> {

    @Autowired
    DSLContext dsl;


    RentalDao rentalDao = new RentalDao(this.configuration);

    public RentalServiceImple() {
        super();
    }

       @Override
    public boolean save(Rental rental) {
        try {
            rentalDao.insert(rental);
        }catch(Exception p)
        {
            p.printStackTrace();
            return false;
        }


        return  super.save(rental);
    }

    @Override
    public Rental find(int id) {
        return super.find(id);
    }

    public boolean isInRentBy(int inventoryId)
    {
            Result<RentalRecord> r2 = dsl.selectFrom(hello.tables.Rental.RENTAL)
                    .where(hello.tables.Rental.RENTAL.RETURN_DATE.isNull().and(hello.tables.Rental.RENTAL.INVENTORY_ID.eq(inventoryId)))
                    .fetch();

        return r2.size() == 0 ? false : true;
    }

    @Override
    public List<Rental> findAll() {

        Table<Record5<Short, Short, Timestamp, Timestamp, Short>> subquery1 =
                dsl.select(Inventory.INVENTORY.FILM_ID,Inventory.INVENTORY.STORE_ID, hello.tables.Rental.RENTAL.RENTAL_DATE, hello.tables.Rental.RENTAL.RETURN_DATE, hello.tables.Rental.RENTAL.CUSTOMER_ID)
                        .from(hello.tables.Rental.RENTAL)
                        .join(Inventory.INVENTORY)
                        .on(hello.tables.Rental.RENTAL.INVENTORY_ID.eq(Inventory.INVENTORY.INVENTORY_ID))
                        .asTable("subquery1");

        Table<? extends Record6<String, Short, BigDecimal, ?, ?, ?>> subquery2 =
                dsl.select(hello.tables.Film.FILM.TITLE, hello.tables.Film.FILM.LANGUAGE_ID, hello.tables.Film.FILM.REPLACEMENT_COST, subquery1.field("store_id"), subquery1.field("rental_date"), subquery1.field("customer_id"))
                        .from(hello.tables.Film.FILM, subquery1)
                        .where(hello.tables.Film.FILM.FILM_ID.eq((Field<Integer>) subquery1.field("film_id")))
                        .asTable("subquery2");

        Table<Record8<Integer, Integer, String, String, Integer, String, Integer, String>> subquery3 =
                dsl.select(Store.STORE.STORE_ID, Address.ADDRESS.ADDRESS_ID, Address.ADDRESS.ADDRESS_, Address.ADDRESS.DISTRICT, City.CITY.CITY_ID, City.CITY.CITY_, Country.COUNTRY.COUNTRY_ID, Country.COUNTRY.COUNTRY_)
                        .from(Store.STORE, Address.ADDRESS, City.CITY, Country.COUNTRY)
                        .where(Store.STORE.ADDRESS_ID.eq(Address.ADDRESS.field("address_id",Short.TYPE)).and(Address.ADDRESS.CITY_ID.eq(City.CITY.field("city_id",Short.TYPE)).and(City.CITY.COUNTRY_ID.eq(Country.COUNTRY.field("country_id",Short.TYPE)))))
                        .asTable("subquery3");


        Result<? extends Record8<?, ?, ?, ?, ?, String, String, ?>> result =
                dsl.select(subquery2.field("title"), subquery2.field("replacement_cost"), subquery3.field("address"), subquery3.field("city"), subquery3.field("country"), Customer.CUSTOMER.FIRST_NAME, Customer.CUSTOMER.LAST_NAME, subquery2.field("rental_date"))
                        .from(subquery2, subquery3, Customer.CUSTOMER)
                        .where(subquery2.field("store_id", Short.TYPE).eq(subquery3.field("store_id", Short.TYPE)).and(Customer.CUSTOMER.CUSTOMER_ID.eq(subquery2.field("customer_id", Integer.TYPE))))
                        .orderBy(subquery2.field("rental_date").desc())
                        .fetch();

        List<Rental> list = new ArrayList<>();
        for (Record record : result)
        {
            RentalRest rr = new RentalRest();

            rr.title = (String) record.get(0);
            rr.replacement_cost =(BigDecimal) record.get(1);
            rr.address = (String) record.get(2);
            rr.city = (String) record.get(3);
            rr.country = (String) record.get(4);
            rr.first_name = (String) record.get(5);
            rr.last_name = (String) record.get(6);
            rr.setRentalDate((Timestamp) record.get(7));
            list.add(rr);
        }

        return list;
    }


        @Override
    public List<Rental> findEntries(int firstResult, int maxResults) {
        return super.findEntries(firstResult, maxResults);
    }

    @Override
    public long countAll() {
        return super.countAll();
    }

    @Override
    public Rental update(Rental rental) {
        return super.update(rental);
    }

    @Override
    public void delete(Rental rental) {
        super.delete(rental);
    }
}
