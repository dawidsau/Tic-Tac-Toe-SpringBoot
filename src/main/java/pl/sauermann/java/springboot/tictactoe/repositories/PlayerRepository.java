package pl.sauermann.java.springboot.tictactoe.repositories;

import org.springframework.stereotype.Repository;
import pl.sauermann.java.springboot.tictactoe.model.Player;

@Repository
public interface PlayerRepository extends BaseRepository<Player> {
}
