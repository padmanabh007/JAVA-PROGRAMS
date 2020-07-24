package javaJDBC;

import java.sql.*;

public class DemoClass {
	
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/demo";//mysql is server/LAN type machine
		String user="";//user name of database
		String password="";//password of database
		//String query="select username from student where userid=3";//to get values of particular conditon
		
		//String query="select * from student";//to print whole table
		
		
		//String query="insert into student values(4,'Asvin')";//to update table so no need of resultset we use count
		//ELSE
		int userid=5;//id of student going to enter
		String username="";//use name you want to enter
		//String query="insert into student values("+userid+','+username+")";
		//if we have many inputs so we use prepare statement
		String query="insert into student values(?,?)";//this is used during prepare statement
		
		
		
		Class.forName("com.mysql.jdbc.Driver");//it will call the static file present in driver manager
		Connection con= DriverManager.getConnection(url, user, password);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, userid);
		st.setString(2, username);
		int count=st.executeUpdate(); //result set has power to store chunk of data
		
		
		st.close();
		con.close();
	}

}
