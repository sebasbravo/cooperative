package ca.cooperative.inventario.dao.conection;

import java.sql.Connection;

public class ConectionManager {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@fanalca97:1524:testalt";
	private static final String USER = "usuarioBasedeDatos";
	private static final String PASS = "password";

	public ConectionManager() {
		super();
	}

	public static Connection getConnection() throws Exception {

		Connection conn = ServiceLocatorDS.getInstance().getDataSource()
				.getConnection();
		return conn;
	}

	/*
	 * public static Connection getConnection() throws Exception{
	 * 
	 * //cargar el driver Class.forName(driver);
	 * 
	 * //conexion a la bd return DriverManager.getConnection(url,user,pass); }
	 */
	public static void closeConnection(Connection connection) throws Exception {

		if (connection != null) {
			connection.close();
		}

	}

}
