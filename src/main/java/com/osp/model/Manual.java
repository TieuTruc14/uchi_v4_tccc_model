package com.osp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by tieut on 10/12/2017.
 */
@Entity
@Table(name="tbl_manual")
public class Manual implements Serializable {
    private static final long serialVersionUID = 5868442253977850971L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="title",length = 500)
    private String title;

    @Lob
    @Column(name="content")
    private String content;

    @Column(name="fileName",length = 1023)
    private String fileName;

    @Column(name="filePath",length = 1023)
    private String filePath;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
}
