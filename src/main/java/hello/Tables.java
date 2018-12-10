/*
 * This file is generated by jOOQ.
 */
package hello;


import hello.tables.Actor;
import hello.tables.ActorInfo;
import hello.tables.Address;
import hello.tables.Category;
import hello.tables.City;
import hello.tables.Country;
import hello.tables.Customer;
import hello.tables.CustomerList;
import hello.tables.Film;
import hello.tables.FilmActor;
import hello.tables.FilmCategory;
import hello.tables.FilmInStock;
import hello.tables.FilmList;
import hello.tables.FilmNotInStock;
import hello.tables.Inventory;
import hello.tables.Language;
import hello.tables.NicerButSlowerFilmList;
import hello.tables.Payment;
import hello.tables.Rental;
import hello.tables.RewardsReport;
import hello.tables.SalesByFilmCategory;
import hello.tables.SalesByStore;
import hello.tables.Staff;
import hello.tables.StaffList;
import hello.tables.Store;
import hello.tables.records.FilmInStockRecord;
import hello.tables.records.FilmNotInStockRecord;
import hello.tables.records.RewardsReportRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.actor</code>.
     */
    public static final Actor ACTOR = hello.tables.Actor.ACTOR;

    /**
     * The table <code>public.actor_info</code>.
     */
    public static final ActorInfo ACTOR_INFO = hello.tables.ActorInfo.ACTOR_INFO;

    /**
     * The table <code>public.address</code>.
     */
    public static final Address ADDRESS = hello.tables.Address.ADDRESS;

    /**
     * The table <code>public.category</code>.
     */
    public static final Category CATEGORY = hello.tables.Category.CATEGORY;

    /**
     * The table <code>public.city</code>.
     */
    public static final City CITY = hello.tables.City.CITY;

    /**
     * The table <code>public.country</code>.
     */
    public static final Country COUNTRY = hello.tables.Country.COUNTRY;

    /**
     * The table <code>public.customer</code>.
     */
    public static final Customer CUSTOMER = hello.tables.Customer.CUSTOMER;

    /**
     * The table <code>public.customer_list</code>.
     */
    public static final CustomerList CUSTOMER_LIST = hello.tables.CustomerList.CUSTOMER_LIST;

    /**
     * The table <code>public.film</code>.
     */
    public static final Film FILM = hello.tables.Film.FILM;

    /**
     * The table <code>public.film_actor</code>.
     */
    public static final FilmActor FILM_ACTOR = hello.tables.FilmActor.FILM_ACTOR;

    /**
     * The table <code>public.film_category</code>.
     */
    public static final FilmCategory FILM_CATEGORY = hello.tables.FilmCategory.FILM_CATEGORY;

    /**
     * The table <code>public.film_in_stock</code>.
     */
    public static final FilmInStock FILM_IN_STOCK = hello.tables.FilmInStock.FILM_IN_STOCK;

    /**
     * Call <code>public.film_in_stock</code>.
     */
    public static Result<FilmInStockRecord> FILM_IN_STOCK(Configuration configuration, Integer pFilmId, Integer pStoreId) {
        return configuration.dsl().selectFrom(hello.tables.FilmInStock.FILM_IN_STOCK.call(pFilmId, pStoreId)).fetch();
    }

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(Integer pFilmId, Integer pStoreId) {
        return hello.tables.FilmInStock.FILM_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(Field<Integer> pFilmId, Field<Integer> pStoreId) {
        return hello.tables.FilmInStock.FILM_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * The table <code>public.film_list</code>.
     */
    public static final FilmList FILM_LIST = hello.tables.FilmList.FILM_LIST;

    /**
     * The table <code>public.film_not_in_stock</code>.
     */
    public static final FilmNotInStock FILM_NOT_IN_STOCK = hello.tables.FilmNotInStock.FILM_NOT_IN_STOCK;

    /**
     * Call <code>public.film_not_in_stock</code>.
     */
    public static Result<FilmNotInStockRecord> FILM_NOT_IN_STOCK(Configuration configuration, Integer pFilmId, Integer pStoreId) {
        return configuration.dsl().selectFrom(hello.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(pFilmId, pStoreId)).fetch();
    }

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(Integer pFilmId, Integer pStoreId) {
        return hello.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(Field<Integer> pFilmId, Field<Integer> pStoreId) {
        return hello.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * The table <code>public.inventory</code>.
     */
    public static final Inventory INVENTORY = hello.tables.Inventory.INVENTORY;

    /**
     * The table <code>public.language</code>.
     */
    public static final Language LANGUAGE = hello.tables.Language.LANGUAGE;

    /**
     * The table <code>public.nicer_but_slower_film_list</code>.
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = hello.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>public.payment</code>.
     */
    public static final Payment PAYMENT = hello.tables.Payment.PAYMENT;

    /**
     * The table <code>public.rental</code>.
     */
    public static final Rental RENTAL = hello.tables.Rental.RENTAL;

    /**
     * The table <code>public.rewards_report</code>.
     */
    public static final RewardsReport REWARDS_REPORT = hello.tables.RewardsReport.REWARDS_REPORT;

    /**
     * Call <code>public.rewards_report</code>.
     */
    public static Result<RewardsReportRecord> REWARDS_REPORT(Configuration configuration, Integer minMonthlyPurchases, BigDecimal minDollarAmountPurchased) {
        return configuration.dsl().selectFrom(hello.tables.RewardsReport.REWARDS_REPORT.call(minMonthlyPurchases, minDollarAmountPurchased)).fetch();
    }

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(Integer minMonthlyPurchases, BigDecimal minDollarAmountPurchased) {
        return hello.tables.RewardsReport.REWARDS_REPORT.call(minMonthlyPurchases, minDollarAmountPurchased);
    }

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(Field<Integer> minMonthlyPurchases, Field<BigDecimal> minDollarAmountPurchased) {
        return hello.tables.RewardsReport.REWARDS_REPORT.call(minMonthlyPurchases, minDollarAmountPurchased);
    }

    /**
     * The table <code>public.sales_by_film_category</code>.
     */
    public static final SalesByFilmCategory SALES_BY_FILM_CATEGORY = hello.tables.SalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * The table <code>public.sales_by_store</code>.
     */
    public static final SalesByStore SALES_BY_STORE = hello.tables.SalesByStore.SALES_BY_STORE;

    /**
     * The table <code>public.staff</code>.
     */
    public static final Staff STAFF = hello.tables.Staff.STAFF;

    /**
     * The table <code>public.staff_list</code>.
     */
    public static final StaffList STAFF_LIST = hello.tables.StaffList.STAFF_LIST;

    /**
     * The table <code>public.store</code>.
     */
    public static final Store STORE = hello.tables.Store.STORE;
}
