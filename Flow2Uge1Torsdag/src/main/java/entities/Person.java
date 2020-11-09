/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;

/**
 *
 * @author Bruger
 */
@Entity
@NamedQueries({
@NamedQuery(name = "Person.deleteAllRows", query = "DELETE from Person"),
@NamedQuery(name = "Person.getAllRows", query = "SELECT p from Person p")})

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
    
      @Temporal(javax.persistence.TemporalType.DATE)
    Date created;
        @Temporal(javax.persistence.TemporalType.DATE)
    Date lastEdited; 

  
    public Person(String firstname, String lastname, String phone) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.created = new Date();
        this.lastEdited = this.created;

    }

   
    

    public Person() {
    }
    
  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

     public Date getCreated() {
        return created;
    }


    public Date getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited() {
        this.lastEdited = new Date();
    }
}
