package com.senai.polyana.PrjGame.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_jogo")
public class jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "plataform")
	private String plataform;
	
	
	public Long getid() {
		
	return id;
	
	}
	
	public void setid(Long id) {
		this.id = id; 
	}
	
	public String getname () {
		return name;
		
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getplataform () {
		return plataform;
	}
	
	public void setplataform(String plataform) {
		this.plataform = plataform;
	}

}
