package com.ku.dku.entity;
// Generated Mar 27, 2021 10:36:09 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MsBuildingEight generated by hbm2java
 */
@Entity
@Table(name="ms_building_eight"
    //, catalog="dku"
)
public class MsBuildingEight  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_ROOMID = "roomId";
    public static final String P_FLOORID = "floorId";
    public static final String P_BUILDINGID = "buildingId";
    public static final String P_NUMBER = "number";


    private Long recId;
    private Long roomId;
    private Long floorId;
    private Long buildingId;
    private Integer number;

    public MsBuildingEight() {
    }


    public MsBuildingEight(Long roomId, Long floorId, Long buildingId, Integer number) {
        this.roomId = roomId;
        this.floorId = floorId;
        this.buildingId = buildingId;
        this.number = number;
    }
   
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="rec_id", unique=true, nullable=false)
    public Long getRecId() {
        return this.recId;
    }
    
    public void setRecId(Long recId) {
        this.recId = recId;
    }
    
    @Column(name="room_id", nullable=false)
    public Long getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }
    
    @Column(name="floor_id", nullable=false)
    public Long getFloorId() {
        return this.floorId;
    }
    
    public void setFloorId(Long floorId) {
        this.floorId = floorId;
    }
    
    @Column(name="building_id", nullable=false)
    public Long getBuildingId() {
        return this.buildingId;
    }
    
    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }
    
    @Column(name="number", nullable=false)
    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }




}


