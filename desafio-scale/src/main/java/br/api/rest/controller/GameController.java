package br.api.rest.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.api.rest.model.Resultado;
import br.api.rest.repository.ResultadoRepository;
import br.api.rest.service.ComparatorService;

@RestController
@RequestMapping(value = "/desafio")
public class GameController {
		
	@Autowired
	private ResultadoRepository resultadoRepository;
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity resultados() {
		
		List<Resultado> listaResultados = (List<Resultado>) resultadoRepository.findAll();
		List<Resultado> listaFinal = new ArrayList<Resultado>();
		//listaResultados.sort(Comparator.comparing(Resultado::getNumeroChutes));
		//System.out.println(listaResultados);
		//tentativa sort por 2 comparator custom
		Collections.sort(listaResultados, new ComparatorService());
		Iterator it1 = listaResultados.iterator();
		while(it1.hasNext()) {
			Resultado r1 = (Resultado) it1.next();
			listaFinal.add(r1);
		}
		
		return new ResponseEntity<List<Resultado>>(listaFinal, HttpStatus.OK);
	}
	
	@PostMapping(value = "/", produces = "application/json")
	public ResponseEntity fimJogo(@RequestBody Resultado resultado) {
		
		Resultado resultadoSalvo =  resultadoRepository.save(resultado);
		
		return new ResponseEntity<Resultado>(resultadoSalvo, HttpStatus.OK);
	}

}
