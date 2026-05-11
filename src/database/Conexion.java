package database;

//11/05/26
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	private static final String URL = "jdbc:mysql://localhost:3306/moodleapp";
	private static final String USUARIO = "root";
	private static final String CONTRASENA = "76SsE57U";

	public static Connection getConexion() {
		try {
			Connection con = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
			System.out.println("Conexion exitosa");
			return con;
		} catch (Exception e) {
			System.out.println("Error al conectar: " + e.getMessage());
			return null;
		}
	}
}