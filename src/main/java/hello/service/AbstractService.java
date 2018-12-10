package hello.service;

import hello.tables.pojos.Film;
import org.jooq.Configuration;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;

import org.jooq.impl.DefaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

@Service
public abstract class AbstractService<T> implements IService<T> {

    // Initialise an Configuration
    protected Configuration configuration;

    public AbstractService()
    {
        Connection conn= null;
        try {
            conn= DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","123");
        } catch (Exception e) {
            e.printStackTrace();
        }

        configuration  = new DefaultConfiguration().set(conn).set(SQLDialect.POSTGRES_10);
    }

    @Override
    public boolean save(T t) {
        return true;
    }

    @Override
    public T find(int id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public List<T> findEntries(int firstResult, int maxResults) {
        return null;
    }

    @Override
    public long countAll() {
        return 0;
    }

    @Override
    public T update(T t) {
        return null;
    }

    @Override
    public void delete(T t) {

    }
}
