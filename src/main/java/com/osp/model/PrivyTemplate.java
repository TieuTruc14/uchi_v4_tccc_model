package com.osp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by tieut on 10/12/2017.
 */
@Entity
@Table(name="tbl_privy_template")
public class PrivyTemplate implements Serializable {
    private static final long serialVersionUID = 4885016394011732087L;
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Lob
    @Column(name="content")
    private String content;

    @Column(name="disable",nullable = false)
    private boolean disable;

    @Column(name="deleted",nullable = false)
    private boolean deleted;

    @ManyToOne(optional=true,fetch = FetchType.LAZY)
    @JoinColumn(name="userUpdated")
    private User userUpdated;

    @Column(name="dateUpdated")
    private Date dateUpdated;

    @Column(name="lastTimeSync")
    private Date lastTimeSync;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
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

    public User getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(User userUpdated) {
        this.userUpdated = userUpdated;
    }
}
