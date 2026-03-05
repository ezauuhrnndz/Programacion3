package CalculadoraLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculadoraLayout extends JFrame {
	
    private JButton b1,b2,b3,b4;

    public CalculadoraLayout() {
        this.setTitle("CALCULADORA - INTERFAZ");
        this.setSize(340, 500);
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

        JLabel lblResultado = new JLabel("0", SwingConstants.RIGHT);
        lblResultado.setOpaque(true);
        lblResultado.setBackground(new Color(250, 250, 250));
        lblResultado.setFont(new Font("Segoe UI", Font.BOLD, 32));
        lblResultado.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 0, 0, 15)));

        panelSuperior.add(lblResultado, BorderLayout.NORTH);

        contenedor.add(panelSuperior, BorderLayout.NORTH);

        unaVentana(panelSuperior);
        
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4,4,5,5));

        String[] botones = {
                "7","8","9","/",
                "6","5","4","*",
                "3","2","1","-",
                "0",".","=","+"
        };

        for(String texto : botones){
            panelBotones.add(new JButton(texto));
            
        }
        contenedor.add(panelBotones, BorderLayout.CENTER);
        this.setVisible(true);

    }
    public void unaVentana(JPanel contenedor) {
    	
	    b1 = new JButton("CE");
	    b2 = new JButton("MC");
	    b3 = new JButton("M+");
	    b4 = new JButton("Historial");
	
	    JPanel panelMemoria = new JPanel();
    	panelMemoria.setLayout(new GridLayout(1,4,5,5));
    	
    	panelMemoria.add(b1);
    	panelMemoria.add(b2);
    	panelMemoria.add(b3);
    	panelMemoria.add(b4);
    	
    	contenedor.add(panelMemoria,BorderLayout.SOUTH);

        /*JButton btnClear = crearBoton("C", 20, 100);
        btnClear.setBackground(new Color(231, 76, 60)); 
        contenedor.add(btnClear);

        JButton btnDividir = crearBoton("/", 95, 100);
        contenedor.add(btnDividir);

        JButton btnMultiplicar = crearBoton("*", 170, 100);
        contenedor.add(btnMultiplicar);

        JButton btnRestar = crearBoton("-", 245, 100);
        contenedor.add(btnRestar);

        JButton btn7 = crearBoton("7", 20, 170);
        contenedor.add(btn7);

        JButton btn8 = crearBoton("8", 95, 170);
        contenedor.add(btn8);

        JButton btn9 = crearBoton("9", 170, 170);
        contenedor.add(btn9);

        JButton btnSumar = crearBoton("+", 245, 170);
        btnSumar.setSize(60, 130);
        contenedor.add(btnSumar);

        JButton btn4 = crearBoton("4", 20, 240);
        contenedor.add(btn4);

        JButton btn5 = crearBoton("5", 95, 240);
        contenedor.add(btn5);

        JButton btn6 = crearBoton("6", 170, 240);
        contenedor.add(btn6);

        JButton btn1 = crearBoton("1", 20, 310);
        contenedor.add(btn1);

        JButton btn2 = crearBoton("2", 95, 310);
        contenedor.add(btn2);

        JButton btn3 = crearBoton("3", 170, 310);
        contenedor.add(btn3);

        JButton btnIgual = crearBoton("=", 245, 310);
        btnIgual.setSize(60, 130);
        btnIgual.setBackground(new Color(52, 152, 219)); 
        contenedor.add(btnIgual);

        JButton btn0 = crearBoton("0", 20, 380);
        btn0.setSize(210, 60); 
        contenedor.add(btn0);
        
       /* JPanel test_panel = new JPanel();
		test_panel.setSize(400, 450);
		test_panel.setLocation(0, 0);
		test_panel.setBackground(Color.white);
		test_panel.setLayout(null);
		this.add(test_panel, BorderLayout.SOUTH);
        
        JPanel center_panel = new JPanel(); 
		center_panel.setBackground(Color.WHITE);
		center_panel.setLayout(new GridLayout(4,4));
				
		contenedor.add(center_panel,BorderLayout.CENTER);

        this.setVisible(true);*/
    }

   /* private JButton crearBoton(String texto, int x, int y) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, 60, 60);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        boton.setBackground(new Color(240, 240, 240));
        boton.setForeground(new Color(50, 50, 50));
        boton.setFocusPainted(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        return boton;*/
}