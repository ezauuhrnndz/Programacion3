package Programacion3;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	public Ventana () {
		
		JFrame ventana = new JFrame();
		
		ventana.setVisible(true);
		ventana.setSize(500,500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension (200, 200));
		ventana.setMaximumSize(new Dimension (1920, 1080));
		ventana.setTitle("HOLAHOLA");
		ventana.setBackground(Color.black);
		
		
	}

}
