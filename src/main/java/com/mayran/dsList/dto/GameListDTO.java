package com.mayran.dsList.dto;

import com.mayran.dsList.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }
}
