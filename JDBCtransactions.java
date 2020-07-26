
package javaJDBC;
import java.util.*;
import java.sql.*;

public class JDBCtransactions {
	
	public static void main (String[] args) throws SQLException{
		
		Scanner sc=new Scanner(System.in);
		
		Connection con=null;
		Statement st=null;
		ResultSet rst=null;
		
		String url="jdbc:mysql://loclhost:3306/demo";
		String user="student";
		String password="student";
		
		try {
			char in=' ';
			String sql="select * from student ";
			String query="delete * from student where userid=1";
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();
			rst=st.executeQuery(sql);
			//Turning off Autocommit
			con.setAutoCommit(false);
			
			//Before transaction
			while(rst.next()) {
				System.out.println(rst.getInt(1)+" "+rst.getString(2) );
			}
			
			//Transaction processing
			int count=st.executeUpdate(query);
			
			//Ask user to save changes
			System.out.println("Is it ok to save changes y/n ");
			in=sc.next().charAt(0);
			
			if(in=='Y'||in=='y') {
				con.commit();
				System.out.println("Transaction commited");
			}
			else {
				con.rollback();
				System.out.println("Transaction fail");
			}
			System.out.println("After transaction ");
			while(rst.next()) {
				System.out.println(rst.getInt(1)+" "+rst.getString(2) );
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rst!=null) {
				rst.close();
			}
			if(st!=null) {
				st.close();
			}
			if(rst!=null) {
				rst.close();
			}
		}
	}

}
