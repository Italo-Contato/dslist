package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entites.Game;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinimoDto  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String title;
	private int year;
	private String img_url;
	private String short_description;
	public GameMinimoDto() {
		
	}
	public GameMinimoDto(Game entity) {
		super();
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.img_url = entity.getImg_url();
		this.short_description = entity.getShort_description();
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public String getImg_url() {
		return img_url;
	}
	public String getShort_description() {
		return short_description;
	}
	

	
	
}

