package com.osp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by tieut on 10/12/2017.
 */
@Entity
@Table(name="tbl_contract_template")
public class ContractTemplate implements Serializable {
    private static final long serialVersionUID = -3205440422245189220L;
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name",length=500)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="contractKind")
    private ContractKind contractKind;

    @Column(name="note",length = 1000)
    private String note;

    @Column(name="fileName",length = 1000)
    private String fileName;

    @Column(name="filePath",length = 1000)
    private String filePath;

    @Column(name="disable",nullable = false)
    private boolean disable;

    @Column(name="periodStatus",nullable = false)
    private boolean periodStatus;

    @Column(name="mortageCancel",nullable = false)
    private boolean mortageCancel;

    @Lob
    @Column(name="content")
    private String content;

//    mac dinh userUpdated =null tuc la chua edit bao gio, neu khac null la edit roi.
    @Column(name="userUpdated")
    private Integer userUpdated;

    @Column(name="dateUpdated")
    private Date dateUpdated;

    @Column(name="lastTimeSync")
    private Date lastTimeSync;

    @Column(name="deleted",nullable = false)
    private boolean deleted;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContractKind getContractKind() {
        return contractKind;
    }

    public void setContractKind(ContractKind contractKind) {
        this.contractKind = contractKind;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public boolean isPeriodStatus() {
        return periodStatus;
    }

    public void setPeriodStatus(boolean periodStatus) {
        this.periodStatus = periodStatus;
    }

    public boolean isMortageCancel() {
        return mortageCancel;
    }

    public void setMortageCancel(boolean mortageCancel) {
        this.mortageCancel = mortageCancel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(Integer userUpdated) {
        this.userUpdated = userUpdated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Date getLastTimeSync() {
        return lastTimeSync;
    }

    public void setLastTimeSync(Date lastTimeSync) {
        this.lastTimeSync = lastTimeSync;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
