package com.ku.dku.entity;
// Generated Mar 28, 2021 1:58:24 PM by Hibernate Tools 3.2.2.GA


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
 * TxOfficer generated by hbm2java
 */
@Entity
@Table(name="tx_officer"
    //, catalog="dku"
)
public class TxOfficer  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_OFFICERUSERNAME = "officerUsername";
    public static final String P_OFFICERPASSWORD = "officerPassword";
    public static final String P_OFFICERFNAME = "officerFname";
    public static final String P_OFFICERLNAME = "officerLname";
    public static final String P_OFFICERROLE = "officerRole";
    public static final String P_OFFICERSTATUS = "officerStatus";
    public static final String P_OFFICERLOGINDATE = "officerLogindate";
    public static final String P_OFFICERFAIL = "officerFail";
    public static final String P_OFFICEREMAIL = "officerEmail";
    public static final String P_OFFICERID = "officerId";
    public static final String P_OFFICEROTP = "officerOtp";
    public static final String P_OFFICERLOGINFIRSTCHANGE = "officerLoginfirstchange";


    private Long recId;
    private String officerUsername;
    private String officerPassword;
    private String officerFname;
    private String officerLname;
    private String officerRole;
    private String officerStatus;
    private Date officerLogindate;
    private Long officerFail;
    private String officerEmail;
    private Long officerId;
    private Long officerOtp;
    private Long officerLoginfirstchange;

    public TxOfficer() {
    }


    public TxOfficer(String officerUsername, String officerPassword, String officerFname, String officerLname, String officerRole, String officerStatus, Date officerLogindate, Long officerFail, String officerEmail, Long officerId, Long officerOtp, Long officerLoginfirstchange) {
        this.officerUsername = officerUsername;
        this.officerPassword = officerPassword;
        this.officerFname = officerFname;
        this.officerLname = officerLname;
        this.officerRole = officerRole;
        this.officerStatus = officerStatus;
        this.officerLogindate = officerLogindate;
        this.officerFail = officerFail;
        this.officerEmail = officerEmail;
        this.officerId = officerId;
        this.officerOtp = officerOtp;
        this.officerLoginfirstchange = officerLoginfirstchange;
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
    
    @Column(name="officer_username", length=50)
    public String getOfficerUsername() {
        return this.officerUsername;
    }
    
    public void setOfficerUsername(String officerUsername) {
        this.officerUsername = officerUsername;
    }
    
    @Column(name="officer_password", length=100)
    public String getOfficerPassword() {
        return this.officerPassword;
    }
    
    public void setOfficerPassword(String officerPassword) {
        this.officerPassword = officerPassword;
    }
    
    @Column(name="officer_fname", length=50)
    public String getOfficerFname() {
        return this.officerFname;
    }
    
    public void setOfficerFname(String officerFname) {
        this.officerFname = officerFname;
    }
    
    @Column(name="officer_lname", length=50)
    public String getOfficerLname() {
        return this.officerLname;
    }
    
    public void setOfficerLname(String officerLname) {
        this.officerLname = officerLname;
    }
    
    @Column(name="officer_role", length=20)
    public String getOfficerRole() {
        return this.officerRole;
    }
    
    public void setOfficerRole(String officerRole) {
        this.officerRole = officerRole;
    }
    
    @Column(name="officer_status", length=50)
    public String getOfficerStatus() {
        return this.officerStatus;
    }
    
    public void setOfficerStatus(String officerStatus) {
        this.officerStatus = officerStatus;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="officer_logindate", length=19)
    public Date getOfficerLogindate() {
        return this.officerLogindate;
    }
    
    public void setOfficerLogindate(Date officerLogindate) {
        this.officerLogindate = officerLogindate;
    }
    
    @Column(name="officer_fail")
    public Long getOfficerFail() {
        return this.officerFail;
    }
    
    public void setOfficerFail(Long officerFail) {
        this.officerFail = officerFail;
    }
    
    @Column(name="officer_email", length=50)
    public String getOfficerEmail() {
        return this.officerEmail;
    }
    
    public void setOfficerEmail(String officerEmail) {
        this.officerEmail = officerEmail;
    }
    
    @Column(name="officer_id")
    public Long getOfficerId() {
        return this.officerId;
    }
    
    public void setOfficerId(Long officerId) {
        this.officerId = officerId;
    }
    
    @Column(name="officer_otp")
    public Long getOfficerOtp() {
        return this.officerOtp;
    }
    
    public void setOfficerOtp(Long officerOtp) {
        this.officerOtp = officerOtp;
    }
    
    @Column(name="officer_loginfirstchange")
    public Long getOfficerLoginfirstchange() {
        return this.officerLoginfirstchange;
    }
    
    public void setOfficerLoginfirstchange(Long officerLoginfirstchange) {
        this.officerLoginfirstchange = officerLoginfirstchange;
    }




}


