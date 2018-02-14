package Presentacion;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

import Dominio.*;
import Presentacion.Login.MiFocusListener;

import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Login{

	public JFrame frmLogin;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnSpain;
	private JButton btnIngles;
	private JLabel lblFoto;
	private JButton btnSalir;
	private JButton btnLogin;
	private JFormattedTextField ftxtUsuario;
	private Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);
	private JLabel lblError;
	private JLabel lblCheckUsuario;
	//private static Medico medico;
	//private GestorMedicos gestM;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {



		frmLogin = new JFrame();
		frmLogin.addWindowListener(new FrmLoginWindowListener());
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 453, 321);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{48, 61, 7, 100, 102, 38, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 98, 43, 20, 26, 29, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frmLogin.getContentPane().setLayout(gridBagLayout);

		btnSpain = new JButton("");
		btnSpain.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/espanol.png")));
		GridBagConstraints gbc_btnSpain = new GridBagConstraints();
		gbc_btnSpain.anchor = GridBagConstraints.EAST;
		gbc_btnSpain.insets = new Insets(0, 0, 5, 5);
		gbc_btnSpain.gridx = 5;
		gbc_btnSpain.gridy = 0;
		frmLogin.getContentPane().add(btnSpain, gbc_btnSpain);

		btnIngles = new JButton("");
		btnIngles.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/ingles.png")));
		GridBagConstraints gbc_btnIngles = new GridBagConstraints();
		gbc_btnIngles.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIngles.insets = new Insets(0, 0, 5, 0);
		gbc_btnIngles.gridx = 6;
		gbc_btnIngles.gridy = 0;
		frmLogin.getContentPane().add(btnIngles, gbc_btnIngles);

		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/medico.jpg")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridwidth = 2;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 3;
		gbc_lblFoto.gridy = 1;
		frmLogin.getContentPane().add(lblFoto, gbc_lblFoto);


		lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 3;
		MaskFormatter formatoDNI = null;
		try {
			formatoDNI = new MaskFormatter("########'-U");
			formatoDNI.setPlaceholderCharacter('#');
		} catch (ParseException e) {
			e.printStackTrace();
		}

		lblError = new JLabel("");
		GridBagConstraints gbc_lblError = new GridBagConstraints();
		gbc_lblError.gridwidth = 2;
		gbc_lblError.insets = new Insets(0, 0, 5, 5);
		gbc_lblError.gridx = 3;
		gbc_lblError.gridy = 2;
		frmLogin.getContentPane().add(lblError, gbc_lblError);

		frmLogin.getContentPane().add(lblUsuario, gbc_lblUsuario);
		ftxtUsuario = new JFormattedTextField(formatoDNI);
		ftxtUsuario.addKeyListener(new FtxtUsuarioKeyListener());
		ftxtUsuario.addFocusListener(new FtxtUsuarioFocusListener());

		GridBagConstraints gbc_ftxtUsuario = new GridBagConstraints();
		gbc_ftxtUsuario.fill = GridBagConstraints.BOTH;
		gbc_ftxtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtUsuario.gridwidth = 3;
		gbc_ftxtUsuario.gridx = 2;
		gbc_ftxtUsuario.gridy = 3;
		frmLogin.getContentPane().add(ftxtUsuario, gbc_ftxtUsuario);

		lblCheckUsuario = new JLabel("");
		GridBagConstraints gbc_lblCheckUsuario = new GridBagConstraints();
		gbc_lblCheckUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblCheckUsuario.gridx = 5;
		gbc_lblCheckUsuario.gridy = 3;
		frmLogin.getContentPane().add(lblCheckUsuario, gbc_lblCheckUsuario);

		lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridwidth = 2;
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 4;
		frmLogin.getContentPane().add(lblPassword, gbc_lblPassword);

		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.anchor = GridBagConstraints.NORTH;
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.gridwidth = 3;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 4;
		frmLogin.getContentPane().add(passwordField, gbc_passwordField);

		btnLogin = new JButton("Login");
		btnLogin.setEnabled(false);
		btnLogin.addActionListener(new BtnLoginActionListener());

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new BtnSalirActionListener());
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.anchor = GridBagConstraints.NORTH;
		gbc_btnSalir.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalir.gridwidth = 2;
		gbc_btnSalir.gridx = 2;
		gbc_btnSalir.gridy = 5;
		frmLogin.getContentPane().add(btnSalir, gbc_btnSalir);
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.anchor = GridBagConstraints.NORTH;
		gbc_btnLogin.gridx = 4;
		gbc_btnLogin.gridy = 5;
		frmLogin.getContentPane().add(btnLogin, gbc_btnLogin);

	}
	private class BtnLoginActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Medico medico = null;
			String usuario = ftxtUsuario.getText();
			String password = ""; //$NON-NLS-1$
			char [] pw = passwordField.getPassword();
			for(int i = 0; i < pw.length; i++)
				password = password + pw[i];
			if((medico = GestorMedicos.autenticar(usuario, password)) != null){
				JOptionPane.showMessageDialog(null,"¡Bienvenido " + medico.getNombre() + "!","Autenticacion con exito",JOptionPane.INFORMATION_MESSAGE);
				frmLogin.setVisible(false);
				General.main(null);
				General.setUsuario(medico);
				
			}
		}
	}
	public class MiFocusListener extends FocusAdapter{
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,210));
		}
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
		}
	}
	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int respuesta =JOptionPane.showConfirmDialog(null, "¿Desea Salir de la Aplicación", "OK", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(respuesta == 0){
				frmLogin.setVisible(false);
				frmLogin.dispose();
				JOptionPane.showMessageDialog(frmLogin, "Gracias por utilizar nuestra aplicación", "Cerrar la aplicación",JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	private class FtxtUsuarioFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,210));
		}
		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250,250,250));
		}
	}
	private class FtxtUsuarioKeyListener extends KeyAdapter {
	    public void keyReleased(KeyEvent e) {
	      if(verificarDNI(ftxtUsuario.getText())){
	        if(GestorMedicos.buscarMedico(ftxtUsuario.getText())!=null){
	          passwordField.setEnabled(true);
	          btnLogin.setEnabled(true);
	          ftxtUsuario.setEnabled(false);
	          ftxtUsuario.setBorder(bordeVerde);
	          lblCheckUsuario.setIcon(new ImageIcon(Login.class.getResource("/imagenes/tick.PNG")));
	          lblError.setText("");
	          
	        }
	      } else{
	        ftxtUsuario.setBorder(bordeRojo);
	        lblCheckUsuario.setIcon(new ImageIcon(Login.class.getResource("/imagenes/cross.PNG")));
	        lblError.setText("El usuario no existe");
	        passwordField.setEnabled(false);
	        btnLogin.setEnabled(false);

	      }
	    }
	  }
	private class FrmLoginWindowListener extends WindowAdapter {
		@Override
		public void windowClosed(WindowEvent e) {
			frmLogin.setVisible(false);
			frmLogin.dispose();
		}
	}
	@SuppressWarnings("unused")
	private boolean verificarDNI(String DNI) {
		boolean check = true;
		// Eliminamos el guion y dividimos el DNI en las variables con la informacion que nos hace falta
		DNI = DNI.replaceAll("[-]", ""); //$NON-NLS-1$ //$NON-NLS-2$
		char letraDNI = DNI.charAt(8);
		String numerosDNI = DNI.substring(0, 8);
		int digitos;
		//Comprobamos la longitud del DNI introducido
		if (DNI.length() != 9)
			check = false;
		// Comprobamos si el ultimo caracter es una letra
		if (!Character.isLetter(letraDNI))
			check = false;
		try {
			digitos = Integer.parseInt(numerosDNI);
		} catch (NumberFormatException e) {
			check = false;
		}
		return check;
	}
	
}