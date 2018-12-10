package hello.contoller;

import hello.service.MovieServiceImple;
import hello.tables.daos.FilmDao;
import hello.tables.pojos.Film;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MovieController {

   @Autowired
   MovieServiceImple movieService;

   @RequestMapping("/movie")
   public List<Film> movieList(@RequestParam(value="id", defaultValue="-1") int id) {

      System.err.println(id);
      if (id != -1)
      {
         List<Film> list = new ArrayList<Film>();
         list.add(movieService.find(id));
         return list;

      }

        return movieService.findAll();
   }
}
