
package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.devsuperior.dslist.dto.GameMinimoDto;
import com.devsuperior.dslist.entites.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinimoDto> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinimoDto> gameDto = result.stream().map(x -> new GameMinimoDto(x)).toList();
		return gameDto;

	}
}
