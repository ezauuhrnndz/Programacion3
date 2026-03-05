package Interes;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CalcularInteres extends JFrame{
	
    Button button1, button2;	
	private JButton b1,b2,b3; 
	
	public void VentanaPrincipal() {
		this.setTitle("CALCULAR INTERES");
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(new Color(245, 245, 245)); 
        
        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new BorderLayout());
        contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedor);
        
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new BorderLayout());
        
        JLabel Calcular = new JLabel(" Caclcular el interes", SwingConstants.RIGHT);
        Calcular.setOpaque(true);
        Calcular.setBackground(new Color(250, 250, 250));
        Calcular.setFont(new Font("Segoe UI", Font.BOLD, 32));
        Calcular.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 0, 0, 15)));
        
        panelSuperior.add(Calcular, BorderLayout.NORTH);

        contenedor.add(panelSuperior, BorderLayout.NORTH);
        
        b1 = new JButton("Capital");
	    b2 = new JButton("Tiempo");
	    b3 = new JButton("Tasa");
	
	    JPanel panelMemoria = new JPanel();
    	panelMemoria.setLayout(new GridLayout(1,4,1,1));
    	
    	panelMemoria.add(b1);
    	panelMemoria.add(b2);
    	panelMemoria.add(b3);
    	

        button1 = new Button("calcular");
        button2 = new Button("cancelar");
        add(button1);
        add(button2);
	    	    
        contenedor.add(panelMemoria,BorderLayout.CENTER);
        VentanaPrincipal();
	}
}
