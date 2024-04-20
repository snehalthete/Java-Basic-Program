package jdbc1;
import java.sql.*;

public class ConnectedApp {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver loaded successfully.....");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
		if(conn!=null)
		{
			System.out.println("Connected");
		}
		else
		{
			System.out.println("Not connected");
		}

	}

}
