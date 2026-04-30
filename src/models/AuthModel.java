package models;

public class AuthModel {

	public void registro(String usuario, String contrasena, String email) {
		System.out.println("=== NUEVO REGISTRO ===");
		System.out.println("Usuario: " + usuario);
		System.out.println("Email: " + email);
		System.out.println("Contrasena: " + contrasena);
		System.out.println("======================");
	}
}