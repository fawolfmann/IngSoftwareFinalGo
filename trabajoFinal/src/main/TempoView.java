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

public class TempoView implements TempoObserver{
	
	private JFrame frame;
	static public boolean huboClick = false;
	static public TempoController controler;
	static public TempoModelInterface model;
	final JTextPane txtpnElProblemaConsiste= new JTextPane();
	final JButton btnNewButton = new JButton("Pregunta 1");
	final JButton btnNewButton_1 = new JButton("Pregunta 2");
	final JButton btnNewButton_2 = new JButton("Pregunta 3");
	final JButton btnNewButton_3 = new JButton("Pregunta 4");
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
		model.registerObserver((TempoObserver)this);
		
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
		txtpnElProblemaConsiste.setEditable(false);
		
		txtpnElProblemaConsiste.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		txtpnElProblemaConsiste.setForeground(Color.BLACK);
		txtpnElProblemaConsiste.setBackground(SystemColor.control);;
		
	
		

		btnNewButton.setBounds(36, 43, 132, 48);
		frame.getContentPane().add(btnNewButton);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controler.mostrar(1);
			}
		});
		
	
		btnNewButton_1.setBounds(306, 43, 147, 48);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controler.mostrar(2);
			}
		});
		
		
		btnNewButton_2.setBounds(36, 187, 132, 48);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controler.mostrar(3);
			}
		});
		
		
		btnNewButton_3.setBounds(306, 187, 147, 48);
		frame.getContentPane().add(btnNewButton_3);
		
		
		txtpnElProblemaConsiste.setVisible(false);
		txtpnElProblemaConsiste.setBounds(36, 27, 417, 246);
		frame.getContentPane().add(txtpnElProblemaConsiste);
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controler.mostrar(0);
				
		        }
		     	
			
		      
			
		});
	}
	public void desaparece (){
		btnNewButton.setVisible(false);
		btnNewButton_1.setVisible(false);
		btnNewButton_2.setVisible(false);
		btnNewButton_3.setVisible(false);
		
	}
	
	public void setInvisible(boolean bool){
		this.frame.setVisible(bool);
	}

	@Override
	public void updateTempo(String a) {
		// TODO Auto-generated method stub
		ponerPregunta(a);
		
	}
	public void ponerPregunta(String pregunta){
		
		txtpnElProblemaConsiste.setText(pregunta);
		txtpnElProblemaConsiste.setVisible(true);
		desaparece();
	}

	public void restart(){
		
		btnNewButton.setVisible(true);
		btnNewButton_1.setVisible(true);
		btnNewButton_2.setVisible(true);
		btnNewButton_3.setVisible(true);
		txtpnElProblemaConsiste.setVisible(false);
		
	}
	
}
