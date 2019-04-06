package pl.sauermann.java.springboot.tictactoe.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface BaseRepository<T> extends CrudRepository<T, Long> {

    Set<T> findByName(String name);

}
