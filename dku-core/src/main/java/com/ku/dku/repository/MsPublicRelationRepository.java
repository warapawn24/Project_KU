package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.MsPublicRelation;

public interface MsPublicRelationRepository extends JpaRepository<MsPublicRelation,Long> {

	MsPublicRelation findByRecId(long recId);
}
