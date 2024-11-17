package com.mayran.dsList.services;

import com.mayran.dsList.dto.GameDTO;
import com.mayran.dsList.dto.GameMinValuesDTO;
import com.mayran.dsList.entities.Game;
import com.mayran.dsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    public List<GameMinValuesDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        return games.stream().map(GameMinValuesDTO::new).toList();
    }

}
