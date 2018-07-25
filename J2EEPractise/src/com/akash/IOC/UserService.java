package com.akash.IOC;

import java.util.ArrayList;

public class UserService {
	private  ArrayList<User> users= new ArrayList<>();;
	
	
public void addUser(User user){
	users.add(user);
}

public void printUser(){
	for(User user:users)
		System.out.println(user);
}

@Override
public String toString() {
	StringBuffer string= new StringBuffer();
	for(Object object : users.toArray())
		string.append(object);
	return "UserService [users=" + string + "]";
}

public ArrayList<User> getUsers() {
	return users;
}

public void setUsers(ArrayList<User> users) {
	this.users = users;
}


}
