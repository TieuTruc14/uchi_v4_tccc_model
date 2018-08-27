package com.osp.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by tieut on 9/10/2017.
 */
@Entity
@Table(name="tbl_user")
public class User implements UserDetails{
    private static final long serialVersionUID = 1683311979622516214L;
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name = "username", nullable = false,unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name="viewNameType")
    private Byte viewNameType;

    @Column(name = "passport",length=50)
    private String passport;

    @Column(name = "birthday",length=50)
    private Date birthday;

    @Column(name = "sex",nullable = false)
    private boolean sex;

    @Column(name = "email")
    private String email;

    @Column(name = "validNotary",nullable = false)
    private boolean validNotary;//cong chung vien hop danh

    @Column(name = "phone")
    private String phone;

    @Column(name = "address",length=1023)
    private String address;

    @Column(name = "fileName",length=1023)
    private String fileName;

    @Column(name = "filePath",length = 1023)
    private String filePath;

    @Column(name = "position")
    private String position;//chuc vu

    @Column(name = "disable",nullable = false)
    private boolean disable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userCreated")
    private User userCreated;

    @Column(name = "dateCreated")
    private Date dateCreated;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userUpdated")
    private User userUpdated;

    @Column(name = "dateUpdated")
    private Date dateUpdated;

    @Column(name = "deleted",nullable = false)
    private boolean deleted;

    /**
     * For spring user
     */
    private transient List<GrantedAuthority> grantedAuths;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getViewNameType() {
        return viewNameType;
    }

    public void setViewNameType(Byte viewNameType) {
        this.viewNameType = viewNameType;
    }

    public String getFullName(){
        if(this.lastName!=null){
            if(this.viewNameType!=null){
                switch (this.viewNameType.intValue()){
                    case 0: return (this.lastName+" "+this.firstName);
                    case 1: return (this.firstName+" "+this.lastName);
                    case 2: return this.firstName;
                    default: return (this.lastName+" "+this.firstName);
                }
            }
            return (this.lastName+" "+this.firstName);
        }
        return this.firstName;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public List<GrantedAuthority> getGrantedAuths() {
        return grantedAuths;
    }

    public void setGrantedAuths(List<GrantedAuthority> grantedAuths) {
        this.grantedAuths = grantedAuths;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuths;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValidNotary() {
        return validNotary;
    }

    public void setValidNotary(boolean validNotary) {
        this.validNotary = validNotary;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
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
}
