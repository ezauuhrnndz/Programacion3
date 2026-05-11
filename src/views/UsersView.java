package views;
//11/05/26

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import models.User;

public class UsersView {

	public void mostrarUsuarios(ArrayList<User> listaUsuarios) {

		JFrame ventana = new JFrame();
		ventana.setTitle("---USUARIOS---");
		ventana.setSize(1000, 600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(null);
		ventana.getContentPane().setBackground(Color.decode("#FDEBD0"));

		// Panel principal que contiene la tabla
		JPanel panel = new JPanel();
		panel.setBounds(50, 40, 880, 480);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
		ventana.add(panel);

		JLabel titulo = new JLabel("USUARIOS REGISTRADOS", SwingConstants.CENTER);
		titulo.setBounds(0, 20, 880, 40);
		titulo.setFont(new Font("Segoe UI", Font.BOLD, 24));
		panel.add(titulo);

		JLabel separador = new JLabel();
		separador.setBounds(30, 65, 820, 1);
		separador.setBackground(new Color(220, 220, 220));
		separador.setOpaque(true);
		panel.add(separador);

		DefaultTableModel modeloTabla = new DefaultTableModel();
		modeloTabla.addColumn("ID");
		modeloTabla.addColumn("Username");
		modeloTabla.addColumn("Nombre Completo");

		for (User user : listaUsuarios) {
			modeloTabla.addRow(new Object[]{
				user.getId(),
				user.getUsername(),
				user.getNombreCompleto()
			});
		}

		JTable tabla = new JTable(modeloTabla);
		tabla.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		tabla.setRowHeight(30);
		tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));
		tabla.getTableHeader().setBackground(Color.decode("#7E5109"));
		tabla.getTableHeader().setForeground(Color.WHITE);
		tabla.setEnabled(false);

		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(30, 80, 820, 360);
		panel.add(scroll);

		ventana.setVisible(true);
	}
}