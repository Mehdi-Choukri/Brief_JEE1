package data.access;

import java.sql.Connection;

import java.sql.DriverManager;

public class utileConnection {

	private static Connection connection;
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_pepiniere?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","");
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		return connection;
	}
}
