package action;

import dao.UserDAO;
import entities.User;

public class RegisterAction {

    private String email,pwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public RegisterAction() {
    }

    public String execute() throws Exception {
        
        // create an object of User entity
        User u = new User();
        u.setEmail(email);
        u.setPassword(pwd);
        
        if ( UserDAO.registerUser(u))   // Access persistence tier through DAO
             return "success";
        else
            return "fail";
    }
}
