package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class NuevaPersona extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textNieNif;
	private JTextField textTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaPersona frame = new NuevaPersona();
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
	public NuevaPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre *:");
		lblNombre.setBounds(32, 38, 65, 14);
		contentPane.add(lblNombre);
		
		textFieldNombre = new JTextField();
		lblNombre.setLabelFor(textFieldNombre);
		textFieldNombre.setBounds(111, 35, 86, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblNifNie = new JLabel("Selecciona la opcion e\r\n");
		lblNifNie.setBounds(32, 91, 112, 30);
		contentPane.add(lblNifNie);
		
		JLabel lblNewLabel = new JLabel("Introduzca el valor");
		lblNewLabel.setBounds(32, 112, 112, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNif = new JRadioButton("NIF");
		buttonGroup.add(rdbtnNif);
		rdbtnNif.setBounds(153, 84, 50, 23);
		contentPane.add(rdbtnNif);
		
		JRadioButton rdbtnNie = new JRadioButton("NIE");
		buttonGroup.add(rdbtnNie);
		rdbtnNie.setBounds(207, 84, 109, 23);
		contentPane.add(rdbtnNie);
		
		textNieNif = new JTextField();
		textNieNif.setBounds(154, 109, 86, 20);
		contentPane.add(textNieNif);
		textNieNif.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(32, 166, 46, 14);
		contentPane.add(lblTelefono);
		
		textTelefono = new JTextField();
		lblTelefono.setLabelFor(textTelefono);
		textTelefono.setBounds(111, 163, 129, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblNacimiento = new JLabel("Fecha Nacimiento *:");
		lblNacimiento.setBounds(32, 214, 98, 14);
		contentPane.add(lblNacimiento);
		
		JSpinner spinnerNacimiento = new JSpinner();
		lblNacimiento.setLabelFor(spinnerNacimiento);
		spinnerNacimiento.setModel(new SpinnerDateModel(new Date(-315622800000L), null, null, Calendar.DAY_OF_YEAR));
		spinnerNacimiento.setBounds(140, 211, 100, 20);
		contentPane.add(spinnerNacimiento);
	}
}
