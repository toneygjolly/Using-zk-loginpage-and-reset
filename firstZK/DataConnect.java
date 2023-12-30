package firstZK;


import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnect {
private static Connection con;
private DataConnect()
{
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginzk","root","Toney@123");
	System.out.println("connection established");
	
} catch(Exception ex)
	{
		ex.getMessage();
	}
	}
public static Connection getConnection() {
	DataConnect D=new DataConnect();
	return con;
}

}