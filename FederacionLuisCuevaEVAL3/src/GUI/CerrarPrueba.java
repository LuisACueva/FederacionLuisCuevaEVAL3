package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import DAO.AtletaDAO;
import DAO.MetalDAO;
import DAO.PatrocinadorDAO;
import DAO.PruebaDAO;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import entidades.Atleta;
import entidades.Lugar;
import entidades.Patrocinador;
import entidades.Prueba;
import entidades.Tiempo;
import utils.ConexBD;
import validaciones.Validaciones;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.SpinnerNumberModel;

public class CerrarPrueba extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private final ButtonGroup buttonGroupTipo = new ButtonGroup();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int idprueba = 1;
					CerrarPrueba frame = new CerrarPrueba(idprueba);
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
	public CerrarPrueba(int idprueba) {
		PruebaDAO pDAO = new PruebaDAO(ConexBD.getCon());
		Prueba prueba = pDAO.buscarPorID(idprueba);
		if(prueba!=null) {
			setTitle("Cerrar Prueba" + idprueba);
		}
		else
		setTitle("Cerrar Prueba INDETERMINADA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(null, "Datos de la prueba", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 21, 424, 199);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblIdPrueba = new JLabel("IdPrueba:");
		lblIdPrueba.setBounds(22, 21, 77, 14);
		panel_1.add(lblIdPrueba);

		textField = new JTextField(""+prueba.getId());
		textField.setBounds(86, 14, 86, 20);
		panel_1.add(textField);
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(22, 48, 77, 14);
		panel_1.add(lblNombre);

		textFieldNombre = new JTextField(prueba.getNombre());
		textFieldNombre.setBounds(86, 41, 261, 20);
		panel_1.add(textFieldNombre);
		textFieldNombre.setEnabled(false);
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);

		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(22, 73, 46, 14);
		panel_1.add(lblFecha);

		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setBounds(200, 73, 46, 14);
		panel_1.add(lblLugar);

		JComboBox comboBoxLugar = new JComboBox();
		comboBoxLugar.setBounds(245, 69, 169, 22);
		panel_1.add(comboBoxLugar);
		comboBoxLugar.setEnabled(false);
		comboBoxLugar.setModel(new DefaultComboBoxModel(Lugar.values()));

		JPanel panel = new JPanel();
		panel.setBounds(22, 98, 210, 52);
		panel_1.add(panel);
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Tipo de Prueba:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JRadioButton rbIndividual = new JRadioButton("Individual");
	
		rbIndividual.setEnabled(false);
		buttonGroupTipo.add(rbIndividual);
		panel.add(rbIndividual);

		JRadioButton rbEquipos = new JRadioButton("Por Equipos");
		rbEquipos.setEnabled(false);
		buttonGroupTipo.add(rbEquipos);
		panel.add(rbEquipos);
		if(prueba.isIndividual()) 
			rbIndividual.setSelected(true);
		else
			rbEquipos.setSelected(true);

		JLabel lblPatrocinador = new JLabel("Patrocinador:");
		lblPatrocinador.setBounds(22, 161, 87, 14);
		panel_1.add(lblPatrocinador);

		JLabel lblprimerpuesto = new JLabel("Primer puesto *:");
		lblprimerpuesto.setBounds(27, 224, 109, 14);
		contentPane.add(lblprimerpuesto);

		JLabel lblsegundopuesto = new JLabel("Segundo puesto *:");
		lblsegundopuesto.setBounds(27, 314, 109, 14);
		contentPane.add(lblsegundopuesto);

		JLabel lbltercerpuesto = new JLabel("Tercer puesto *:");
		lbltercerpuesto.setBounds(27, 394, 109, 14);
		contentPane.add(lbltercerpuesto);

		DefaultComboBoxModel<Atleta> atletasModel = new DefaultComboBoxModel<Atleta>();
		AtletaDAO aDAO = new AtletaDAO(ConexBD.getCon());
		ArrayList<Atleta> atletassList = (ArrayList<Atleta>) aDAO.buscarTodos();
		/// Pero el modelo de comboBox básico requiere Strings
		String[] atletasStr = new String[atletassList.size()];
		for (int i = 0; i < atletassList.size(); i++)
			atletasStr[i] = atletassList.get(i).getPersona().data();



		JComboBox<Atleta> comboBoxPuesto1 = new JComboBox<Atleta>();
		comboBoxPuesto1.setModel(new DefaultComboBoxModel(atletasStr));		
		lblprimerpuesto.setLabelFor(comboBoxPuesto1);
		comboBoxPuesto1.setBounds(140, 220, 287, 22);
		contentPane.add(comboBoxPuesto1);

		JComboBox<Atleta> comboBoxPuesto2 = new JComboBox<Atleta>();
		comboBoxPuesto2.setModel(new DefaultComboBoxModel(atletasStr));
		lblsegundopuesto.setLabelFor(comboBoxPuesto2);
		comboBoxPuesto2.setBounds(140, 310, 287, 22);
		contentPane.add(comboBoxPuesto2);

		JComboBox<Atleta> comboBoxPuesto3 = new JComboBox<Atleta>();
		comboBoxPuesto3.setModel(new DefaultComboBoxModel(atletasStr));
		lbltercerpuesto.setLabelFor(comboBoxPuesto3);
		comboBoxPuesto3.setBounds(140, 390, 287, 22);
		contentPane.add(comboBoxPuesto3);

		LocalDate hoyMas1MesLD = LocalDate.now().plusMonths(1);
		java.util.Date hoyMas1Mes = new Date(hoyMas1MesLD.getYear() - 1900, hoyMas1MesLD.getMonthValue() - 1,
				hoyMas1MesLD.getDayOfMonth());

		/// Las siguientes lineas seria lo deseable: trabajar diectamente con objetos en
		/// el model del comboBox
		DefaultComboBoxModel<Patrocinador> patrocinadoresModel = new DefaultComboBoxModel<Patrocinador>();
		JComboBox<Patrocinador> comboBoxPatrocinador = new JComboBox<Patrocinador>(patrocinadoresModel);
		PatrocinadorDAO patDAO = new PatrocinadorDAO(ConexBD.getCon());
		ArrayList<Patrocinador> patrocinadoresList = (ArrayList<Patrocinador>) patDAO.buscarTodos();
		for (Patrocinador pat : patrocinadoresList)
			comboBoxPatrocinador.addItem(pat);

		/// Pero el modelo de comboBox básico requiere Strings
		String[] patrocinadoresStr = new String[patrocinadoresList.size()];
		for (int i = 0; i < patrocinadoresList.size(); i++)
			patrocinadoresStr[i] = patrocinadoresList.get(i).mostrarBasico();
		comboBoxPatrocinador.setModel(new DefaultComboBoxModel(patrocinadoresStr));
		comboBoxPatrocinador.setBounds(96, 157, 261, 22);
		panel_1.add(comboBoxPatrocinador);
		comboBoxPatrocinador.setEnabled(false);

		JSpinner spinnerFecha = new JSpinner();
		spinnerFecha.setBounds(86, 69, 86, 20);
		panel_1.add(spinnerFecha);
		spinnerFecha.setEnabled(false);
		spinnerFecha.setModel(new SpinnerDateModel(hoyMas1Mes, hoyMas1Mes, null, Calendar.DAY_OF_YEAR));

		JButton buttonAceptar = new JButton("Aceptar");
		buttonAceptar.setBounds(233, 478, 89, 23);
		contentPane.add(buttonAceptar);

		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titulo = "Cerrar ventana";
				String msj = "¿Realmente desea cerrar la ventana?";
				int opcion = JOptionPane.showConfirmDialog(null, msj, titulo, JOptionPane.OK_CANCEL_OPTION);
				if (opcion == JOptionPane.YES_OPTION) {
					/// Aqui se redirigiría al usuario hacia la pantalla principal o se saldria
					System.exit(0); /// SALIR directamente
				}

			}
		});
		buttonCancelar.setBounds(338, 478, 89, 23);
		contentPane.add(buttonCancelar);
		
		JLabel lblDefinitivo = new JLabel("Establecer como DEFINITIVO:");
		lblDefinitivo.setBounds(27, 482, 153, 14);
		contentPane.add(lblDefinitivo);
		
		JCheckBox chckbxDefinitivo = new JCheckBox("");
		lblDefinitivo.setLabelFor(chckbxDefinitivo);
		chckbxDefinitivo.setBounds(172, 478, 21, 23);
		contentPane.add(chckbxDefinitivo);
		
		JLabel lblIdOro = new JLabel("id Oro:");
		lblIdOro.setBounds(90, 285, 46, 14);
		contentPane.add(lblIdOro);
		
		JLabel lblIdPlata = new JLabel("id Plata:");
		lblIdPlata.setBounds(90, 369, 46, 14);
		contentPane.add(lblIdPlata);
		
		JLabel lblIdBronce = new JLabel("id Bronce:");
		lblIdBronce.setBounds(79, 454, 57, 14);
		contentPane.add(lblIdBronce);
		
		MetalDAO mdao = new MetalDAO(ConexBD.establecerConexion());
		JComboBox comboBoxOros = new JComboBox(new DefaultComboBoxModel(mdao.buscarLibre("oro").toArray()));
		comboBoxOros.setBounds(140, 281, 97, 22);
		contentPane.add(comboBoxOros);
		
		JComboBox comboBoxPlatas = new JComboBox(new DefaultComboBoxModel(mdao.buscarLibre("plata").toArray()));
		comboBoxPlatas.setBounds(140, 365, 97, 22);
		contentPane.add(comboBoxPlatas);
		
		JComboBox comboBoxBronces = new JComboBox(new DefaultComboBoxModel(mdao.buscarLibre("bronce").toArray()));
		comboBoxBronces.setBounds(140, 450, 97, 22);
		contentPane.add(comboBoxBronces);
		
		JLabel lblHoras_1 = new JLabel("Horas:");
		lblHoras_1.setBounds(37, 249, 46, 14);
		contentPane.add(lblHoras_1);
		
		JLabel lblHoras_2 = new JLabel("Horas:");
		lblHoras_2.setBounds(37, 339, 46, 14);
		contentPane.add(lblHoras_2);
		
		JLabel lblHoras_3 = new JLabel("Horas:");
		lblHoras_3.setBounds(37, 419, 46, 14);
		contentPane.add(lblHoras_3);
		
		
		JLabel lblMinutos_1 = new JLabel("Minutos:");
		lblMinutos_1.setBounds(124, 249, 46, 14);
		contentPane.add(lblMinutos_1);
		
		JSpinner spinnerM1 = new JSpinner();
		lblMinutos_1.setLabelFor(spinnerM1);
		spinnerM1.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		spinnerM1.setBounds(174, 249, 41, 20);
		contentPane.add(spinnerM1);
		
		JLabel lblSegundos_1 = new JLabel("Segundos:");
		lblSegundos_1.setBounds(225, 249, 66, 14);
		contentPane.add(lblSegundos_1);
		
		JSpinner spinnerS1 = new JSpinner();
		lblSegundos_1.setLabelFor(spinnerS1);
		spinnerS1.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		spinnerS1.setBounds(281, 249, 41, 20);
		contentPane.add(spinnerS1);
		
		JLabel lblCentesimas_1 = new JLabel("Centesimas:");
		lblCentesimas_1.setBounds(324, 249, 72, 14);
		contentPane.add(lblCentesimas_1);
		
		JSpinner spinnerC1 = new JSpinner();
		lblCentesimas_1.setLabelFor(spinnerC1);
		spinnerC1.setModel(new SpinnerNumberModel(0, 0, 99, 1));
		spinnerC1.setBounds(386, 249, 41, 20);
		contentPane.add(spinnerC1);
		
		JSpinner spinnerH2 = new JSpinner();
		lblHoras_2.setLabelFor(spinnerH2);
		spinnerH2.setBounds(73, 338, 41, 20);
		contentPane.add(spinnerH2);
		
		JLabel lblMinutos_1_1 = new JLabel("Minutos:");
		lblMinutos_1_1.setBounds(124, 338, 46, 14);
		contentPane.add(lblMinutos_1_1);
		
		JSpinner spinnerM2 = new JSpinner();
		lblMinutos_1_1.setLabelFor(spinnerM2);
		spinnerM2.setBounds(174, 338, 41, 20);
		contentPane.add(spinnerM2);
		
		JLabel lblSegundos_1_1 = new JLabel("Segundos:");
		lblSegundos_1_1.setBounds(225, 338, 66, 14);
		contentPane.add(lblSegundos_1_1);
		
		JSpinner spinnerS2 = new JSpinner();
		lblSegundos_1_1.setLabelFor(spinnerS2);
		spinnerS2.setBounds(281, 338, 41, 20);
		contentPane.add(spinnerS2);
		
		JLabel lblCentesimas_1_1 = new JLabel("Centesimas:");
		lblCentesimas_1_1.setBounds(324, 338, 72, 14);
		contentPane.add(lblCentesimas_1_1);
		
		JSpinner spinnerC2 = new JSpinner();
		lblCentesimas_1_1.setLabelFor(spinnerC2);
		spinnerC2.setBounds(386, 338, 41, 20);
		contentPane.add(spinnerC2);
		
		JSpinner spinnerH3 = new JSpinner();
		spinnerH3.setBounds(73, 419, 41, 20);
		contentPane.add(spinnerH3);
		
		JLabel lblMinutos_1_2 = new JLabel("Minutos:");
		lblMinutos_1_2.setBounds(124, 419, 46, 14);
		contentPane.add(lblMinutos_1_2);
		
		JSpinner spinnerM3 = new JSpinner();
		spinnerM3.setBounds(174, 419, 41, 20);
		contentPane.add(spinnerM3);
		
		JLabel lblSegundos_1_2 = new JLabel("Segundos:");
		lblSegundos_1_2.setBounds(225, 419, 66, 14);
		contentPane.add(lblSegundos_1_2);
		
		JSpinner spinnerS3 = new JSpinner();
		spinnerS3.setBounds(281, 419, 41, 20);
		contentPane.add(spinnerS3);
		
		JLabel lblCentesimas_1_2 = new JLabel("Centesimas:");
		lblCentesimas_1_2.setBounds(324, 419, 72, 14);
		contentPane.add(lblCentesimas_1_2);
		
		JSpinner spinnerC3 = new JSpinner();
		spinnerC3.setBounds(386, 419, 41, 20);
		contentPane.add(spinnerC3);
		
		JSpinner spinnerH1 = new JSpinner();
		spinnerH1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerH1.setBounds(73, 249, 41, 20);
		contentPane.add(spinnerH1);
		
		buttonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valid = false;
				Tiempo temp1 = new Tiempo((Integer)spinnerH1.getValue(),(Integer)spinnerM1.getValue(),(Integer)spinnerS1.getValue(),(Integer)spinnerC1.getValue());
				Tiempo temp2 = new Tiempo((Integer)spinnerH2.getValue(),(Integer)spinnerM2.getValue(),(Integer)spinnerS2.getValue(),(Integer)spinnerC2.getValue());
				Tiempo temp3 = new Tiempo((Integer)spinnerH3.getValue(),(Integer)spinnerM3.getValue(),(Integer)spinnerS3.getValue(),(Integer)spinnerC3.getValue());
				if(temp1.compareTo(temp2)>0 && temp2.compareTo(temp3)>0) {
					if(temp1.getHoras()>=0 && temp1.getMinutos()>=0 && temp1.getSegundos()>=0 && temp1.getCentesimas()>=0){
						if(temp2.getHoras()>=0 && temp2.getMinutos()>=0 && temp2.getSegundos()>=0 && temp2.getCentesimas()>=0){
							if(temp3.getHoras()>=0 && temp3.getMinutos()>=0 && temp3.getSegundos()>=0 && temp3.getCentesimas()>=0){
								if(comboBoxPuesto1.getSelectedIndex()!=comboBoxPuesto2.getSelectedIndex() && comboBoxPuesto2.getSelectedIndex()!=comboBoxPuesto3.getSelectedIndex()) {
									
								}
							}
						}
					}
				}
				DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh:mm:ss");
				DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				String impresion = "Resultado de la prueba "+textField.getText()+" \""+textFieldNombre.getText()+"\" celebrada el pasado "+
						spinnerFecha.getToolTipText()+" en "+comboBoxLugar.getSelectedItem().toString()+"."+"\n"+
						"\n"+"Primer puesto para "+comboBoxPuesto1.getSelectedItem().toString().split("\\|")[1]+
						" ("+comboBoxPuesto1.getSelectedItem().toString().split("\\|")[2]+"),"+" con un tiempo de "+temp1.toString()+"."+
						" Se le otorga el oro "+comboBoxOros.getSelectedItem().toString()+" de pureza "+comboBoxOros.getSelectedItem().toString()+"%.\n"+
						"\n"+"Segundo puesto para "+comboBoxPuesto2.getSelectedItem().toString().split("\\|")[1]+
						" ("+comboBoxPuesto2.getSelectedItem().toString().split("\\|")[2]+"),"+" con un tiempo de "+temp2.toString()+"."+
						" Se le otorga la plata "+comboBoxPlatas.getSelectedItem().toString()+" de pureza "+comboBoxPlatas.getSelectedItem().toString()+"%.\n"+
						"\n"+"Tercer puesto para "+comboBoxPuesto3.getSelectedItem().toString().split("\\|")[1]+
						" ("+comboBoxPuesto3.getSelectedItem().toString().split("\\|")[2]+"),"+" con un tiempo de "+temp3.toString()+"."+
						" Se le otorga el bronce "+comboBoxBronces.getSelectedItem().toString()+" de pureza "+comboBoxBronces.getSelectedItem().toString()+"%.\n"+
						"\n Resultado (idResultado)"+" cerrado a las "+LocalDateTime.now().format(formatter1)+" del dia "+LocalDateTime.now().format(formatter2);
				File archivo = new File ("resultado_prueba"+textField.getText()+".txt");
				try {
					FileWriter fr = new FileWriter(archivo);
					PrintWriter pw = new PrintWriter(fr);
					pw.print(impresion);
					System.out.println("Se ha impreso");
					fr.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(chckbxDefinitivo.isSelected()) {
					// Metodo para introducir en la base de datos el resultado
				}
			}
		});

	}
}
