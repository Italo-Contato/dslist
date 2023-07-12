package com.devsuperior.dslist.entites;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String title;
	@Column(name = "game_year")//mudando referência ao nome para fugir da palavra reservada do sql
	private int year;
	private String genre;
	private String platforms;
	private double score;
	private String img_url;
	
	@Column(columnDefinition = "TEXT")
	private String short_description;
		
	@Column(columnDefinition = "TEXT")//CONFIGURA O ATRIBUTO PARA SER UM TEXTO COM MAIS DE 255 CARACTERES NO BANCO DE DADOS
	private String long_description;
	
	
	
	
	public Game() {
		
	}



	public Game(Long id, String title, int year, String genre, String platform, Double score ,String img_url,
			String short_description, String long_description) {
		
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platform;
		this.score = score;
		this.img_url = img_url;
		this.short_description = short_description;
		this.long_description = long_description;
		
	}




	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenr(String genre) {
		this.genre = genre;
	}



	public String getPlatforms() {
		return platforms;
	}



	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}



	public double getScore() {
		return score;
	}



	public void setScore(double score) {
		this.score = score;
	}



	public String getImg_url() {
		return img_url;
	}



	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}



	public String getShort_description() {
		return short_description;
	}



	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}



	public String getLong_descritpion() {
		return long_description;
	}



	public void setLong_descritpion(String long_descritpion) {
		this.long_description = long_descritpion;
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
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
