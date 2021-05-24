package lesson210520.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	
	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/quantori", "root", "123");
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select id, name from Test");
			while (resultSet.next()) {
				User user = new User();
				user.id = resultSet.getInt("id");
				user.name = resultSet.getString(2);
				System.out.println(user);
			}
			statement.executeUpdate("insert into Test values (1, 'Ann')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
