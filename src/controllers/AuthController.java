package controllers;
//01/05/26
import models.AuthModel;
import views.AuthView;

public class AuthController {

	private AuthView vista;
	private AuthModel modelo;

	public AuthController() {
		modelo = new AuthModel();
		vista = new AuthView(this);
	}

	public void showLogin() {
		vista.loginView();
	}

	public void showRegister() {
		vista.registerView();
	}

	public void registrarUsuario(String usuario, String contrasena, String email) {
		modelo.registro(usuario, contrasena, email);
	}
}