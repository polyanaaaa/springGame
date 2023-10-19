package com.senai.polyana.PrjGame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.polyana.PrjGame.entities.*;
import com.senai.polyana.PrjGame.repositories.*;

@Service
public class JogoService {
	
	private final JogoRepository repository;
	
	
	@Autowired
	public JogoService (JogoRepository repository) {
		this.repository = repository;
 }
 
	public jogo savejogo(jogo jogo) { 
		return repository.save(jogo);
	}
	
	public List <jogo> getAlljogo(){
		return repository.findAll();
		
	}
	
	public jogo GetjogoById(long Id) {
		return repository.findById(Id).orElse(null);
	}
	
	public void deletejogo(Long id) {
		repository.deleteById(id);
	}
}
