package com.ku.dku.entity;
// Generated Mar 10, 2021 2:42:40 AM by Hibernate Tools 3.2.2.GA


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
 * TxLoginAdmin generated by hbm2java
 */
@Entity
@Table(name="tx_login_admin"
    //, catalog="dku"
)
public class TxLoginAdmin  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_OFFICERID = "officerId";
    public static final String P_OFFICERPASSWORD = "officerPassword";
    public static final String P_OFFICERUSERNAME = "officerUsername";
    public static final String P_LOGINTIME = "loginTime";
    public static final String P_LOGINERROR = "loginError";
    public static final String P_LOGINFORM = "loginForm";


    private Long recId;
    private Long officerId;
    private String officerPassword;
    private String officerUsername;
    private Date loginTime;
    private String loginError;
    private String loginForm;

    public TxLoginAdmin() {
    }

    public TxLoginAdmin(String loginError) {
        this.loginError = loginError;
    }

    public TxLoginAdmin(Long officerId, String officerPassword, String officerUsername, Date loginTime, String loginError, String loginForm) {
        this.officerId = officerId;
        this.officerPassword = officerPassword;
        this.officerUsername = officerUsername;
        this.loginTime = loginTime;
        this.loginError = loginError;
        this.loginForm = loginForm;
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
    
    @Column(name="officer_id")
    public Long getOfficerId() {
        return this.officerId;
    }
    
    public void setOfficerId(Long officerId) {
        this.officerId = officerId;
    }
    
    @Column(name="Officer_password")
    public String getOfficerPassword() {
        return this.officerPassword;
    }
    
    public void setOfficerPassword(String officerPassword) {
        this.officerPassword = officerPassword;
    }
    
    @Column(name="officer_username")
    public String getOfficerUsername() {
        return this.officerUsername;
    }
    
    public void setOfficerUsername(String officerUsername) {
        this.officerUsername = officerUsername;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="login_time", length=19)
    public Date getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
    
    @Column(name="login_error", nullable=false, length=1)
    public String getLoginError() {
        return this.loginError;
    }
    
    public void setLoginError(String loginError) {
        this.loginError = loginError;
    }
    
    @Column(name="login_form")
    public String getLoginForm() {
        return this.loginForm;
    }
    
    public void setLoginForm(String loginForm) {
        this.loginForm = loginForm;
    }




}


