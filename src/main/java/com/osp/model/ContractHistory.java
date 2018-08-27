package com.osp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by tieut on 10/12/2017.
 */
@Entity
@Table(name="tbl_contract_history")
public class ContractHistory implements Serializable {
    private static final long serialVersionUID = 2588904576406171416L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="contractId")
    private Integer contractId;

    @Column(name="contractNumber",length = 50)
    private String contractNumber;

    @Column(name="clientInfo",length=100)
    private String clientInfo;

    @Column(name="executeDate")
    private Date executeDate;

    @Column(name="executeUser")
    private Integer executeUser;

    @Column(name="executeContent")
    private String executeContent;

    @Lob
    @Column(name="contractContent")
    private String contractContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    public Date getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(Date executeDate) {
        this.executeDate = executeDate;
    }

    public Integer getExecuteUser() {
        return executeUser;
    }

    public void setExecuteUser(Integer executeUser) {
        this.executeUser = executeUser;
    }

    public String getExecuteContent() {
        return executeContent;
    }

    public void setExecuteContent(String executeContent) {
        this.executeContent = executeContent;
    }

    public String getContractContent() {
        return contractContent;
    }

    public void setContractContent(String contractContent) {
        this.contractContent = contractContent;
    }
}
