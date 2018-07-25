package dao;

import entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UserDAO {

    public static boolean registerUser(User u) {

         SessionFactory sf = HibernateUtil.getSessionFactory();
         Transaction t = null;
         try  {
         Session s  = sf.openSession();
         t = s.beginTransaction(); // start a new transaction
         s.persist(u);
         t.commit();  // commit transaction 
         return true;
         }
         catch(Exception ex) {
             System.err.println("Error -->"  + ex.getMessage());
             if ( t!=null) t.rollback();  // rollback transaction on exception 
             return false;
         }
    }
    
    public static void main(String[] args) {
    	User user = new User();
    	user.setEmail("email");
    	user.setPassword("pass");
    	user.setUserid(1212);
    	
		UserDAO.registerUser(user);
	}
}