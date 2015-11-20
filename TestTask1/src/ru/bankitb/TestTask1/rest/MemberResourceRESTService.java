package ru.bankitb.TestTask1.rest;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ru.bankitb.TestTask1.model.*;
import ru.bankitb.TestTask1.ejb.*;

@Path("/members")

public class MemberResourceRESTService {
	
	    @Produces(MediaType.APPLICATION_JSON)
	    @GET
	    public Member getMember() {
	    	try{

	    		Context ctx = new InitialContext();
		        MemberBean myBean = (MemberBean) ctx.lookup("java:global/TestTask1/MemberBean");
		        Member member = myBean.getMember();

		        if (member == null)	 {
		            return new Member();
		        }

		        return member;
		        
	    		}catch (Exception e ) {
	    			e.printStackTrace();
	    		}
			return null;
	      }
	    
	    @Consumes(MediaType.APPLICATION_JSON)
	    @POST
	    
	    public Member setMember(Member member) {
	    	try{

	    		Context ctx = new InitialContext();
		        MemberBean myBean = (MemberBean) ctx.lookup("java:global/TestTask1/MemberBean");
		        myBean.setMember(member);

		        if (member == null)	 {
		            return new Member();
		        }

		        return member;
		        
	    		}catch (Exception e ) {
	    			e.printStackTrace();
	    		}
			return null;
	      }
}	