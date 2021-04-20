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

/**
 * TxStudent generated by hbm2java
 */
@Entity
@Table(name="tx_student"
    //, catalog="dku"
)
public class TxStudent  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_STUDENTUSERNAME = "studentUsername";
    public static final String P_STUDENTPASSWORD = "studentPassword";
    public static final String P_STUDENTFNAME = "studentFname";
    public static final String P_STUDENTLNAME = "studentLname";
    public static final String P_STUDENTEMAIL = "studentEmail";
    public static final String P_STUDENTFACULTY = "studentFaculty";
    public static final String P_STUDENTROOM = "studentRoom";
    public static final String P_STUDENTFAIL = "studentFail";
    public static final String P_STUDENTLOGINDATE = "studentLogindate";
    public static final String P_STUDENTID = "studentId";
    public static final String P_FACULTYCODE = "facultyCode";
    public static final String P_STUDENTBRANCH = "studentBranch";
    public static final String P_STUDENTSTATUS = "studentStatus";
    public static final String P_STUDENTPHONE = "studentPhone";


    private Long recId;
    private String studentUsername;
    private String studentPassword;
    private String studentFname;
    private String studentLname;
    private String studentEmail;
    private String studentFaculty;
    private Long studentRoom;
    private Long studentFail;
    private Date studentLogindate;
    private Long studentId;
    private String facultyCode;
    private String studentBranch;
    private String studentStatus;
    private String studentPhone;

    public TxStudent() {
    }

    public TxStudent(String studentStatus, String studentPhone) {
        this.studentStatus = studentStatus;
        this.studentPhone = studentPhone;
    }

    public TxStudent(String studentUsername, String studentPassword, String studentFname, String studentLname, String studentEmail, String studentFaculty, Long studentRoom, Long studentFail, Date studentLogindate, Long studentId, String facultyCode, String studentBranch, String studentStatus, String studentPhone) {
        this.studentUsername = studentUsername;
        this.studentPassword = studentPassword;
        this.studentFname = studentFname;
        this.studentLname = studentLname;
        this.studentEmail = studentEmail;
        this.studentFaculty = studentFaculty;
        this.studentRoom = studentRoom;
        this.studentFail = studentFail;
        this.studentLogindate = studentLogindate;
        this.studentId = studentId;
        this.facultyCode = facultyCode;
        this.studentBranch = studentBranch;
        this.studentStatus = studentStatus;
        this.studentPhone = studentPhone;
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
    
    @Column(name="student_email")
    public String getStudentEmail() {
        return this.studentEmail;
    }
    
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    
    @Column(name="student_faculty")
    public String getStudentFaculty() {
        return this.studentFaculty;
    }
    
    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }
    
    @Column(name="student_room")
    public Long getStudentRoom() {
        return this.studentRoom;
    }
    
    public void setStudentRoom(Long studentRoom) {
        this.studentRoom = studentRoom;
    }
    
    @Column(name="student_fail")
    public Long getStudentFail() {
        return this.studentFail;
    }
    
    public void setStudentFail(Long studentFail) {
        this.studentFail = studentFail;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="student_logindate", length=19)
    public Date getStudentLogindate() {
        return this.studentLogindate;
    }
    
    public void setStudentLogindate(Date studentLogindate) {
        this.studentLogindate = studentLogindate;
    }
    
    @Column(name="student_id")
    public Long getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    
    @Column(name="faculty_code")
    public String getFacultyCode() {
        return this.facultyCode;
    }
    
    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }
    
    @Column(name="student_branch")
    public String getStudentBranch() {
        return this.studentBranch;
    }
    
    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }
    
    @Column(name="student_status", nullable=false)
    public String getStudentStatus() {
        return this.studentStatus;
    }
    
    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }
    
    @Column(name="student_phone", nullable=false)
    public String getStudentPhone() {
        return this.studentPhone;
    }
    
    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }




}


