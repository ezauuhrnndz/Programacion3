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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TicTacToe1 extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JPanel gridPanel;
    private JButton[] botones = new JButton[9];

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
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 600);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(new Color(30, 30, 30));
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);

        JPanel northPanel = new JPanel(new BorderLayout());
        northPanel.setBackground(new Color(30, 30, 30));
        northPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

        JLabel titulo = new JLabel("Tic Tac Toe", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setForeground(new Color(240, 240, 240));
        titulo.setBorder(BorderFactory.createEmptyBorder(6, 0, 10, 0));
        northPanel.add(titulo, BorderLayout.NORTH);

        JLabel timer = new JLabel("0:00", SwingConstants.CENTER);
        timer.setFont(new Font("Arial", Font.PLAIN, 16));
        timer.setForeground(new Color(180, 180, 180));
        timer.setBorder(BorderFactory.createEmptyBorder(0, 0, 8, 0));
        northPanel.add(timer, BorderLayout.CENTER);

        JPanel scorePanel = new JPanel(new GridLayout(1, 2, 0, 0));
        scorePanel.setBackground(new Color(30, 30, 30));

        JLabel scoreX = new JLabel("X: 0", SwingConstants.CENTER);
        scoreX.setFont(new Font("Arial", Font.BOLD, 16));
        scoreX.setForeground(new Color(240, 240, 240));

        JLabel scoreO = new JLabel("O: 0", SwingConstants.CENTER);
        scoreO.setFont(new Font("Arial", Font.BOLD, 16));
        scoreO.setForeground(new Color(240, 240, 240));

        scorePanel.add(scoreX);
        scorePanel.add(scoreO);
        northPanel.add(scorePanel, BorderLayout.SOUTH);

        contentPane.add(northPanel, BorderLayout.NORTH);

        gridPanel = new JPanel(new GridLayout(3, 3, 6, 6));
        gridPanel.setBackground(new Color(30, 30, 30));
        contentPane.add(gridPanel, BorderLayout.CENTER);

        for (int i = 0; i < 9; i++) {
            botones[i] = new JButton();
            botones[i].setFont(new Font("Arial", Font.BOLD, 60));
            botones[i].setBackground(new Color(240, 240, 240));
            botones[i].setForeground(new Color(30, 30, 30));
            botones[i].setFocusPainted(false);
            botones[i].setBorder(BorderFactory.createLineBorder(new Color(180, 180, 180), 2, true));
            botones[i].setText("");
            gridPanel.add(botones[i]);
        }

        JPanel southPanel = new JPanel();
        southPanel.setBackground(new Color(30, 30, 30));
        southPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setFont(new Font("Arial", Font.BOLD, 14));
        btnReiniciar.setBackground(new Color(240, 240, 240));
        btnReiniciar.setForeground(new Color(30, 30, 30));
        btnReiniciar.setFocusPainted(false);
        btnReiniciar.setBorder(BorderFactory.createLineBorder(new Color(180, 180, 180), 2, true));

        southPanel.add(btnReiniciar);
        contentPane.add(southPanel, BorderLayout.SOUTH);
    }
}