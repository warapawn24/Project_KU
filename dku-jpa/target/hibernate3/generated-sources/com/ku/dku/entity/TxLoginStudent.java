package com.ku.dku.entity;
// Generated Apr 19, 2021 3:03:38 AM by Hibernate Tools 3.2.2.GA


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
 * TxLoginStudent generated by hbm2java
 */
@Entity
@Table(name="tx_login_student"
    //, catalog="dku"
)
public class TxLoginStudent  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_STUDENTID = "studentId";
    public static final String P_STUDENTUSERNAME = "studentUsername";
    public static final String P_STUDENTPASSWORD = "studentPassword";
    public static final String P_LOGINTIME = "loginTime";
    public static final String P_LOGINERROR = "loginError";
    public static final String P_LOGINFORM = "loginForm";


    private Long recId;
    private Long studentId;
    private String studentUsername;
    private String studentPassword;
    private Date loginTime;
    private String loginError;
    private String loginForm;

    public TxLoginStudent() {
    }


    public TxLoginStudent(Long studentId, String studentUsername, String studentPassword, Date loginTime, String loginError, String loginForm) {
        this.studentId = studentId;
        this.studentUsername = studentUsername;
        this.studentPassword = studentPassword;
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
    
    @Column(name="student_id")
    public Long getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    
    @Column(name="student_username")
    public String getStudentUsername() {
        return this.studentUsername;
    }
    
    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
    }
    
    @Column(name="student_password")
    public String getStudentPassword() {
        return this.studentPassword;
    }
    
    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="login_time", length=19)
    public Date getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
    
    @Column(name="login_error", length=1)
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


