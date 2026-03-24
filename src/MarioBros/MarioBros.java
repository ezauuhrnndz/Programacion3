package MarioBros;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarioBros extends JFrame{
	static BufferedImage imagen = null;
    public MarioBros() {
        this.setTitle("");
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);
        
        this.pintar();
    }
    
    /*
     */
    
    public void pintar () {
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                
//              PINTAR CIELO (#5C94FC)

                GradientPaint gradienteCielo = new GradientPaint(
                        0, 0, Color.decode("#213A5C"), 
                        0, 500, Color.decode("#F2A172") 
                    );
                    
                    g2d.setPaint(gradienteCielo);
                    g2d.fillRect(0, 0, 1920, 1080);
                    
//              TUBERIA VERDE #00A800

                // SOMBRA TUBERIA 
                g2d.setColor(Color.decode("#404040"));
                g2d.fillRect(765, 515, 100, 175);
                g2d.fillRect(715, 475, 200, 60);
                
                g2d.setColor(Color.decode("#008000"));
                g2d.fillRect(750,500,100,175);
                
                g2d.setColor(Color.decode("#00A800"));
                g2d.fillRect(760, 500, 90, 175);
                
                g2d.setColor(Color.decode("#88D800"));
                g2d.fillRect(770, 500, 15, 175);
                
                g2d.setColor(Color.black);
                g2d.drawRect(750,500,100,175);
                
                // CABEZA DE TUBERIA 
                
                g2d.setColor(Color.decode("#008000"));
                g2d.fillRect(700,460,200,60);
                
                g2d.setColor(Color.decode("#00A800"));
                g2d.fillRect(710, 460, 190, 60);
                
                g2d.setColor(Color.decode("#88D800"));
                g2d.fillRect(720, 460, 15, 60); 
                
                g2d.setColor(Color.black);
                g2d.drawRect(700,460,200,60);

//              BLOQUES 
                
                // SOMBRA BLOQUE AZUL
                g2d.setColor(Color.decode("#404040"));
                g2d.fillRect(215, 315, 300, 375);

                //AZUL
                
                g2d.setColor(Color.decode("#1B97CF"));
                g2d.fillRect(200,300,300,375);
                
                g2d.setColor(Color.black);
                g2d.drawRect(200,300,300,375);
                
                // SOMBRA CUADRO ROSA
                g2d.setColor(Color.decode("#404040"));
                g2d.fillRect(115, 415, 300, 275);

                //ROSA
                
                g2d.setColor(Color.decode("#D998E3"));
                g2d.fillRect(100,400,300,275);
                
                g2d.setColor(Color.black);
                g2d.drawRect(100,400,300,275);
                
                // SOMBRA BLOQUE VERDE
                g2d.setColor(Color.decode("#404040"));
                g2d.fillRect(1065, 490, 200, 200);

                //VERDE 
                
                g2d.setColor(Color.decode("#41E06C"));
                g2d.fillRect(1050,475,200,200);
                
                g2d.setColor(Color.black);
                g2d.drawRect(1050,475,200,200);
                
//              LADRILLOS #C84C0C
                
                // SOMBRA LADRILLOS
                g2d.setColor(Color.decode("#404040"));
                g2d.fillRect(815, 215, 100, 100);
                g2d.fillRect(915, 215, 100, 100);

                g2d.setColor(Color.decode("#C84C0C"));
                g2d.fillRect(800,200,100,100);
                
                g2d.setColor(Color.black);
                g2d.drawRect(800,200,50,20);
                g2d.drawRect(850,200,50,20);
                g2d.drawRect(825,220,50,20);
                g2d.drawRect(800,240,50,20);
                g2d.drawRect(850,240,50,20);
                g2d.drawRect(825,260,50,20);
                g2d.drawRect(800,280,50,20);
                g2d.drawRect(850,280,50,20);
                g2d.drawRect(800,200,100,100);

                
                g2d.setColor(Color.decode("#C84C0C"));
                g2d.fillRect(900,200,100,100);
                
                g2d.setColor(Color.black);
                g2d.drawRect(900,200,100,100);
                
//              BLOQUE INTERROGACION #F8D824
                
                // SOMBRA BLOQUE INTERROGACION
                g2d.setColor(Color.decode("#404040"));
                g2d.fillRect(1015, 215, 100, 100);

                g2d.setColor(Color.decode("#F8D824"));
                g2d.fillRect(1000,200,100,100);
                
                g2d.setColor(Color.black);
                g2d.drawRect(1000,200,100,100);
                
//              ARBUSTO
                
                // SOMBRA ARBUSTO
                g2d.setColor(Color.decode("#404040"));
                g2d.fillOval(565, 590, 100, 100);
                g2d.fillOval(635, 615, 75, 75);
                g2d.fillOval(520, 615, 75, 75);
                
/*              //SOMBRA 2 ARBUSTO
                g2d.setColor(Color.decode("#437337"));
                g2d.fillOval(487, 600, 75, 75);
                */

                g2d.setColor(Color.decode("#88D800"));
                g2d.fillOval(550, 575, 100, 100);
                g2d.fillOval(620, 600, 75, 75);
                g2d.fillOval(505, 600, 75, 75);
                

//              NUBES #FCFCFC
                
                // SOMBRA NUBES
                g2d.setColor(Color.decode("#404040"));
                g2d.fillOval(115, 115, 150, 150);
                g2d.fillOval(205, 135, 100, 100);
                g2d.fillOval(75, 135, 100, 100);

//              PINTAR PISO #943210
                
                int cantidadDeCuadros = 20; 
                int anchoCuadro = 100;

                for (int i = 0; i < cantidadDeCuadros; i++) {
                    int x = i * anchoCuadro;

                    g2d.setColor(Color.decode("#4EAB5D"));
                    g2d.fillRect(x, 675, anchoCuadro, 405);
                    
                    g2d.setColor(Color.decode("#449451"));
                    g2d.fillRect(x + 50, 675, 50, 50);
                    g2d.fillRect(x, 725, 50, 50);
                    g2d.fillRect(x + 50, 775, 50, 50);
                    g2d.fillRect(x, 825, 50, 50);
                    
                    g2d.setStroke(new BasicStroke(2.0f));
                    g2d.setColor(Color.decode("#437337"));
                    g2d.drawLine(0, 675, 1920, 675);
                }
                
                g2d.setColor(Color.decode("#FCFCFC"));
                g2d.fillOval(100, 100, 150, 150);
                
                g2d.setColor(Color.decode("#FCFCFC"));
                g2d.fillOval(190, 120, 100, 100);
                
                g2d.setColor(Color.decode("#FCFCFC"));
                g2d.fillOval(60, 120, 100, 100);
                
                
                /*JLabel imagen = new JLabel(new ImageIcon("MARIO BROS.png"));
                imagen.setBounds(200,200, 900, 1200);
                this.add(imagen);
                
                Toolkit t = Toolkit.getDefaultToolkit();
                Image imagen = t.getImage("MARIO BROS.png");
                
                BufferedImage bi = null;
                try {
					bi = ImageIO.read(new File("MARIO BROS.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
                Image imagen1 = bi.getScaledInstance(50,50,Image.SCALE_DEFAULT);
                g2d.drawImage(imagen1,0,0,null);*/
                
                }
                              
            };
            pane.setSize(1920,1080);
            pane.setLocation(0,0);
            this.add(pane);
    }
}