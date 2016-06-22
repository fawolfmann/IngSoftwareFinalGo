package main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class Logo implements Runnable  {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public Logo(){

	}

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	
	public JFrame getFrame(){
		return frame;
	}
	public void initialize() {
		frame = new JFrame("Logo");
		frame.setTitle("");
		frame.setResizable(false);
		frame.setMaximumSize(new Dimension(1320, 2415));
		frame.setBounds(250, 100, 850, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		/*JLabel lblSeleccionadorDeModelo = new JLabel("Seleccionador de modelo");
		lblSeleccionadorDeModelo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeleccionadorDeModelo.setBounds(100, 11, 231, 29);
		frame.getContentPane().add(lblSeleccionadorDeModelo);*/
		//ImageIcon icon = new ImageIcon("/main/resources/Images/logo_reducido.png"); 
		JLabel label = new JLabel(new ImageIcon(Logo.class.getResource("/main/resources/Images/logo_reducido.png")));
		label.setBounds(10, 19, 815, 440);
		frame.getContentPane().add(label);
	}

	public void desaparecer(){
		frame.setVisible(false);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
		TimeUnit.SECONDS.sleep(2);
		desaparecer();
		}
		catch(Exception e ){
			
		}
		
	
		
		

	}



}


