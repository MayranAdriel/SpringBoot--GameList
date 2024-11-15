package com.mayran.dsList.services;

import com.mayran.dsList.dto.GameMinValuesDTO;
import com.mayran.dsList.entities.Game;
import com.mayran.dsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinValuesDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        return games.stream().map(GameMinValuesDTO::new).toList();
    }
}
