package com.ku.dku.entity;
// Generated Mar 15, 2021 7:14:33 PM by Hibernate Tools 3.2.2.GA


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
 * TxBail generated by hbm2java
 */
@Entity
@Table(name="tx_bail"
    //, catalog="dku"
)
public class TxBail  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_ROOMID = "roomId";
    public static final String P_STUDENTID = "studentId";
    public static final String P_STUDENTFNAME = "studentFname";
    public static final String P_STUDENTLNAME = "studentLname";
    public static final String P_BAILPHONE = "bailPhone";
    public static final String P_BAILTYPE = "bailType";
    public static final String P_BAILLNOTE = "baillNote";
    public static final String P_YEAR = "year";
    public static final String P_TERMNAME = "termName";
    public static final String P_BAILDATE = "bailDate";
    public static final String P_BAILEQUIPMENT = "bailEquipment";
    public static final String P_BAILACCOUCTNUM = "bailAccouctnum";
    public static final String P_BAILBANK = "bailBank";
    public static final String P_BAILCOLLATERAL = "bailCollateral";
    public static final String P_BAILWATER = "bailWater";
    public static final String P_BAILELECTRICBILL = "bailElectricbill";
    public static final String P_BAILOTHER = "bailOther";
    public static final String P_BAILPRICE = "bailPrice";
    public static final String P_BAILTOTAL = "bailTotal";
    public static final String P_BAILSTATUS = "bailStatus";


    private Long recId;
    private Long roomId;
    private Long studentId;
    private String studentFname;
    private String studentLname;
    private String bailPhone;
    private String bailType;
    private String baillNote;
    private Long year;
    private String termName;
    private Date bailDate;
    private String bailEquipment;
    private String bailAccouctnum;
    private String bailBank;
    private Float bailCollateral;
    private Float bailWater;
    private Float bailElectricbill;
    private Float bailOther;
    private Float bailPrice;
    private Float bailTotal;
    private String bailStatus;

    public TxBail() {
    }


    public TxBail(Long roomId, Long studentId, String studentFname, String studentLname, String bailPhone, String bailType, String baillNote, Long year, String termName, Date bailDate, String bailEquipment, String bailAccouctnum, String bailBank, Float bailCollateral, Float bailWater, Float bailElectricbill, Float bailOther, Float bailPrice, Float bailTotal, String bailStatus) {
        this.roomId = roomId;
        this.studentId = studentId;
        this.studentFname = studentFname;
        this.studentLname = studentLname;
        this.bailPhone = bailPhone;
        this.bailType = bailType;
        this.baillNote = baillNote;
        this.year = year;
        this.termName = termName;
        this.bailDate = bailDate;
        this.bailEquipment = bailEquipment;
        this.bailAccouctnum = bailAccouctnum;
        this.bailBank = bailBank;
        this.bailCollateral = bailCollateral;
        this.bailWater = bailWater;
        this.bailElectricbill = bailElectricbill;
        this.bailOther = bailOther;
        this.bailPrice = bailPrice;
        this.bailTotal = bailTotal;
        this.bailStatus = bailStatus;
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
    
    @Column(name="bail_phone")
    public String getBailPhone() {
        return this.bailPhone;
    }
    
    public void setBailPhone(String bailPhone) {
        this.bailPhone = bailPhone;
    }
    
    @Column(name="bail_type")
    public String getBailType() {
        return this.bailType;
    }
    
    public void setBailType(String bailType) {
        this.bailType = bailType;
    }
    
    @Column(name="baill_note")
    public String getBaillNote() {
        return this.baillNote;
    }
    
    public void setBaillNote(String baillNote) {
        this.baillNote = baillNote;
    }
    
    @Column(name="year")
    public Long getYear() {
        return this.year;
    }
    
    public void setYear(Long year) {
        this.year = year;
    }
    
    @Column(name="term_name")
    public String getTermName() {
        return this.termName;
    }
    
    public void setTermName(String termName) {
        this.termName = termName;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="bail_date", length=19)
    @DateTimeFormat(pattern="dd/MM/yyyy")
    public Date getBailDate() {
        return this.bailDate;
    }
    
    public void setBailDate(Date bailDate) {
        this.bailDate = bailDate;
    }
    
    @Column(name="bail_equipment")
    public String getBailEquipment() {
        return this.bailEquipment;
    }
    
    public void setBailEquipment(String bailEquipment) {
        this.bailEquipment = bailEquipment;
    }
    
    @Column(name="bail_accouctnum")
    public String getBailAccouctnum() {
        return this.bailAccouctnum;
    }
    
    public void setBailAccouctnum(String bailAccouctnum) {
        this.bailAccouctnum = bailAccouctnum;
    }
    
    @Column(name="bail_bank")
    public String getBailBank() {
        return this.bailBank;
    }
    
    public void setBailBank(String bailBank) {
        this.bailBank = bailBank;
    }
    
    @Column(name="bail_collateral", precision=12, scale=0)
    public Float getBailCollateral() {
        return this.bailCollateral;
    }
    
    public void setBailCollateral(Float bailCollateral) {
        this.bailCollateral = bailCollateral;
    }
    
    @Column(name="bail_water", precision=12, scale=0)
    public Float getBailWater() {
        return this.bailWater;
    }
    
    public void setBailWater(Float bailWater) {
        this.bailWater = bailWater;
    }
    
    @Column(name="bail_electricbill", precision=12, scale=0)
    public Float getBailElectricbill() {
        return this.bailElectricbill;
    }
    
    public void setBailElectricbill(Float bailElectricbill) {
        this.bailElectricbill = bailElectricbill;
    }
    
    @Column(name="bail_other", precision=12, scale=0)
    public Float getBailOther() {
        return this.bailOther;
    }
    
    public void setBailOther(Float bailOther) {
        this.bailOther = bailOther;
    }
    
    @Column(name="bail_price", precision=12, scale=0)
    public Float getBailPrice() {
        return this.bailPrice;
    }
    
    public void setBailPrice(Float bailPrice) {
        this.bailPrice = bailPrice;
    }
    
    @Column(name="bail_total", precision=12, scale=0)
    public Float getBailTotal() {
        return this.bailTotal;
    }
    
    public void setBailTotal(Float bailTotal) {
        this.bailTotal = bailTotal;
    }
    
    @Column(name="bail_status")
    public String getBailStatus() {
        return this.bailStatus;
    }
    
    public void setBailStatus(String bailStatus) {
        this.bailStatus = bailStatus;
    }




}


