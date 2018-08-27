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
@Table(name="tbl_group_permission")
public class GroupPermission implements Serializable {
    private static final long serialVersionUID = -3916648224198153835L;
    @Id
    @Column(name="groupId")
    private String groupId;

    @Id
    @Column(name="permissionId")
    private String permissionId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

}
