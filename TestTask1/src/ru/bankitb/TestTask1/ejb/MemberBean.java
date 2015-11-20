package ru.bankitb.TestTask1.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import java.util.concurrent.TimeUnit;
import ru.bankitb.TestTask1.model.*;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateful
@LocalBean
@StatefulTimeout(unit = TimeUnit.MINUTES, value = 20)
public class MemberBean {

    /**
     * Default constructor. 
     */
    public MemberBean() {

    }
    
    private Member member;

    public void setMember(Member copyMember){
    	member = new Member(copyMember.getFirstname(),copyMember.getLastname(),copyMember.getMiddlename(),copyMember.getdateOfBirth());
    }
    
    
    public Member getMember(){
    	return member;
    }

    
}
