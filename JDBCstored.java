//Using IN parameter of stored procedure
package javaJDBC;
import java.sql.*;

public class JDBCstored {
	
	public static void main(String[] args) throws SQLException{
		
		Connection con=null;
		CallableStatement st=null;
		
		String url="jdbc:mysql://localhost:3306/demo";
		String user="student";
		String password="student";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			
			int id_no=2;
			int stud_marks=5;
			
			st=con.prepareCall("{call increase_marks(?,?)}");
			st.setInt(1, id_no);
			st.setInt(2, stud_marks);
			
			
			st.execute();
			
			
		}
		catch (Exception e) {
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
