package pl.sauermann.java.springboot.tictactoe.repositories;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Sets;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.sauermann.java.springboot.tictactoe.model.Game;
import pl.sauermann.java.springboot.tictactoe.model.Player;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudRepositoryTest {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private GameRepository gameRepository;

    @Test
    public void shouldSavePlayerEntity() {
        log.debug("Creating game instance");
        Game game = new Game("Game1", Sets.newHashSet());
        log.debug("Creating player instance");
        Player player = new Player("Player1", game);
        game.getPlayers().add(player);
        log.debug("Persisting game");
        gameRepository.save(game);
        log.debug("Persisting player");
        Player result = playerRepository.save(player);
        log.debug("Player "+result.getId() + " saved");
        assertNotNull(result);
    }

    @Test
    public void shouldFindPlayerEntity() {
        log.debug("Creating game instance");
        Game game = new Game("Game1", Sets.newHashSet());
        log.debug("Creating player instance");
        Player player = new Player("Player1", game);
        game.getPlayers().add(player);
        log.debug("Persisting game");
        gameRepository.save(game);
        log.debug("Persisting player");
        playerRepository.save(player);

        Set<Player> result = playerRepository.findByName("Player1");
        assertNotEquals(0,result.size());
    }

}