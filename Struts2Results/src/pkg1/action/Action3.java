package pkg1.action;

import com.opensymphony.xwork2.ActionSupport;

public class Action3 extends ActionSupport {
	private String name;       
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}                
	@Override
    public String execute() throws Exception {
            String control=INPUT;
                 if((getName()!=null && getName().length()>0) && (getAddress()!=null && getAddress().length()>0)){
                    control=SUCCESS;
            }
            return control;
    }

}
