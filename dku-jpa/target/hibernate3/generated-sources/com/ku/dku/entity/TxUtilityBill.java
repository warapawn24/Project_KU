package com.ku.dku.entity;
// Generated Mar 10, 2021 2:42:40 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * TxUtilityBill generated by hbm2java
 */
@Entity
@Table(name="tx_utility_bill"
    //, catalog="dku"
)
public class TxUtilityBill  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_ROOMID = "roomId";
    public static final String P_STUDENTID = "studentId";
    public static final String P_STUDENTFNAME = "studentFname";
    public static final String P_STUDENTLNAME = "studentLname";
    public static final String P_UTILITYDATE = "utilityDate";
    public static final String P_UTILITYDUEDATE = "utilityDuedate";
    public static final String P_UTILITYWATER = "utilityWater";
    public static final String P_UTILITYELECTRICBILL = "utilityElectricbill";
    public static final String P_UTILITYFINES = "utilityFines";
    public static final String P_UTILITYTOTAL = "utilityTotal";


    private Long recId;
    private Long roomId;
    private Long studentId;
    private String studentFname;
    private String studentLname;
    private String utilityDate;
    private String utilityDuedate;
    private Float utilityWater;
    private Float utilityElectricbill;
    private Float utilityFines;
    private Float utilityTotal;

    public TxUtilityBill() {
    }


    public TxUtilityBill(Long roomId, Long studentId, String studentFname, String studentLname, String utilityDate, String utilityDuedate, Float utilityWater, Float utilityElectricbill, Float utilityFines, Float utilityTotal) {
        this.roomId = roomId;
        this.studentId = studentId;
        this.studentFname = studentFname;
        this.studentLname = studentLname;
        this.utilityDate = utilityDate;
        this.utilityDuedate = utilityDuedate;
        this.utilityWater = utilityWater;
        this.utilityElectricbill = utilityElectricbill;
        this.utilityFines = utilityFines;
        this.utilityTotal = utilityTotal;
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
    
    @Column(name="student_id")
    public Long getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    
    @Column(name="student_fname")
    public String getStudentFname() {
        return this.studentFname;
    }
    
    public void setStudentFname(String studentFname) {
        this.studentFname = studentFname;
    }
    
    @Column(name="student_lname")
    public String getStudentLname() {
        return this.studentLname;
    }
    
    public void setStudentLname(String studentLname) {
        this.studentLname = studentLname;
    }
    
    @Column(name="utility_date")
    @DateTimeFormat(pattern="dd/MM/yyyy")
    public String getUtilityDate() {
        return this.utilityDate;
    }
    
    public void setUtilityDate(String utilityDate) {
        this.utilityDate = utilityDate;
    }
    
    @Column(name="utility_duedate")
    public String getUtilityDuedate() {
        return this.utilityDuedate;
    }
    
    public void setUtilityDuedate(String utilityDuedate) {
        this.utilityDuedate = utilityDuedate;
    }
    
    @Column(name="utility_water", precision=12, scale=0)
    public Float getUtilityWater() {
        return this.utilityWater;
    }
    
    public void setUtilityWater(Float utilityWater) {
        this.utilityWater = utilityWater;
    }
    
    @Column(name="utility_electricbill", precision=12, scale=0)
    public Float getUtilityElectricbill() {
        return this.utilityElectricbill;
    }
    
    public void setUtilityElectricbill(Float utilityElectricbill) {
        this.utilityElectricbill = utilityElectricbill;
    }
    
    @Column(name="utility_fines", precision=12, scale=0)
    public Float getUtilityFines() {
        return this.utilityFines;
    }
    
    public void setUtilityFines(Float utilityFines) {
        this.utilityFines = utilityFines;
    }
    
    @Column(name="utility_total", precision=12, scale=0)
    public Float getUtilityTotal() {
        return this.utilityTotal;
    }
    
    public void setUtilityTotal(Float utilityTotal) {
        this.utilityTotal = utilityTotal;
    }




}


