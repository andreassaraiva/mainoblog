package andrea.maino.blog.model.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	public Connection getConnection(){
		try {
			
			 String dbUrl = System.getenv("JDBC_DATABASE_URL");
			return DriverManager.getConnection(dbUrl);
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	}
}
