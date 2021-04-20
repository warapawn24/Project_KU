package com.ku.dku.entity;
// Generated Apr 21, 2021 4:22:11 AM by Hibernate Tools 3.2.2.GA


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
 * TxPost generated by hbm2java
 */
@Entity
@Table(name="tx_post"
    //, catalog="dku"
)
public class TxPost  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_POSTCODE = "postCode";
    public static final String P_STUDENTID = "studentId";
    public static final String P_STUDENTFNAME = "studentFname";
    public static final String P_STUDENTLNAME = "studentLname";
    public static final String P_POSTDATE = "postDate";
    public static final String P_POSTTYPE = "postType";
    public static final String P_POSTSTATUS = "postStatus";
    public static final String P_YEAR = "year";
    public static final String P_POSTRECIVEDATE = "postRecivedate";


    private Long recId;
    private String postCode;
    private Long studentId;
    private String studentFname;
    private String studentLname;
    private Date postDate;
    private String postType;
    private String postStatus;
    private Long year;
    private Date postRecivedate;

    public TxPost() {
    }


    public TxPost(String postCode, Long studentId, String studentFname, String studentLname, Date postDate, String postType, String postStatus, Long year, Date postRecivedate) {
        this.postCode = postCode;
        this.studentId = studentId;
        this.studentFname = studentFname;
        this.studentLname = studentLname;
        this.postDate = postDate;
        this.postType = postType;
        this.postStatus = postStatus;
        this.year = year;
        this.postRecivedate = postRecivedate;
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
    
    @Column(name="post_code")
    public String getPostCode() {
        return this.postCode;
    }
    
    public void setPostCode(String postCode) {
        this.postCode = postCode;
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
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="post_date", length=19)
    @DateTimeFormat(pattern="dd/MM/yyyy")
    public Date getPostDate() {
        return this.postDate;
    }
    
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    
    @Column(name="post_type")
    public String getPostType() {
        return this.postType;
    }
    
    public void setPostType(String postType) {
        this.postType = postType;
    }
    
    @Column(name="post_status")
    public String getPostStatus() {
        return this.postStatus;
    }
    
    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }
    
    @Column(name="year")
    public Long getYear() {
        return this.year;
    }
    
    public void setYear(Long year) {
        this.year = year;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="post_recivedate", length=19)
    public Date getPostRecivedate() {
        return this.postRecivedate;
    }
    
    public void setPostRecivedate(Date postRecivedate) {
        this.postRecivedate = postRecivedate;
    }




}


