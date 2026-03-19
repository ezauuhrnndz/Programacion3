package Registro;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

import com.formdev.flatlaf.extras.FlatSVGIcon;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Ventana2 window = new Ventana2();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Ventana2() {
		initialize();
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 742, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 231, 13));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(68, 100, 227));
		panel_1.add(panel_2, BorderLayout.SOUTH);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(102, 153, 255));
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 730, 31);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		panel_4.add(panel);

		JLabel lblNewLabel = new JLabel("Registro Usuarios");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		panel.add(lblNewLabel);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 42, 348, 358);
		panel_3.setLayout(null);

		panel_3.setBorder(
			BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.BLACK),
				"Datos Generales",
				TitledBorder.LEFT,
				TitledBorder.TOP
			)
		);

		panel_4.add(panel_3);

		JPanel formulario = new JPanel();
		formulario.setBounds(0, 25, 320, 300);
		formulario.setLayout(new GridLayout(6,2,5,5));
		panel_3.add(formulario);

		JLabel lblNombre = new JLabel("Nombre:");
		formulario.add(lblNombre);

		textField = new JTextField();
		textField.setEditable(false);
		formulario.add(textField);

		JLabel lblApPat = new JLabel("Apellido Paterno:");
		formulario.add(lblApPat);

		textField_1 = new JTextField();
		formulario.add(textField_1);

		JLabel lblApMat = new JLabel("Apellido Materno:");
		formulario.add(lblApMat);

		textField_2 = new JTextField();
		formulario.add(textField_2);

		JLabel lblFecha = new JLabel("Fecha de Nacimiento:");
		formulario.add(lblFecha);

		JTextField txtFecha = new JTextField();
		formulario.add(txtFecha);

		JLabel lblSexo = new JLabel("Sexo:");
		formulario.add(lblSexo);

		JPanel sexoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JRadioButton masculino = new JRadioButton("Masculino");
		JRadioButton femenino = new JRadioButton("Femenino");
		sexoPanel.add(masculino);
		sexoPanel.add(femenino);
		formulario.add(sexoPanel);

		JLabel lblNac = new JLabel("Nacionalidad:");
		formulario.add(lblNac);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addItem("México");
		comboBox.addItem("Estados Unidos");
		comboBox.addItem("España");
		comboBox.addItem("Argentina");
		formulario.add(comboBox);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(372, 42, 348, 358);
		panel_3_1.setLayout(null);

		panel_3_1.setBorder(
			BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.BLACK),
				"Perfil del usuario"
			)
		);

		panel_4.add(panel_3_1);

		JLabel lblImagen = new JLabel("");
		//lblImagen.setIcon(new FlatSVGIcon(Ventana2.class.getResource("/SignUp/IconUser.png")));
		lblImagen.setIcon(new ImageIcon(Ventana2.class.getResource("/SignUp/UsuarioIcono.png")));
		lblImagen.setBounds(106, 42, 128, 141);
		panel_3_1.add(lblImagen);

		JCheckBoxMenuItem chkFoto = new JCheckBoxMenuItem("Mostrar Foto de perfil");
		chkFoto.setBounds(80, 210, 200, 25);
		panel_3_1.add(chkFoto);

		JCheckBoxMenuItem chkFecha = new JCheckBoxMenuItem("Mostrar Fecha de nacimiento");
		chkFecha.setBounds(80, 240, 220, 25);
		panel_3_1.add(chkFecha);

		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBounds(10, 411, 348, 99);
		panel_3_2.setLayout(null);

		panel_3_2.setBorder(
			BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.BLACK),
				"Datos Adicionales"
			)
		);

		panel_4.add(panel_3_2);

		JLabel lblDesc = new JLabel("Descripción:");
		lblDesc.setBounds(10, 15, 100, 14);
		panel_3_2.add(lblDesc);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 30, 150, 58);
		panel_3_2.add(textArea);

		JLabel lblPref = new JLabel("Preferencias:");
		lblPref.setBounds(188, 15, 100, 14);
		panel_3_2.add(lblPref);

		DefaultListModel<String> modelo = new DefaultListModel<>();
		modelo.addElement("Cantar");
		modelo.addElement("Escuchar música");
		modelo.addElement("Leer");
		modelo.addElement("Deportes");

		JList<String> list = new JList<>(modelo);
		list.setBounds(188, 30, 150, 58);
		panel_3_2.add(list);

		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setBounds(372, 411, 348, 99);
		panel_3_2_1.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		panel_4.add(panel_3_2_1);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNuevoIcono = new JLabel("Nuevo");
		lblNuevoIcono.setIcon(new ImageIcon(Ventana2.class.getResource("/SignUp/NuevoIcono.png")));
		lblNuevoIcono.setBounds(100, 400, 50, 50);
		panel_3_2_1.add(lblNuevoIcono);
		
		JButton btnGuardar = new JButton("Guardar");
		
		JLabel lblGuardar = new JLabel("Guardar");
		lblGuardar.setIcon(new ImageIcon(Ventana2.class.getResource("/SignUp/Guardar.png")));
		lblGuardar.setBounds(100, 400, 50, 50);
		panel_3_2_1.add(lblGuardar);
		
		JButton btnSalir = new JButton("Salir");
		
		JLabel lblSalir = new JLabel("Salir");
		lblSalir.setIcon(new ImageIcon(Ventana2.class.getResource("/SignUp/cerrar-sesion.png")));
		lblSalir.setBounds(100, 400, 50, 50);
		panel_3_2_1.add(lblSalir);

		panel_3_2_1.add(btnNuevo);
		panel_3_2_1.add(btnGuardar);
		panel_3_2_1.add(btnSalir);
	}
}