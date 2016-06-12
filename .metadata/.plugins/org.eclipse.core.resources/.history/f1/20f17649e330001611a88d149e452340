package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class TempoView {
	
	private JFrame frame;
	static public boolean huboClick = false;
	static public TempoController controler;
	static public TempoModelInterface model;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempoView window = new TempoView(controler,model);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public TempoView(TempoController controler, TempoModelInterface model) {
		this.controler = controler;
		this.model  = model;
		initialize();
	
	
	
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
private void initialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		final JTextPane txtpnElProblemaConsiste= new JTextPane();
		txtpnElProblemaConsiste.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtpnElProblemaConsiste.setForeground(Color.BLACK);
		txtpnElProblemaConsiste.setBackground(SystemColor.control);;
		final JButton btnNewButton = new JButton("Pregunta 1");
		

		btnNewButton.setBounds(36, 43, 132, 48);
		frame.getContentPane().add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Pregunta 2");
		btnNewButton_1.setBounds(306, 43, 147, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Pregunta 3");
		btnNewButton_2.setBounds(36, 187, 132, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("Pregunta 4");
		btnNewButton_3.setBounds(306, 187, 147, 48);
		frame.getContentPane().add(btnNewButton_3);
		
		
		txtpnElProblemaConsiste.setVisible(false);
		txtpnElProblemaConsiste.setText("El problema consiste en un hombre ciego, que debe tomar tres pastillas de distinto color por dia para vivr, estas son exactamente iguales al tacto y al olfato. El hombre tiene guardadas sus pantillas en frascos de 6, donde hay dos de cada color. \u00BFComo hace para no morir?");
		txtpnElProblemaConsiste.setBounds(116, 91, 271, 144);
		frame.getContentPane().add(txtpnElProblemaConsiste);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controler.mostrar(1);
				
				
		        }
		     	
			
		      
			
		});
	}
	public void desaparece (JButton boton1,JButton boton2,JButton boton3,JButton boton4){
		boton1.setVisible(false);
		boton2.setVisible(false);
		boton3.setVisible(false);
		boton4.setVisible(false);
		
	}
	
	public void setInvisible(boolean bool){
		this.frame.setVisible(bool);
	}

	
}
