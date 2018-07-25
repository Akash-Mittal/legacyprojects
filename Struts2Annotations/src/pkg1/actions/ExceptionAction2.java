package pkg1.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
@ExceptionMappings({
    @ExceptionMapping(exception = "java.lang.NullPointerException", result = "error1", params = {"param1", "val1"})
})
@Results({
	   @Result(name="success", location="/WEB-INF/jsp/success.jsp"),
	   @Result(name="input", location="/index.jsp"),
	   @Result(name="error1", location="/WEB-INF/jsp/error.jsp")
	})
public class ExceptionAction2 extends ActionSupport
{

@Action(value="actionError1")
public String execute1() 
{
	System.out.println("it is execute1");
	String str=null;
	System.out.println(str.charAt(10));
	return SUCCESS;
}

@Action(value = "actionError2", exceptionMappings = {
        @ExceptionMapping(exception = "java.lang.NumberFormatException", result = "error1", params = {"param1", "val1"})
})
public String execute2()
{
	System.out.println("it is execute2");
	int num=Integer.parseInt("aa");
	return SUCCESS;
}
}
