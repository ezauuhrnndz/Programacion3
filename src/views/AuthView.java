package views;

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

import Programacion3.Ventana;

public class AuthView {
	
	public void AuthView() {
		
	}

	public void loginView() {
		// TODO Auto-generated method stub
		
		JFrame moodleApp = new JFrame();
		moodleApp.setIconImage(new ImageIcon("logo.png").getImage());
		moodleApp.setTitle("---INICIAR SESION---");
		moodleApp.setSize(1000, 600);
		moodleApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		moodleApp.setLocationRelativeTo(null); // Centra la ventana en la pantalla
		moodleApp.setLayout(null);  
		moodleApp.setVisible(true); 
		
		// Panel de la izquierda para poner el logo o una imagen de bienvenida
        JPanel contenedorLogo = new JPanel();
        contenedorLogo.setBounds(50, 40, 502, 480);
        contenedorLogo.setBackground(Color.white);
        contenedorLogo.setLayout(null);
        contenedorLogo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        moodleApp.add(contenedorLogo);
        
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
        moodleApp.add(contenedor);
        
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
        
        JButton register = new JButton ("New User? Signup");  
        register.setBounds(20, 375, 150, 20);
        register.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        register.setForeground(Color.decode("#DE6A00"));
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        register.setCursor(new Cursor(Cursor.HAND_CURSOR));
        contenedor.add(register);
        
        register.addActionListener(e -> {
        	moodleApp.dispose();
            registerView();
			//this.router("registro");
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
        	    if (username_val.equals("") || username_val.contains(" ")){
        	        username.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
        	        todoBien = false;
        	    }else {
        	        username.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
        	    }

        	    // Validacion dde pass
        	    if (password_val.length() < 6 || password_val.contains(" ")){
        	        password.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
        	            todoBien = false;
        	    }else{
        	        password.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
        	    }

        	    // VALIDACION "TERMINOS"
        	    if (!recordar.isSelected()){
        	        recordar.setForeground(Color.red);
        	        todoBien = false;
        	    }else{
        	        recordar.setForeground(Color.black);
        	    }

        	    // RESULTADO FINAL
        	    if (todoBien){
        	        System.out.println("Registro correcto");
        	    }

        	}

        		
        	
					
        }
				);

        
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
        moodleApp.add(fondo);
        moodleApp.add(contenedor); 
        moodleApp.setVisible(true);
        moodleApp.repaint();
        
	}

	public void registerView() {
		
		AuthView vista = new AuthView();
		
	}

}
