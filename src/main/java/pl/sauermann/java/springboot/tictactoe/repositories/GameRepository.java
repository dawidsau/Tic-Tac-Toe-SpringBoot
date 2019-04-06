package pl.sauermann.java.springboot.tictactoe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sauermann.java.springboot.tictactoe.model.Game;

import java.util.Optional;

@Repository
public interface GameRepository extends CrudRepository<Game,Long> {

    Optional<Game> findByName(String name);
}
