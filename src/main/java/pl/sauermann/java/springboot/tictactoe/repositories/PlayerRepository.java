package pl.sauermann.java.springboot.tictactoe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sauermann.java.springboot.tictactoe.model.Player;

import java.util.Optional;
import java.util.Set;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

    Set<Player> findByName(String name);

}
