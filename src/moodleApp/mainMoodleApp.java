package moodleApp;

//11/05/26
import controllers.AuthController;

public class mainMoodleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// moodleApp miventana = new moodleApp();

		AuthController ac = new AuthController();
		ac.showLogin();
	    ac.mostrarUsuarios();

	}

}
