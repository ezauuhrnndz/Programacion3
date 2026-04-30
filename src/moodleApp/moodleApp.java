package moodleApp;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class moodleApp extends JFrame {
	
	public moodleApp() {
        // Configuracion basica de la ventana: titulo, tamaño y que se cierre al salir
  
	}
	
	public void login() {
        
        
	}
	
	public void registro()
	{
	
	}
	
	public void router(String target)
	{		
	    this.getContentPane().removeAll();
	    
	    if(target.equals("login")) {
	        this.login();
	    }
	    else if(target.equals("registro"))  {
	        this.registro();
	    }
	    else if(target.equals("alta"))  {
	        this.alta();
	    }
	    else if(target.equals("baja"))  {
	        this.baja();
	    }
	    else if(target.equals("consultar"))  {
	        this.consultar();
	    }
	    else if(target.equals("crearUser"))  {
	        this.crearUser();
	    }
	    else if(target.equals("accederSistema"))  {
	        this.accederSistema();
	    }
	    else if(target.equals("olvidoContra"))  {
	        this.olvidoContra();
	    }
	    else if(target.equals("recuperarCuenta"))  {
	        this.recuperarCuenta();
	    }
	    
	    this.revalidate();
	    this.repaint();
	}
	
	public void alta() {	
		
		JPanel contenedorLogo = new JPanel();
        contenedorLogo.setBounds(50, 40, 502, 480);
        contenedorLogo.setBackground(Color.white);
        contenedorLogo.setLayout(null);
        contenedorLogo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedorLogo);

        // Texto descriptivo dentro del panel izquierdo
        JLabel descripcionAlta = new JLabel("<html><center>Completa el formulario<br>para dar de alta<br>un nuevo usuario</center></html>", SwingConstants.CENTER);
        descripcionAlta.setBounds(50, 180, 400, 120);
        descripcionAlta.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        descripcionAlta.setForeground(new Color(150, 150, 150));
        contenedorLogo.add(descripcionAlta);
        
        // Panel derecho con el formulario de alta
        JPanel contenedor = new JPanel();
        contenedor.setBounds(550, 40, 400, 480);
        contenedor.setBackground(Color.white);
        contenedor.setLayout(null);
        contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedor);
        
        JLabel title_login = new JLabel(" ALTA ", SwingConstants.CENTER);
        title_login.setBounds(50, 30, 300, 40);
        title_login.setFont(new Font("Segoe UI", Font.BOLD, 24));
        contenedor.add(title_login);

        JLabel separador = new JLabel();
        separador.setBounds(50, 72, 300, 1);
        separador.setBackground(new Color(220, 220, 220));
        separador.setOpaque(true);
        contenedor.add(separador);

        // Campo nombre completo
        JLabel lblNombre = new JLabel("NOMBRE COMPLETO:");
        lblNombre.setBounds(50, 90, 300, 18);
        lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblNombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(50, 110, 300, 35);
        txtNombre.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        contenedor.add(txtNombre);

        // Campo correo electronico
        JLabel lblEmail = new JLabel("CORREO ELECTRONICO:");
        lblEmail.setBounds(50, 155, 300, 18);
        lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(50, 175, 300, 35);
        txtEmail.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        contenedor.add(txtEmail);

        // Campo telefono
        JLabel lblTelefono = new JLabel("TELEFONO:");
        lblTelefono.setBounds(50, 220, 300, 18);
        lblTelefono.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblTelefono);

        JTextField txtTelefono = new JTextField();
        txtTelefono.setBounds(50, 240, 300, 35);
        txtTelefono.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        contenedor.add(txtTelefono);

        // Rol del usuario (combo box con opciones predefinidas)
        JLabel lblRol = new JLabel("ROL:");
        lblRol.setBounds(50, 285, 300, 18);
        lblRol.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblRol);

        String[] roles = {"Selecciona un rol", "Administrador", "Usuario", "Moderador"};
        JComboBox<String> comboRol = new JComboBox<>(roles);
        comboRol.setBounds(50, 305, 300, 35);
        comboRol.setBackground(Color.WHITE);
        comboRol.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        contenedor.add(comboRol);

        // Colores reutilizables para botones naranja
        final Color colorNaranjaOriginal = Color.decode("#DE6A00");
        final Color colorNaranjaHover = Color.decode("#FF8C00");

        // Boton para confirmar el alta del usuario
        JButton btnAlta = new JButton("DAR DE ALTA");
        btnAlta.setBounds(50, 360, 195, 42);
        btnAlta.setBackground(colorNaranjaOriginal);
        btnAlta.setForeground(Color.WHITE);
        btnAlta.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnAlta.setFocusPainted(false);
        btnAlta.setBorder(null);
        btnAlta.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnAlta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) { btnAlta.setBackground(colorNaranjaHover); }
            @Override
            public void mouseExited(MouseEvent e) { btnAlta.setBackground(colorNaranjaOriginal); }
        });

        // Validacion basica antes de dar de alta
        btnAlta.addActionListener(e -> {
            if (txtNombre.getText().isEmpty() || txtEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor completa todos los campos.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario dado de alta exitosamente.", "Alta exitosa", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        contenedor.add(btnAlta);

        // Boton para volver a la pantalla principal (login)
        JButton btnVolver = new JButton("VOLVER");
        btnVolver.setBounds(255, 360, 95, 42);
        btnVolver.setBackground(new Color(240, 240, 240));
        btnVolver.setForeground(new Color(80, 80, 80));
        btnVolver.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnVolver.setFocusPainted(false);
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnVolver.addActionListener(e -> this.router("login"));
        contenedor.add(btnVolver);
        
        // Imagen de fondo que cubre toda la ventana
        JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));	
        fondo.setBounds(0, 0, 1000, 600);
        this.add(fondo);
	}
	
	public void baja() {

		// Panel izquierdo decorativo igual al resto de vistas
		JPanel contenedorLogo = new JPanel();
        contenedorLogo.setBounds(50, 40, 502, 480);
        contenedorLogo.setBackground(Color.white);
        contenedorLogo.setLayout(null);
        contenedorLogo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedorLogo);

        // Texto de advertencia dentro del panel izquierdo
        JLabel descripcionBaja = new JLabel("<html><center>Esta accion eliminara<br>al usuario del sistema.<br><br>Procede con cuidado.</center></html>", SwingConstants.CENTER);
        descripcionBaja.setBounds(50, 160, 400, 160);
        descripcionBaja.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        descripcionBaja.setForeground(new Color(200, 80, 80));
        contenedorLogo.add(descripcionBaja);
        
        // Panel derecho con el formulario de baja
        JPanel contenedor = new JPanel();
        contenedor.setBounds(550, 40, 400, 480);
        contenedor.setBackground(Color.white);
        contenedor.setLayout(null);
        contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedor);
        
        JLabel title_login = new JLabel(" BAJA ", SwingConstants.CENTER);
        title_login.setBounds(50, 30, 300, 40);
        title_login.setFont(new Font("Segoe UI", Font.BOLD, 24));
        contenedor.add(title_login);

        // Separador visual debajo del titulo
        JLabel separador = new JLabel();
        separador.setBounds(50, 72, 300, 1);
        separador.setBackground(new Color(220, 220, 220));
        separador.setOpaque(true);
        contenedor.add(separador);

        // Campo para identificar al usuario a dar de baja
        JLabel lblUsuario = new JLabel("USUARIO O EMAIL A DAR DE BAJA:");
        lblUsuario.setBounds(50, 100, 300, 18);
        lblUsuario.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblUsuario);

        JTextField txtUsuarioBaja = new JTextField();
        txtUsuarioBaja.setBounds(50, 122, 300, 35);
        txtUsuarioBaja.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        contenedor.add(txtUsuarioBaja);

        // Razon de la baja
        JLabel lblMotivo = new JLabel("MOTIVO DE BAJA:");
        lblMotivo.setBounds(50, 175, 300, 18);
        lblMotivo.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblMotivo);

        String[] motivos = {"Selecciona un motivo", "Solicitud del usuario", "Inactividad prolongada", "Violacion de terminos", "Otro"};
        JComboBox<String> comboMotivo = new JComboBox<>(motivos);
        comboMotivo.setBounds(50, 197, 300, 35);
        comboMotivo.setBackground(Color.WHITE);
        comboMotivo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        contenedor.add(comboMotivo);

        // Confirmacion extra 
        JCheckBox chkConfirmar = new JCheckBox("Confirmo que deseo eliminar este usuario");
        chkConfirmar.setBounds(50, 248, 300, 20);
        chkConfirmar.setBackground(Color.WHITE);
        chkConfirmar.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        contenedor.add(chkConfirmar);

        // Colores reutilizables para botones
        final Color colorRojoOriginal = Color.decode("#C0392B");
        final Color colorRojoHover = Color.decode("#E74C3C");

        // Boton para confirmar la baja del usuario
        JButton btnBaja = new JButton("DAR DE BAJA");
        btnBaja.setBounds(50, 360, 195, 42);
        btnBaja.setBackground(colorRojoOriginal);
        btnBaja.setForeground(Color.WHITE);
        btnBaja.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnBaja.setFocusPainted(false);
        btnBaja.setBorder(null);
        btnBaja.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnBaja.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) { btnBaja.setBackground(colorRojoHover); }
            @Override
            public void mouseExited(MouseEvent e) { btnBaja.setBackground(colorRojoOriginal); }
        });

        // Validacion: se debe confirmar el checkbox antes de proceder
        btnBaja.addActionListener(e -> {
            if (txtUsuarioBaja.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingresa el usuario o email a dar de baja.", "Campo vacio", JOptionPane.WARNING_MESSAGE);
            } else if (!chkConfirmar.isSelected()) {
                JOptionPane.showMessageDialog(this, "Debes confirmar la accion antes de continuar.", "Confirmacion requerida", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario dado de baja correctamente.", "Baja exitosa", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        contenedor.add(btnBaja);

        // Boton para volver a la pantalla principal (login)
        JButton btnVolver = new JButton("VOLVER");
        btnVolver.setBounds(255, 360, 95, 42);
        btnVolver.setBackground(new Color(240, 240, 240));
        btnVolver.setForeground(new Color(80, 80, 80));
        btnVolver.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnVolver.setFocusPainted(false);
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnVolver.addActionListener(e -> this.router("login"));
        contenedor.add(btnVolver);
        
        // Imagen de fondo que cubre toda la ventana
        JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));	
        fondo.setBounds(0, 0, 1000, 600);
        this.add(fondo);
	}
	
	public void consultar() {

		JPanel contenedorLogo = new JPanel();
        contenedorLogo.setBounds(50, 40, 502, 480);
        contenedorLogo.setBackground(Color.white);
        contenedorLogo.setLayout(null);
        contenedorLogo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedorLogo);

        // Texto informativo dentro del panel izquierdo
        JLabel descripcionConsulta = new JLabel("<html><center>Busca un usuario por<br>nombre, email o ID<br>para ver su informacion</center></html>", SwingConstants.CENTER);
        descripcionConsulta.setBounds(50, 180, 400, 120);
        descripcionConsulta.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        descripcionConsulta.setForeground(new Color(150, 150, 150));
        contenedorLogo.add(descripcionConsulta);
      
        // Panel derecho con el formulario de consulta
        JPanel contenedor = new JPanel();
        contenedor.setBounds(550, 40, 400, 480);
        contenedor.setBackground(Color.white);
        contenedor.setLayout(null);
        contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedor);
        
        JLabel title_login = new JLabel(" CONSULTAR ", SwingConstants.CENTER);
        title_login.setBounds(50, 30, 300, 40);
        title_login.setFont(new Font("Segoe UI", Font.BOLD, 24));
        contenedor.add(title_login);

        JLabel separador = new JLabel();
        separador.setBounds(50, 72, 300, 1);
        separador.setBackground(new Color(220, 220, 220));
        separador.setOpaque(true);
        contenedor.add(separador);

        // Campo de busqueda del usuario
        JLabel lblBuscar = new JLabel("BUSCAR USUARIO:");
        lblBuscar.setBounds(50, 95, 300, 18);
        lblBuscar.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblBuscar);

        JTextField txtBuscar = new JTextField();
        txtBuscar.setBounds(50, 117, 300, 35);
        txtBuscar.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        contenedor.add(txtBuscar);

        // Criterio de busqueda
        JLabel lblCriterio = new JLabel("BUSCAR POR:");
        lblCriterio.setBounds(50, 163, 300, 18);
        lblCriterio.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblCriterio);

        // Radio buttons 
        JRadioButton rbNombre = new JRadioButton("Nombre");
        rbNombre.setBounds(50, 185, 90, 20);
        rbNombre.setBackground(Color.WHITE);
        rbNombre.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        rbNombre.setSelected(true);

        JRadioButton rbEmail = new JRadioButton("Email");
        rbEmail.setBounds(150, 185, 80, 20);
        rbEmail.setBackground(Color.WHITE);
        rbEmail.setFont(new Font("Segoe UI", Font.PLAIN, 12));

        JRadioButton rbId = new JRadioButton("ID");
        rbId.setBounds(240, 185, 60, 20);
        rbId.setBackground(Color.WHITE);
        rbId.setFont(new Font("Segoe UI", Font.PLAIN, 12));

        // Grupo para que solo uno pueda estar seleccionado a la vez
        ButtonGroup grupoRadio = new ButtonGroup();
        grupoRadio.add(rbNombre);
        grupoRadio.add(rbEmail);
        grupoRadio.add(rbId);

        contenedor.add(rbNombre);
        contenedor.add(rbEmail);
        contenedor.add(rbId);

        // Area de texto para mostrar el resultado de la consulta
        JLabel lblResultado = new JLabel("RESULTADO:");
        lblResultado.setBounds(50, 218, 300, 18);
        lblResultado.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblResultado);

        JTextArea areaResultado = new JTextArea();
        areaResultado.setBounds(50, 240, 300, 100);
        areaResultado.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 10, 5, 0)));
        areaResultado.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        areaResultado.setEditable(false);
        areaResultado.setBackground(new Color(250, 250, 250));
        contenedor.add(areaResultado);

        // Colores reutilizables para botones naranja
        final Color colorNaranjaOriginal = Color.decode("#DE6A00");
        final Color colorNaranjaHover = Color.decode("#FF8C00");

        // Boton para ejecutar la busqueda
        JButton btnBuscar = new JButton("BUSCAR");
        btnBuscar.setBounds(50, 360, 195, 42);
        btnBuscar.setBackground(colorNaranjaOriginal);
        btnBuscar.setForeground(Color.WHITE);
        btnBuscar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnBuscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) { btnBuscar.setBackground(colorNaranjaHover); }
            @Override
            public void mouseExited(MouseEvent e) { btnBuscar.setBackground(colorNaranjaOriginal); }
        });

        // Simulacion de resultado al buscar
        btnBuscar.addActionListener(e -> {
            if (txtBuscar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingresa un termino de busqueda.", "Campo vacio", JOptionPane.WARNING_MESSAGE);
            } else {
                areaResultado.setText("Nombre: Juan Perez\nEmail: juan@ejemplo.com\nRol: Administrador\nEstado: Activo");
            }
        });

        contenedor.add(btnBuscar);

        // Boton para volver a la pantalla principal (login)
        JButton btnVolver = new JButton("VOLVER");
        btnVolver.setBounds(255, 360, 95, 42);
        btnVolver.setBackground(new Color(240, 240, 240));
        btnVolver.setForeground(new Color(80, 80, 80));
        btnVolver.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnVolver.setFocusPainted(false);
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnVolver.addActionListener(e -> this.router("login"));
        contenedor.add(btnVolver);
        
        // Imagen de fondo que cubre toda la ventana
        JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));	
        fondo.setBounds(0, 0, 1000, 600);
        this.add(fondo);
	}
	
	public void crearUser() {

		JPanel contenedorLogo = new JPanel();
        contenedorLogo.setBounds(50, 40, 502, 480);
        contenedorLogo.setBackground(Color.white);
        contenedorLogo.setLayout(null);
        contenedorLogo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedorLogo);

        // Texto de ayuda dentro del panel izquierdo
        JLabel descripcionCrear = new JLabel("<html><center>Aprende a crear<br>un nuevo usuario<br>paso a paso</center></html>", SwingConstants.CENTER);
        descripcionCrear.setBounds(50, 180, 400, 120);
        descripcionCrear.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        descripcionCrear.setForeground(new Color(150, 150, 150));
        contenedorLogo.add(descripcionCrear);
        
        // Panel derecho con la informacion de ayuda para crear usuario
        JPanel contenedor = new JPanel();
        contenedor.setBounds(550, 40, 400, 480);
        contenedor.setBackground(Color.white);
        contenedor.setLayout(null);
        contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedor);
        
        JLabel title_login = new JLabel(" CREAR USUARIO ", SwingConstants.CENTER);
        title_login.setBounds(50, 30, 300, 40);
        title_login.setFont(new Font("Segoe UI", Font.BOLD, 24));
        contenedor.add(title_login);

        JLabel separador = new JLabel();
        separador.setBounds(50, 72, 300, 1);
        separador.setBackground(new Color(220, 220, 220));
        separador.setOpaque(true);
        contenedor.add(separador);

        // Pasos explicativos numerados
        JLabel paso1 = new JLabel("1.  Accede al menu Usuarios > Alta");
        paso1.setBounds(50, 95, 300, 20);
        paso1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contenedor.add(paso1);

        JLabel paso2 = new JLabel("2.  Completa nombre, email y telefono");
        paso2.setBounds(50, 130, 300, 20);
        paso2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contenedor.add(paso2);

        JLabel paso3 = new JLabel("3.  Selecciona el rol del nuevo usuario");
        paso3.setBounds(50, 165, 300, 20);
        paso3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contenedor.add(paso3);

        JLabel paso4 = new JLabel("4.  Presiona el boton DAR DE ALTA");
        paso4.setBounds(50, 200, 300, 20);
        paso4.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contenedor.add(paso4);

        JLabel paso5 = new JLabel("5.  Recibiras una confirmacion en pantalla");
        paso5.setBounds(50, 235, 300, 20);
        paso5.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contenedor.add(paso5);

        // Nota
        JLabel nota = new JLabel("<html><i>Nota: solo administradores<br>pueden crear usuarios nuevos.</i></html>");
        nota.setBounds(50, 275, 300, 50);
        nota.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        nota.setForeground(new Color(180, 100, 0));
        contenedor.add(nota);

        // Boton hover
        final Color colorNaranjaOriginal = Color.decode("#DE6A00");
        final Color colorNaranjaHover = Color.decode("#FF8C00");

        JButton btnIrAlta = new JButton("IR A ALTA");
        btnIrAlta.setBounds(50, 360, 195, 42);
        btnIrAlta.setBackground(colorNaranjaOriginal);
        btnIrAlta.setForeground(Color.WHITE);
        btnIrAlta.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnIrAlta.setFocusPainted(false);
        btnIrAlta.setBorder(null);
        btnIrAlta.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnIrAlta.addActionListener(e -> this.router("alta"));

        btnIrAlta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) { btnIrAlta.setBackground(colorNaranjaHover); }
            @Override
            public void mouseExited(MouseEvent e) { btnIrAlta.setBackground(colorNaranjaOriginal); }
        });

        contenedor.add(btnIrAlta);

        // Boton para volver a la pantalla principal (login)
        JButton btnVolver = new JButton("VOLVER");
        btnVolver.setBounds(255, 360, 95, 42);
        btnVolver.setBackground(new Color(240, 240, 240));
        btnVolver.setForeground(new Color(80, 80, 80));
        btnVolver.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnVolver.setFocusPainted(false);
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnVolver.addActionListener(e -> this.router("login"));
        contenedor.add(btnVolver);
        
        // Imagen de fondo que cubre toda la ventana
        JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));	
        fondo.setBounds(0, 0, 1000, 600);
        this.add(fondo);
        
        
	}
	
	public void accederSistema() {

		JPanel contenedorLogo = new JPanel();
        contenedorLogo.setBounds(50, 40, 502, 480);
        contenedorLogo.setBackground(Color.white);
        contenedorLogo.setLayout(null);
        contenedorLogo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedorLogo);

        // Texto de bienvenida dentro del panel izquierdo
        JLabel descripcionAcceder = new JLabel("<html><center>Sigue estos pasos<br>para iniciar sesion<br>en el sistema</center></html>", SwingConstants.CENTER);
        descripcionAcceder.setBounds(50, 180, 400, 120);
        descripcionAcceder.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        descripcionAcceder.setForeground(new Color(150, 150, 150));
        contenedorLogo.add(descripcionAcceder);
        
        // Panel derecho con instrucciones para acceder al sistema
        JPanel contenedor = new JPanel();
        contenedor.setBounds(550, 40, 400, 480);
        contenedor.setBackground(Color.white);
        contenedor.setLayout(null);
        contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedor);
        
        JLabel title_login = new JLabel(" ACCEDER AL SISTEMA ", SwingConstants.CENTER);
        title_login.setBounds(20, 30, 360, 40);
        title_login.setFont(new Font("Segoe UI", Font.BOLD, 20));
        contenedor.add(title_login);

        JLabel separador = new JLabel();
        separador.setBounds(50, 72, 300, 1);
        separador.setBackground(new Color(220, 220, 220));
        separador.setOpaque(true);
        contenedor.add(separador);

        // Pasos para acceder al sistema
        JLabel paso1 = new JLabel("1.  Ingresa tu usuario o email");
        paso1.setBounds(50, 95, 300, 20);
        paso1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contenedor.add(paso1);

        JLabel paso2 = new JLabel("2.  Escribe tu contrasena");
        paso2.setBounds(50, 130, 300, 20);
        paso2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contenedor.add(paso2);

        JLabel paso3 = new JLabel("3.  Marca la opcion Remember Me");
        paso3.setBounds(50, 165, 300, 20);
        paso3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contenedor.add(paso3);

        JLabel paso4 = new JLabel("4.  Haz click en el boton LOGIN");
        paso4.setBounds(50, 200, 300, 20);
        paso4.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contenedor.add(paso4);

        JLabel paso5 = new JLabel("5.  Si los datos son correctos, entras");
        paso5.setBounds(50, 235, 300, 20);
        paso5.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contenedor.add(paso5);

        // Consejo para el usuario
        JLabel consejo = new JLabel("<html><i>Tip: si olvidaste tu contrasena,<br>usa la opcion de recuperacion.</i></html>");
        consejo.setBounds(50, 275, 300, 50);
        consejo.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        consejo.setForeground(new Color(180, 100, 0));
        contenedor.add(consejo);

        // Boton directo para ir al login
        final Color colorNaranjaOriginal = Color.decode("#DE6A00");
        final Color colorNaranjaHover = Color.decode("#FF8C00");

        JButton btnIrLogin = new JButton("IR AL LOGIN");
        btnIrLogin.setBounds(50, 360, 195, 42);
        btnIrLogin.setBackground(colorNaranjaOriginal);
        btnIrLogin.setForeground(Color.WHITE);
        btnIrLogin.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnIrLogin.setFocusPainted(false);
        btnIrLogin.setBorder(null);
        btnIrLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnIrLogin.addActionListener(e -> this.router("login"));

        btnIrLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) { btnIrLogin.setBackground(colorNaranjaHover); }
            @Override
            public void mouseExited(MouseEvent e) { btnIrLogin.setBackground(colorNaranjaOriginal); }
        });

        contenedor.add(btnIrLogin);

        // Boton para volver a la pantalla principal (login)
        JButton btnVolver = new JButton("VOLVER");
        btnVolver.setBounds(255, 360, 95, 42);
        btnVolver.setBackground(new Color(240, 240, 240));
        btnVolver.setForeground(new Color(80, 80, 80));
        btnVolver.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnVolver.setFocusPainted(false);
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnVolver.addActionListener(e -> this.router("login"));
        contenedor.add(btnVolver);
        
        // Imagen de fondo que cubre toda la ventana
        JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));	
        fondo.setBounds(0, 0, 1000, 600);
        this.add(fondo);
        
	}
	
	public void olvidoContra() {

		// Panel izquierdo decorativo igual al resto de vistas
		JPanel contenedorLogo = new JPanel();
	    contenedorLogo.setBounds(50, 40, 502, 480);
	    contenedorLogo.setBackground(Color.white);
	    contenedorLogo.setLayout(null);
	    contenedorLogo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
	    this.add(contenedorLogo);

	    // Texto informativo dentro del panel izquierdo
	    JLabel descripcionOlvido = new JLabel("<html><center>Te enviaremos un enlace<br>para que puedas<br>restablecer tu contrasena</center></html>", SwingConstants.CENTER);
	    descripcionOlvido.setBounds(50, 180, 400, 120);
	    descripcionOlvido.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	    descripcionOlvido.setForeground(new Color(150, 150, 150));
	    contenedorLogo.add(descripcionOlvido);
	    
	    // Panel derecho con el formulario de recuperacion de contraseña
	    JPanel contenedor = new JPanel();
	    contenedor.setBounds(550, 40, 400, 480);
	    contenedor.setBackground(Color.white);
	    contenedor.setLayout(null);
	    contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
	    this.add(contenedor);
	    
	    JLabel title_login = new JLabel(" OLVIDO SU CONTRASEÑA ", SwingConstants.CENTER);
	    title_login.setBounds(10, 30, 380, 40);
	    title_login.setFont(new Font("Segoe UI", Font.BOLD, 18));
	    contenedor.add(title_login);

	    JLabel separador = new JLabel();
	    separador.setBounds(50, 72, 300, 1);
	    separador.setBackground(new Color(220, 220, 220));
	    separador.setOpaque(true);
	    contenedor.add(separador);

	    // Instruccion breve
	    JLabel instruccion = new JLabel("<html>Ingresa tu email y te enviaremos<br>las instrucciones para recuperarla.</html>");
	    instruccion.setBounds(50, 85, 300, 45);
	    instruccion.setFont(new Font("Segoe UI", Font.PLAIN, 12));
	    instruccion.setForeground(new Color(120, 120, 120));
	    contenedor.add(instruccion);

	    // Campo para ingresar el email registrado
	    JLabel lblEmail = new JLabel("EMAIL REGISTRADO:");
	    lblEmail.setBounds(50, 145, 300, 18);
	    lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
	    contenedor.add(lblEmail);

	    JTextField txtEmailOlvido = new JTextField();
	    txtEmailOlvido.setBounds(50, 167, 300, 35);
	    txtEmailOlvido.setBorder(BorderFactory.createCompoundBorder(
	        BorderFactory.createLineBorder(new Color(200, 200, 200)),
	        BorderFactory.createEmptyBorder(0, 10, 0, 0)));
	    contenedor.add(txtEmailOlvido);

	    final Color colorNaranjaOriginal = Color.decode("#DE6A00");
	    final Color colorNaranjaHover = Color.decode("#FF8C00");

	    // Boton para enviar el enlace de recuperacion
	    JButton btnEnviar = new JButton("ENVIAR ENLACE");
	    btnEnviar.setBounds(50, 360, 195, 42);
	    btnEnviar.setBackground(colorNaranjaOriginal);
	    btnEnviar.setForeground(Color.WHITE);
	    btnEnviar.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    btnEnviar.setFocusPainted(false);
	    btnEnviar.setBorder(null);
	    btnEnviar.setCursor(new Cursor(Cursor.HAND_CURSOR));

	    btnEnviar.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseEntered(MouseEvent e) { btnEnviar.setBackground(colorNaranjaHover); }
	        @Override
	        public void mouseExited(MouseEvent e) { btnEnviar.setBackground(colorNaranjaOriginal); }
	    });

	    // Validacion del campo y confirmacion del envio
	    btnEnviar.addActionListener(e -> {
	        if (txtEmailOlvido.getText().isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Ingresa tu email para continuar.", "Campo vacio", JOptionPane.WARNING_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(this, "Enlace enviado a: " + txtEmailOlvido.getText(), "Correo enviado", JOptionPane.INFORMATION_MESSAGE);
	            this.router("recuperarCuenta");
	        }
	    });

	    contenedor.add(btnEnviar);

	    // Boton para volver a la pantalla principal (login)
	    JButton btnVolver = new JButton("VOLVER");
	    btnVolver.setBounds(255, 360, 95, 42);
	    btnVolver.setBackground(new Color(240, 240, 240));
	    btnVolver.setForeground(new Color(80, 80, 80));
	    btnVolver.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    btnVolver.setFocusPainted(false);
	    btnVolver.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
	    btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btnVolver.addActionListener(e -> this.router("login"));
	    contenedor.add(btnVolver);

	    // Imagen de fondo que cubre toda la ventana
        JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));	
        fondo.setBounds(0, 0, 1000, 600);
        this.add(fondo);
    
	}
	
	public void recuperarCuenta() {

		JPanel contenedorLogo = new JPanel();
        contenedorLogo.setBounds(50, 40, 502, 480);
        contenedorLogo.setBackground(Color.white);
        contenedorLogo.setLayout(null);
        contenedorLogo.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedorLogo);

        // Texto crear nuevacontra
        JLabel descripcionRecuperar = new JLabel("<html><center>Crea una nueva contraseña<br>segura para proteger<br>tu cuenta</center></html>", SwingConstants.CENTER);
        descripcionRecuperar.setBounds(50, 180, 400, 120);
        descripcionRecuperar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        descripcionRecuperar.setForeground(new Color(150, 150, 150));
        contenedorLogo.add(descripcionRecuperar);
        
        // Panel derecho con el formulario para restablecer contraseña
        JPanel contenedor = new JPanel();
        contenedor.setBounds(550, 40, 400, 480);
        contenedor.setBackground(Color.white);
        contenedor.setLayout(null);
        contenedor.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
        this.add(contenedor);
        
        JLabel title_login = new JLabel(" RECUPERAR CUENTA ", SwingConstants.CENTER);
        title_login.setBounds(30, 30, 340, 40);
        title_login.setFont(new Font("Segoe UI", Font.BOLD, 20));
        contenedor.add(title_login);

        JLabel separador = new JLabel();
        separador.setBounds(50, 72, 300, 1);
        separador.setBackground(new Color(220, 220, 220));
        separador.setOpaque(true);
        contenedor.add(separador);

        // Campo para ingresar el codigo de verificacion recibido por email
        JLabel lblCodigo = new JLabel("CODIGO DE VERIFICACION:");
        lblCodigo.setBounds(50, 90, 300, 18);
        lblCodigo.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblCodigo);

        JTextField txtCodigo = new JTextField();
        txtCodigo.setBounds(50, 112, 300, 35);
        txtCodigo.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        contenedor.add(txtCodigo);

        // Campo para la nueva contraseña
        JLabel lblNuevaPass = new JLabel("NUEVA CONTRASEÑA:");
        lblNuevaPass.setBounds(50, 160, 300, 18);
        lblNuevaPass.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblNuevaPass);

        JPasswordField txtNuevaPass = new JPasswordField();
        txtNuevaPass.setBounds(50, 182, 300, 35);
        txtNuevaPass.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        contenedor.add(txtNuevaPass);

        // Campo para confirmar la nueva contraseña
        JLabel lblConfirmarPass = new JLabel("CONFIRMAR CONTRASEÑA:");
        lblConfirmarPass.setBounds(50, 230, 300, 18);
        lblConfirmarPass.setFont(new Font("Segoe UI", Font.BOLD, 12));
        contenedor.add(lblConfirmarPass);

        JPasswordField txtConfirmarPass = new JPasswordField();
        txtConfirmarPass.setBounds(50, 252, 300, 35);
        txtConfirmarPass.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        contenedor.add(txtConfirmarPass);

        final Color colorNaranjaOriginal = Color.decode("#DE6A00");
        final Color colorNaranjaHover = Color.decode("#FF8C00");

        // Boton para guardar la nueva contraseña
        JButton btnGuardar = new JButton("GUARDAR");
        btnGuardar.setBounds(50, 360, 195, 42);
        btnGuardar.setBackground(colorNaranjaOriginal);
        btnGuardar.setForeground(Color.WHITE);
        btnGuardar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnGuardar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) { btnGuardar.setBackground(colorNaranjaHover); }
            @Override
            public void mouseExited(MouseEvent e) { btnGuardar.setBackground(colorNaranjaOriginal); }
        });

        // Validacion de que las contraseñas coincidan antes de guardar
        btnGuardar.addActionListener(e -> {
            String nuevaPass = new String(txtNuevaPass.getPassword());
            String confirmarPass = new String(txtConfirmarPass.getPassword());

            if (txtCodigo.getText().isEmpty() || nuevaPass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor completa todos los campos.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            } else if (!nuevaPass.equals(confirmarPass)) {
                JOptionPane.showMessageDialog(this, "Las contrasenas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
                txtConfirmarPass.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
            } else {
                JOptionPane.showMessageDialog(this, "Contrasena actualizada correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
                this.router("login");
            }
        });

        contenedor.add(btnGuardar);

        // Boton para volver a la pantalla principal (login)
        JButton btnVolver = new JButton("VOLVER");
        btnVolver.setBounds(255, 360, 95, 42);
        btnVolver.setBackground(new Color(240, 240, 240));
        btnVolver.setForeground(new Color(80, 80, 80));
        btnVolver.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnVolver.setFocusPainted(false);
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnVolver.addActionListener(e -> this.router("login"));
        contenedor.add(btnVolver);
        
        // Imagen de fondo que cubre toda la ventana
        JLabel fondo = new JLabel(new ImageIcon("DiseñoLogin.jpg"));	
        fondo.setBounds(0, 0, 1000, 600);
        this.add(fondo);
	}

	public void menu () {
		
		JMenuBar barra = new JMenuBar();
				
		
//		BARRA USUARIOS
		
				JMenu archivo = new JMenu("Usuarios");
				
				JMenuItem open = new JMenuItem("Alta");
				//
				open.addActionListener(e ->{
					this.router("alta");
				});
				
				JMenuItem close = new JMenuItem("Baja");
				//
				close.addActionListener(e ->{
					this.router("baja");
				});
				
				JMenuItem save = new JMenuItem("Consultar");
				//
				save.addActionListener(e ->{
					this.router("consultar");
				});
				
				//JMenuItem newFile = new JMenuItem("Nuevo");
				
				archivo.add(open);
				archivo.add(close);
				archivo.add(save);
				//archivo.add(newFile);
				
				barra.add(archivo);
				
				//SUBMENU OTROS - USUARIOS
				
				/*JMenu submenu = new JMenu("Otros");
				
				archivo.addSeparator(); 
		
				JMenuItem menuItem = new JMenuItem("An item in the submenu");
				 
				submenu.add(menuItem);
		
				menuItem = new JMenuItem("Another item");
				submenu.add(menuItem);
				archivo.add(submenu);*/
				
//				BARRA AYUDA
				
				JMenu ayuda = new JMenu("Ayuda");
				
				JMenuItem crearAcc = new JMenuItem("¿Cómo crear un usuario?");
				crearAcc.addActionListener(e ->{
					this.router("crearUser");
				});
				
				JMenuItem accederSys = new JMenuItem("¿Cómo acceder al sistema?");
				accederSys.addActionListener(e ->{
					this.router("accederSistema");
				});
				
				JMenuItem olvidoPass = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
				olvidoPass.addActionListener(e ->{
					this.router("olvidoContra");
				});
				
				
				ayuda.add(crearAcc);
				ayuda.add(accederSys);
				ayuda.add(olvidoPass);

				barra.add(ayuda);
				
//				BARRA CUENTA
				
				JMenu cuenta = new JMenu("Cuenta");
				
				JMenuItem acceder = new JMenuItem("Acceder");
				acceder.addActionListener(e ->{
					this.router("login");
				});
				
				JMenuItem registrarse = new JMenuItem("Registrarse");
				registrarse.addActionListener(e ->{
					this.router("registro");
				});
				
				JMenuItem recuperar = new JMenuItem("Recuperar Cuenta");
				recuperar.addActionListener(e ->{
					this.router("recuperarCuenta");
				});
				
				
				
				cuenta.add(acceder);
				cuenta.add(registrarse);
				cuenta.add(recuperar);
				
				barra.add(cuenta);
				
				this.setJMenuBar(barra);
				
				this.setVisible(true);
	}
}