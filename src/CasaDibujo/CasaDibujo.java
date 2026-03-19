package CasaDibujo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CasaDibujo extends JFrame{
	
	public CasaDibujo() {
        this.setTitle("");
        this.setSize(1000, 635);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);
        
        this.pintar();
	}
	
	public void pintar () {
		 JPanel pane = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                
	                Graphics2D g2d = (Graphics2D) g;
	                
//	                Pasto
	                
	                g2d.setColor(Color.decode("#4CAF50"));
	                g2d.fillRect(0,500,1000,100);
	                
	                // Sombras #2E7D32

	                int[] x = {50, 750, 850, 800};
	                int[] y = {500, 500, 490, 600};

	                g2d.setColor(Color.decode("#2E7D32")); 
	                g2d.fillPolygon(x, y, 4);
	                

//					Cielo (Posible cambio a imagen png)

	                GradientPaint gradienteCielo = new GradientPaint(
	                        0, 0, Color.decode("#213A5C"), 
	                        0, 500, Color.decode("#F2A172") 
	                    );
	                    
	                    g2d.setPaint(gradienteCielo);
	                    g2d.fillRect(0, 0, 1000, 500);
	                

//						Barda 
                    
	                    for (int xB = 10; xB <= 1000; xB += 40) {
	                        
	                        // Sombras
	                        g2d.setColor(Color.decode("#2E7D32"));
	                        int[] sX = {xB, xB + 30, xB + 50, xB + 20};
	                        int[] sY = {500, 500, 515, 515};
	                        g2d.fillPolygon(sX, sY, 4);
	                        
	                        // Poste
	                        g2d.setColor(Color.decode("#4D2A0A"));
	                        g2d.fillRect(xB, 410, 30, 90);
	                        
	                        int[] pX = {xB, xB + 15, xB + 30};
	                        int[] pY = {410, 400, 410};
	                        g2d.fillPolygon(pX, pY, 3);
	                    }
                    
                
	                
//	                Sol
	                
	                g2d.setColor(Color.decode("#FFD54F"));
	                g2d.fillOval(10, 10, 100, 100);
	                
	                float[] dist = {0.0f, 1.0f};

	                Color[] colores = {
	                    new Color(255,255,200),   
	                    new Color(255,213,79)     
	                };

	                RadialGradientPaint rgp = new RadialGradientPaint(
	                    60, 60,      
	                    50,      
	                    dist,
	                    colores
	                    
	                    
	                );

	                g2d.setPaint(rgp);
	                g2d.fillOval(10,10,100,100); 
	                
	                    
//					Faro
	                
                    g2d.setColor(Color.decode("#45556C"));
	                g2d.fillRect(900,180,10,320);
	                
	                g2d.setColor(Color.decode("#45556C"));
	                g2d.fillRect(810,180,100,10);
	                
	                g2d.setColor(Color.decode("#45556C"));
	                g2d.fillRect(810,180,10,30);
	                
	                // Luz
	                g2d.setColor(Color.decode("#FFEB3B"));
	                g2d.fillOval(800, 210, 30, 30);
	                
	                g2d.setColor(Color.decode("#45556C"));
	                g2d.fillRect(800,210,30,20);
	                
	                    
	                
	                
//	                Frente de casa
	                
	                g2d.setColor(Color.decode("#F5DEB3"));
	                g2d.fillRect(200,200,300,320);
	                
//	                Lado de casa
	                
	                g2d.setColor(Color.decode("#D2B48C"));
	                g2d.fillRect(500,200,250,320);
	                
//	                Tejado
	                
	                g2d.setColor(Color.decode("#8B1A1A"));
	                g2d.fillRect(350,120,250,80);
	                
//	                (350,120)   
//	                (500,200)   
//	                (750,200)
	                
	                int [] PX = {600,500,750};
	                int [] PY = {120,200,200};
	                
	                g2d.setColor(Color.decode("#8B1A1A"));
	                g2d.fillPolygon(PX, PY, 3);
	                
//	                (350,120)
//	                (200,200)
//	                (500,200)
	                
	                int []  puntosX = {350,200,500};
	                int []  puntosY = {120,200,200};

	                g2d.setColor(Color.decode("#CD5C5C"));
	                g2d.fillPolygon(puntosX, puntosY, 3);
	                
//	                Puerta 
	                
	                g2d.setColor(Color.decode("#6D4C41"));
	                g2d.fillRect(250,420,50,80);
	                
	                g2d.setColor(Color.decode("#3E2723"));
	                g2d.drawRect(250, 420, 50, 80);
	                
	                g2d.setColor(Color.decode("#3E2723"));
	                g2d.fillOval(285, 455, 10, 10);
	                
	                // Sombras
	                
	                int [] SombraPX = {500,300,300};
	                int [] SombraPY = {500,500,420};	                
	                g2d.setColor(Color.decode("#D2B48C"));
	                g2d.fillPolygon(SombraPX,SombraPY,3);
	                
	                
	                
	                
	                
	                /*
	                 * int []  puntosX = {350,200,500};
	                int []  puntosY = {120,200,200};

	                g2d.setColor(Color.decode("#CD5C5C"));
	                g2d.fillPolygon(puntosX, puntosY, 3);
	                
	                */
	                
//	                Ventanas #B3E5FC
	                
	                //SOMBRAS 
	                
	                int [] SombraX = {300,300,400};
	                int [] SombraY = {350,300,350};	                
	                g2d.setColor(Color.decode("#D2B48C"));
	                g2d.fillPolygon(SombraX,SombraY,3);
	                
	                g2d.setColor(Color.decode("#B3E5FC"));
	                g2d.fillRect(250,300,50,50);
	                
	                // Marcos #FFFFFF
	                
	                g2d.setColor(Color.decode("#FFFFFF"));
	                g2d.drawRect(250,300,50,50);
	                
	                // Reflejos #E1F5FE
	                
	                GradientPaint gp = new GradientPaint
	                		(255, 305, new Color(255,255,255,250), 
	                	     255, 345, new Color(255,255,255,50));

	                	g2d.setPaint(gp);
	                	g2d.fillRect(250,300,50,50);
	            
	                
//	                Ventana Lateral
	            
                
                g2d.setColor(Color.decode("#D2B48C"));
                g2d.fillRect(600,300,50,50);
                
                // Marcos #FFFFFF
                
                g2d.setColor(Color.decode("#FFFFFF"));
                g2d.drawRect(600,300,50,50);
                
                // Reflejos #E1F5FE
                
                GradientPaint g2p = new GradientPaint
                		(605, 305,  Color.decode("#FFFFFF"), 
                	     605, 345,  Color.decode("#B3E5FC"));

                	g2d.setPaint(g2p);
                	g2d.fillRect(600,300,50,50);
            

            	g2d.setColor(new Color(255, 255, 150, 50));

            	int[] luzX = {50,-1000,1800};
            	int[] luzY = {50,800,800};

                	g2d.fillPolygon(luzX, luzY, 3);
                	
	                /*BufferedImage image;
					try {
						image = ImageIO.read(new File("UsuarioIcono.png"));
		                g2d.drawImage(image, 500, 9, null);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();*/
					}

	        };
	        pane.setSize(1200,600);
		    pane.setLocation(0,0);
		    this.add(pane);
	}
}