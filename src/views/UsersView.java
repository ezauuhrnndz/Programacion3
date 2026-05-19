package views;
//19/05/26

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controllers.AuthController;
import models.User;

public class UsersView {

	private AuthController controlador;
	private JFrame ventana;
	private JTable tabla;
	private DefaultTableModel modeloTabla;

	public UsersView(AuthController controlador) {
		this.controlador = controlador;
	}

	public void mostrarVentana() {

		ventana = new JFrame();
		ventana.setTitle("---USUARIOS---");
		ventana.setSize(1000, 600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(null);
		ventana.getContentPane().setBackground(Color.decode("#FDEBD0"));

		// Panel principal que contiene la tabla y los botones
		JPanel panel = new JPanel();
		panel.setBounds(50, 40, 880, 480);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
		ventana.add(panel);

		JLabel titulo = new JLabel("REGISTERED USERS", SwingConstants.CENTER);
		titulo.setBounds(0, 20, 880, 40);
		titulo.setFont(new Font("Segoe UI", Font.BOLD, 24));
		panel.add(titulo);

		JLabel separador = new JLabel();
		separador.setBounds(30, 65, 820, 1);
		separador.setBackground(new Color(220, 220, 220));
		separador.setOpaque(true);
		panel.add(separador);

		// Colores para botones
		final Color colorNaranjaOriginal = Color.decode("#DE6A00");
		final Color colorNaranjaHover = Color.decode("#FF8C00");

		// Boton para añadir un nuevo usuario abre la vista de registro
		JButton btnAnadir = new JButton("ADD USER");
		btnAnadir.setBounds(30, 75, 120, 35);
		btnAnadir.setBackground(colorNaranjaOriginal);
		btnAnadir.setForeground(Color.WHITE);
		btnAnadir.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnAnadir.setFocusPainted(false);
		btnAnadir.setBorder(null);
		btnAnadir.setCursor(new Cursor(Cursor.HAND_CURSOR));

		btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) { btnAnadir.setBackground(colorNaranjaHover); }
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) { btnAnadir.setBackground(colorNaranjaOriginal); }
		});

		// Al presionar Añadir se oculta esta ventana y se abre el formulario de registro
		btnAnadir.addActionListener(e -> {
			ventana.setVisible(false);
			RegisterView registerView = new RegisterView(controlador, UsersView.this);
			registerView.mostrarVentana();
		});

		panel.add(btnAnadir);

		// Modelo de la tabla
		modeloTabla = new DefaultTableModel();
		modeloTabla.addColumn("ID");
		modeloTabla.addColumn("USERNAME ");
		modeloTabla.addColumn("EMAIL ADRESS ");

		tabla = new JTable(modeloTabla);
		tabla.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		tabla.setRowHeight(30);
		tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));
		tabla.getTableHeader().setBackground(Color.decode("#DE6A00"));
		tabla.getTableHeader().setForeground(Color.WHITE);
		tabla.setEnabled(false);

		// JScrollPane es el contenedor con scroll para la tabla
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(30, 120, 820, 320);
		panel.add(scroll);

		// Carga los datos de la base de datos en la tabla al abrir la ventana
		cargarTabla();

		ventana.setVisible(true);
	}

	// Limpia la tabla y la vuelve a llenar con los datos actuales de la base de datos
	public void cargarTabla() {
		modeloTabla.setRowCount(0);

		ArrayList<User> listaUsuarios = controlador.obtenerUsuarios();

		for (User user : listaUsuarios) {
			modeloTabla.addRow(new Object[]{
				user.getId(),
				user.getUsername(),
				user.getNombreCompleto()
			});
			// Imagen de fondo que cubre toda la ventana
			JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));
			fondo.setBounds(0, 0, 1000, 600);
			ventana.add(fondo);
			
			ventana.setVisible(true);
		}
	}
	

	// Vuelve a mostrar esta ventana cuando el usuario regresa desde RegisterView
	public void volver() {
		ventana.setVisible(true);
		cargarTabla();
	}
}