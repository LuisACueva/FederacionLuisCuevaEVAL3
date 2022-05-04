package GUI;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class PanelTiempo extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtEjemploDeColegiado;
	private JTextField txtEjemploDeAtleta;

	/**
	 * Create the panel.
	 */
	public PanelTiempo() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(200, 262, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Horas");
		lblNewLabel.setBounds(154, 265, 28, 14);
		add(lblNewLabel);
		
		JLabel lblMinutos = new JLabel("Minutos");
		lblMinutos.setBounds(144, 298, 37, 14);
		add(lblMinutos);
		
		JLabel lblSegundos = new JLabel("Segundos");
		lblSegundos.setBounds(136, 337, 54, 14);
		add(lblSegundos);
		
		JLabel lblCentesimas = new JLabel("Centesimas");
		lblCentesimas.setBounds(129, 375, 61, 14);
		add(lblCentesimas);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(200, 295, 86, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(200, 334, 86, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(200, 372, 86, 20);
		add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("Introduzca el tiempo de la Prueba");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(75, 54, 475, 82);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(200, 427, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(328, 427, 89, 23);
		add(btnNewButton_1);
		
		txtEjemploDeColegiado = new JTextField();
		txtEjemploDeColegiado.setText("Ejemplo de colegiado");
		txtEjemploDeColegiado.setEditable(false);
		txtEjemploDeColegiado.setBounds(200, 151, 169, 20);
		add(txtEjemploDeColegiado);
		txtEjemploDeColegiado.setColumns(10);
		
		txtEjemploDeAtleta = new JTextField();
		txtEjemploDeAtleta.setText("Ejemplo de atleta");
		txtEjemploDeAtleta.setEditable(false);
		txtEjemploDeAtleta.setColumns(10);
		txtEjemploDeAtleta.setBounds(200, 182, 169, 20);
		add(txtEjemploDeAtleta);
		
		JLabel lblNewLabel_2 = new JLabel("Colegiado");
		lblNewLabel_2.setBounds(128, 154, 54, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Atleta");
		lblNewLabel_3.setBounds(145, 185, 37, 14);
		add(lblNewLabel_3);

	}
}
