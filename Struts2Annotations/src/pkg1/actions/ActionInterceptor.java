package pkg1.actions;

import javax.security.sasl.AuthenticationException;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.annotations.After;
import com.opensymphony.xwork2.interceptor.annotations.Before;
import com.opensymphony.xwork2.interceptor.annotations.BeforeResult;
import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

@Results({ 
		@Result(name = "success", location = "/WEB-INF/jsp/success.jsp"),
		@Result(name = "input", location = "/index.jsp") 
		})
@org.apache.struts2.convention.annotation.ParentPackage(value = "default") 
public class ActionInterceptor extends ActionSupport {
	String msg = "Default message";

	@Override
	public void validate() {
	System.out.println("Validate method");
	}
	
	public String getMsg() {
		return msg;
	}

	//@Action(value="/actInt1")
	@Action(value = "/actInt1",interceptorRefs={@InterceptorRef("Int1"), @InterceptorRef("defaultStack")})
	public String execute() throws Exception {
		System.out.println("It is execute method in ActionInterceptor");
		msg = "ActionInterceptor Action";
		return SUCCESS;
	}

	/*@After
	public void afterExecute() throws ValidationException {
		System.out.println("After execute method");
	}

	@Before
	public void beforeExecute()  throws AuthenticationException{
		System.out.println("Before execute method");
	}

	@BeforeResult
	public void beforeResult() throws AuthenticationException{
		System.out.println("BeforeResult method");
	}*/
}
