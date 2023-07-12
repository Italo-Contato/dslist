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
	@Column(name = "year_game")//mudano referência ao nome para fugir da palavra reservada do sql
	private int year;
	private String genro;
	private String plataform;
	private String img_url;
	private String shortDescription;
	private String longDescritpion;
	
	
	
	public Game() {
		
	}



	public Game(Long id, String title, int year, String genro, String plataform, String img_url,
			String shortDescription, String longDescritpion) {
		
		this.id = id;
		this.title = title;
		this.year = year;
		this.genro = genro;
		this.plataform = plataform;
		this.img_url = img_url;
		this.shortDescription = shortDescription;
		this.longDescritpion = longDescritpion;
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



	public String getGenro() {
		return genro;
	}



	public void setGenro(String genro) {
		this.genro = genro;
	}



	public String getPlataform() {
		return plataform;
	}



	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}



	public String getImg_url() {
		return img_url;
	}



	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}



	public String getShortDescription() {
		return shortDescription;
	}



	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}



	public String getLongDescritpion() {
		return longDescritpion;
	}



	public void setLongDescritpion(String longDescritpion) {
		this.longDescritpion = longDescritpion;
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
