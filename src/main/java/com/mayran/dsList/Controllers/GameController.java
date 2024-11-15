package com.mayran.dsList.Controllers;

import com.mayran.dsList.dto.GameMinValuesDTO;
import com.mayran.dsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinValuesDTO> findAll(){
        return gameService.findAll();
    }

}
