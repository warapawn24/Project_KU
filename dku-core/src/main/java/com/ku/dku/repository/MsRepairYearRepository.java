package com.ku.dku.repository;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.transaction.annotation.Transactional;

import com.ku.dku.entity.MsRepairYear;

@Transactional(readOnly = true)
public interface MsRepairYearRepository extends JpaRepository<MsRepairYear, Long> {

	@Lock(LockModeType.PESSIMISTIC_WRITE)
	MsRepairYear findByYear(int year);
}
