package pkg1;

import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport {

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() throws Exception {
		if(username==null || username.trim().length()==0 || password==null || password.trim().length()==0)
		{
			this.addActionError(getText("app.invalid"));
			return ERROR;
		}else if(username.equals(password))
			return SUCCESS;
		else{
			this.addActionError(getText("app.invalid"));
			return ERROR;
		}		
	}		
}