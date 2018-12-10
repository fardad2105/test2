package hello.service;

import hello.tables.daos.FilmDao;
import hello.tables.pojos.Film;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieServiceImple extends AbstractService<Film>
{

    FilmDao filmDao = new FilmDao(this.configuration);

    @Override
    public Film find(int id) {
        return filmDao.fetchOneByFilmId(id);
    }

    @Override
    public List<Film> findAll() {

        return filmDao.findAll();
    }
}
