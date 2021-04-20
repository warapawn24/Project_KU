package com.ku.dku.entity;
// Generated Apr 21, 2021 4:22:11 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TxBailType generated by hbm2java
 */
@Entity
@Table(name="tx_bail_type"
    //, catalog="dku"
)
public class TxBailType  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_BAILID = "bailId";
    public static final String P_BAILTYPE = "bailType";


    private Long recId;
    private Long bailId;
    private String bailType;

    public TxBailType() {
    }


    public TxBailType(Long bailId, String bailType) {
        this.bailId = bailId;
        this.bailType = bailType;
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
    
    @Column(name="bail_id", nullable=false)
    public Long getBailId() {
        return this.bailId;
    }
    
    public void setBailId(Long bailId) {
        this.bailId = bailId;
    }
    
    @Column(name="bail_type", nullable=false)
    public String getBailType() {
        return this.bailType;
    }
    
    public void setBailType(String bailType) {
        this.bailType = bailType;
    }




}


