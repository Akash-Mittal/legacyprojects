package pkg1;

import com.opensymphony.xwork2.ActionSupport;

public class UserInterceptorAction extends ActionSupport
{
@Override
public String execute() throws Exception 
{
System.out.println("This is execute method in UserInterceptorAction");
return SUCCESS;
}
}
