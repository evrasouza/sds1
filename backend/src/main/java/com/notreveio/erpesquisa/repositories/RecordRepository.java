package com.notreveio.erpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notreveio.erpesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
