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
@Table(name="tbl_privy_contract")
public class PrivyContract implements Serializable{
    private static final long serialVersionUID = -6578735743262448050L;
    @Id
    @Column(name="privyId")
    private Integer privyId;
    @Id
    @Column(name="contractId")
    private Integer contractId;

    public PrivyContract(Integer privyId, Integer contractId) {
        this.privyId = privyId;
        this.contractId = contractId;
    }

    public PrivyContract() {
    }

    public Integer getPrivyId() {
        return privyId;
    }

    public void setPrivyId(Integer privyId) {
        this.privyId = privyId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }
}
