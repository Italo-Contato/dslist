package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinimoDto;
import com.devsuperior.dslist.entites.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	/*@GetMapping
	public List<GameMinimoDto> findAll(){
		List<Game> result = gameService.findAll();
		List<GameMinimoDto> gameDto = result.stream().map(x-> 
			new GameMinimoDto(x)).toList();
		return gameDto;
	}*/
	
	@Autowired
	private GameRepository gameRepository;
	
	@GetMapping
	public List<GameMinimoDto> findAll(){
		List<GameMinimoDto> result = gameService.findAll();
		return result;
	}
	 
	
}
