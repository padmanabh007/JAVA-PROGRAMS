package javaJDBC;
import java.sql.*;

public class JDBCupdate {
	public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		Statement st=null;
		ResultSet rst=null;
		
		String url="jdbc:mysql://localhost:3306/demo";
		String user="student";
		String password="student";
		
		try {
			
			String sql="update student set username='Akshay' where userid=3";
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();
			
			int count=st.executeUpdate(sql);
			System.out.println("Updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(st!=null) {
				st.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}

}
