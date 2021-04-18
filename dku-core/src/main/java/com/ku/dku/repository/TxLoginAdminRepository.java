package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.TxLoginAdmin;

public interface TxLoginAdminRepository extends JpaRepository<TxLoginAdmin, Long> {

	TxLoginAdmin findByRecId(long recId);
}
