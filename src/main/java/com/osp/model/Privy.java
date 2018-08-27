package com.osp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by tieut on 11/20/2017.
 */

@Entity
@Table(name="tbl_privy")
public class Privy implements Serializable {

    private static final long serialVersionUID = 587145862962312864L;
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="privyTemplate")
    private Integer privyTemplate;

    @Column(name="name")
    private String name;

    @Column(name="birthday")
    private Date birthday;

    @Column(name="passport")
    private String passport;

    @Column(name="certificationDate")
    private Date certificationDate;

    @Column(name="certificationPlace")
    private String certificationPlace;

    @Column(name="address")
    private String address;

    @Column(name="position")
    private String position;

    @Column(name="description")
    private String description;

    @Column(name="orgName")
    private String orgName;

    @Column(name="orgAddress")
    private String orgAddress;

    @Column(name="orgCode")
    private String orgCode;

    @Column(name="firstRegistedDate")
    private Date firstRegistedDate;

    @Column(name="numberChangeRegisted")
    private String numberChangeRegisted;

    @Column(name="changeRegistedDate")
    private Date changeRegistedDate;

    @Column(name="departmentIssue")
    private String departmentIssue;

    @Column(name="userCreated")
    private Integer userCreated;

    @Column(name="dateCreated")
    private Date dateCreated;

    @Column(name="userUpdated")
    private Integer userUpdated;

    @Column(name="dateUpdated")
    private Date dateUpdated;

    public Privy() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrivyTemplate() {
        return privyTemplate;
    }

    public void setPrivyTemplate(Integer privyTemplate) {
        this.privyTemplate = privyTemplate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Date getCertificationDate() {
        return certificationDate;
    }

    public void setCertificationDate(Date certificationDate) {
        this.certificationDate = certificationDate;
    }

    public String getCertificationPlace() {
        return certificationPlace;
    }

    public void setCertificationPlace(String certificationPlace) {
        this.certificationPlace = certificationPlace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Date getFirstRegistedDate() {
        return firstRegistedDate;
    }

    public void setFirstRegistedDate(Date firstRegistedDate) {
        this.firstRegistedDate = firstRegistedDate;
    }

    public String getNumberChangeRegisted() {
        return numberChangeRegisted;
    }

    public void setNumberChangeRegisted(String numberChangeRegisted) {
        this.numberChangeRegisted = numberChangeRegisted;
    }

    public Date getChangeRegistedDate() {
        return changeRegistedDate;
    }

    public void setChangeRegistedDate(Date changeRegistedDate) {
        this.changeRegistedDate = changeRegistedDate;
    }

    public String getDepartmentIssue() {
        return departmentIssue;
    }

    public void setDepartmentIssue(String departmentIssue) {
        this.departmentIssue = departmentIssue;
    }

    public Integer getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Integer userCreated) {
        this.userCreated = userCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(Integer userUpdated) {
        this.userUpdated = userUpdated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
