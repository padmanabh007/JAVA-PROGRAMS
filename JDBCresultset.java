//This program is using result set in stored procedure
package javaJDBC;
import java.sql.*;

public class JDBCresultset {
	
	public static void  main(String[] args) throws SQLException{
		
		Connection con=null;
		CallableStatement st=null;
		ResultSet rst= null;
		
		String url="jdbc:mysql://localhost:3306/demo";
		String user="student";
		String password="student";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			
			int id_stud=3;
			
			st=con.prepareCall("{call get_all_by_id(?)}");
			st.setInt(1, id_stud);
			
			st.execute();
			
			rst=st.getResultSet();
			
			//rst.next();
			String name=rst.getString(2);
			int marks=rst.getInt(3);
			
			System.out.printf("Name = ",name);
			System.out.printf("Marks = ",marks);
		}
		catch (Exception e) {
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
