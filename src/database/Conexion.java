package database;

//19/05/26
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	private static final String URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_z0ejUOEZ"; //sql.freedb.tech
	private static final String USUARIO = "u_JquOc1"; //u_JquOc1
	private static final String CONTRASENA = "N1LclnWGBUCL"; // N1LclnWGBUCL

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