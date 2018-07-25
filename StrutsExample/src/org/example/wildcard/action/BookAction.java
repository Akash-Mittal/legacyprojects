package org.example.wildcard.action;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {

	
	public String create(){
		System.out.println("Create");
		return INPUT;
	}
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("Executing");
		return SUCCESS;
		
	}
	
}
