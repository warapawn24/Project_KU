package com.ku.dku.entity;
// Generated Mar 15, 2021 7:14:33 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MsBuildingOne generated by hbm2java
 */
@Entity
@Table(name="ms_building_one"
    //, catalog="dku"
)
public class MsBuildingOne  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_ROOMID = "roomId";
    public static final String P_FLOORID = "floorId";
    public static final String P_BUILDINGID = "buildingId";


    private Long recId;
    private Long roomId;
    private Long floorId;
    private Long buildingId;

    public MsBuildingOne() {
    }


    public MsBuildingOne(Long roomId, Long floorId, Long buildingId) {
        this.roomId = roomId;
        this.floorId = floorId;
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




}


