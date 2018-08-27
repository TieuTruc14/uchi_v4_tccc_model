package com.osp.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tieut on 10/23/2017.
 */
@Entity
@Table(name="tbl_permission_group_grant")
public class PermissionGroupGrant implements Serializable {
    private static final long serialVersionUID = 4577514025534254195L;
    @Id
    @Column(name="permissionId")
    private String permissionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="groupGrantId")
    private GroupGrant groupGrantId;

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public GroupGrant getGroupGrantId() {
        return groupGrantId;
    }

    public void setGroupGrantId(GroupGrant groupGrantId) {
        this.groupGrantId = groupGrantId;
    }
}
