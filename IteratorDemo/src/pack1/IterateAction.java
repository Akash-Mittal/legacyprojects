package pack1;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class IterateAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	ArrayList<String> fruits = new ArrayList<String>();
	
	public ArrayList<String> getFruits() {
		return fruits;
	}

	
	
@Override
public String execute() throws Exception {

	fruits.add("Grapes");
	fruits.add("Oranges");
	fruits.add("Banana");
	fruits.add("Mango");
	fruits.add("Grapes");

	return SUCCESS;
}
}
