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
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    BelongingPK belongingPK = new BelongingPK();
    Integer position;

    public Belonging(Game game, GameList gameList, Integer position) {
        this.belongingPK.setGameId(game);
        this.belongingPK.setGameListId(gameList);
        this.position = position;
    }
}
