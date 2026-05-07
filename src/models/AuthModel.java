package models;

//06/05/26
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.Conexion;

public class AuthModel {

	public void registro(String usuario, String contrasena, String email) {
		Connection con = Conexion.getConexion();

		if (con != null) {
			try {

				String sql = "INSERT INTO usuarios (username, password, nombre_completo) VALUES (?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, usuario);
				ps.setString(2, contrasena);
				ps.setString(3, email);
				ps.executeUpdate();
				System.out.println("Usuario guardado en la base de datos");
			} catch (Exception e) {
				System.out.println("Error al guardar: " + e.getMessage());
			}
		}
	}

	public boolean login(String usuario, String contrasena) {
		Connection con = Conexion.getConexion();

		if (con != null) {
			try {
				String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, usuario);
				ps.setString(2, contrasena);
				ResultSet rs = ps.executeQuery();

				if (rs.next()) {
					System.out.println("Login exitoso: bienvenido " + rs.getString("username"));
					return true;
				} else {
					System.out.println("Usuario o contrasena incorrectos");
					return false;
				}
			} catch (Exception e) {
				System.out.println("Error al hacer login: " + e.getMessage());
				return false;
			}
		}
		return false;
	}
}