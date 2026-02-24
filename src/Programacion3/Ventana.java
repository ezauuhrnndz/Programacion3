package Programacion3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana () {
		
		this.setVisible(true);
		this.setSize(1000,540);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension (960, 540));
		this.setMaximumSize(new Dimension (1920, 1080));
		this.setTitle("---INICIAR SESIÓN---");
		this.setLayout(null);
		//ventana.setBackground(Color.black);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(500,500);
		contenedor.setLocation(0,0);
		contenedor.setLayout(null);
		this.add(contenedor);

		JLabel title_login = new JLabel();
		title_login.setText("INICIAR SESIÓN ");
		title_login.setSize(275,30);
		title_login.setOpaque(true);
		title_login.setLocation(150,30);
		title_login.setBackground(Color.gray);
		title_login.setFont(new Font ("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JLabel user = new JLabel();
		user.setText("NOMBRE DE USUARIO: ");
		user.setSize(275,30);
		user.setOpaque(true);
		user.setLocation(150,175);
		user.setBackground(Color.gray);
		user.setFont(new Font ("Arial",Font.BOLD,14));
		contenedor.add(user);

		JTextField username = new JTextField();
		username.setSize(275,30);
		username.setLocation(150,200);
		username.setFont(new Font ("Arial",Font.BOLD,14));
		contenedor.add(username);
		
		JLabel pass = new JLabel();
		pass.setText("CONTRASEÑA: ");
		pass.setSize(275,30);
		pass.setOpaque(true);
		pass.setLocation(150,250);
		pass.setBackground(Color.gray);
		pass.setFont(new Font ("Arial",Font.BOLD,14));
		contenedor.add(pass);
		
		JPasswordField password = new JPasswordField();
		password.setSize(275,30);
		password.setLocation(150,275);
		password.setFont(new Font ("Arial",Font.BOLD,14));
		contenedor.add(password);
		
		JCheckBox recordar = new JCheckBox();
		recordar.setText("Recordarme ");
		recordar.setSize(100,20);
		recordar.setOpaque(true);
		recordar.setLocation(150,305);
		recordar.setBackground(Color.gray);
		recordar.setFont(new Font ("Arial",Font.BOLD,10));
		contenedor.add(recordar);
		
		JButton ask = new JButton();
		ask.setText("¿Olvidó su contraseña?");
		ask.setLocation(275,305);
		ask.setSize(150,20);
		ask.setBackground(Color.gray);
		ask.setBorderPainted(false);
		ask.setContentAreaFilled(false);
		ask.setFont(new Font ("Arial",Font.BOLD,10));
		contenedor.add(ask);
		
		JButton acceder = new JButton();
		acceder.setText("ACCEDER");
		acceder.setLocation(190,400);
		acceder.setSize(200,50);
		acceder.setBackground(Color.red);
		acceder.setForeground(Color.white);
		acceder.setFont(new Font ("Arial",Font.BOLD,22));
		contenedor.add(acceder);
	
		contenedor.repaint();
		contenedor.revalidate();
		
		JPanel register = new JPanel();
		register.setSize(500,500);
		register.setLocation(650,50);
		register.setOpaque(true);
		register.setForeground(Color.black);
		register.setLayout(null);
		this.add(register);

		JLabel bio = new JLabel(" BIOGRAFIA ");
		bio.setBounds(0, 0, 250, 40);
		bio.setBackground(Color.white);
		bio.setHorizontalAlignment(JLabel.CENTER);
		bio.setOpaque(true);
		bio.setFont(new Font ("Arial",Font.BOLD,22));
		register.add(bio);
		
		JTextArea bio_dos = new JTextArea();
		bio_dos.setBackground(Color.black);
		bio_dos.setForeground(Color.white);
		bio_dos.setFont(new Font ("Arial",Font.BOLD,10));
		bio_dos.setBounds(10, 100, 250, 100);
		register.add(bio_dos);
		
		JCheckBox sweet = new JCheckBox("DULCE ");
		sweet.setBounds(10, 200, 90, 40);
		sweet.setFont(new Font ("Arial",Font.BOLD,10));
		register.add(sweet);
		
		JCheckBox salty = new JCheckBox("SALADO ");
		salty.setBounds(105, 200, 90, 40);
		salty.setFont(new Font ("Arial",Font.BOLD,10));
		register.add(salty);
		
		JCheckBox healthy = new JCheckBox("SALUDABLE ");
		healthy.setBounds(200, 200, 90, 40);
		healthy.setFont(new Font ("Arial",Font.BOLD,10));
		register.add(healthy);
		
		JRadioButton opc1 = new JRadioButton("Acepto los terminos.");
		opc1.setBounds(0, 240, 150, 40);
		opc1.setFont(new Font ("Arial",Font.BOLD,10));
		register.add(opc1);
		
		JRadioButton opc2 = new JRadioButton("Rechazo los terminos.");
		opc2.setBounds(150, 240, 150, 40);
		opc2.setFont(new Font ("Arial",Font.BOLD,10));
		register.add(opc2);
	
		
		JComboBox colonia = new JComboBox();


		register.repaint();
		


		

			
	}
}