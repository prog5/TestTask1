package ru.bankitb.TestTask1.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Member {
	/**
	 * 
	 */
	private String firstname;
	private String lastname;
	private String middlename;
	private String dateOfBirth;
	
	public Member() {
    }
	
	
    public Member(String firstname, String lastname, String middlename, String dateOfBirth) {
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
    
    public String getdateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
