package ConvertidorMonena;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class ConvertidorMoneda extends JFrame {

	private JPanel contentPane;
	private final static Monedas[] opciones = Monedas.values();
	private JTextField txtMonedaOrigen;
	private JTextField txtMonedaDestino;
	private JTextField txtCantidad;
	private JTextField txtCantidad2; 
	private JTextField txtResultado2;
	private ButtonGroup grupo;
	private JLabel lblMonedaOrigen;
	private JLabel lblMonedaConvertir;
	private JLabel lblCantidad;
	private JLabel lblUnidadConversion;
	private JLabel lblCantidad2;
	private JList<Monedas> list;
	private JButton btnAgregar1;
	private JButton btnAgregar2;
	private JButton btnConvertir;
	private JRadioButton rdbtnFarenheit;
	private JRadioButton rdbtnCelsius;
	private JTextField txtResultado;
	private JButton btnLimpiar;
	private JButton btnConvertir2;
	private JLabel lblEtiqueta;
	private JLabel lblImagen;

	public static void main(String[] args) throws Exception{		
		for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	        if ("Nimbus".equals(info.getName())) {
	            UIManager.setLookAndFeel(info.getClassName());
	            break;
	        }
	    }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvertidorMoneda frame = new ConvertidorMoneda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ConvertidorMoneda() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 list = new JList<Monedas>(opciones);
		list.setBounds(30, 71, 79, 124);
		contentPane.add(list);
		
		lblMonedaOrigen = new JLabel("Moneda origen");
		lblMonedaOrigen.setBounds(143, 76, 96, 17);
		contentPane.add(lblMonedaOrigen);
		 
		txtMonedaOrigen = new JTextField();
		txtMonedaOrigen.setBounds(271, 73, 120, 23);
		contentPane.add(txtMonedaOrigen);
		txtMonedaOrigen.setColumns(10);
		
		btnAgregar1 = new JButton("Agregar");
		btnAgregar1.setBounds(406, 73, 89, 23);
		contentPane.add(btnAgregar1);
		
		lblMonedaConvertir = new JLabel("Moneda a convertir");
		lblMonedaConvertir.setBounds(141, 104, 120, 17);
		contentPane.add(lblMonedaConvertir);
		
		txtMonedaDestino = new JTextField();
		txtMonedaDestino.setBounds(271, 107, 120, 22);
		contentPane.add(txtMonedaDestino);
		txtMonedaDestino.setColumns(10);
		
		btnAgregar2 = new JButton("Agregar");
		btnAgregar2.setBounds(406, 107, 89, 23);
		contentPane.add(btnAgregar2);
		
		lblCantidad = new JLabel("Ingrese cantidad");
		lblCantidad.setBounds(143, 141, 96, 20);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(271, 140, 86, 23);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(406, 140, 89, 23);
		contentPane.add(btnConvertir);				
		
		rdbtnFarenheit = new JRadioButton("Farenheit", true);
		rdbtnFarenheit.setBounds(207, 218, 79, 23);
		contentPane.add(rdbtnFarenheit);
		
		rdbtnCelsius = new JRadioButton("Cesius");
		rdbtnCelsius.setBounds(305, 218, 79, 23);
		contentPane.add(rdbtnCelsius);
		
		grupo = new ButtonGroup();
		grupo.add(rdbtnFarenheit);
		grupo.add(rdbtnCelsius);
		
		lblUnidadConversion = new JLabel("Indique Unidad de conversion");
		lblUnidadConversion.setBounds(30, 220, 171, 19);
		contentPane.add(lblUnidadConversion);
		
		lblCantidad2 = new JLabel("Indique cantidad ");
		lblCantidad2.setBounds(32, 253, 109, 17);
		contentPane.add(lblCantidad2);
		
		txtCantidad2 = new JTextField();
		txtCantidad2.setBounds(189, 250, 72, 23);
		contentPane.add(txtCantidad2);
		txtCantidad2.setColumns(10);
		
		txtResultado2 = new JTextField();
		txtResultado2.setBounds(378, 250, 86, 23);
		contentPane.add(txtResultado2);
		txtResultado2.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(203, 174, 154, 23);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(406, 174, 89, 23);
		contentPane.add(btnLimpiar);
		
		btnConvertir2 = new JButton("Convertir");
		btnConvertir2.setBounds(271, 250, 89, 23);
		contentPane.add(btnConvertir2);
		
		lblEtiqueta = new JLabel("Challenge ONE Back End - G5");
		lblEtiqueta.setFont(new Font("Serif", Font.BOLD, 20));
		lblEtiqueta.setBounds(120, 0, 271, 51);
		contentPane.add(lblEtiqueta);
		
		Icon bandera = new ImageIcon("");
		
		lblImagen = new JLabel(bandera);
		lblImagen.setBounds(193, 181, 46, 14);
		contentPane.add(lblImagen);
		
		JLabel lblNewLabel = new JLabel("Marco Uriel Carrasco Hernández");
		lblNewLabel.setBounds(30, 304, 201, 17);
		contentPane.add(lblNewLabel);
		int indice = list.getSelectedIndex();
		
		btnAgregar1.addActionListener(new Manejador() );
		btnAgregar2.addActionListener(new Manejador()); 
		btnConvertir.addActionListener(new Manejador());
		btnLimpiar.addActionListener(new Manejador());
		btnConvertir2.addActionListener(new Manejador2());		
		
		
	}
	
	class Manejador implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int indice = list.getSelectedIndex();
			if(indice >= 0) {
				if(e.getSource() == btnAgregar1)					
					txtMonedaOrigen.setText(list.getSelectedValue().toString());							
				if(e.getSource() == btnAgregar2) { 					
						txtMonedaDestino.setText(list.getSelectedValue().toString());
						txtCantidad.requestFocusInWindow();
				}
			}				
						
			else
				JOptionPane.showMessageDialog(rootPane, "No ha seleccionado una moneda");	
			
			if(e.getSource() == btnLimpiar) {
				txtMonedaOrigen.setText("");
				txtMonedaDestino.setText("");
				txtCantidad.setText("");
				txtResultado.setText("");
			}
			if(e.getSource() == btnConvertir) {
				if(txtMonedaOrigen.getText().equals(txtMonedaDestino.getText())) {
					JOptionPane.showMessageDialog(rootPane, "Las monedas deben ser distintas");
					txtMonedaDestino.setText("");
					txtMonedaDestino.requestFocusInWindow();
					return;
				}					
				if(txtCantidad.getText().equals("")) {
					JOptionPane.showMessageDialog(rootPane, "Debe ingresar cantidad");
					txtCantidad.requestFocusInWindow();
					return;
				}
				if(Integer.parseInt(txtCantidad.getText()) == 0) {
					JOptionPane.showMessageDialog(rootPane, "La cantidad no debe ser  0");
					txtCantidad.setText("");
					txtResultado.setText("");
					txtCantidad.requestFocusInWindow();
					return;
				}
				if(Integer.parseInt(txtCantidad.getText()) < 0) {
					JOptionPane.showMessageDialog(rootPane, "La cantidad no debe ser menor a cero ");
					txtCantidad.setText("");
					txtResultado.setText(""); 
					txtCantidad.requestFocusInWindow();
					return;
				}					
				Convertidor convertidor = new Convertidor(
						txtMonedaOrigen.getText(),
						txtMonedaDestino.getText(),
						Double.parseDouble(txtCantidad.getText()));
				
				String resultado =  convertidor.convertirMonedas();
				txtResultado.setText( resultado);
				//bandera = new ImageIcon();
			}
		
				
		}		
	}
	class Manejador2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {			
			double resultado;
			if(txtCantidad2.getText().equals("")) {
				JOptionPane.showMessageDialog(rootPane, "Debe ingresar cantidad"); 
				txtCantidad2.requestFocusInWindow();
			}else {
				if( rdbtnFarenheit.isSelected()) {
					resultado = (Double.parseDouble(txtCantidad2.getText()) - 32) / 1.8;
					txtResultado2.setText(String.format("%.2f", resultado));
				}
				if(rdbtnCelsius.isSelected()) {
					resultado =(Double.parseDouble(txtCantidad2.getText()) * 1.8)  + 32 ;
					txtResultado2.setText(String.format("%.2f", resultado));
				}
			}
		}		
	}	
}
