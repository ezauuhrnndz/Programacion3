package Programacion3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    public Ventana() {
        this.setTitle("---INICIAR SESION---");
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.decode("#FDEBD0"));
        this.setVisible(true);
        
        //this.login();
        //this.registro();
        this.users();
        
    }
    public void login() {
    	 JPanel contenedor = new JPanel();
         contenedor.setBounds(50, 40, 400, 480);
         contenedor.setBackground(Color.white);
         contenedor.setLayout(null);
         contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
         this.add(contenedor);

         JLabel title_login = new JLabel("¡BIENVENIDO!", SwingConstants.CENTER);
         title_login.setBounds(50, 40, 300, 40);
         title_login.setFont(new Font("Segoe UI", Font.BOLD, 24));
         contenedor.add(title_login);

         JLabel user = new JLabel("NOMBRE DE USUARIO:");
         user.setBounds(50, 130, 300, 20);
         user.setFont(new Font("Segoe UI", Font.BOLD, 12));
         contenedor.add(user);

         JTextField username = new JTextField();
         username.setBounds(50, 155, 300, 35);
         username.setBorder(BorderFactory.createCompoundBorder(
             BorderFactory.createLineBorder(new Color(200, 200, 200)),
             BorderFactory.createEmptyBorder(0, 10, 0, 0)));
         contenedor.add(username);

         JLabel pass = new JLabel("CONTRASEÑA:");
         pass.setBounds(50, 205, 300, 20);
         pass.setFont(new Font("Segoe UI", Font.BOLD, 12));
         contenedor.add(pass);

         JPasswordField password = new JPasswordField();
         password.setBounds(50, 230, 300, 35);
         password.setBorder(BorderFactory.createCompoundBorder(
             BorderFactory.createLineBorder(new Color(200, 200, 200)),
             BorderFactory.createEmptyBorder(0, 10, 0, 0)));
         contenedor.add(password);

         JCheckBox recordar = new JCheckBox("Recordarme");
         recordar.setBounds(50, 275, 120, 20);
         recordar.setBackground(Color.WHITE);
         recordar.setFont(new Font("Segoe UI", Font.PLAIN, 11));
         contenedor.add(recordar);

         JButton ask = new JButton("¿Olvido su contraseña?");
         ask.setBounds(225, 275, 150, 20);
         ask.setFont(new Font("Segoe UI", Font.PLAIN, 11));
         ask.setForeground(Color.decode("#7E5109"));
         ask.setBorderPainted(false);
         ask.setContentAreaFilled(false);
         ask.setCursor(new Cursor(Cursor.HAND_CURSOR));
         contenedor.add(ask);

         JButton acceder = new JButton("ACCEDER");
         acceder.setBounds(50, 350, 300, 45);
         acceder.setBackground(Color.decode("#7E5109"));
         acceder.setForeground(Color.WHITE);
         acceder.setFont(new Font("Segoe UI", Font.BOLD, 16));
         acceder.setFocusPainted(false);
         acceder.setBorder(null);
         contenedor.add(acceder);
	}
	public void registro(){
		JPanel register = new JPanel();
        register.setBounds(500, 40, 430, 480);
        register.setBackground(Color.WHITE); 
        register.setLayout(null);
        register.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(register);

        JLabel title_register = new JLabel("REGISTRO", SwingConstants.CENTER);
        title_register.setBounds(65, 40, 300, 40);
        title_register.setFont(new Font("Segoe UI", Font.BOLD, 24));
        register.add(title_register);

        JLabel bio = new JLabel("BIOGRAFIA");
        bio.setBounds(30, 100, 200, 20);
        bio.setFont(new Font("Segoe UI", Font.BOLD, 12));
        register.add(bio);

        JTextArea bio_dos = new JTextArea();
        bio_dos.setBounds(30, 125, 370, 80);
        bio_dos.setLineWrap(true);
        bio_dos.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        register.add(bio_dos);

        JLabel gustos = new JLabel("PREFERENCIAS:");
        gustos.setBounds(30, 220, 200, 20);
        gustos.setFont(new Font("Segoe UI", Font.BOLD, 12));
        register.add(gustos);

        JCheckBox sweet = new JCheckBox("DULCE");
        sweet.setBounds(30, 245, 80, 25);
        sweet.setBackground(Color.WHITE);
        register.add(sweet);

        JCheckBox salty = new JCheckBox("SALADO");
        salty.setBounds(120, 245, 80, 25);
        salty.setBackground(Color.WHITE);
        register.add(salty);

        JCheckBox healthy = new JCheckBox("SALUDABLE");
        healthy.setBounds(210, 245, 110, 25);
        healthy.setBackground(Color.WHITE);
        register.add(healthy);

        ButtonGroup terminos = new ButtonGroup();
        JRadioButton opc1 = new JRadioButton("Acepto terminos");
        opc1.setBounds(30, 290, 150, 25);
        opc1.setBackground(Color.WHITE);
        JRadioButton opc2 = new JRadioButton("Rechazo terminos");
        opc2.setBounds(180, 290, 150, 25);
        opc2.setBackground(Color.WHITE);
        terminos.add(opc1);
        terminos.add(opc2);
        register.add(opc1);
        register.add(opc2);

        JLabel colLabel = new JLabel("COLONIA:");
        colLabel.setBounds(30, 335, 200, 20);
        colLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
        register.add(colLabel);

        String[] colonias = {"Elige una","Calafia", "Esterito", "8 de Octubre", "Santa Fe", "Camino Real"};
        
        JComboBox colonia = new JComboBox(colonias);
        colonia.setBounds(30, 360, 370, 30);
        register.add(colonia);
        
        register.repaint();
			
	}
	public void users() {
		
		JPanel users = new JPanel();
		users.setSize(800,400);
		users.setLocation(100,50);
		users.setBackground(Color.white);
		this.add(users);
		
		JLabel usuarios = new JLabel("USUARIOS");
		usuarios.setBounds(110,500,200,40);
		usuarios.setHorizontalAlignment(JLabel.CENTER);
		usuarios.setOpaque(true);
        usuarios.setLayout(null);
		usuarios.setBackground(Color.white);
		usuarios.setFont(new Font("Segoe UI", Font.BOLD, 24));
		users.add(usuarios);
		
		JButton export = new JButton("Exportar");
		export.setBounds(150, 120, 100, 40);
		users.add(export);		
		
		JButton add = new JButton("Añadir");
		add.setBounds(130, 120, 100, 40);
		users.add(add);
		
		String [] tabla = {"No. de Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"};		
		
		String [][] tablaDos = {
				    {"2023001", "Juan", "Pérez López", "6", "8.9", "Editar/Eliminar"},
				    {"2023002", "María", "García Hernández", "4", "9.2", "Editar/Eliminar"},
				    {"2023003", "Carlos", "Martínez Sánchez", "8", "7.5", "Editar/Eliminar"},
				    {"2023004", "Ana", "Rodríguez Gómez", "2", "9.8", "Editar/Eliminar"}

		};
		
		JTable usuariosTabla = new JTable(tablaDos, tabla );
		usuarios.setLocation(10,300);
		usuarios.setSize(100,80);
		users.add(usuariosTabla);
		
        this.setVisible(true);
        users.repaint();	
		
	}

}