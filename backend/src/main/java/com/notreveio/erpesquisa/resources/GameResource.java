package com.notreveio.erpesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notreveio.erpesquisa.dto.GameDTO;
import com.notreveio.erpesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
	@Autowired
	private GameService gameService;
	
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> FindAll(){
		List<GameDTO> list = gameService.FindAll();
;		return ResponseEntity.ok().body(list);
	}

}
