package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.LkRole;

public interface LkRoleRepository extends JpaRepository<LkRole, Long> {

	LkRole findByRecId(long recId);
	
}
