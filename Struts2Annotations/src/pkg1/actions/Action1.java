package pkg1.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
@Results({
	   @Result(name="success", location="/WEB-INF/jsp/success.jsp"),
	   @Result(name="input", location="/index.jsp")
	})

public class Action1 extends ActionSupport 
{
String msg="Default message";
public String getMsg() {
	return msg;
}
	@Action(value="/action1")
//@Action("/action1")
public String execute1(){
	System.out.println("It is execute1 methods");
	msg="execute1";
	return SUCCESS;
}
	
	@Action(value="/action2")
	//@Action("/action1")
	public String execute2(){
		System.out.println("It is execute2 methods");
		msg="execute2";
		return SUCCESS;
	}

	@Actions({
		    @Action("/action3"),
		    @Action("/action4")
		  })
	public String execute3()
	{
		System.out.println("It is execute3");
		msg="execute3-4";
		return SUCCESS;
	}
	
	@Action(value="/action5",results={@Result(name="success", location="http://struts.apache.org", type="redirect"),@Result(name="success1", location="http://mybeat.techmahindra.com/", type="redirect")})
	public String execute5()
	{
		System.out.println("It is execute5");
		msg="execute5";
		//return SUCCESS;
		return "success1";
	}
	
	
}
