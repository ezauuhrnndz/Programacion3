package controllers;
//13/05/26

import java.util.ArrayList;
import models.AuthModel;
import models.User;
import views.AuthView;
import views.UsersView;

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

	public void registrarUsuario(User u) {
		modelo.registrarUsuario(u);
	}

	public boolean iniciarSesion(String usuario, String contrasena) {
		return modelo.login(usuario, contrasena);
	}

	public ArrayList<User> obtenerUsuarios() {
		return modelo.obtenerUsuarios();
	}

	// aqui abro vista de tabla de usuarios
	public void showUsers(AuthController controller) {
		UsersView usersView = new UsersView(controller);
		usersView.mostrarVentana();
	}
}