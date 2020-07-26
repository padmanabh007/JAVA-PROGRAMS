package javaJDBC;
import java.sql.*;

public class JDBCmetadata {
	
	public static void main(String[] args) throws SQLException{
		
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/demo";
		String user="student";
		String password="student";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,user, password);
			
			//Getting meta data connection
			DatabaseMetaData dmd=con.getMetaData();
			
			//Display detail about database
			System.out.println("Product name : "+dmd.getDatabaseProductName());
			System.out.println("Product version : "+dmd.getDatabaseProductVersion() );
			
			
			//Display info about jdbc driver
			System.out.println("Driver name : "+dmd.getDriverName());
			System.out.println("Driver version : "+dmd.getDriverVersion() );
			
			
			/*To get table schema use
			 ResulSet rst=dmd.getTables(catalog,schemaPattern,tableNamePattern,types);
			 while(rst.next(){
			 	System.out.println(rst.getString("TABLE_NAME");
			 }*/
			
			/*To get column schema use
			 ResulSet rst=dmd.getColumns(catalog,schemaPattern,"Table_name",columnNamePattern);
			 while(rst.next(){
			 	System.out.println(rst.getString("COLUMN_NAME");
			 }*/
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				con.close();
			}
		}
	}
}
