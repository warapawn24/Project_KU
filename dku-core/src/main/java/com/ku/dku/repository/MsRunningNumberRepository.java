package com.ku.dku.repository;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.transaction.annotation.Transactional;

import com.ku.dku.entity.MsRunningNumber;

@Transactional(readOnly = true)
public interface MsRunningNumberRepository extends JpaRepository<MsRunningNumber, Long> {

	@Lock(LockModeType.PESSIMISTIC_WRITE)
	MsRunningNumber findByNumber(int number);
	
	MsRunningNumber findByDescription(String description);
}
