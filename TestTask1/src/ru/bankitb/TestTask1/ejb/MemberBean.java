package ru.bankitb.TestTask1.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import ru.bankitb.TestTask1.model.*;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateful
@LocalBean
public class MemberBean {

    /**
     * Default constructor. 
     */
    public MemberBean() {

    }
    
    private static Member member;

    public void setMember(Member copyMember){
    	member = new Member(copyMember.getFirstname(),copyMember.getLastname(),copyMember.getMiddlename(),copyMember.getdateOfBirth());
    }
    
    
    public Member getMember(){
    	return member;
    }

    
}
