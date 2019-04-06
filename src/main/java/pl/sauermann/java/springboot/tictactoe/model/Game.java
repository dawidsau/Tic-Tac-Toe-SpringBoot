package pl.sauermann.java.springboot.tictactoe.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "games")
public class Game extends BaseEntity{

    @Column(name = "name", nullable = false)
    private String name;
    private Set<Player> players;
}
