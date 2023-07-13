package com.devsuperior.dslist.entites;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;

public class Belonging {
	
	@EmbeddedId
	private BelogingId id;
	
	private Integer position;
	
	public Belonging() {
		
	}
	
	public Belonging(Game game, GameList list, Integer position) {
		this.id.setList(list);
		this.id.setGame(game);
		this.position = position;
	}

	
	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public BelogingId getId() {
		return id;
	}

	public void setPk(BelogingId id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
