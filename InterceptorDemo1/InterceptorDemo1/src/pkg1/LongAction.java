package pkg1;

import com.opensymphony.xwork2.Action;

public class LongAction implements Action {

	public String execute() throws Exception {
		Thread.sleep(5000);		
		return SUCCESS;
	}
}
