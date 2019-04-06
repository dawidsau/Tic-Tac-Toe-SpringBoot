package pl.sauermann.java.springboot.tictactoe.repositories;

import org.springframework.stereotype.Repository;
import pl.sauermann.java.springboot.tictactoe.model.Game;

@Repository
public interface GameRepository extends BaseRepository<Game> {
}
