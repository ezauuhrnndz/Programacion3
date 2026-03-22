package Examen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Examen2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen2 frame = new Examen2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Examen2() {
        this.setTitle("---INICIAR SESION---");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null); 
	    this.login();
	    this.setVisible(true);

	}
	public void login() {
        
   	 	JPanel contenedor = new JPanel();
   	 	contenedor.setLocation(0, 0);
        contenedor.setSize(488, 557);
        contenedor.setBackground(Color.white);
        contenedor.setLayout(null);
        contenedor.setBorder(new CompoundBorder());
        getContentPane().add(contenedor);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Datos del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(34, 80, 408, 113);
        contenedor.add(panel);
        panel.setLayout(null);
        
        JLabel lblDireccin = new JLabel("Dirección:\r\n");
        lblDireccin.setBounds(10, 71, 58, 14);
        lblDireccin.setIconTextGap(15);
        lblDireccin.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        panel.add(lblDireccin);
        
        JLabel lblNombres = new JLabel("Nombres:\r\n\r\n");
        lblNombres.setIconTextGap(15);
        lblNombres.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        lblNombres.setBounds(204, 32, 58, 14);
        panel.add(lblNombres);
        
        JLabel lblTelefono = new JLabel("Telefono:\r\n");
        lblTelefono.setIconTextGap(15);
        lblTelefono.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        lblTelefono.setBounds(204, 71, 58, 14);
        panel.add(lblTelefono);
        
        JLabel doc = new JLabel("Documento:");
        doc.setBounds(10, 29, 66, 20);
        panel.add(doc);
        doc.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        doc.setIconTextGap(15);
        
        textField = new JTextField();
        textField.setFont(new Font("Segoe UI", Font.BOLD, 12));
        textField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 200, 200)),
                    BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        textField.setBounds(85, 69, 107, 20);
        panel.add(textField);
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
        textField_1.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 200, 200)),
                    BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        textField_1.setBounds(274, 27, 107, 20);
        panel.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
        textField_2.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 200, 200)),
                    BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        textField_2.setBounds(274, 68, 107, 20);
        panel.add(textField_2);
        
                JTextField documento = new JTextField();
                documento.setFont(new Font("Segoe UI", Font.BOLD, 12));
                documento.setBounds(85, 28, 107, 20);
                panel.add(documento);
                documento.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 200, 200)),
                    BorderFactory.createEmptyBorder(0, 10, 0, 0)));
                
                JPanel panel_1 = new JPanel();
                panel_1.setBorder(new TitledBorder(null, "Datos de factura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
                panel_1.setLayout(null);
                panel_1.setBounds(34, 205, 408, 62);
                contenedor.add(panel_1);
                
                JLabel lblFecha = new JLabel("Fecha:");
                lblFecha.setIconTextGap(15);
                lblFecha.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                lblFecha.setBounds(220, 33, 58, 14);
                panel_1.add(lblFecha);
                
                JLabel lblNumeroDeFactura = new JLabel("Numero de Factura:");
                lblNumeroDeFactura.setIconTextGap(15);
                lblNumeroDeFactura.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                lblNumeroDeFactura.setBounds(6, 30, 94, 20);
                panel_1.add(lblNumeroDeFactura);
                
                JLabel lblNumeroDeFactura_1 = new JLabel("1");
                lblNumeroDeFactura_1.setIconTextGap(15);
                lblNumeroDeFactura_1.setFont(new Font("Segoe UI", Font.BOLD, 10));
                lblNumeroDeFactura_1.setBounds(114, 31, 94, 20);
                panel_1.add(lblNumeroDeFactura_1);
                
                JLabel lblFecha_1 = new JLabel("21/03/26");
                lblFecha_1.setIconTextGap(15);
                lblFecha_1.setFont(new Font("Segoe UI", Font.BOLD, 10));
                lblFecha_1.setBounds(290, 33, 58, 14);
                panel_1.add(lblFecha_1);
                
                JPanel panel_2 = new JPanel();
                panel_2.setBorder(new CompoundBorder());
                panel_2.setBounds(34, 272, 408, 41);
                contenedor.add(panel_2);
                panel_2.setLayout(null);
                
                JButton btnNewButton = new JButton("Eliminar");
                btnNewButton.setIcon(new ImageIcon(Examen2.class.getResource("/SignUp/iconfinder-trash-4341321_120557.png")));
                btnNewButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                	}
                });
                btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                btnNewButton.setBounds(294, 1, 114, 40);
                panel_2.add(btnNewButton);
                
                JButton btnAadir = new JButton("Añadir");
                btnAadir.setIcon(new ImageIcon(Examen2.class.getResource("/SignUp/NuevoIcono.png")));
                btnAadir.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                btnAadir.setBounds(178, 1, 114, 40);
                panel_2.add(btnAadir);
                
                JButton btnVerListadoDe = new JButton("Ver Listado de Factura\r\n");
                btnVerListadoDe.setIcon(new ImageIcon(Examen2.class.getResource("/SignUp/1486564398-menu2_81519.png")));
                btnVerListadoDe.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                btnVerListadoDe.setBounds(0, 1, 176, 40);
                panel_2.add(btnVerListadoDe);
                
                JPanel panel_2_1 = new JPanel();
                panel_2_1.setBackground(new Color(70, 130, 180));
                panel_2_1.setBorder(new CompoundBorder());
                panel_2_1.setBounds(0, 0, 488, 62);
                contenedor.add(panel_2_1);
                panel_2_1.setLayout(null);
                
                JLabel title_login = new JLabel(" Factura en Java - Eclipse - Array List y POO ", SwingConstants.CENTER);
                title_login.setForeground(new Color(255, 255, 255));
                title_login.setBounds(34, 6, 288, 20);
                panel_2_1.add(title_login);
                title_login.setFont(new Font("Segoe UI", Font.BOLD, 14));
                title_login.setBackground(Color.decode("#2927A1"));
                
                JLabel lblsinBaseDe = new JLabel("[Sin Base de Datos]");
                lblsinBaseDe.setForeground(new Color(255, 255, 255));
                lblsinBaseDe.setIconTextGap(15);
                lblsinBaseDe.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                lblsinBaseDe.setBounds(37, 25, 94, 20);
                panel_2_1.add(lblsinBaseDe);
                
                JPanel panel_1_1 = new JPanel();
                panel_1_1.setLayout(null);
                panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
                panel_1_1.setBounds(34, 314, 408, 93);
                contenedor.add(panel_1_1);
                
                table = new JTable();
                table.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                table.setModel(new DefaultTableModel(
                	new Object[][] {
                		{"Producto", "Cantidad", "Valor", "Sub Total"},
                		{"Agua", "2", "500", "1000.0"},
                		{"Cereal", "5", "1000", "5000.0"},
                		{"Leche", "2", "300", "600.0"},
                		
                	},
                	new String[] {
                		"Producto", "Cantidad", "Valor", "Sub Total"
                	}
                ));
                table.getColumnModel().getColumn(0).setPreferredWidth(168);
                table.getColumnModel().getColumn(1).setPreferredWidth(168);
                table.getColumnModel().getColumn(2).setPreferredWidth(168);
                table.getColumnModel().getColumn(3).setPreferredWidth(168);
                table.setBounds(6, 6, 396, 81);
                panel_1_1.add(table);
                
                JLabel lblSubtotal = new JLabel("Subtotal:\r\n");
                lblSubtotal.setIconTextGap(15);
                lblSubtotal.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                lblSubtotal.setBounds(34, 419, 43, 20);
                contenedor.add(lblSubtotal);
                
                JLabel lblSubtotal_1 = new JLabel("6600.0\r\n\r\n");
                lblSubtotal_1.setIconTextGap(15);
                lblSubtotal_1.setFont(new Font("Segoe UI", Font.BOLD, 10));
                lblSubtotal_1.setBounds(109, 419, 43, 20);
                contenedor.add(lblSubtotal_1);
                
                JLabel lblDescuento = new JLabel("% Descuento\r\n\r\n");
                lblDescuento.setIconTextGap(15);
                lblDescuento.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                lblDescuento.setBounds(34, 451, 63, 20);
                contenedor.add(lblDescuento);
                
                textField_3 = new JTextField();
                textField_3.setBorder(BorderFactory.createCompoundBorder(
                                    BorderFactory.createLineBorder(new Color(200, 200, 200)),
                                    BorderFactory.createEmptyBorder(0, 10, 0, 0)));
                textField_3.setBounds(109, 451, 43, 20);
                contenedor.add(textField_3);
                
                JCheckBox chckbxNewCheckBox = new JCheckBox("Valor Descontado:");
                chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
                chckbxNewCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                chckbxNewCheckBox.setBounds(163, 450, 115, 20);
                contenedor.add(chckbxNewCheckBox);
                
                JLabel lblSubtotal_1_1 = new JLabel("330.0\r\n");
                lblSubtotal_1_1.setIconTextGap(15);
                lblSubtotal_1_1.setFont(new Font("Segoe UI", Font.BOLD, 10));
                lblSubtotal_1_1.setBounds(290, 451, 43, 20);
                contenedor.add(lblSubtotal_1_1);
                
                JLabel lblIva = new JLabel("IVA 19%");
                lblIva.setIconTextGap(15);
                lblIva.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                lblIva.setBounds(34, 483, 43, 20);
                contenedor.add(lblIva);
                
                JLabel lblSubtotal_1_2 = new JLabel("1254.0");
                lblSubtotal_1_2.setIconTextGap(15);
                lblSubtotal_1_2.setFont(new Font("Segoe UI", Font.BOLD, 10));
                lblSubtotal_1_2.setBounds(109, 483, 43, 20);
                contenedor.add(lblSubtotal_1_2);
                
                JLabel lblTotalFactura = new JLabel("Total Factura");
                lblTotalFactura.setIconTextGap(15);
                lblTotalFactura.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                lblTotalFactura.setBounds(34, 509, 63, 20);
                contenedor.add(lblTotalFactura);
                
                JLabel lblSubtotal_1_2_1 = new JLabel("7524.0\r\n");
                lblSubtotal_1_2_1.setIconTextGap(15);
                lblSubtotal_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 10));
                lblSubtotal_1_2_1.setBounds(109, 509, 43, 20);
                contenedor.add(lblSubtotal_1_2_1);
                
                JButton btnFinalizarFactura = new JButton("Finalizar Factura\r\n");
                btnFinalizarFactura.setBackground(new Color(220, 220, 220));
                btnFinalizarFactura.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                btnFinalizarFactura.setBounds(248, 513, 115, 22);
                contenedor.add(btnFinalizarFactura);
                
                JButton btnLimpiar = new JButton("Limpiar\r\n");
                btnLimpiar.setBackground(new Color(220, 220, 220));
                btnLimpiar.setFont(new Font("Segoe UI", Font.PLAIN, 10));
                btnLimpiar.setBounds(370, 514, 72, 22);
                contenedor.add(btnLimpiar);
	}
}
