/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "lending_of_book")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LendingOfBook.findAll", query = "SELECT l FROM LendingOfBook l")
    , @NamedQuery(name = "LendingOfBook.findById", query = "SELECT l FROM LendingOfBook l WHERE l.id = :id")
    , @NamedQuery(name = "LendingOfBook.findByRemark", query = "SELECT l FROM LendingOfBook l WHERE l.remark = :remark")
    , @NamedQuery(name = "LendingOfBook.findByDate", query = "SELECT l FROM LendingOfBook l WHERE l.date = :date")
    , @NamedQuery(name = "LendingOfBook.findByDateReturn", query = "SELECT l FROM LendingOfBook l WHERE l.dateReturn = :dateReturn")})
public class LendingOfBook implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "remark")
    private String remark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_return")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReturn;
    @JoinColumn(name = "users_login", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private User usersLogin;
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Book bookId;

    public LendingOfBook() {
    }

    public LendingOfBook(Integer id) {
        this.id = id;
    }

    public LendingOfBook(Integer id, String remark, Date date, Date dateReturn) {
        this.id = id;
        this.remark = remark;
        this.date = date;
        this.dateReturn = dateReturn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public User getUsersLogin() {
        return usersLogin;
    }

    public void setUsersLogin(User usersLogin) {
        this.usersLogin = usersLogin;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LendingOfBook)) {
            return false;
        }
        LendingOfBook other = (LendingOfBook) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.LendingOfBook[ id=" + id + " ]";
    }
    
}
