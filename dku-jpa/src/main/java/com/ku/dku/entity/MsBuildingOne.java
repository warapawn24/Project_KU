package com.ku.dku.entity;
// Generated Apr 18, 2021 1:49:04 AM by Hibernate Tools 3.2.2.GA


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
    public static final String P_NUMBER = "number";
    public static final String P_BUILDINGTOTAL = "buildingTotal";
    public static final String P_TYPEID = "typeId";


    private Long recId;
    private Long roomId;
    private Long floorId;
    private Long buildingId;
    private Integer number;
    private Integer buildingTotal;
    private Long typeId;

    public MsBuildingOne() {
    }


    public MsBuildingOne(Long roomId, Long floorId, Long buildingId, Integer number, Integer buildingTotal, Long typeId) {
        this.roomId = roomId;
        this.floorId = floorId;
        this.buildingId = buildingId;
        this.number = number;
        this.buildingTotal = buildingTotal;
        this.typeId = typeId;
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
    
    @Column(name="building_total", nullable=false)
    public Integer getBuildingTotal() {
        return this.buildingTotal;
    }
    
    public void setBuildingTotal(Integer buildingTotal) {
        this.buildingTotal = buildingTotal;
    }
    
    @Column(name="type_id", nullable=false)
    public Long getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }




}


