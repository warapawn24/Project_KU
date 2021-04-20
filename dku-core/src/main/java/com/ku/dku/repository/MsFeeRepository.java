package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.MsFee;

public interface MsFeeRepository extends JpaRepository<MsFee, Long> {

	MsFee findByRecId(long rceId);
}
