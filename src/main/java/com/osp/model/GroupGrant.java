package com.osp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by tieut on 10/19/2017.
 */
@Entity
@Table(name="tbl_group_grant")
public class GroupGrant implements Serializable {
    private static final long serialVersionUID = 7523511047722632868L;

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="type")
    private int type;

    @Column(name="xem")
    private boolean xem;

    @Column(name="them")
    private boolean them;

    @Column(name="sua")
    private boolean sua;

    @Column(name="xoa")
    private boolean xoa;

    @Column(name="backup")
    private boolean backup;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isXem() {
        return xem;
    }

    public void setXem(boolean xem) {
        this.xem = xem;
    }

    public boolean isThem() {
        return them;
    }

    public void setThem(boolean them) {
        this.them = them;
    }

    public boolean isSua() {
        return sua;
    }

    public void setSua(boolean sua) {
        this.sua = sua;
    }

    public boolean isXoa() {
        return xoa;
    }

    public void setXoa(boolean xoa) {
        this.xoa = xoa;
    }

    public boolean isBackup() {
        return backup;
    }

    public void setBackup(boolean backup) {
        this.backup = backup;
    }
}
