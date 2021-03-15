package com.ku.dku.entity;
// Generated Mar 15, 2021 7:14:33 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TxBailEquipment generated by hbm2java
 */
@Entity
@Table(name="tx_bail_equipment"
    //, catalog="dku"
)
public class TxBailEquipment  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_BAILID = "bailId";
    public static final String P_BAILEQUIPMENT = "bailEquipment";


    private Long recId;
    private Long bailId;
    private String bailEquipment;

    public TxBailEquipment() {
    }


    public TxBailEquipment(Long bailId, String bailEquipment) {
        this.bailId = bailId;
        this.bailEquipment = bailEquipment;
    }
   
    @Id
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
    
    @Column(name="bail_equipment", nullable=false)
    public String getBailEquipment() {
        return this.bailEquipment;
    }
    
    public void setBailEquipment(String bailEquipment) {
        this.bailEquipment = bailEquipment;
    }




}


