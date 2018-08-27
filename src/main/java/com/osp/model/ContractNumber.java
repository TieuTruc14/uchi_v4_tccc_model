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
@Table(name="tbl_contract_number")
public class ContractNumber implements Serializable {
    private static final long serialVersionUID = 2994124171900825518L;
    @Id
    @Column(name="id",length = 20)
    private String id;

    @Column(name="value")
    private Integer value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
