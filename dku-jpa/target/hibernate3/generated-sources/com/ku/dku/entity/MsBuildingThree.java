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
 * MsBuildingThree generated by hbm2java
 */
@Entity
@Table(name="ms_building_three"
    //, catalog="dku"
)
public class MsBuildingThree  implements java.io.Serializable, BaseEntity {
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
    private Long number;
    private Long buildingTotal;
    private Long typeId;

    public MsBuildingThree() {
    }


    public MsBuildingThree(Long roomId, Long floorId, Long buildingId, Long number, Long buildingTotal, Long typeId) {
        this.roomId = roomId;
        this.floorId = floorId;
        this.buildingId = buildingId;
        this.number = number;
        this.buildingTotal = buildingTotal;
        this.typeId = typeId;
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
    
    @Column(name="number", nullable=false)
    public Long getNumber() {
        return this.number;
    }
    
    public void setNumber(Long number) {
        this.number = number;
    }
    
    @Column(name="building_total", nullable=false)
    public Long getBuildingTotal() {
        return this.buildingTotal;
    }
    
    public void setBuildingTotal(Long buildingTotal) {
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


