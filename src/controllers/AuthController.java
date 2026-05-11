package controllers;
//11/05/26

import java.util.ArrayList;

//06/05/26
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

	public boolean iniciarSesion(String usuario, String contrasena) {
		return modelo.login(usuario, contrasena);
	}
	
	public void mostrarUsuarios() {
	    ArrayList<User> lista = modelo.obtenerUsuarios();
	    UsersView usersView = new UsersView();
	    usersView.mostrarUsuarios(lista);
	}
}