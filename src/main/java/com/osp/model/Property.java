package com.osp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by tieut on 11/20/2017.
 */
@Entity
@Table(name="tbl_property")
public class Property implements Serializable {
    private static final long serialVersionUID = -6000968365304222713L;
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="type")
    private String type;

    @Column(name="template")
    private String template;

    @Column(name="propertyInfo")
    private String propertyInfo;

    @Column(name="ownerInfo")
    private String ownerInfo;

    @Column(name="otherInfo")
    private String otherInfo;

    @Column(name="restrict")
    private String restrict;

    @Column(name="apartmentAddress")
    private String apartmentAddress;

    @Column(name="apartmentNumber")
    private String apartmentNumber;

    @Column(name="apartmentFloor")
    private String apartmentFloor;

    @Column(name="apartmentAreaUse")
    private String apartmentAreaUse;

    @Column(name="apartmentAreaBuild")
    private String apartmentAreaBuild;

    @Column(name="apartmentStructure")
    private String apartmentStructure;

    @Column(name="apartmentTotalFloor")
    private String apartmentTotalFloor;

    @Column(name="landCertificate")
    private String landCertificate;

    @Column(name="landIssuePlace")
    private String landIssuePlace;

    @Column(name="landIssueDate")
    private Date landIssueDate;

    @Column(name="landMapNumber")
    private String landMapNumber;

    @Column(name="landNumber")
    private String landNumber;

    @Column(name="landAddress")
    private String landAddress;

    @Column(name="landArea")
    private String landArea;

    @Column(name="landAreaText")
    private String landAreaText;

    @Column(name="landPublicArea")
    private String landPublicArea;

    @Column(name="landPrivateArea")
    private String landPrivateArea;

    @Column(name="landUsePurpose")
    private String landUsePurpose;

    @Column(name="landUsePeriod")
    private String landUsePeriod;

    @Column(name="landUseOrigin")
    private String landUseOrigin;

    @Column(name="landAssociateProperty")
    private String landAssociateProperty;

    @Column(name="landStreet")
    private String landStreet;

    @Column(name="landDistrict")
    private String landDistrict;

    @Column(name="landProvince")
    private String landProvince;

    @Column(name="landFullOfArea")
    private String landFullOfArea;

    @Column(name="vehicleLicenseNumber")
    private String vehicleLicenseNumber;

    @Column(name="vehicleRegistNunmber")
    private String vehicleRegistNunmber;

    @Column(name="vehicleIssuePlace")
    private String vehicleIssuePlace;

    @Column(name="vehicleIssueDate")
    private Date vehicleIssueDate;

    @Column(name="vehicleFrameNumber")
    private String vehicleFrameNumber;

    @Column(name="vehicleMachineNumber")
    private String vehicleMachineNumber;

    @Column(name="userCreated")
    private Integer userCreated;

    @Column(name="dateCreated")
    private Date dateCreated;

    @Column(name="userUpdated")
    private Integer userUpdated;

    @Column(name="dateUpdated")
    private Date dateUpdated;

    public Property() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getPropertyInfo() {
        return propertyInfo;
    }

    public void setPropertyInfo(String propertyInfo) {
        this.propertyInfo = propertyInfo;
    }

    public String getOwnerInfo() {
        return ownerInfo;
    }

    public void setOwnerInfo(String ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getRestrict() {
        return restrict;
    }

    public void setRestrict(String restrict) {
        this.restrict = restrict;
    }

    public String getApartmentAddress() {
        return apartmentAddress;
    }

    public void setApartmentAddress(String apartmentAddress) {
        this.apartmentAddress = apartmentAddress;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getApartmentFloor() {
        return apartmentFloor;
    }

    public void setApartmentFloor(String apartmentFloor) {
        this.apartmentFloor = apartmentFloor;
    }

    public String getApartmentAreaUse() {
        return apartmentAreaUse;
    }

    public void setApartmentAreaUse(String apartmentAreaUse) {
        this.apartmentAreaUse = apartmentAreaUse;
    }

    public String getApartmentAreaBuild() {
        return apartmentAreaBuild;
    }

    public void setApartmentAreaBuild(String apartmentAreaBuild) {
        this.apartmentAreaBuild = apartmentAreaBuild;
    }

    public String getApartmentStructure() {
        return apartmentStructure;
    }

    public void setApartmentStructure(String apartmentStructure) {
        this.apartmentStructure = apartmentStructure;
    }

    public String getApartmentTotalFloor() {
        return apartmentTotalFloor;
    }

    public void setApartmentTotalFloor(String apartmentTotalFloor) {
        this.apartmentTotalFloor = apartmentTotalFloor;
    }

    public String getLandCertificate() {
        return landCertificate;
    }

    public void setLandCertificate(String landCertificate) {
        this.landCertificate = landCertificate;
    }

    public String getLandIssuePlace() {
        return landIssuePlace;
    }

    public void setLandIssuePlace(String landIssuePlace) {
        this.landIssuePlace = landIssuePlace;
    }

    public Date getLandIssueDate() {
        return landIssueDate;
    }

    public void setLandIssueDate(Date landIssueDate) {
        this.landIssueDate = landIssueDate;
    }

    public String getLandMapNumber() {
        return landMapNumber;
    }

    public void setLandMapNumber(String landMapNumber) {
        this.landMapNumber = landMapNumber;
    }

    public String getLandNumber() {
        return landNumber;
    }

    public void setLandNumber(String landNumber) {
        this.landNumber = landNumber;
    }

    public String getLandAddress() {
        return landAddress;
    }

    public void setLandAddress(String landAddress) {
        this.landAddress = landAddress;
    }

    public String getLandArea() {
        return landArea;
    }

    public void setLandArea(String landArea) {
        this.landArea = landArea;
    }

    public String getLandAreaText() {
        return landAreaText;
    }

    public void setLandAreaText(String landAreaText) {
        this.landAreaText = landAreaText;
    }

    public String getLandPublicArea() {
        return landPublicArea;
    }

    public void setLandPublicArea(String landPublicArea) {
        this.landPublicArea = landPublicArea;
    }

    public String getLandPrivateArea() {
        return landPrivateArea;
    }

    public void setLandPrivateArea(String landPrivateArea) {
        this.landPrivateArea = landPrivateArea;
    }

    public String getLandUsePurpose() {
        return landUsePurpose;
    }

    public void setLandUsePurpose(String landUsePurpose) {
        this.landUsePurpose = landUsePurpose;
    }

    public String getLandUsePeriod() {
        return landUsePeriod;
    }

    public void setLandUsePeriod(String landUsePeriod) {
        this.landUsePeriod = landUsePeriod;
    }

    public String getLandUseOrigin() {
        return landUseOrigin;
    }

    public void setLandUseOrigin(String landUseOrigin) {
        this.landUseOrigin = landUseOrigin;
    }

    public String getLandAssociateProperty() {
        return landAssociateProperty;
    }

    public void setLandAssociateProperty(String landAssociateProperty) {
        this.landAssociateProperty = landAssociateProperty;
    }

    public String getLandStreet() {
        return landStreet;
    }

    public void setLandStreet(String landStreet) {
        this.landStreet = landStreet;
    }

    public String getLandDistrict() {
        return landDistrict;
    }

    public void setLandDistrict(String landDistrict) {
        this.landDistrict = landDistrict;
    }

    public String getLandProvince() {
        return landProvince;
    }

    public void setLandProvince(String landProvince) {
        this.landProvince = landProvince;
    }

    public String getLandFullOfArea() {
        return landFullOfArea;
    }

    public void setLandFullOfArea(String landFullOfArea) {
        this.landFullOfArea = landFullOfArea;
    }

    public String getVehicleLicenseNumber() {
        return vehicleLicenseNumber;
    }

    public void setVehicleLicenseNumber(String vehicleLicenseNumber) {
        this.vehicleLicenseNumber = vehicleLicenseNumber;
    }

    public String getVehicleRegistNunmber() {
        return vehicleRegistNunmber;
    }

    public void setVehicleRegistNunmber(String vehicleRegistNunmber) {
        this.vehicleRegistNunmber = vehicleRegistNunmber;
    }

    public String getVehicleIssuePlace() {
        return vehicleIssuePlace;
    }

    public void setVehicleIssuePlace(String vehicleIssuePlace) {
        this.vehicleIssuePlace = vehicleIssuePlace;
    }

    public Date getVehicleIssueDate() {
        return vehicleIssueDate;
    }

    public void setVehicleIssueDate(Date vehicleIssueDate) {
        this.vehicleIssueDate = vehicleIssueDate;
    }

    public String getVehicleFrameNumber() {
        return vehicleFrameNumber;
    }

    public void setVehicleFrameNumber(String vehicleFrameNumber) {
        this.vehicleFrameNumber = vehicleFrameNumber;
    }

    public String getVehicleMachineNumber() {
        return vehicleMachineNumber;
    }

    public void setVehicleMachineNumber(String vehicleMachineNumber) {
        this.vehicleMachineNumber = vehicleMachineNumber;
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
