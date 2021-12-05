package com.notreveio.erpesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notreveio.erpesquisa.dto.RecordDTO;
import com.notreveio.erpesquisa.dto.RecordInsertDTO;
import com.notreveio.erpesquisa.entities.Game;
import com.notreveio.erpesquisa.entities.Record;
import com.notreveio.erpesquisa.repositories.GameRepository;
import com.notreveio.erpesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;

	@Autowired
	private GameRepository gameRepository;

	@Transactional
	public RecordDTO insert(RecordInsertDTO dto){

		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}

}
