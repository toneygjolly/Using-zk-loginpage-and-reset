package firstZK;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.zkoss.zul.Textbox;

//import com.sun.corba.se.pept.transport.Connection;

public class Usercheck {
	Scanner sc;	
	private java.sql.Connection con;
	private PreparedStatement stat;
	public Usercheck()
	{
		con=DataConnect.getConnection();
		sc=new Scanner(System.in);
	}	
	
//	public void Admin() throws SQLException
//	{
//		System.out.println("Enter the Adminname");
//		String name=sc.next();
//		System.out.println("Enter the password");
//		String password=sc.next();
//		
//		user(name, password);
//	}
	
	public boolean user(String username,  String userpassword) throws SQLException {
//		System.out.println("Enter the Adminname");
//		String name=sc.next();
//		System.out.println("Enter the password");
//		String password=sc.next();
		boolean found=false;
//		stat=con.prepareStatement("Select username,password from users where 'username='"+name+"'"
//				+ "and password='"+password+"'");
		String sql = "SELECT username, password FROM users WHERE username = ? AND password = ?";
		PreparedStatement stat = con.prepareStatement(sql);
		stat.setString(1, username);
		stat.setString(2, userpassword);
		//boolean result=stat.execute();
	    ResultSet result1=stat.executeQuery();
		if(result1.next()) {
			 found=true;
			
			//System.out.println("welcome TO Admin page");
			
			//AdminMenu menu=new AdminMenu();
			//menu.search();
		}
		else {
			 found=false;
			//System.out.println("invalid");
		}
		
	
		return found;
		
	}
//	public static void main(String args[]) throws SQLException {
//		Usercheck u=new Usercheck();
//		u.user();
//	}
	
	
	
	
	
	
//	public boolean isUsernameAvailable(String username) throws SQLException {
//        String query = "SELECT * FROM users WHERE username = ?";
//        try (PreparedStatement statement = con.prepareStatement(query)) {
//            statement.setString(1, username);
//            try (ResultSet resultSet = statement.executeQuery()) {
//                return !resultSet.next(); // Returns true if username is available
//            }
//        }
//    }
//
//    // Store username and password in the database
//    public boolean saveUser(String username, String password) throws SQLException {
//        String query = "INSERT INTO users (username, password) VALUES (?, ?)";
//        try (PreparedStatement statement = con.prepareStatement(query)) {
//            statement.setString(1, username);
//            statement.setString(2, password);
//            return statement.executeUpdate() > 0; // Returns true if insertion is successful
//        }
//    }
//	
	
	
	
	public boolean userRegister(String uname, String password) throws SQLException
    {
        stat=con.prepareStatement("select * from users where username=? and password=?");
        stat.setString(1, uname);
        stat.setString(2,password);
        boolean userpresent=false;
        ResultSet res=stat.executeQuery();
        if(res.next())
        {
            userpresent=true;
        }
        else
        {
            stat=con.prepareStatement("insert into users(username,password) values(?,?)");
            stat.setString(1,uname);
            stat.setString(2,password);
            int r=stat.executeUpdate();
        }
        
        return userpresent;
    }
	
	
	
	public boolean check(String name1) throws SQLException {
		
     stat=con.prepareStatement("select*from wordcheck where word=?");
     stat.setString(1,name1);
     boolean found=false;
     ResultSet result1=stat.executeQuery();
     if(result1.next()) {
		 found=true;
		 
     }
		else {
			 found=false;
			//System.out.println("invalid");
		}
		
	
		return found;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
