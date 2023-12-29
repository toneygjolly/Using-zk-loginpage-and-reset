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
}
