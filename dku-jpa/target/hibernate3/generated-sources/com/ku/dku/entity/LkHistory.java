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
 * LkHistory generated by hbm2java
 */
@Entity
@Table(name="lk_history"
    //, catalog="dku"
)
public class LkHistory  implements java.io.Serializable, BaseEntity {
	private static final long serialVersionUID = 1L;


    public static final String P_RECID = "recId";
    public static final String P_HISTORYTEXT = "historyText";


    private Long recId;
    private String historyText;

    public LkHistory() {
    }


    public LkHistory(String historyText) {
        this.historyText = historyText;
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
    
    @Column(name="history_text", length=65535)
    public String getHistoryText() {
        return this.historyText;
    }
    
    public void setHistoryText(String historyText) {
        this.historyText = historyText;
    }




}


