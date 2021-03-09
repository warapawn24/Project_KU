package com.ku.dku.entity;
// Generated Feb 11, 2021 11:10:26 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * TxReserve generated by hbm2java
 */
@Entity
@Table(name="tx_reserve"
    //, catalog="dku"
)
public class TxReserve  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_BUILDINGID = "buildingId";
    public static final String P_ROOMID = "roomId";
    public static final String P_RESERVEDATE = "reserveDate";
    public static final String P_RESERVEDUEDATE = "reserveDuedate";
    public static final String P_RESERVESTATUS = "reserveStatus";
    public static final String P_RESERVEROOMSTATUS = "reserveRoomstatus";


    private Long recId;
    private Long buildingId;
    private Long roomId;
    private Date reserveDate;
    private Date reserveDuedate;
    private String reserveStatus;
    private Integer reserveRoomstatus;

    public TxReserve() {
    }


    public TxReserve(Long buildingId, Long roomId, Date reserveDate, Date reserveDuedate, String reserveStatus, Integer reserveRoomstatus) {
        this.buildingId = buildingId;
        this.roomId = roomId;
        this.reserveDate = reserveDate;
        this.reserveDuedate = reserveDuedate;
        this.reserveStatus = reserveStatus;
        this.reserveRoomstatus = reserveRoomstatus;
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
    
    @Column(name="building_id")
    public Long getBuildingId() {
        return this.buildingId;
    }
    
    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }
    
    @Column(name="room_id")
    public Long getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="reserve_date", length=19)
    @DateTimeFormat(pattern="dd/MM/yyyy")
    public Date getReserveDate() {
        return this.reserveDate;
    }
    
    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="reserve_duedate", length=19)
    public Date getReserveDuedate() {
        return this.reserveDuedate;
    }
    
    public void setReserveDuedate(Date reserveDuedate) {
        this.reserveDuedate = reserveDuedate;
    }
    
    @Column(name="reserve_status")
    public String getReserveStatus() {
        return this.reserveStatus;
    }
    
    public void setReserveStatus(String reserveStatus) {
        this.reserveStatus = reserveStatus;
    }
    
    @Column(name="reserve_roomstatus")
    public Integer getReserveRoomstatus() {
        return this.reserveRoomstatus;
    }
    
    public void setReserveRoomstatus(Integer reserveRoomstatus) {
        this.reserveRoomstatus = reserveRoomstatus;
    }




}


