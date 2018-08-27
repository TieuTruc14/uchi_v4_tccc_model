package com.osp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by tieut on 10/12/2017.
 */
@Entity
@Table(name="tbl_contract_kind")
public class ContractKind implements Serializable{
    private static final long serialVersionUID = 5383455427601413753L;
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name",length=500)
    private String name;

    @Column(name="orderNumber")
    private Integer orderNumber;

    @Column(name="note",length=1000)
    private String note;

    @Column(name="lastTimeSync")
    private Date lastTimeSync;

    @Column(name="disable",nullable = false)
    private boolean disable;

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

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public Date getLastTimeSync() {
        return lastTimeSync;
    }

    public void setLastTimeSync(Date lastTimeSync) {
        this.lastTimeSync = lastTimeSync;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
