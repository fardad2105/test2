package hello;

import hello.tables.*;
import org.jooq.*;
import org.jooq.impl.DefaultDataType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;


@Configuration
public class MvcConfig implements WebMvcConfigurer {


    @Autowired
    DSLContext dsl;

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");




         /* System.out.println("{{{{{{{{{{{{");
          try {
              System.out.println(create.insertInto(Actor.ACTOR).set(Actor.ACTOR.FIRST_NAME,"mobin").set(Actor.ACTOR.LAST_NAME,"red").execute());
          } catch (Exception e) {
              e.printStackTrace();
          }*/
      }

}
