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
@Table(name="tbl_contract_appendix")
public class ContractAppendix implements Serializable {
    private static final long serialVersionUID = -150843317942219568L;

    @Id
    @Column(name="contractId")
    private Integer contractId;

    @Id
    @Column(name="contractAppendixId")
    private Integer contractAppendixId;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getContractAppendixId() {
        return contractAppendixId;
    }

    public void setContractAppendixId(Integer contractAppendixId) {
        this.contractAppendixId = contractAppendixId;
    }
}
