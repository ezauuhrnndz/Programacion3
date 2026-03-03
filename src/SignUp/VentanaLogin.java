package SignUp;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class VentanaLogin extends JFrame {
	
	public VentanaLogin() {
        this.setTitle("---INICIAR SESION---");
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null); 
        this.login();
        this.setVisible(true);
	}
	
	public void login() {
        
        JPanel contenedorLogo = new JPanel();
        contenedorLogo.setBounds(50, 40, 502, 480);
        contenedorLogo.setBackground(Color.white);
        contenedorLogo.setLayout(null);
        contenedorLogo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedorLogo);
        
        ImageIcon Logo = new ImageIcon("EntradaLogo.png");

        JLabel textoLogo = new JLabel("", SwingConstants.CENTER);
        textoLogo.setIcon(Logo);
        textoLogo.setBounds(0, 0, 400, 480);
        textoLogo.setFont(new Font("Segoe UI", Font.BOLD, 16));
        contenedorLogo.add(textoLogo);

   	 	JPanel contenedor = new JPanel();
        contenedor.setBounds(550, 40, 400, 480);
        contenedor.setBackground(Color.white);
        contenedor.setLayout(null);
        contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedor);
        
        JLabel title_login = new JLabel(" SIGN UP ", SwingConstants.CENTER);
        title_login.setBounds(50, 40, 300, 40);
        title_login.setFont(new Font("Segoe UI", Font.BOLD, 24));
        contenedor.add(title_login);
        
        ImageIcon iconoUsuario = new ImageIcon("usuario.png");

        JLabel user = new JLabel("NOMBRE DE USUARIO:");
        user.setIcon(iconoUsuario); 
        user.setBounds(50, 130, 300, 20);
        user.setFont(new Font("Segoe UI", Font.BOLD, 12));
        user.setIconTextGap(15);
        contenedor.add(user);

        JTextField username = new JTextField();
        username.setBounds(50, 155, 300, 35);
        username.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        contenedor.add(username);

        ImageIcon iconoContraseña = new ImageIcon("PasswordIcon.png");
        
        JLabel pass = new JLabel("CONTRASEÑA:");
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

        JCheckBox recordar = new JCheckBox("Recordarme");
        recordar.setBounds(50, 275, 120, 20);
        recordar.setBackground(Color.WHITE);
        recordar.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        contenedor.add(recordar);

        JButton ask = new JButton("¿Olvido su contraseña?");
        ask.setBounds(215, 275, 150, 20);
        ask.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        ask.setForeground(Color.decode("#DE6A00"));
        ask.setBorderPainted(false);
        ask.setContentAreaFilled(false);
        ask.setCursor(new Cursor(Cursor.HAND_CURSOR));
        contenedor.add(ask);
        
        final Color colorNaranjaOriginal = Color.decode("#DE6A00");
        final Color colorNaranjaHover = Color.decode("#FF8C00");
        
        JButton acceder = new JButton("ACCEDER");
        acceder.setBounds(50, 350, 300, 45);
        acceder.setBackground(colorNaranjaOriginal);
        acceder.setForeground(Color.WHITE);
        acceder.setFont(new Font("Segoe UI", Font.BOLD, 16));
        acceder.setFocusPainted(false);
        acceder.setBorder(null);
        acceder.setCursor(new Cursor(Cursor.HAND_CURSOR));  
        
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
        
        JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));	
        fondo.setBounds(0, 0, 1000, 600);
        this.add(fondo);
    }
}