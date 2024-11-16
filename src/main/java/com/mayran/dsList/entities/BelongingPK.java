package com.mayran.dsList.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name =  "game_id")
    private Game gameId;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameListId;
}
