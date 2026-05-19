package models;
//19/05/26

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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

	// Registra un usuario recibiendo directamente un objeto User
	public void registrarUsuario(User u) {
		Connection con = Conexion.getConexion();

		if (con != null) {
			try {
				String sql = "INSERT INTO usuarios (username, password, nombre_completo) VALUES (?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, u.getUsername());
				ps.setString(2, u.getPassword());
				ps.setString(3, u.getNombreCompleto());
				ps.executeUpdate();
				System.out.println("Usuario registrado: " + u.getUsername());
			} catch (Exception e) {
				System.out.println("Error al registrar: " + e.getMessage());
			}
		}
	}

	public ArrayList<User> obtenerUsuarios() {
		ArrayList<User> listaUsuarios = new ArrayList<>();
		Connection con = Conexion.getConexion();

		if (con != null) {
			try {
				String sql = "SELECT * FROM usuarios";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();

				// Recorre cada fila del resultado y crea un objeto User con sus datos
				while (rs.next()) {
					int id = rs.getInt("id");
					String username = rs.getString("username");
					String password = rs.getString("password");
					String nombreCompleto = rs.getString("nombre_completo");

					User user = new User(id, username, password, nombreCompleto);
					listaUsuarios.add(user);
				}

			} catch (Exception e) {
				System.out.println("Error al obtener usuarios: " + e.getMessage());
			}
		}

		return listaUsuarios;
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