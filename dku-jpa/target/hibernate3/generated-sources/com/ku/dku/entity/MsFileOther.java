package com.ku.dku.entity;
// Generated Apr 21, 2021 2:56:37 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MsFileOther generated by hbm2java
 */
@Entity
@Table(name="ms_file_other"
    //, catalog="dku"
)
public class MsFileOther  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_FILENAME = "fileName";
    public static final String P_FILETYPE = "fileType";
    public static final String P_FILEDATA = "fileData";


    private Long recId;
    private String fileName;
    private String fileType;
    private byte[] fileData;

    public MsFileOther() {
    }


    public MsFileOther(String fileName, String fileType, byte[] fileData) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileData = fileData;
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
    
    @Column(name="file_name")
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    @Column(name="file_type")
    public String getFileType() {
        return this.fileType;
    }
    
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    
    @Column(name="file_data")
    public byte[] getFileData() {
        return this.fileData;
    }
    
    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }




}


