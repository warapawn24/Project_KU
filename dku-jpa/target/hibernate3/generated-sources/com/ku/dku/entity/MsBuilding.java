package com.ku.dku.entity;
// Generated Apr 21, 2021 2:56:37 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MsBuilding generated by hbm2java
 */
@Entity
@Table(name="ms_building"
    //, catalog="dku"
)
public class MsBuilding  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_ROOMID = "roomId";
    public static final String P_ROMFLOOR = "romFloor";
    public static final String P_BUILDINGID = "buildingId";


    private Long recId;
    private Long roomId;
    private Long romFloor;
    private Long buildingId;

    public MsBuilding() {
    }


    public MsBuilding(Long roomId, Long romFloor, Long buildingId) {
        this.roomId = roomId;
        this.romFloor = romFloor;
        this.buildingId = buildingId;
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="rec_id", unique=true, nullable=false)
    public Long getRecId() {
        return this.recId;
    }
    
    public void setRecId(Long recId) {
        this.recId = recId;
    }
    
    @Column(name="room_id")
    public Long getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }
    
    @Column(name="rom_floor")
    public Long getRomFloor() {
        return this.romFloor;
    }
    
    public void setRomFloor(Long romFloor) {
        this.romFloor = romFloor;
    }
    
    @Column(name="building_id")
    public Long getBuildingId() {
        return this.buildingId;
    }
    
    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }




}


