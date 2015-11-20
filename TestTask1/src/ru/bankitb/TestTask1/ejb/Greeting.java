package ru.bankitb.TestTask1.ejb;

import javax.ejb.Local;
import ru.bankitb.TestTask1.model.*;

@Local
public interface Greeting {
	  public void setMember(Member copyMember);
	  public Member getMember();
}
