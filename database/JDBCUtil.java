package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection c =null;
		
		try {
			// đăng ký mySQL driver với driver manager
			DriverManager.registerDriver(new Driver());
			
			//Các thông số
			String url= "jdbc:mySQL://localhost:3306/nhasach";
			String username= "root";
			String password= "";
			
			//Tạo kết nối
			c=DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static void closeConnection(Connection c) {
		if(c!=null) {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
