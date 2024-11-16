package com.mayran.dsList.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_pertence")
public class Pertence {

    @EmbeddedId
    private PertencePK id = new PertencePK();
    private Integer position;

    public Pertence(Game game, GameList gameList, Integer position) {
        this.id.setGameId(game);
        this.id.setGameListId(gameList);
        this.position = position;
    }
}
