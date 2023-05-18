package crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {


	public static Connection getConnection() {

		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			String url = "jdbc:mysql://localhost:3306/basic~jdbc";
			String userName = "root";
			String password = "Vishesh@123";
			Connection connection = DriverManager.getConnection(url, userName, password);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}



}
