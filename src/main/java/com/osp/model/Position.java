package com.osp.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tieut on 10/9/2017.
 */
@Entity
@Table(name="tbl_position")
public class Position implements Serializable{
    private static final long serialVersionUID = 1454596603570063448L;
    @Id
    @Column(name="id")
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

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
}
