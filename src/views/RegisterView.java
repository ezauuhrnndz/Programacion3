package views;
//13/05/26

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controllers.AuthController;
import models.User;

public class RegisterView {

	private AuthController controlador;
	private UsersView usersView;
	private JFrame ventana;

	public RegisterView(AuthController controlador2, UsersView usersView2) {
		this.controlador = controlador2;
		this.usersView = usersView2;
	}

	public void mostrarVentana() {

		ventana = new JFrame();
		ventana.setIconImage(new ImageIcon("logo.png").getImage());
		ventana.setTitle("---REGISTRARSE---");
		ventana.setSize(1000, 600);
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(null);

		JPanel register_container = new JPanel();
		register_container.setBounds(550, 40, 400, 480);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#ffffff"));
		register_container.setLayout(null);
		ventana.add(register_container);

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

		/*JCheckBox terminos = new JCheckBox("Acept Terms");
		terminos.setBounds(50, 295, 120, 20);
		terminos.setBackground(Color.WHITE);
		terminos.setFont(new Font("Segoe UI", Font.ITALIC, 11));
		register_container.add(terminos);*/

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

		JButton crear = new JButton("CREATE USER");
		crear.setBounds(50, 340, 300, 45);
		crear.setBackground(colorNaranjaOriginal);
		crear.setForeground(Color.WHITE);
		crear.setFont(new Font("Segoe UI", Font.BOLD, 16));
		crear.setFocusPainted(false);
		crear.setBorder(null);
		crear.setCursor(new Cursor(Cursor.HAND_CURSOR));

		crear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) { crear.setBackground(colorNaranjaHover); }
			@Override
			public void mouseExited(MouseEvent e) { crear.setBackground(colorNaranjaOriginal); }
		});

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

			/*if (!terminos.isSelected()) {
				terminos.setForeground(Color.red);
				todoBien = false;
			} else {
				terminos.setForeground(Color.black);
			}*/

			if (todoBien) {
				User nuevoUsuario = new User(0, usuario_val, password_val, email_val);
				controlador.registrarUsuario(nuevoUsuario);
				ventana.dispose();
				usersView.volver();
			}
		});

		register_container.add(crear);

		cancelar.addActionListener(e -> {
			ventana.dispose();
			usersView.volver();
		});

		// Imagen de fondo que cubre toda la ventana
		JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));
		fondo.setBounds(0, 0, 1000, 600);
		ventana.add(fondo);

		register_container.repaint();
		register_container.revalidate();
		ventana.setVisible(true);
	}
}