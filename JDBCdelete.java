package javaJDBC;
import java.sql.*;

public class JDBCdelete {
	
	public static void main(String[] args) throws SQLException{
		
		Connection con=null;
		Statement st=null;
		ResultSet rst=null;
		
		String url="jdbc:mysql://localhost:3306/demo";
		String user="";//database name
		String password="";//datbase password
		
		try {
			String sql="delete from student where userid=6";
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();
			
			int count=st.executeUpdate(sql);
			System.out.println("Deleted the row");
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
