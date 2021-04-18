package com.ku.dku.entity;
// Generated Apr 19, 2021 3:03:38 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TxReserveDetail generated by hbm2java
 */
@Entity
@Table(name="tx_reserve_detail"
    //, catalog="dku"
)
public class TxReserveDetail  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_RESERVEID = "reserveId";
    public static final String P_STUDENTID = "studentId";
    public static final String P_STUDENTFNAME = "studentFname";
    public static final String P_STUDENTLNAME = "studentLname";


    private Long recId;
    private Long reserveId;
    private Long studentId;
    private String studentFname;
    private String studentLname;

    public TxReserveDetail() {
    }


    public TxReserveDetail(Long reserveId, Long studentId, String studentFname, String studentLname) {
        this.reserveId = reserveId;
        this.studentId = studentId;
        this.studentFname = studentFname;
        this.studentLname = studentLname;
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
    
    @Column(name="reserve_id")
    public Long getReserveId() {
        return this.reserveId;
    }
    
    public void setReserveId(Long reserveId) {
        this.reserveId = reserveId;
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




}


