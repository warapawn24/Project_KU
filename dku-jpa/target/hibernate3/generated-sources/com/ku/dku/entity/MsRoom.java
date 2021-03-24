package com.ku.dku.entity;
// Generated Mar 22, 2021 12:35:23 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MsRoom generated by hbm2java
 */
@Entity
@Table(name="ms_room"
    //, catalog="dku"
)
public class MsRoom  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_BUILDINGID = "buildingId";
    public static final String P_ROOMFLOOR = "roomFloor";
    public static final String P_ROOMTERM = "roomTerm";
    public static final String P_ROOMTYPE = "roomType";
    public static final String P_ROOMAMOUNT = "roomAmount";
    public static final String P_ROOMPRICE = "roomPrice";
    public static final String P_ROOMSTATUS = "roomStatus";
    public static final String P_ROOMID = "roomId";


    private Long recId;
    private Long buildingId;
    private Long roomFloor;
    private String roomTerm;
    private String roomType;
    private Long roomAmount;
    private Long roomPrice;
    private Long roomStatus;
    private Long roomId;

    public MsRoom() {
    }


    public MsRoom(Long buildingId, Long roomFloor, String roomTerm, String roomType, Long roomAmount, Long roomPrice, Long roomStatus, Long roomId) {
        this.buildingId = buildingId;
        this.roomFloor = roomFloor;
        this.roomTerm = roomTerm;
        this.roomType = roomType;
        this.roomAmount = roomAmount;
        this.roomPrice = roomPrice;
        this.roomStatus = roomStatus;
        this.roomId = roomId;
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
    
    @Column(name="building_id")
    public Long getBuildingId() {
        return this.buildingId;
    }
    
    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }
    
    @Column(name="room_floor")
    public Long getRoomFloor() {
        return this.roomFloor;
    }
    
    public void setRoomFloor(Long roomFloor) {
        this.roomFloor = roomFloor;
    }
    
    @Column(name="room_term")
    public String getRoomTerm() {
        return this.roomTerm;
    }
    
    public void setRoomTerm(String roomTerm) {
        this.roomTerm = roomTerm;
    }
    
    @Column(name="room_type")
    public String getRoomType() {
        return this.roomType;
    }
    
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    
    @Column(name="room_amount")
    public Long getRoomAmount() {
        return this.roomAmount;
    }
    
    public void setRoomAmount(Long roomAmount) {
        this.roomAmount = roomAmount;
    }
    
    @Column(name="room_price")
    public Long getRoomPrice() {
        return this.roomPrice;
    }
    
    public void setRoomPrice(Long roomPrice) {
        this.roomPrice = roomPrice;
    }
    
    @Column(name="room_status")
    public Long getRoomStatus() {
        return this.roomStatus;
    }
    
    public void setRoomStatus(Long roomStatus) {
        this.roomStatus = roomStatus;
    }
    
    @Column(name="room_id")
    public Long getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }




}


