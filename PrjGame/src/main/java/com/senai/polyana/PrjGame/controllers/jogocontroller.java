package com.senai.polyana.PrjGame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.polyana.PrjGame.entities.jogo;
import com.senai.polyana.PrjGame.services.JogoService;


	@RestController
	@RequestMapping("/jogo")
	public class jogocontroller {
		
		private final JogoService jogoService;
		
		
		@Autowired
		public jogocontroller (JogoService jogoService) {
			this.jogoService = jogoService;
		}
		
		@PostMapping
		public jogo createjogo(@RequestBody jogo jogo) {
			return jogoService.savejogo(jogo);

	}
		@GetMapping("/{id}")
		public ResponseEntity<jogo> getjogo (@PathVariable Long id) {
			jogo jogo = jogoService.GetjogoById(id);
				if (jogo !=null) {
					return ResponseEntity.ok(jogo);}
				else {
					return ResponseEntity.notFound().build();}
				}
		
		@GetMapping ("/home") public String paginaInicial() 
		{ return "index";}
		
		@DeleteMapping ("/{id}")
		
		public void deletejogo(@PathVariable Long id) {
			jogoService.deletejogo(id);
		}

}
	


