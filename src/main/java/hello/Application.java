package hello;

import hello.tables.daos.ActorDao;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;


@SpringBootApplication
public class Application {




    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class, args);

        /*
        System.err.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[");

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","12345");
        DSLContext create = DSL.using(conn, SQLDialect.POSTGRES_10);

        ActorDao Ad = new ActorDao();


        Ad.fetchByFirstName("Nick").forEach(System.out::println);*/
/*
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","12345");

        // Initialise an Configuration
        Configuration configuration = new DefaultConfiguration().set(conn).set(SQLDialect.POSTGRES_10);

        // Initialise the DAO with the Configuration
        ActorDao bookDao = new ActorDao(configuration);

        bookDao.fetchByFirstName("Nick").forEach(System.out::println);
*/

    }

}
