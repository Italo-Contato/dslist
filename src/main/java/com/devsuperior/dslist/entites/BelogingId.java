package com.devsuperior.dslist.entites;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelogingId {
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;
	
	@ManyToOne
	@JoinColumn(name = "tb_game_list")
	private GameList List;

	public BelogingId() {
		
	}
	
	public BelogingId(Game game, GameList list) {
		super();
		this.game = game;
		List = list;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getList() {
		return List;
	}

	public void setList(GameList list) {
		List = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(List, game);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelogingId other = (BelogingId) obj;
		return Objects.equals(List, other.List) && Objects.equals(game, other.game);
	}
	
	
}
