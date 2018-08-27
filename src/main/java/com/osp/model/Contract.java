package com.osp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by tieut on 10/12/2017.
 */
@Entity
@Table(name="tbl_contract")
public class Contract implements Serializable {

    private static final long serialVersionUID = -2373992573082845885L;
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="offline",nullable = false)
    private boolean offline;

    @Column(name="type",nullable = false)
    private byte type;// 0-cho ky, 1-da ky, 2-tra ve, 3-chinh sua, 4-da dong dau

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="contractTemplate")
    private ContractTemplate contractTemplate;

    @Column(name="contractNumber",length = 50,unique = true)
    private String contractNumber;

    @Column(name="contractValue")
    private Long contractValue;

    @Lob
    @Column(name="relationObject")
    private String relationObject;

    @Lob
    @Column(name="propertyInfo")
    private String propertyInfo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="notary")
    private User notary;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="drafter")
    private User drafter;

    @Column(name="receivedDate")
    private Date receivedDate;

    @Column(name="notaryDate")
    private Date notaryDate;

    @Column(name="numberCopyContract")
    private Integer numberCopyContract;

    @Column(name="numberOfPage")
    private Integer numberOfPage;

    @Column(name="notaryCost")
    private Long notaryCost;

    @Column(name="remunerationCost")
    private Long remunerationCost;

    @Column(name="notaryCostTotal")
    private Long notaryCostTotal;

    @Column(name="notaryOutside",nullable = false)
    private boolean notaryOutside;

    @Column(name="notaryPlaceOutside")
    private String notaryPlaceOutside;

    @Column(name="bank")
    private Bank bank;

    @Column(name="bankServiceCost")
    private Long bankServiceCost;

    @Column(name="crediterName")
    private String crediterName;

    @Column(name="fileName",length = 1000)
    private String fileName;

    @Column(name="filePath",length = 1000)
    private String filePath;

    @Column(name="errorStatus",nullable = false)
    private boolean errorStatus;

    @Column(name="errorUser")
    private Integer errorUser;

    @Column(name="errorDescription")
    private String errorDescription;

    @Column(name="additionStatus",nullable = false)
    private boolean additionStatus;

    @Column(name="additionDescription")
    private String additionDescription;

    @Column(name="cancelStatus",nullable = false)
    private boolean cancelStatus;

    @Column(name="cancelDescription")
    private String cancelDescription;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="cancelRelationContract")
    private Contract cancelRelationContract;

    @Column(name="contractPeriod")
    private Date contractPeriod;

    @Column(name="mortageCancelStatus",nullable = false)
    private boolean mortageCancelStatus;

    @Column(name="mortageCancelDate")
    private Date mortageCancelDate;

    @Column(name="mortageCancelNote")
    private String mortageCancelNote;

    @Column(name="originalStorePlace")
    private String originalStorePlace;

    @Lob
    @Column(name="note")
    private String note;//text

    @Lob
    @Column(name="summary")
    private String summary;//text

    @Lob
    @Column(name="content")
    private String content;//longtext

    @Lob
    @Column(name="jsonProperty")
    private String jsonProperty;//text

    @Lob
    @Column(name="jsonPrivy")
    private String jsonPrivy;//text

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userCreated")
    private User userCreated;

    @Column(name="dateCreated")
    private Date dateCreated;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userUpdated")
    private User userUpdated;

    @Column(name="dateUpdated")
    private Date dateUpdated;

    @Column(name="deleted")
    private boolean deleted;

    @Column(name="sync")
    private boolean sync;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public ContractTemplate getContractTemplate() {
        return contractTemplate;
    }

    public void setContractTemplate(ContractTemplate contractTemplate) {
        this.contractTemplate = contractTemplate;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Long getContractValue() {
        return contractValue;
    }

    public void setContractValue(Long contractValue) {
        this.contractValue = contractValue;
    }

    public String getRelationObject() {
        return relationObject;
    }

    public void setRelationObject(String relationObject) {
        this.relationObject = relationObject;
    }

    public String getPropertyInfo() {
        return propertyInfo;
    }

    public void setPropertyInfo(String propertyInfo) {
        this.propertyInfo = propertyInfo;
    }

    public User getNotary() {
        return notary;
    }

    public void setNotary(User notary) {
        this.notary = notary;
    }

    public User getDrafter() {
        return drafter;
    }

    public void setDrafter(User drafter) {
        this.drafter = drafter;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getNotaryDate() {
        return notaryDate;
    }

    public void setNotaryDate(Date notaryDate) {
        this.notaryDate = notaryDate;
    }

    public Integer getNumberCopyContract() {
        return numberCopyContract;
    }

    public void setNumberCopyContract(Integer numberCopyContract) {
        this.numberCopyContract = numberCopyContract;
    }

    public Integer getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(Integer numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public Long getNotaryCost() {
        return notaryCost;
    }

    public void setNotaryCost(Long notaryCost) {
        this.notaryCost = notaryCost;
    }

    public Long getRemunerationCost() {
        return remunerationCost;
    }

    public void setRemunerationCost(Long remunerationCost) {
        this.remunerationCost = remunerationCost;
    }

    public Long getNotaryCostTotal() {
        return notaryCostTotal;
    }

    public void setNotaryCostTotal(Long notaryCostTotal) {
        this.notaryCostTotal = notaryCostTotal;
    }

    public boolean isNotaryOutside() {
        return notaryOutside;
    }

    public void setNotaryOutside(boolean notaryOutside) {
        this.notaryOutside = notaryOutside;
    }

    public String getNotaryPlaceOutside() {
        return notaryPlaceOutside;
    }

    public void setNotaryPlaceOutside(String notaryPlaceOutside) {
        this.notaryPlaceOutside = notaryPlaceOutside;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Long getBankServiceCost() {
        return bankServiceCost;
    }

    public void setBankServiceCost(Long bankServiceCost) {
        this.bankServiceCost = bankServiceCost;
    }

    public String getCrediterName() {
        return crediterName;
    }

    public void setCrediterName(String crediterName) {
        this.crediterName = crediterName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean isErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(boolean errorStatus) {
        this.errorStatus = errorStatus;
    }

    public Integer getErrorUser() {
        return errorUser;
    }

    public void setErrorUser(Integer errorUser) {
        this.errorUser = errorUser;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public boolean isAdditionStatus() {
        return additionStatus;
    }

    public void setAdditionStatus(boolean additionStatus) {
        this.additionStatus = additionStatus;
    }

    public String getAdditionDescription() {
        return additionDescription;
    }

    public void setAdditionDescription(String additionDescription) {
        this.additionDescription = additionDescription;
    }

    public boolean isCancelStatus() {
        return cancelStatus;
    }

    public void setCancelStatus(boolean cancelStatus) {
        this.cancelStatus = cancelStatus;
    }

    public String getCancelDescription() {
        return cancelDescription;
    }

    public void setCancelDescription(String cancelDescription) {
        this.cancelDescription = cancelDescription;
    }

    public Contract getCancelRelationContract() {
        return cancelRelationContract;
    }

    public void setCancelRelationContract(Contract cancelRelationContract) {
        this.cancelRelationContract = cancelRelationContract;
    }

    public Date getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(Date contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public boolean isMortageCancelStatus() {
        return mortageCancelStatus;
    }

    public void setMortageCancelStatus(boolean mortageCancelStatus) {
        this.mortageCancelStatus = mortageCancelStatus;
    }

    public Date getMortageCancelDate() {
        return mortageCancelDate;
    }

    public void setMortageCancelDate(Date mortageCancelDate) {
        this.mortageCancelDate = mortageCancelDate;
    }

    public String getMortageCancelNote() {
        return mortageCancelNote;
    }

    public void setMortageCancelNote(String mortageCancelNote) {
        this.mortageCancelNote = mortageCancelNote;
    }

    public String getOriginalStorePlace() {
        return originalStorePlace;
    }

    public void setOriginalStorePlace(String originalStorePlace) {
        this.originalStorePlace = originalStorePlace;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getJsonProperty() {
        return jsonProperty;
    }

    public void setJsonProperty(String jsonProperty) {
        this.jsonProperty = jsonProperty;
    }

    public String getJsonPrivy() {
        return jsonPrivy;
    }

    public void setJsonPrivy(String jsonPrivy) {
        this.jsonPrivy = jsonPrivy;
    }

    public User getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(User userCreated) {
        this.userCreated = userCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public User getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(User userUpdated) {
        this.userUpdated = userUpdated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isSync() {
        return sync;
    }

    public void setSync(boolean sync) {
        this.sync = sync;
    }
}
