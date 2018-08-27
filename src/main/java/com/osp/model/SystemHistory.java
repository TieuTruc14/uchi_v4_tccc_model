package com.osp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by tieut on 10/13/2017.
 */
@Entity
@Table(name="tbl_system_history")
public class SystemHistory implements Serializable {
    private static final long serialVersionUID = 3955196844110030363L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="userId")
    private Integer userId;

    @Column(name="username")
    private String username;

    @Column(name="clientInfo")
    private String clientInfo;

    @Column(name="executeDate")
    private Date executeDate;

    @Column(name="action")
    private String action;

    @Lob
    @Column(name="content")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
