package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.MsRoom;

public interface MsRoomRepository extends JpaRepository<MsRoom, Long> {

	MsRoom findByRecId(long recId);
	MsRoom findByRoomId(long roomId);
	
}
