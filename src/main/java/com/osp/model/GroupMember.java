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
@Table(name="tbl_group_member")
public class GroupMember implements Serializable {
    private static final long serialVersionUID = 2724524803142341528L;
    @Id
    @Column(name="userId")
    private Integer userId;

    @Id
    @Column(name="groupId")
    private String groupId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
