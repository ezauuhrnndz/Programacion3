package Interes;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CalcularInteres extends JFrame{
	
	private JButton b1,b2,b3;
	private JButton button1, button2;

	public void VentanaPrincipal() {
		
		this.setTitle("CALCULAR INTERES");
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());
        this.add(contenedor);
        
        JLabel Calcular = new JLabel("Calcular el interes", SwingConstants.CENTER);
        Calcular.setFont(new Font("Segoe UI", Font.BOLD, 32));
        
        contenedor.add(Calcular, BorderLayout.NORTH);
        
        b1 = new JButton("Capital");
	    b2 = new JButton("Tiempo");
	    b3 = new JButton("Tasa");
	
	    JPanel panelMemoria = new JPanel();
    	panelMemoria.setLayout(new GridLayout(1,3));
    	
    	panelMemoria.add(b1);
    	panelMemoria.add(b2);
    	panelMemoria.add(b3);
    	
    	contenedor.add(panelMemoria,BorderLayout.CENTER);
    	
    	JPanel panelBotones = new JPanel();
    	
    	button1 = new JButton("Calcular");
        button2 = new JButton("Cancelar");
        
        panelBotones.add(button1);
        panelBotones.add(button2);
        
        contenedor.add(panelBotones, BorderLayout.SOUTH);
        
        this.setVisible(true);
	}

	public static void main(String[] args) {
		CalcularInteres ventana = new CalcularInteres();
		ventana.VentanaPrincipal();
	}
}