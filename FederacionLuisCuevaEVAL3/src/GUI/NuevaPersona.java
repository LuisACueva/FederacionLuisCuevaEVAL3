package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.event.CaretListener;

import entidades.DatosPersona;

import javax.swing.event.CaretEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class NuevaPersona extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textNieNif;
	private JTextField textTelefono;
	private JTextField textAltura;
	private JTextField textPeso;

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
		setBounds(100, 100, 450, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre *:");
		lblNombre.setBounds(32, 38, 65, 14);
		contentPane.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				if(textFieldNombre.getText().length()<3 || textFieldNombre.getText().length()>50) {
					textFieldNombre.setBackground(Color.red);
				}
				if(textFieldNombre.getText().length()>=3 && textFieldNombre.getText().length()<50) {
					textFieldNombre.setBackground(Color.white);
				}
			}
		});
		lblNombre.setLabelFor(textFieldNombre);
		textFieldNombre.setBounds(111, 35, 86, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblNifNie = new JLabel("Selecciona la opcion e\r\n");
		lblNifNie.setBounds(32, 91, 112, 30);
		contentPane.add(lblNifNie);
		
		JLabel lblNewLabel = new JLabel("Introduzca el valor *");
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
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom;
				String doc;
				String tel;
				LocalDate nac;
				//DatosPersona persona = new DatosPersona(eventMask, tel, tel, null);
				
			}
		});
		btnAceptar.setBounds(176, 420, 118, 43);
		contentPane.add(btnAceptar);
		
		JLabel lblAltura = new JLabel("Altura *:");
		lblAltura.setBounds(32, 293, 65, 14);
		contentPane.add(lblAltura);
		
		JLabel lblPeso = new JLabel("Peso *:");
		lblPeso.setBounds(32, 318, 65, 14);
		contentPane.add(lblPeso);
		
		textAltura = new JTextField();
		textAltura.setBounds(86, 290, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textPeso = new JTextField();
		textPeso.setBounds(86, 318, 86, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblAlturaFormato = new JLabel("m.(en formato xx,xx)");
		lblAlturaFormato.setBounds(182, 293, 134, 14);
		contentPane.add(lblAlturaFormato);
		
		JLabel lblPesoFormato = new JLabel("Kg.(en formato xx,xx)");
		lblPesoFormato.setBounds(182, 318, 134, 14);
		contentPane.add(lblPesoFormato);
		
		JLabel lblEquipo = new JLabel("Equipo:");
		lblEquipo.setBounds(32, 375, 46, 14);
		contentPane.add(lblEquipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(86, 371, 208, 22);
		contentPane.add(comboBox);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seleccion = JOptionPane.showConfirmDialog(null, 
						"¿Desea cerrar la ventana?", "Aviso", 
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.WARNING_MESSAGE);
				switch(seleccion) {
				case JOptionPane.YES_OPTION: break;
				case JOptionPane.NO_OPTION: System.exit(0); break;
				case JOptionPane.CANCEL_OPTION: break;
				}
				
			}
		});
		btnCancelar.setBounds(304, 420, 118, 43);
		contentPane.add(btnCancelar);
	}
}
