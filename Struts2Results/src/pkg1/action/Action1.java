package pkg1.action;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.Action;
public class Action1 implements Action, ServletRequestAware{
	HttpServletRequest request;
	String message;

	public void setServletRequest(HttpServletRequest request) {
		this.request=request;		
	}
	
	public String getMessage() {
		
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() throws Exception {
		System.out.println("Action1.execute() running...");
		setMessage("Welcome to Results in  Struts2");		
		request.setAttribute("name", "Subodh Sharma");		
		return SUCCESS;
	}

}
