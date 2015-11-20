package ru.bankitb.TestTask1.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Member implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstname;
	private String lastname;
	private String middlename;
	private Date dateOfBirth;
	
	public Member() {
    }
	
	
    public Member(String firstname, String lastname, String middlename, Date dateOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.dateOfBirth = dateOfBirth;
    }
    
    
	public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getMiddlename() {
        return this.middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }
    
    public Date getdateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
