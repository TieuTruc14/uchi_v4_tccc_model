package com.osp.model;

import jdk.nashorn.internal.runtime.logging.Logger;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by tieut on 10/12/2017.
 */
@Entity
@Table(name="tbl_announcement")
public class Announcement implements Serializable {
    private static final long serialVersionUID = 1516380772309711249L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="important",nullable = false)
    private boolean important;

    @Column(name="hidden",nullable = false)
    private boolean hidden;

    @Column(name="type",nullable = false)
    private boolean type;//1-thong bao tu BO Tu Phap, default =0 là cua tccc

    @Column(name="idBTP")
    private Integer idBTP;//id thong bao down tu btp ve. mac dinh Null khi la cua tccc.(Dung so sanh xem khi check stp thi add hay update.) 3 tieng check 1 lan

    @Column(name="orgSend", length = 500)
    private String orgSend;// ten don vi gui thong bao. doi voi thong bao tu BTP

    @Column(name="displayDay")
    private Integer displayDay;//so ngay hien thi

    @Column(name="displayToTime")
    private Date displayToTime;//hien thi toi thoi gian nao

    @Column(name="title")
    private String title;

    @Lob
    @Column(name="content")
    private String content;

    @Column(name="fileName",length = 1023)
    private String fileName;

    @Column(name="filePath",length = 1023)
    private String filePath;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userCreated")
    private User userCreated;

    @Column(name="dateCreated")
    private Date dateCreated;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userUpdated")
    private User userUpdated;

    @Column(name="dateUpdated")
    private Date dateUpdated;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }


    public Integer getIdBTP() {
        return idBTP;
    }

    public void setIdBTP(Integer idBTP) {
        this.idBTP = idBTP;
    }


    public Integer getDisplayDay() {
        return displayDay;
    }

    public void setDisplayDay(Integer displayDay) {
        this.displayDay = displayDay;
    }

    public Date getDisplayToTime() {
        return displayToTime;
    }

    public void setDisplayToTime(Date displayToTime) {
        this.displayToTime = displayToTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public User getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(User userCreated) {
        this.userCreated = userCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public User getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(User userUpdated) {
        this.userUpdated = userUpdated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getOrgSend() {
        return orgSend;
    }

    public void setOrgSend(String orgSend) {
        this.orgSend = orgSend;
    }
}
