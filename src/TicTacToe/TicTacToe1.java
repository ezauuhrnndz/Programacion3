package TicTacToe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TicTacToe1 extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JPanel gridPanel;
    private JButton[] botones = new JButton[9];
    private LogicaTicTacToe logica = new LogicaTicTacToe();
    private JLabel scoreX;
    private JLabel scoreO;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TicTacToe1 frame = new TicTacToe1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TicTacToe1() {
//    	Implementacion de la Ventana y sus caracteristicas
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 600);
        setResizable(false);

//        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(new Color(30, 30, 30));
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);

        JPanel northPanel = new JPanel(new BorderLayout());
        northPanel.setBackground(new Color(30, 30, 30));
        northPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

//      JLabel con el titulo del juego
        JLabel titulo = new JLabel("Tic Tac Toe", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setForeground(new Color(240, 240, 240));
        titulo.setBorder(BorderFactory.createEmptyBorder(6, 0, 10, 0));
        northPanel.add(titulo, BorderLayout.NORTH);
        
//		JLabel que contiene el temporizador
        JLabel timer = new JLabel("0:00", SwingConstants.CENTER);
        timer.setFont(new Font("Arial", Font.PLAIN, 16));
        timer.setForeground(new Color(180, 180, 180));
        timer.setBorder(BorderFactory.createEmptyBorder(0, 0, 8, 0));
        northPanel.add(timer, BorderLayout.CENTER);

//      Panel de marcador "X" y "O"
        JPanel scorePanel = new JPanel(new GridLayout(1, 2, 0, 0));
        scorePanel.setBackground(new Color(30, 30, 30));

        //Marcador jugador X
        scoreX = new JLabel("X: 0", SwingConstants.CENTER);
        scoreX.setFont(new Font("Arial", Font.BOLD, 16));
        scoreX.setForeground(new Color(240, 240, 240));
        
        //Marcador jugador O
        scoreO = new JLabel("O: 0", SwingConstants.CENTER);
        scoreO.setFont(new Font("Arial", Font.BOLD, 16));
        scoreO.setForeground(new Color(240, 240, 240));

        scorePanel.add(scoreX);
        scorePanel.add(scoreO);
        northPanel.add(scorePanel, BorderLayout.SOUTH);

        contentPane.add(northPanel, BorderLayout.NORTH);

//      Layout para tablero
        gridPanel = new JPanel(new GridLayout(3, 3, 6, 6));
        gridPanel.setBackground(new Color(30, 30, 30));
        contentPane.add(gridPanel, BorderLayout.CENTER);

//      Tablero 
        for (int i = 0; i < 9; i++) {

            botones[i] = new JButton(); 

            botones[i].setFont(new Font("Arial", Font.BOLD, 60));
            botones[i].setBackground(new Color(240, 240, 240));
            botones[i].setForeground(new Color(30, 30, 30));
            botones[i].setFocusPainted(false);
            botones[i].setBorder(BorderFactory.createLineBorder(new Color(180, 180, 180), 2, true));
            botones[i].setText("");

            int posicion = i;  

            botones[i].addActionListener(e -> { 

                if (logica.hacerJugada(posicion)) {

                    botones[posicion].setText(logica.turnoActual);
                    botones[posicion].setEnabled(false);

                    if (logica.preguntarGanador()) {
                    	
                        String ganador = logica.ganador();
                        actualizarMarcador();
                        JOptionPane.showMessageDialog(this, "¡Jugador " + ganador + " gana!");
                        reiniciarTablero();
                        
                    } else if (logica.empate()) {
                    	
                        JOptionPane.showMessageDialog(this, "¡Empate!");
                        reiniciarTablero();
                        
                    } else {
                    	
                        logica.cambiarTurno();
                    }
                }
            });

            gridPanel.add(botones[i]);
        }

        JPanel southPanel = new JPanel();
        southPanel.setBackground(new Color(30, 30, 30));
        southPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

//      Boton para reiniciar juego
        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setFont(new Font("Arial", Font.BOLD, 14));
        btnReiniciar.setBackground(new Color(240, 240, 240));
        btnReiniciar.setForeground(new Color(30, 30, 30));
        btnReiniciar.setFocusPainted(false);
        btnReiniciar.setBorder(BorderFactory.createLineBorder(new Color(180, 180, 180), 2, true));

        btnReiniciar.addActionListener(e -> reiniciarTablero());

        southPanel.add(btnReiniciar);
        contentPane.add(southPanel, BorderLayout.SOUTH);
    }

    private void actualizarMarcador() {
    	
        scoreX.setText("X: " + logica.puntajeX);
        scoreO.setText("O: " + logica.puntajeO);
    }

    private void reiniciarTablero() {
    	
        logica.reiniciarTablero();
        
        for (int i = 0; i < 9; i++) {
            botones[i].setText("");
            botones[i].setEnabled(true);
        }
    }
}