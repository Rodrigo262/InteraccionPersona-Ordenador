package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Presentacion.*;
import java.awt.Rectangle;

import com.sun.xml.internal.ws.api.message.Messages;
import com.toedter.components.JLocaleChooser;

import Dominio.*;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import javax.swing.border.EtchedBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class General {

	public JFrame frame;
	private JPanel panel;
	private JPanel pnlUltimoAcceso;
	private JLabel lblUsuario;
	private JLabel lblUltimaConexion;
	private JButton btnSalir;
	private JTabbedPane pestanasGeneral;
	private JPanel pnlCalendarioCitas;
	private JPanel pnlDirectorioPacientes;
	private JPanel pnlEspecialistas;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel pnlDatosPersonales;
	private JLabel lblNss;
	private JLabel lblNss_1;
	private JLabel lblApellidos;
	private JTextField txtNSS;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JLabel lblFechaNacimiento;
	private JLabel lblSexo;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JPanel pnlOtrosDatos;
	private JTabbedPane pestanasOtrosDatos;
	private JPanel pnlAlergias;
	private JPanel pnlIntervenciones;
	private JPanel pnlOtrasObservacioens;
	private JPanel pnlImagenes;
	private JButton btnAadir;
	private JButton btnModificar;
	private JButton btnLimpiarCampos;
	private JButton btnEliminar;
	private JPanel pnlListaEspecialista;
	private JPanel pnlFicha;
	private JLabel lblNombre;
	private JLabel lblApellidos_1;
	private JLabel lblEmail;
	private JTextField txtNombreEspecialista;
	private JTextField txtApellidoEspecialista;
	private JTextField txtEmailEspecialista;
	private JLabel lblTelfono;
	private JTextField txtTlfEspecialista;
	private JTabbedPane tabbedPane;
	private JPanel pnlDispon;
	private JPanel pnlEspe;
	private JPanel panel_5;
	private JLabel lblAsunto;
	private JLabel lblProblema;
	private JTextArea textArea_3;
	private JTextArea textArea_4;
	private JScrollPane txtAreaImagenes;
	private JScrollPane scrollPane_1;
	private JTextArea txtAreaAlergias;
	private JLabel lblImagen;
	private JScrollPane scrollPane_2;
	private JLabel lblFotoMedico;
	private JScrollPane TextAreaIntervenciones;
	private JTextArea taIntervernciones;
	private JScrollPane txtAreaObservaciones;
	private JTextArea taObservaciones;
	private JLabel lblSeleccionaDa;
	private static Medico medico;
	private JDateChooser dateChooser;
	private JPanel panelCitacion;
	private JLabel lblHoraDeLa;
	private JLabel lblNombre_1;
	private JLabel lblApellidos_2;
	private JLabel lblTipoDeConsulta;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnCargarPacientes;
	private JButton btnLimpiarCampos_1;
	private JScrollPane scrollPane_6;
	private JTextArea taDisponibilidad;
	private JScrollPane scrollPane_7;
	private JTextArea taEspecialidad;
	private JButton btnEnviarConsulta;
	private JDateChooser dateChooserFechaNacimiento;
	private JComboBox comboBox;
	private JScrollPane scrollPane_8;
	private JScrollPane scrollPaneEspecialista;
	private JList listaEspecialista;
	private JPanel pnlPacientes;
	private JScrollPane scrollPanePaciente;
	private JList listaPacientes;
	private JPanel pnlCalendarioPacientes;
	private JScrollPane scrollPane;
	private JList list;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnPreferencias;
	private JMenu mnAcercaDe;
	private JMenu mnIdioma;
	private JMenu Ayuda;
	private JMenuItem mntmHerramientaDeDibujo;
	private JMenuItem mntmSalir;
	private JRadioButtonMenuItem rdbtnmntmEspao;
	private JMenuItem mntmIngls;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					General window = new General();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public General() {
		initialize();
		GestorMedicos.actualizarInicioSesion(medico.getUsuario());
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0,700,823);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 120, 224, 294, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 126, 458, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));

		scrollPane_2 = new JScrollPane();
		panel.add(scrollPane_2, BorderLayout.CENTER);

		lblFotoMedico = new JLabel("");
		scrollPane_2.setViewportView(lblFotoMedico);
		lblFotoMedico.setIcon(new ImageIcon(General.class.getResource(medico.getImagen())));
		pnlUltimoAcceso = new JPanel();
		pnlUltimoAcceso.setBorder(new TitledBorder(null, "\u00DAltimo Acceso", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlUltimoAcceso.setBounds(325, 11, 196, 50);

		frame.getContentPane().add(pnlUltimoAcceso);
		GridBagConstraints gbc_pnlUltimoAcceso = new GridBagConstraints();
		gbc_pnlUltimoAcceso.fill = GridBagConstraints.BOTH;
		gbc_pnlUltimoAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_pnlUltimoAcceso.gridx = 3;
		gbc_pnlUltimoAcceso.gridy = 1;
		frame.getContentPane().add(pnlUltimoAcceso, gbc_pnlUltimoAcceso);
		GridBagLayout gbl_pnlUltimoAcceso = new GridBagLayout();
		gbl_pnlUltimoAcceso.columnWidths = new int[]{256, 0};
		gbl_pnlUltimoAcceso.rowHeights = new int[]{16, 16, 44, 0};
		gbl_pnlUltimoAcceso.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnlUltimoAcceso.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlUltimoAcceso.setLayout(gbl_pnlUltimoAcceso);
		
		
				lblUsuario = new JLabel("¡Bienvenido " +medico.getNombre()  +" !");
				lblUsuario.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
				GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
				gbc_lblUsuario.fill = GridBagConstraints.BOTH;
				gbc_lblUsuario.insets = new Insets(0, 0, 5, 0);
				gbc_lblUsuario.gridx = 0;
				gbc_lblUsuario.gridy = 0;
				pnlUltimoAcceso.add(lblUsuario, gbc_lblUsuario);
		
				lblUltimaConexion = new JLabel("Última Conexión: " + medico.getFechaUltimoAcceso() +" a las "+ medico.getHoraUltimoAcceso());
				lblUltimaConexion.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
				GridBagConstraints gbc_lblUltimaConexion = new GridBagConstraints();
				gbc_lblUltimaConexion.fill = GridBagConstraints.BOTH;
				gbc_lblUltimaConexion.insets = new Insets(0, 0, 5, 0);
				gbc_lblUltimaConexion.gridx = 0;
				gbc_lblUltimaConexion.gridy = 1;
				pnlUltimoAcceso.add(lblUltimaConexion, gbc_lblUltimaConexion);
		
		
				btnSalir = new JButton("Cerrar Sesión");
				btnSalir.setIcon(new ImageIcon(General.class.getResource("/Imagenes/cerrar.png")));
				btnSalir.addActionListener(new BtnSalirActionListener());
				GridBagConstraints gbc_btnSalir = new GridBagConstraints();
				gbc_btnSalir.anchor = GridBagConstraints.NORTH;
				gbc_btnSalir.gridx = 0;
				gbc_btnSalir.gridy = 2;
				pnlUltimoAcceso.add(btnSalir, gbc_btnSalir);

		pestanasGeneral = new JTabbedPane(JTabbedPane.TOP);
		pestanasGeneral.addMouseListener(new PestanasGeneralMouseListener());
		pestanasGeneral.setToolTipText("");
		GridBagConstraints gbc_pestanasGeneral = new GridBagConstraints();
		gbc_pestanasGeneral.anchor = GridBagConstraints.NORTH;
		gbc_pestanasGeneral.insets = new Insets(0, 0, 0, 5);
		gbc_pestanasGeneral.fill = GridBagConstraints.HORIZONTAL;
		gbc_pestanasGeneral.gridwidth = 6;
		gbc_pestanasGeneral.gridx = 0;
		gbc_pestanasGeneral.gridy = 2;
		frame.getContentPane().add(pestanasGeneral, gbc_pestanasGeneral);

		pnlCalendarioCitas = new JPanel();
		pestanasGeneral.addTab("Calendario Citas", null, pnlCalendarioCitas, null);
		GridBagLayout gbl_pnlCalendarioCitas = new GridBagLayout();
		gbl_pnlCalendarioCitas.columnWidths = new int[]{0, 252, 0, 0, 0};
		gbl_pnlCalendarioCitas.rowHeights = new int[]{0, 0, 36, 29, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlCalendarioCitas.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCalendarioCitas.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlCalendarioCitas.setLayout(gbl_pnlCalendarioCitas);
		
		pnlCalendarioPacientes = new JPanel();
		pnlCalendarioPacientes.setBorder(new TitledBorder(null, "Lista Pacientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlCalendarioPacientes = new GridBagConstraints();
		gbc_pnlCalendarioPacientes.gridwidth = 2;
		gbc_pnlCalendarioPacientes.gridheight = 4;
		gbc_pnlCalendarioPacientes.insets = new Insets(0, 0, 5, 5);
		gbc_pnlCalendarioPacientes.fill = GridBagConstraints.BOTH;
		gbc_pnlCalendarioPacientes.gridx = 0;
		gbc_pnlCalendarioPacientes.gridy = 0;
		pnlCalendarioCitas.add(pnlCalendarioPacientes, gbc_pnlCalendarioPacientes);
		pnlCalendarioPacientes.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		pnlCalendarioPacientes.add(scrollPane, BorderLayout.CENTER);
		
		list = new JList();
		scrollPane.setViewportView(list);

		lblSeleccionaDa = new JLabel("Seleccionar fecha:");
		GridBagConstraints gbc_lblSeleccionaDa = new GridBagConstraints();
		gbc_lblSeleccionaDa.anchor = GridBagConstraints.EAST;
		gbc_lblSeleccionaDa.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionaDa.gridx = 2;
		gbc_lblSeleccionaDa.gridy = 0;
		pnlCalendarioCitas.add(lblSeleccionaDa, gbc_lblSeleccionaDa);


		dateChooser = new JDateChooser();
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.gridwidth = 2;
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.BOTH;
		gbc_dateChooser.gridx = 2;
		gbc_dateChooser.gridy = 1;
		pnlCalendarioCitas.add(dateChooser, gbc_dateChooser);

		panelCitacion = new JPanel();
		panelCitacion.setBorder(new TitledBorder(null, "Informacion de la cita", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelCitacion = new GridBagConstraints();
		gbc_panelCitacion.gridwidth = 3;
		gbc_panelCitacion.insets = new Insets(0, 0, 5, 0);
		gbc_panelCitacion.fill = GridBagConstraints.BOTH;
		gbc_panelCitacion.gridx = 2;
		gbc_panelCitacion.gridy = 3;
		pnlCalendarioCitas.add(panelCitacion, gbc_panelCitacion);
		GridBagLayout gbl_panelCitacion = new GridBagLayout();
		gbl_panelCitacion.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelCitacion.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCitacion.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelCitacion.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCitacion.setLayout(gbl_panelCitacion);

		lblHoraDeLa = new JLabel("Hora de la cita:");
		GridBagConstraints gbc_lblHoraDeLa = new GridBagConstraints();
		gbc_lblHoraDeLa.anchor = GridBagConstraints.EAST;
		gbc_lblHoraDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraDeLa.gridx = 1;
		gbc_lblHoraDeLa.gridy = 1;
		panelCitacion.add(lblHoraDeLa, gbc_lblHoraDeLa);

		textField = new JTextField();
		textField.setEnabled(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panelCitacion.add(textField, gbc_textField);
		textField.setColumns(10);

		lblNombre_1 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
		gbc_lblNombre_1.anchor = GridBagConstraints.EAST;
		gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre_1.gridx = 1;
		gbc_lblNombre_1.gridy = 2;
		panelCitacion.add(lblNombre_1, gbc_lblNombre_1);

		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		panelCitacion.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		lblApellidos_2 = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos_2 = new GridBagConstraints();
		gbc_lblApellidos_2.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos_2.gridx = 1;
		gbc_lblApellidos_2.gridy = 3;
		panelCitacion.add(lblApellidos_2, gbc_lblApellidos_2);

		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		panelCitacion.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		lblTipoDeConsulta = new JLabel("Tipo de consulta:");
		GridBagConstraints gbc_lblTipoDeConsulta = new GridBagConstraints();
		gbc_lblTipoDeConsulta.anchor = GridBagConstraints.EAST;
		gbc_lblTipoDeConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeConsulta.gridx = 1;
		gbc_lblTipoDeConsulta.gridy = 4;
		panelCitacion.add(lblTipoDeConsulta, gbc_lblTipoDeConsulta);

		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		panelCitacion.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		btnCargarPacientes = new JButton("Cargar Pacientes");
		GridBagConstraints gbc_btnCargarPacientes = new GridBagConstraints();
		gbc_btnCargarPacientes.insets = new Insets(0, 0, 5, 5);
		gbc_btnCargarPacientes.gridx = 2;
		gbc_btnCargarPacientes.gridy = 6;
		pnlCalendarioCitas.add(btnCargarPacientes, gbc_btnCargarPacientes);

		btnLimpiarCampos_1 = new JButton("Limpiar Campos");
		GridBagConstraints gbc_btnLimpiarCampos_1 = new GridBagConstraints();
		gbc_btnLimpiarCampos_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiarCampos_1.gridx = 3;
		gbc_btnLimpiarCampos_1.gridy = 6;
		pnlCalendarioCitas.add(btnLimpiarCampos_1, gbc_btnLimpiarCampos_1);

		pnlDirectorioPacientes = new JPanel();
		pestanasGeneral.addTab("Pacientes", null, pnlDirectorioPacientes, null);
		GridBagLayout gbl_pnlDirectorioPacientes = new GridBagLayout();
		gbl_pnlDirectorioPacientes.columnWidths = new int[]{30, 144, 225, 0, 0, 255, 0};
		gbl_pnlDirectorioPacientes.rowHeights = new int[]{30, 171, 0, 40, 145, 0, 0, 0, 0, 0};
		gbl_pnlDirectorioPacientes.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlDirectorioPacientes.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlDirectorioPacientes.setLayout(gbl_pnlDirectorioPacientes);
		
		pnlPacientes = new JPanel();
		pnlPacientes.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Lista Pacientes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_pnlPacientes = new GridBagConstraints();
		gbc_pnlPacientes.gridwidth = 2;
		gbc_pnlPacientes.gridheight = 5;
		gbc_pnlPacientes.insets = new Insets(0, 0, 5, 5);
		gbc_pnlPacientes.fill = GridBagConstraints.BOTH;
		gbc_pnlPacientes.gridx = 0;
		gbc_pnlPacientes.gridy = 0;
		pnlDirectorioPacientes.add(pnlPacientes, gbc_pnlPacientes);
		pnlPacientes.setLayout(new BorderLayout(0, 0));
		
		scrollPanePaciente = new JScrollPane();
		pnlPacientes.add(scrollPanePaciente, BorderLayout.CENTER);
		
		listaPacientes = new JList();
		listaPacientes.addListSelectionListener(new ListaPacientesListSelectionListener());
		scrollPanePaciente.setViewportView(listaPacientes);

		pnlDatosPersonales = new JPanel();
		pnlDatosPersonales.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlDatosPersonales = new GridBagConstraints();
		gbc_pnlDatosPersonales.gridheight = 2;
		gbc_pnlDatosPersonales.gridwidth = 4;
		gbc_pnlDatosPersonales.anchor = GridBagConstraints.NORTH;
		gbc_pnlDatosPersonales.fill = GridBagConstraints.HORIZONTAL;
		gbc_pnlDatosPersonales.insets = new Insets(0, 0, 5, 0);
		gbc_pnlDatosPersonales.gridx = 2;
		gbc_pnlDatosPersonales.gridy = 0;
		pnlDirectorioPacientes.add(pnlDatosPersonales, gbc_pnlDatosPersonales);
		GridBagLayout gbl_pnlDatosPersonales = new GridBagLayout();
		gbl_pnlDatosPersonales.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlDatosPersonales.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlDatosPersonales.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDatosPersonales.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlDatosPersonales.setLayout(gbl_pnlDatosPersonales);

		lblNss_1 = new JLabel("NSS: ");
		GridBagConstraints gbc_lblNss_1 = new GridBagConstraints();
		gbc_lblNss_1.anchor = GridBagConstraints.EAST;
		gbc_lblNss_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNss_1.gridx = 0;
		gbc_lblNss_1.gridy = 0;
		pnlDatosPersonales.add(lblNss_1, gbc_lblNss_1);

		txtNSS = new JTextField();
		GridBagConstraints gbc_txtNSS = new GridBagConstraints();
		gbc_txtNSS.gridwidth = 9;
		gbc_txtNSS.insets = new Insets(0, 0, 5, 0);
		gbc_txtNSS.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNSS.gridx = 1;
		gbc_txtNSS.gridy = 0;
		pnlDatosPersonales.add(txtNSS, gbc_txtNSS);
		txtNSS.setColumns(10);

		lblNss = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNss = new GridBagConstraints();
		gbc_lblNss.anchor = GridBagConstraints.EAST;
		gbc_lblNss.insets = new Insets(0, 0, 5, 5);
		gbc_lblNss.gridx = 0;
		gbc_lblNss.gridy = 1;
		pnlDatosPersonales.add(lblNss, gbc_lblNss);

		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 9;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 1;
		pnlDatosPersonales.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		lblApellidos = new JLabel("Apellidos: ");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 2;
		pnlDatosPersonales.add(lblApellidos, gbc_lblApellidos);

		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 9;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 1;
		gbc_txtApellidos.gridy = 2;
		pnlDatosPersonales.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);

		lblFechaNacimiento = new JLabel("Fecha Nacimiento: ");
		GridBagConstraints gbc_lblFechaNacimiento = new GridBagConstraints();
		gbc_lblFechaNacimiento.anchor = GridBagConstraints.EAST;
		gbc_lblFechaNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaNacimiento.gridx = 0;
		gbc_lblFechaNacimiento.gridy = 3;
		pnlDatosPersonales.add(lblFechaNacimiento, gbc_lblFechaNacimiento);

		dateChooserFechaNacimiento = new JDateChooser();
		GridBagConstraints gbc_dateChooserFechaNacimiento = new GridBagConstraints();
		gbc_dateChooserFechaNacimiento.gridwidth = 9;
		gbc_dateChooserFechaNacimiento.insets = new Insets(0, 0, 5, 0);
		gbc_dateChooserFechaNacimiento.fill = GridBagConstraints.BOTH;
		gbc_dateChooserFechaNacimiento.gridx = 1;
		gbc_dateChooserFechaNacimiento.gridy = 3;
		pnlDatosPersonales.add(dateChooserFechaNacimiento, gbc_dateChooserFechaNacimiento);

		lblSexo = new JLabel("Sexo: ");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.EAST;
		gbc_lblSexo.insets = new Insets(0, 0, 0, 5);
		gbc_lblSexo.gridx = 0;
		gbc_lblSexo.gridy = 4;
		pnlDatosPersonales.add(lblSexo, gbc_lblSexo);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 9;
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		pnlDatosPersonales.add(comboBox, gbc_comboBox);
				
				
						pnlOtrosDatos = new JPanel();
						pnlOtrosDatos.setBorder(new TitledBorder(null, "Otros Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
						GridBagConstraints gbc_pnlOtrosDatos = new GridBagConstraints();
						gbc_pnlOtrosDatos.gridwidth = 4;
						gbc_pnlOtrosDatos.insets = new Insets(0, 0, 5, 0);
						gbc_pnlOtrosDatos.gridheight = 3;
						gbc_pnlOtrosDatos.fill = GridBagConstraints.BOTH;
						gbc_pnlOtrosDatos.gridx = 2;
						gbc_pnlOtrosDatos.gridy = 2;
						pnlDirectorioPacientes.add(pnlOtrosDatos, gbc_pnlOtrosDatos);
						GridBagLayout gbl_pnlOtrosDatos = new GridBagLayout();
						gbl_pnlOtrosDatos.columnWidths = new int[]{0, 0};
						gbl_pnlOtrosDatos.rowHeights = new int[]{0, 0};
						gbl_pnlOtrosDatos.columnWeights = new double[]{1.0, Double.MIN_VALUE};
						gbl_pnlOtrosDatos.rowWeights = new double[]{1.0, Double.MIN_VALUE};
						pnlOtrosDatos.setLayout(gbl_pnlOtrosDatos);
						
								pestanasOtrosDatos = new JTabbedPane(JTabbedPane.TOP);
								GridBagConstraints gbc_pestanasOtrosDatos = new GridBagConstraints();
								gbc_pestanasOtrosDatos.fill = GridBagConstraints.BOTH;
								gbc_pestanasOtrosDatos.gridx = 0;
								gbc_pestanasOtrosDatos.gridy = 0;
								pnlOtrosDatos.add(pestanasOtrosDatos, gbc_pestanasOtrosDatos);
								
										pnlAlergias = new JPanel();
										pestanasOtrosDatos.addTab("Alérgias", null, pnlAlergias, null);
										pnlAlergias.setLayout(new BorderLayout(0, 0));
										
												scrollPane_1 = new JScrollPane();
												pnlAlergias.add(scrollPane_1, BorderLayout.CENTER);
												
														txtAreaAlergias = new JTextArea();
														scrollPane_1.setViewportView(txtAreaAlergias);
														
																pnlIntervenciones = new JPanel();
																pestanasOtrosDatos.addTab("Intervenciones", null, pnlIntervenciones, null);
																pnlIntervenciones.setLayout(new BorderLayout(0, 0));
																
																		TextAreaIntervenciones = new JScrollPane();
																		pnlIntervenciones.add(TextAreaIntervenciones, BorderLayout.CENTER);
																		
																				taIntervernciones = new JTextArea();
																				TextAreaIntervenciones.setViewportView(taIntervernciones);
																				
																						pnlOtrasObservacioens = new JPanel();
																						pestanasOtrosDatos.addTab("Observaciones", null, pnlOtrasObservacioens, null);
																						pnlOtrasObservacioens.setLayout(new BorderLayout(0, 0));
																						
																								txtAreaObservaciones = new JScrollPane();
																								pnlOtrasObservacioens.add(txtAreaObservaciones, BorderLayout.CENTER);
																								
																										taObservaciones = new JTextArea();
																										txtAreaObservaciones.setViewportView(taObservaciones);
																										
																												pnlImagenes = new JPanel();
																												pestanasOtrosDatos.addTab("Imágenes", null, pnlImagenes, null);
																												pnlImagenes.setLayout(new BorderLayout(0, 0));
																												
																														txtAreaImagenes = new JScrollPane();
																														pnlImagenes.add(txtAreaImagenes, BorderLayout.CENTER);
																														
																																lblImagen = new JLabel("");
																																txtAreaImagenes.setViewportView(lblImagen);
		
				btnAadir = new JButton("Añadir");
				btnAadir.setIcon(new ImageIcon(General.class.getResource("/Imagenes/anadir32.png")));
				GridBagConstraints gbc_btnAadir = new GridBagConstraints();
				gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
				gbc_btnAadir.gridx = 1;
				gbc_btnAadir.gridy = 6;
				pnlDirectorioPacientes.add(btnAadir, gbc_btnAadir);
		
				btnModificar = new JButton("Modificar");
				btnModificar.setIcon(new ImageIcon(General.class.getResource("/Imagenes/editar.png")));
				GridBagConstraints gbc_btnModificar = new GridBagConstraints();
				gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
				gbc_btnModificar.gridx = 2;
				gbc_btnModificar.gridy = 6;
				pnlDirectorioPacientes.add(btnModificar, gbc_btnModificar);
		
				btnEliminar = new JButton("Eliminar");
				btnEliminar.setIcon(new ImageIcon(General.class.getResource("/Imagenes/eliminar.png")));
				GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
				gbc_btnEliminar.insets = new Insets(0, 0, 5, 0);
				gbc_btnEliminar.gridx = 5;
				gbc_btnEliminar.gridy = 6;
				pnlDirectorioPacientes.add(btnEliminar, gbc_btnEliminar);

		btnLimpiarCampos = new JButton("Limpiar Campos");
		GridBagConstraints gbc_btnLimpiarCampos = new GridBagConstraints();
		gbc_btnLimpiarCampos.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimpiarCampos.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiarCampos.gridx = 2;
		gbc_btnLimpiarCampos.gridy = 7;
		pnlDirectorioPacientes.add(btnLimpiarCampos, gbc_btnLimpiarCampos);

		pnlEspecialistas = new JPanel();
		pestanasGeneral.addTab("Especialistas", null, pnlEspecialistas, null);
		GridBagLayout gbl_pnlEspecialistas = new GridBagLayout();
		gbl_pnlEspecialistas.columnWidths = new int[]{0, 176, 0, 82, 0, 0, 0, 0};
		gbl_pnlEspecialistas.rowHeights = new int[]{0, 197, 171, 0, 0};
		gbl_pnlEspecialistas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlEspecialistas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlEspecialistas.setLayout(gbl_pnlEspecialistas);

		pnlListaEspecialista = new JPanel();
		pnlListaEspecialista.setBorder(new TitledBorder(null, "Lista Especialistas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlListaEspecialista = new GridBagConstraints();
		gbc_pnlListaEspecialista.gridwidth = 2;
		gbc_pnlListaEspecialista.gridheight = 4;
		gbc_pnlListaEspecialista.insets = new Insets(0, 0, 0, 5);
		gbc_pnlListaEspecialista.fill = GridBagConstraints.BOTH;
		gbc_pnlListaEspecialista.gridx = 0;
		gbc_pnlListaEspecialista.gridy = 0;
		pnlEspecialistas.add(pnlListaEspecialista, gbc_pnlListaEspecialista);
		GridBagLayout gbl_pnlListaEspecialista = new GridBagLayout();
		gbl_pnlListaEspecialista.columnWidths = new int[]{0, 0};
		gbl_pnlListaEspecialista.rowHeights = new int[]{0, 0};
		gbl_pnlListaEspecialista.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pnlListaEspecialista.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlListaEspecialista.setLayout(gbl_pnlListaEspecialista);

		scrollPaneEspecialista = new JScrollPane();
		GridBagConstraints gbc_scrollPaneEspecialista = new GridBagConstraints();
		gbc_scrollPaneEspecialista.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneEspecialista.gridx = 0;
		gbc_scrollPaneEspecialista.gridy = 0;
		pnlListaEspecialista.add(scrollPaneEspecialista, gbc_scrollPaneEspecialista);

		listaEspecialista = new JList();
		listaEspecialista.addListSelectionListener(new ListaEspecialistaListSelectionListener());
		scrollPaneEspecialista.setViewportView(listaEspecialista);

		pnlFicha = new JPanel();
		pnlFicha.setBorder(new TitledBorder(null, "Ficha", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlFicha = new GridBagConstraints();
		gbc_pnlFicha.gridheight = 4;
		gbc_pnlFicha.gridwidth = 5;
		gbc_pnlFicha.fill = GridBagConstraints.BOTH;
		gbc_pnlFicha.gridx = 2;
		gbc_pnlFicha.gridy = 0;
		pnlEspecialistas.add(pnlFicha, gbc_pnlFicha);
		GridBagLayout gbl_pnlFicha = new GridBagLayout();
		gbl_pnlFicha.columnWidths = new int[]{0, 78, 0, 0, 0, 0, 0};
		gbl_pnlFicha.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlFicha.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlFicha.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlFicha.setLayout(gbl_pnlFicha);

		lblNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 0;
		pnlFicha.add(lblNombre, gbc_lblNombre);

		txtNombreEspecialista = new JTextField();
		txtNombreEspecialista.setEnabled(false);
		GridBagConstraints gbc_txtNombreEspecialista = new GridBagConstraints();
		gbc_txtNombreEspecialista.gridwidth = 4;
		gbc_txtNombreEspecialista.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombreEspecialista.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreEspecialista.gridx = 2;
		gbc_txtNombreEspecialista.gridy = 0;
		pnlFicha.add(txtNombreEspecialista, gbc_txtNombreEspecialista);
		txtNombreEspecialista.setColumns(10);

		lblApellidos_1 = new JLabel("Apellidos: ");
		GridBagConstraints gbc_lblApellidos_1 = new GridBagConstraints();
		gbc_lblApellidos_1.anchor = GridBagConstraints.WEST;
		gbc_lblApellidos_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos_1.gridx = 1;
		gbc_lblApellidos_1.gridy = 1;
		pnlFicha.add(lblApellidos_1, gbc_lblApellidos_1);

		txtApellidoEspecialista = new JTextField();
		txtApellidoEspecialista.setEnabled(false);
		GridBagConstraints gbc_txtApellidoEspecialista = new GridBagConstraints();
		gbc_txtApellidoEspecialista.gridwidth = 4;
		gbc_txtApellidoEspecialista.insets = new Insets(0, 0, 5, 0);
		gbc_txtApellidoEspecialista.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidoEspecialista.gridx = 2;
		gbc_txtApellidoEspecialista.gridy = 1;
		pnlFicha.add(txtApellidoEspecialista, gbc_txtApellidoEspecialista);
		txtApellidoEspecialista.setColumns(10);

		lblEmail = new JLabel("E-mail: ");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 2;
		pnlFicha.add(lblEmail, gbc_lblEmail);

		txtEmailEspecialista = new JTextField();
		txtEmailEspecialista.setEnabled(false);
		GridBagConstraints gbc_txtEmailEspecialista = new GridBagConstraints();
		gbc_txtEmailEspecialista.gridwidth = 4;
		gbc_txtEmailEspecialista.insets = new Insets(0, 0, 5, 0);
		gbc_txtEmailEspecialista.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmailEspecialista.gridx = 2;
		gbc_txtEmailEspecialista.gridy = 2;
		pnlFicha.add(txtEmailEspecialista, gbc_txtEmailEspecialista);
		txtEmailEspecialista.setColumns(10);

		lblTelfono = new JLabel("Teléfono: ");
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.WEST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 1;
		gbc_lblTelfono.gridy = 3;
		pnlFicha.add(lblTelfono, gbc_lblTelfono);

		txtTlfEspecialista = new JTextField();
		txtTlfEspecialista.setEnabled(false);
		GridBagConstraints gbc_txtTlfEspecialista = new GridBagConstraints();
		gbc_txtTlfEspecialista.gridwidth = 4;
		gbc_txtTlfEspecialista.insets = new Insets(0, 0, 5, 0);
		gbc_txtTlfEspecialista.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTlfEspecialista.gridx = 2;
		gbc_txtTlfEspecialista.gridy = 3;
		pnlFicha.add(txtTlfEspecialista, gbc_txtTlfEspecialista);
		txtTlfEspecialista.setColumns(10);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridheight = 5;
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 0);
		gbc_tabbedPane.gridwidth = 5;
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 5;
		pnlFicha.add(tabbedPane, gbc_tabbedPane);

		pnlDispon = new JPanel();
		tabbedPane.addTab("Disponibilidad", null, pnlDispon, null);
		pnlDispon.setLayout(new BorderLayout(0, 0));

		scrollPane_6 = new JScrollPane();
		pnlDispon.add(scrollPane_6, BorderLayout.CENTER);

		taDisponibilidad = new JTextArea();
		taDisponibilidad.setEnabled(false);
		scrollPane_6.setViewportView(taDisponibilidad);

		pnlEspe = new JPanel();
		tabbedPane.addTab("Especialidad", null, pnlEspe, null);
		pnlEspe.setLayout(new BorderLayout(0, 0));

		scrollPane_7 = new JScrollPane();
		pnlEspe.add(scrollPane_7, BorderLayout.CENTER);

		taEspecialidad = new JTextArea();
		taEspecialidad.setEnabled(false);
		scrollPane_7.setViewportView(taEspecialidad);

		panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Consulta Especialista", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.gridheight = 6;
		gbc_panel_5.gridwidth = 5;
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 10;
		pnlFicha.add(panel_5, gbc_panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{42, 43, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);

		lblAsunto = new JLabel("Asunto: ");
		GridBagConstraints gbc_lblAsunto = new GridBagConstraints();
		gbc_lblAsunto.fill = GridBagConstraints.VERTICAL;
		gbc_lblAsunto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsunto.gridx = 0;
		gbc_lblAsunto.gridy = 0;
		panel_5.add(lblAsunto, gbc_lblAsunto);

		textArea_3 = new JTextArea();
		GridBagConstraints gbc_textArea_3 = new GridBagConstraints();
		gbc_textArea_3.insets = new Insets(0, 0, 5, 0);
		gbc_textArea_3.fill = GridBagConstraints.BOTH;
		gbc_textArea_3.gridx = 1;
		gbc_textArea_3.gridy = 0;
		panel_5.add(textArea_3, gbc_textArea_3);

		lblProblema = new JLabel("Problema: ");
		GridBagConstraints gbc_lblProblema = new GridBagConstraints();
		gbc_lblProblema.anchor = GridBagConstraints.EAST;
		gbc_lblProblema.insets = new Insets(0, 0, 0, 5);
		gbc_lblProblema.gridx = 0;
		gbc_lblProblema.gridy = 1;
		panel_5.add(lblProblema, gbc_lblProblema);

		textArea_4 = new JTextArea();
		GridBagConstraints gbc_textArea_4 = new GridBagConstraints();
		gbc_textArea_4.fill = GridBagConstraints.BOTH;
		gbc_textArea_4.gridx = 1;
		gbc_textArea_4.gridy = 1;
		panel_5.add(textArea_4, gbc_textArea_4);

		btnEnviarConsulta = new JButton("Enviar Consulta");
		GridBagConstraints gbc_btnEnviarConsulta = new GridBagConstraints();
		gbc_btnEnviarConsulta.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviarConsulta.gridx = 1;
		gbc_btnEnviarConsulta.gridy = 17;
		pnlFicha.add(btnEnviarConsulta, gbc_btnEnviarConsulta);
		DefaultListModel modelo = new DefaultListModel();
		for(int i = 0; i<GestorPacientes.getPaciente().size(); i++){
			modelo.addElement(GestorPacientes.getPaciente().get(i).getNss());
		}
		listaPacientes.setModel(modelo);
		listaPacientes.setSelectedIndex(0);
		scrollPaneEspecialista.setViewportView(listaEspecialista);

		DefaultListModel modeloListaEspecialistas = new DefaultListModel();
		for(int i = 0; i<GestorEspecialistas.getEspecialista().size(); i++){
			modeloListaEspecialistas.addElement(GestorEspecialistas.getEspecialista().get(i).getIDEspecialista());
		}
		listaEspecialista.setModel(modeloListaEspecialistas);
		listaEspecialista.setSelectedIndex(0);
		scrollPaneEspecialista.setViewportView(listaEspecialista);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmHerramientaDeDibujo = new JMenuItem("Herramienta de Dibujo");
		mntmHerramientaDeDibujo.setIcon(new ImageIcon(General.class.getResource("/Imagenes/HerramientaDibujo.png")));
		mnArchivo.add(mntmHerramientaDeDibujo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setIcon(new ImageIcon(General.class.getResource("/Imagenes/Salir.png")));
		mnArchivo.add(mntmSalir);
		
		mnPreferencias = new JMenu("Preferencias");
		menuBar.add(mnPreferencias);
		
		mnIdioma = new JMenu("Idioma");
		mnIdioma.setIcon(new ImageIcon(General.class.getResource("/Imagenes/idioma.png")));
		mnPreferencias.add(mnIdioma);
		
		rdbtnmntmEspao = new JRadioButtonMenuItem("Español");
		rdbtnmntmEspao.setIcon(new ImageIcon(General.class.getResource("/Imagenes/espanol.png")));
		mnIdioma.add(rdbtnmntmEspao);
		
		mntmIngls = new JMenuItem("Inglés");
		mntmIngls.setIcon(new ImageIcon(General.class.getResource("/Imagenes/Ingles.png")));
		mnIdioma.add(mntmIngls);
		
		mnAcercaDe = new JMenu("Acerca de");
		menuBar.add(mnAcercaDe);
		
		Ayuda = new JMenu("Acerca de");
		Ayuda.setIcon(new ImageIcon(General.class.getResource("/Imagenes/info.png")));
		mnAcercaDe.add(Ayuda);

	}
	public static void setUsuario(Medico medi){
		medico = medi;
	}

	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int respuesta =JOptionPane.showConfirmDialog(null, "¿Desea cerrar sessión?", "OK", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(respuesta == 0){
				frame.setVisible(false);
				frame.dispose();
				Login.main(null);
			}

		}
	}
	public void RellenarCamposPacientes() throws ParseException{
		String ID = (String) listaPacientes.getSelectedValue();
		Paciente p = GestorPacientes.buscarPaciente(ID);
		txtNSS.setText(p.getNss());
		txtNombre.setText(p.getNombre());
		txtApellidos.setText(p.getApellido());
		comboBox.setSelectedItem(p.getSexo());
		txtAreaAlergias.setText(p.getAlergias());
		taIntervernciones.setText(p.getIntervenciones());
		taObservaciones.setText(p.getObservaciones());
		Date fecha = null;
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MMM-yyyy");
		fecha = formatoFecha.parse(p.getFechaN());
		dateChooserFechaNacimiento.setDate(fecha);
	}

	public void RellenarCamposEspecialistas(){
		int ID = (int) listaEspecialista.getSelectedValue();
		Especialista e1 = GestorEspecialistas.buscarEspecialista(ID);
		txtNombreEspecialista.setText(e1.getNombreEspecialista());
		txtApellidoEspecialista.setText(e1.getApellidosEspecialista());
		txtEmailEspecialista.setText(e1.getEmail());
		txtTlfEspecialista.setText(Integer.toString(e1.getTelefono()));
		taDisponibilidad.setText(e1.getDisponibilidad());
		taEspecialidad.setText(e1.getEspecialidad());
	}

	public void RellenarCampos() throws ParseException{
		switch(pestanasGeneral.getSelectedIndex()){
		case 0:
			RellenarCamposPacientes();
			break;
		case 1:
			RellenarCamposEspecialistas();
			break;
		case 2:
			break;
		}
	}
	private class PestanasGeneralMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				RellenarCampos();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	private class ListaEspecialistaListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			RellenarCamposEspecialistas();
		}
	}
	private class ListaPacientesListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			try {
				RellenarCamposPacientes();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
}
