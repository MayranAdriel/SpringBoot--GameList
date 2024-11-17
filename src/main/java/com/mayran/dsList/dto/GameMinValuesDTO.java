package com.mayran.dsList.dto;

import com.mayran.dsList.entities.Game;
import com.mayran.dsList.projections.GameMinProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameMinValuesDTO {
    private Long id;
    private String title;
    private String imgUrl;
    private String shortDescription;

    public GameMinValuesDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinValuesDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }
}
