package br.com.estudo.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricConnect {

	private static Connection connect;
	private static final String URL_CONEXAO = "jdbc:mysql://localhost/mydb";
	private static final String USER = "root";
	private static final String PASSWORD = "farsoft01";

	public static Connection getConnect() {
		if (connect == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connect = DriverManager.getConnection(URL_CONEXAO, USER,
						PASSWORD);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return connect;
	}

	public static void closeConect() {
		if (connect != null) {
			try {
				connect.close();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connect = null;

		}
	}
}
