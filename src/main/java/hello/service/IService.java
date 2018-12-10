package hello.service;

import hello.tables.pojos.Film;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface IService<T> {

    boolean save(T t);
    T find(int id);
    List<T> findAll();
    List<T> findEntries(int firstResult, int maxResults);
    long countAll();
    T update(T t);
    void delete(T t);

}
