package com.osp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by tieut on 11/22/2017.
 */
@Entity
@Table(name="tbl_property_contract")
public class PropertyContract implements Serializable{
    private static final long serialVersionUID = -5572183931777674059L;
    @Id
    @Column(name="propertyId")
    private Integer propertyId;
    @Id
    @Column(name="contractId")
    private Integer contractId;

    public PropertyContract() {
    }

    public PropertyContract(Integer propertyId, Integer contractId) {
        this.propertyId = propertyId;
        contractId = contractId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }
}
