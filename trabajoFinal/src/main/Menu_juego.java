package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class Menu_juego {

	private static JFrame frame;
	boolean entroHeartTest;
	boolean entroDJTest;
	boolean entroTempoTest;
	boolean entroStrategyTest;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			
		
				
				try {
						
					
					Menu_juego window = new Menu_juego();
					window.frame.setVisible(true);
					
					JLabel lblSeleccionadorDeModelo = new JLabel("Seleccionador de modelo");
					lblSeleccionadorDeModelo.setFont(new Font("Tahoma", Font.PLAIN, 18));
					lblSeleccionadorDeModelo.setBounds(100, 11, 231, 29);
					frame.getContentPane().add(lblSeleccionadorDeModelo);
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu_juego() {
		entroHeartTest=false;
		entroDJTest=false;
		entroTempoTest=false;
		entroStrategyTest=false;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 271);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		/*JLabel lblSeleccionadorDeModelo = new JLabel("Seleccionador de modelo");
		lblSeleccionadorDeModelo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeleccionadorDeModelo.setBounds(100, 11, 231, 29);
		frame.getContentPane().add(lblSeleccionadorDeModelo);*/

		JLabel lblSeleccioneElModelo = new JLabel("Seleccione el modelo.");
		lblSeleccioneElModelo.setBounds(140, 121, 191, 14);
		frame.getContentPane().add(lblSeleccioneElModelo);

		JButton btnCorazon = new JButton("Corazon");
		btnCorazon.setBounds(74, 146, 89, 23);
		frame.getContentPane().add(btnCorazon);

		JButton btnPulso = new JButton("Pulso");
		btnPulso.setBounds(242, 146, 89, 23);
		frame.getContentPane().add(btnPulso);

		JButton btnNoEntrar = new JButton("Smart!");
		btnNoEntrar.setBounds(74, 191, 89, 23);
		frame.getContentPane().add(btnNoEntrar);
		
		JButton btnStrategy = new JButton("Strategy");
		btnStrategy.setBounds(242, 191, 89, 23);
		frame.getContentPane().add(btnStrategy);

		btnStrategy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!entroStrategyTest){
					Thread thread =new Thread(new StrategyTestDrive());
					thread.start();
					entroStrategyTest=true;
				}
			}
		});
		
		btnCorazon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!entroHeartTest){
					Thread thread =new Thread(new HeartTestDrive());
					thread.start();
					entroHeartTest=true;
				}
			}
		});
		btnPulso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!entroDJTest){
					Thread thread =new Thread(new DJTestDrive());
					thread.start();
					entroDJTest=true;
				}
			}
			
		});
		btnNoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!entroTempoTest){
					Thread thread =new Thread(new MyTempoTestDrive());
					thread.start();
					entroTempoTest=true;
				}
			}
			
		});
	}

	
}
