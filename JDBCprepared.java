package javaJDBC;
import java.sql.*;

public class JDBCprepared {

	public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		PreparedStatement st=null;
		ResultSet rst=null;
		
		String url="jdbc:mysql://localhost:3306/demo";
		String user="";//database name
		String password="";//database password
		
		try {
			
			//String sql="select * from student where userid=?";//this is to get the data using prepared statement
			String sql="delete from student where userid=?";//UPDATE INSERT DELETE Comes under this method
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			st=con.prepareStatement(sql);
			
			st.setInt(1, 6);
			
			int count=st.executeUpdate();
			
			/*Tis below codes are used to print data*/
			//rst=st.executeQuery();
			//rst.next();//Used to print data 
			//System.out.println(rst.getString("username")+" "+rst.getInt("userid") );
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
			if(con!=null) {
				con.close();
			}
		}
	}
}
