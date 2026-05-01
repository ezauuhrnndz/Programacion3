package views;
//01/05/26
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controllers.AuthController;

public class AuthView {

	private AuthController controlador;
	private JFrame ventanaLogin;
	private JFrame ventanaRegistro;

	public AuthView(AuthController controlador) {
		this.controlador = controlador;
	}

	public void loginView() {

		ventanaLogin = new JFrame();
		ventanaLogin.setIconImage(new ImageIcon("logo.png").getImage());
		ventanaLogin.setTitle("---INICIAR SESION---");
		ventanaLogin.setSize(1000, 600);
		ventanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaLogin.setLocationRelativeTo(null);
		ventanaLogin.setLayout(null);

		// Panel de la izquierda para poner el logo o una imagen de bienvenida
		JPanel contenedorLogo = new JPanel();
		contenedorLogo.setBounds(50, 40, 502, 480);
		contenedorLogo.setBackground(Color.white);
		contenedorLogo.setLayout(null);
		contenedorLogo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
		ventanaLogin.add(contenedorLogo);

		ImageIcon Logo = new ImageIcon("EntradaLogo.png");

		JLabel textoLogo = new JLabel("", SwingConstants.CENTER);
		textoLogo.setIcon(Logo);
		textoLogo.setBounds(0, 0, 400, 480);
		textoLogo.setFont(new Font("Segoe UI", Font.BOLD, 16));
		contenedorLogo.add(textoLogo);

		// Panel de la derecha donde van todos los campos del formulario
		JPanel contenedor = new JPanel();
		contenedor.setBounds(550, 40, 400, 480);
		contenedor.setBackground(Color.white);
		contenedor.setLayout(null);
		contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
		ventanaLogin.add(contenedor);

		JLabel title_login = new JLabel(" USER LOGIN ", SwingConstants.CENTER);
		title_login.setBounds(50, 40, 300, 40);
		title_login.setFont(new Font("Segoe UI", Font.BOLD, 24));
		contenedor.add(title_login);

		// Campo para el nombre de usuario con su icono
		ImageIcon iconoUsuario = new ImageIcon("usuario.png");

		JLabel user = new JLabel("USERNAME OR EMAIL:");
		user.setIcon(iconoUsuario);
		user.setBounds(50, 130, 300, 20);
		user.setFont(new Font("Segoe UI", Font.BOLD, 12));
		user.setIconTextGap(15);
		contenedor.add(user);

		JTextField username = new JTextField();
		username.setBounds(50, 155, 300, 35);
		// El compound border es para que el texto no pegue con el borde del cuadro
		username.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(200, 200, 200)),
				BorderFactory.createEmptyBorder(0, 10, 0, 0)));
		contenedor.add(username);

		// Campo para la contraseña
		ImageIcon iconoContraseña = new ImageIcon("PasswordIcon.png");

		JLabel pass = new JLabel("PASSWORD:");
		pass.setIcon(iconoContraseña);
		pass.setBounds(50, 205, 300, 20);
		pass.setIconTextGap(15);
		pass.setFont(new Font("Segoe UI", Font.BOLD, 12));
		contenedor.add(pass);

		JPasswordField password = new JPasswordField();
		password.setBounds(50, 230, 300, 35);
		password.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(200, 200, 200)),
				BorderFactory.createEmptyBorder(0, 10, 0, 0)));
		contenedor.add(password);

		// Opciones extras: check de recordar y el link de recuperar pass
		JCheckBox recordar = new JCheckBox("Remember Me");
		recordar.setBounds(50, 275, 120, 20);
		recordar.setBackground(Color.WHITE);
		recordar.setFont(new Font("Segoe UI", Font.ITALIC, 11));
		contenedor.add(recordar);

		JButton ask = new JButton("¿Forgot Password?");
		ask.setBounds(230, 375, 150, 20);
		ask.setFont(new Font("Segoe UI", Font.ITALIC, 11));
		ask.setForeground(Color.decode("#DE6A00"));
		ask.setBorderPainted(false);
		ask.setContentAreaFilled(false);
		ask.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contenedor.add(ask);

		// Colores para el efecto hover del boton
		final Color colorNaranjaOriginal = Color.decode("#DE6A00");
		final Color colorNaranjaHover = Color.decode("#FF8C00");

		JButton register = new JButton("New User? Signup");
		register.setBounds(20, 375, 150, 20);
		register.setFont(new Font("Segoe UI", Font.ITALIC, 11));
		register.setForeground(Color.decode("#DE6A00"));
		register.setBorderPainted(false);
		register.setContentAreaFilled(false);
		register.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contenedor.add(register);

		register.addActionListener(e -> {
			ventanaLogin.dispose();
			controlador.showRegister();
		});

		contenedor.repaint();
		contenedor.revalidate();

		JButton acceder = new JButton("LOGIN");
		acceder.setBounds(50, 320, 300, 45);
		acceder.setBackground(colorNaranjaOriginal);
		acceder.setForeground(Color.WHITE);
		acceder.setFont(new Font("Segoe UI", Font.BOLD, 16));
		acceder.setFocusPainted(false);
		acceder.setBorder(null);
		acceder.setCursor(new Cursor(Cursor.HAND_CURSOR));

		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username_val = username.getText();
				String password_val = new String(password.getPassword());

				boolean todoBien = true;

				// Validacion de user
				if (username_val.equals("") || username_val.contains(" ")) {
					username.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
					todoBien = false;
				} else {
					username.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}

				// Validacion dde pass
				if (password_val.length() < 6 || password_val.contains(" ")) {
					password.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
					todoBien = false;
				} else {
					password.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}

				// VALIDACION "TERMINOS"
				if (!recordar.isSelected()) {
					recordar.setForeground(Color.red);
					todoBien = false;
				} else {
					recordar.setForeground(Color.black);
				}

				// RESULTADO FINAL
				if (todoBien) {
					System.out.println("Registro correcto");
				}
			}
		});

		// Listener para que cambie de color cuando el mouse pase por encima
		acceder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				acceder.setBackground(colorNaranjaHover);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				acceder.setBackground(colorNaranjaOriginal);
			}
		});

		contenedor.add(acceder);

		// Imagen de fondo que cubre toda la ventana
		JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));
		fondo.setBounds(0, 0, 1000, 600);
		ventanaLogin.add(fondo);

		ventanaLogin.setVisible(true);
	}

	public void registerView() {

		ventanaRegistro = new JFrame();
		ventanaRegistro.setIconImage(new ImageIcon("logo.png").getImage());
		ventanaRegistro.setTitle("---REGISTRARSE---");
		ventanaRegistro.setSize(1000, 600);
		ventanaRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaRegistro.setLocationRelativeTo(null);
		ventanaRegistro.setLayout(null);

		//contenedor para el registro
		JPanel register_container = new JPanel();
		register_container.setBounds(550, 40, 400, 480);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#ffffff"));
		register_container.setLayout(null);
		ventanaRegistro.add(register_container);

		JLabel title_register = new JLabel(" REGISTER ", SwingConstants.CENTER);
		title_register.setBounds(50, 40, 300, 40);
		title_register.setFont(new Font("Segoe UI", Font.BOLD, 24));
		register_container.add(title_register);

		JLabel lblUsuario = new JLabel("USERNAME:");
		lblUsuario.setBounds(50, 90, 300, 20);
		lblUsuario.setFont(new Font("Segoe UI", Font.BOLD, 12));
		register_container.add(lblUsuario);

		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(50, 112, 300, 35);
		// El compound border es para que el texto no pegue con el borde del cuadro
		txtUsuario.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(200, 200, 200)),
				BorderFactory.createEmptyBorder(0, 10, 0, 0)));
		register_container.add(txtUsuario);

		JLabel email = new JLabel("EMAIL ADRESS:");
		email.setBounds(50, 157, 300, 20);
		email.setFont(new Font("Segoe UI", Font.BOLD, 12));
		email.setIconTextGap(15);
		register_container.add(email);

		JTextField emailAdress = new JTextField();
		emailAdress.setBounds(50, 179, 300, 35);
		emailAdress.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(200, 200, 200)),
				BorderFactory.createEmptyBorder(0, 10, 0, 0)));
		register_container.add(emailAdress);

		JLabel password_register = new JLabel("CREATE PASSWORD:");
		password_register.setBounds(50, 225, 300, 20);
		password_register.setIconTextGap(15);
		password_register.setFont(new Font("Segoe UI", Font.BOLD, 12));
		register_container.add(password_register);

		JPasswordField password_register_text = new JPasswordField();
		password_register_text.setBounds(50, 248, 300, 35);
		password_register_text.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(200, 200, 200)),
				BorderFactory.createEmptyBorder(0, 10, 0, 0)));
		register_container.add(password_register_text);

		JCheckBox terminos = new JCheckBox("Acept Terms");
		terminos.setBounds(50, 295, 120, 20);
		terminos.setBackground(Color.WHITE);
		terminos.setFont(new Font("Segoe UI", Font.ITALIC, 11));
		register_container.add(terminos);

		final Color colorNaranjaOriginal = Color.decode("#DE6A00");
		final Color colorNaranjaHover = Color.decode("#FF8C00");

		JButton cancelar = new JButton("CANCEL");
		cancelar.setBounds(50, 390, 300, 45);
		cancelar.setBackground(Color.white);
		cancelar.setForeground(Color.black);
		cancelar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		cancelar.setFocusPainted(false);
		cancelar.setBorder(null);
		cancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		register_container.add(cancelar);

		JButton crear = new JButton("CREATE ACCOUNT");
		crear.setBounds(50, 340, 300, 45);
		crear.setBackground(colorNaranjaOriginal);
		crear.setForeground(Color.WHITE);
		crear.setFont(new Font("Segoe UI", Font.BOLD, 16));
		crear.setFocusPainted(false);
		crear.setBorder(null);
		crear.setCursor(new Cursor(Cursor.HAND_CURSOR));

		crear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				crear.setBackground(colorNaranjaHover);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				crear.setBackground(colorNaranjaOriginal);
			}
		});

		// Al crear cuenta se envian los datos al controlador para que los pase al modelo
		crear.addActionListener(e -> {
			String usuario_val = txtUsuario.getText();
			String email_val = emailAdress.getText();
			String password_val = new String(password_register_text.getPassword());

			boolean todoBien = true;

			if (usuario_val.isEmpty() || usuario_val.contains(" ")) {
				txtUsuario.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				todoBien = false;
			} else {
				txtUsuario.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
			}

			if (email_val.isEmpty() || !email_val.contains("@")) {
				emailAdress.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				todoBien = false;
			} else {
				emailAdress.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
			}

			if (password_val.length() < 6 || password_val.contains(" ")) {
				password_register_text.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				todoBien = false;
			} else {
				password_register_text.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
			}

			if (!terminos.isSelected()) {
				terminos.setForeground(Color.red);
				todoBien = false;
			} else {
				terminos.setForeground(Color.black);
			}

			// RESULTADO FINAL: si todo esta bien se mandan los datos al controlador
			if (todoBien) {
				controlador.registrarUsuario(usuario_val, password_val, email_val);
			}
		});

		register_container.add(crear);

		// Imagen de fondo que cubre toda la ventana
		JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));
		fondo.setBounds(0, 0, 1000, 600);
		ventanaRegistro.add(fondo);

		cancelar.addActionListener(e -> {
			ventanaRegistro.dispose();
			controlador.showLogin();
		});

		register_container.repaint();
		register_container.revalidate();
		ventanaRegistro.setVisible(true);
	}
}