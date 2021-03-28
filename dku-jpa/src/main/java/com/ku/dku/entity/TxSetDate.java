package com.ku.dku.entity;
// Generated Mar 25, 2021 10:24:40 PM by Hibernate Tools 3.2.2.GA


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

/**
 * TxSetDate generated by hbm2java
 */
@Entity
@Table(name="tx_set_date"
    //, catalog="dku"
)
public class TxSetDate  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_SETRESERVESTART = "setReserveStart";
    public static final String P_SETRESERVEDUE = "setReserveDue";
    public static final String P_SETSTATUS = "setStatus";


    private Long recId;
    private Date setReserveStart;
    private Date setReserveDue;
    private String setStatus;

    public TxSetDate() {
    }


    public TxSetDate(Date setReserveStart, Date setReserveDue, String setStatus) {
        this.setReserveStart = setReserveStart;
        this.setReserveDue = setReserveDue;
        this.setStatus = setStatus;
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
    @Temporal(TemporalType.DATE)
    @Column(name="set_reserveStart", length=10)
    public Date getSetReserveStart() {
        return this.setReserveStart;
    }
    
    public void setSetReserveStart(Date setReserveStart) {
        this.setReserveStart = setReserveStart;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="set_reserveDue", length=10)
    public Date getSetReserveDue() {
        return this.setReserveDue;
    }
    
    public void setSetReserveDue(Date setReserveDue) {
        this.setReserveDue = setReserveDue;
    }
    
    @Column(name="set_status")
    public String getSetStatus() {
        return this.setStatus;
    }
    
    public void setSetStatus(String setStatus) {
        this.setStatus = setStatus;
    }




}


