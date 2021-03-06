/*
 * This file is generated by jOOQ.
 */
package hello.tables.daos;


import hello.tables.City;
import hello.tables.records.CityRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CityDao extends DAOImpl<CityRecord, hello.tables.pojos.City, Integer> {

    /**
     * Create a new CityDao without any configuration
     */
    public CityDao() {
        super(City.CITY, hello.tables.pojos.City.class);
    }

    /**
     * Create a new CityDao with an attached configuration
     */
    public CityDao(Configuration configuration) {
        super(City.CITY, hello.tables.pojos.City.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(hello.tables.pojos.City object) {
        return object.getCityId();
    }

    /**
     * Fetch records that have <code>city_id IN (values)</code>
     */
    public List<hello.tables.pojos.City> fetchByCityId(Integer... values) {
        return fetch(City.CITY.CITY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>city_id = value</code>
     */
    public hello.tables.pojos.City fetchOneByCityId(Integer value) {
        return fetchOne(City.CITY.CITY_ID, value);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<hello.tables.pojos.City> fetchByCity(String... values) {
        return fetch(City.CITY.CITY_, values);
    }

    /**
     * Fetch records that have <code>country_id IN (values)</code>
     */
    public List<hello.tables.pojos.City> fetchByCountryId(Short... values) {
        return fetch(City.CITY.COUNTRY_ID, values);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<hello.tables.pojos.City> fetchByLastUpdate(Timestamp... values) {
        return fetch(City.CITY.LAST_UPDATE, values);
    }
}
