package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;
	boolean entroHeartTest;
	boolean entroDJTest;
	boolean entroTempoTest;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		entroHeartTest=false;
		entroDJTest=false;
		entroTempoTest=false;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblSeleccionadorDeModelo = new JLabel("Seleccionador de modelo");
		lblSeleccionadorDeModelo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeleccionadorDeModelo.setBounds(100, 11, 231, 29);
		frame.getContentPane().add(lblSeleccionadorDeModelo);

		JLabel lblSeleccioneElModelo = new JLabel("Seleccione el modelo que quiere utilizar");
		lblSeleccioneElModelo.setBounds(140, 121, 191, 14);
		frame.getContentPane().add(lblSeleccioneElModelo);

		JButton btnCorazon = new JButton("Corazon");
		btnCorazon.setBounds(22, 175, 89, 23);
		frame.getContentPane().add(btnCorazon);

		JButton btnPulso = new JButton("Pulso");
		btnPulso.setBounds(177, 175, 89, 23);
		frame.getContentPane().add(btnPulso);

		JButton btnNoEntrar = new JButton("No entrar");
		btnNoEntrar.setBounds(335, 175, 89, 23);
		frame.getContentPane().add(btnNoEntrar);

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
	}
}
