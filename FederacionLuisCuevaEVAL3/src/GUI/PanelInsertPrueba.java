package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;

import DAO.LugarDAO;
import DAO.PatrocinadorDAO;
import entidades.Lugar;
import entidades.Patrocinador;
import entidades.Prueba;
import utils.ConexBD;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelInsertPrueba extends JPanel {
	private JTextField txtNuevaId;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PanelInsertPrueba() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insertar Prueba");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(181, 59, 245, 71);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id Prueba");
		lblNewLabel_1.setBounds(144, 165, 46, 14);
		add(lblNewLabel_1);
		
		txtNuevaId = new JTextField();
		txtNuevaId.setEnabled(false);
		txtNuevaId.setText("nueva id");
		txtNuevaId.setEditable(false);
		txtNuevaId.setBounds(206, 162, 127, 20);
		add(txtNuevaId);
		txtNuevaId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de la Prueba");
		lblNewLabel_2.setBounds(81, 217, 109, 14);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(206, 214, 127, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de la Prueba (dd/mm/yyyy)");
		lblNewLabel_3.setBounds(27, 248, 163, 14);
		add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 245, 127, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Lugar de la Prueba");
		lblNewLabel_4.setBounds(99, 284, 91, 14);
		add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		LugarDAO lugarDao = new LugarDAO(ConexBD.establecerConexion());

		ArrayList<Lugar> listLugares = (ArrayList<Lugar>) lugarDao.buscarTodos();
 
		comboBox.setModel(new DefaultComboBoxModel(listLugares.toArray()));
		comboBox.setBounds(206, 280, 140, 22);
		add(comboBox);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Individual");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(119, 326, 71, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Por equipos");
		rdbtnNewRadioButton_1.setBounds(206, 326, 109, 23);
		add(rdbtnNewRadioButton_1);

		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Patrocinador");
		lblNewLabel_5.setBounds(119, 369, 71, 14);
		add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		PatrocinadorDAO patrocinadorDao = new PatrocinadorDAO(ConexBD.establecerConexion());

		ArrayList<Patrocinador> listPatrocinadores = (ArrayList<Patrocinador>) patrocinadorDao.buscarTodos();
		comboBox_1.setModel(new DefaultComboBoxModel(listPatrocinadores.toArray()));
		comboBox_1.setBounds(206, 365, 140, 22);
		add(comboBox_1);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba insertPrueba;
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(253, 417, 107, 41);
		add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar.setBounds(378, 417, 107, 41);
		add(btnCancelar);
		
	}
}
