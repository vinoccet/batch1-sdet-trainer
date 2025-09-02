package edu.in.batch1_sdet_trainer.day3;

import java.sql.*;

public class DBTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// identify the driver and add its dependencies
		// register diver
		// establish connection
		// create statement
		// execute statement
		// process the result
//		Class.forName("com.mysql.cj.jdbc.Driver");
		String sql = "select email from users";
		String email = "testsdet@sdetprepared.com";
		String insertRecord = "insert into users values (4,'" + email + "','i am sdetbatch','india')";
		String updateRecord = "update users set email=? where id=?";
		Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookings", "root", "root");
		System.out.println("connection successful");
//		Statement statement = dbConnection.createStatement();
		PreparedStatement preparedStatement = dbConnection.prepareStatement(updateRecord);
		preparedStatement.setString(1, email);
		preparedStatement.setInt(2, 4);

//		ResultSet resultSet = statement.executeQuery(sql);
////		System.out.println(resultSet.next());
//		while(resultSet.next()) {
//			System.out.println(resultSet.getString("email"));
//		}
		System.out.println(preparedStatement.execute());
		dbConnection.close();

	}
}
