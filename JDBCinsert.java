package javaJDBC;
import java.sql.*;

public class JDBCinsert {
	
	public static void main(String[] args) throws SQLException{
		
		Connection con=null;
		Statement st=null;
		ResultSet rst=null;
		
		String url="jdbc:mysql://localhost:3306/demo";
		String user="student";
		String password="student";
		
		try {
			//String query="select * from student";
			String sql="insert into student(userid,username) values(6,'Aju')";
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();
			//rst=st.executeQuery(query);
			System.out.println("Inserting values");
			
			
			int count=st.executeUpdate(sql);
			//while(rst.next()) {
				//System.out.println(rst.getInt(1) +" "+rst.getString("username"));
			//}
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		finally {
			//if(rst!=null) {
				//rst.close();
			//}
			if(st!=null) {
				st.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}

}
