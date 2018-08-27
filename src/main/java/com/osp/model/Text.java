package com.osp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by tieut on 10/12/2017.
 */
@Entity
@Table(name="tbl_text")
public class Text implements Serializable {
    private static final long serialVersionUID = 6782868529471438425L;
    @Id
    @Column(name="id")
    private String id;

    @Column(name="value")
    private String value;//ap dung cho name tccc

    @Column(name="value1")
    private String value1;//ap dung cho name phuong xa

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }
}
