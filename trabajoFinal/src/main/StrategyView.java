package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StrategyView extends DJView{

	public StrategyView(ControllerInterface controller, BeatModelInterface model) {
		super(controller, model);
		createView();
		createControls();
		disableStopMenuItem();
		enableStartMenuItem();
		// TODO Auto-generated constructor stub
	}
	public void changeModel(BeatModelInterface model){
		this.model.removeObserver((BeatObserver)this);
		this.model.removeObserver((BPMObserver)this);
		this.model=model;
		this.model.registerObserver((BeatObserver)this);
		this.model.registerObserver((BPMObserver)this);

	}
	   public void createControls() {
			// Create all Swing components here
	        JFrame.setDefaultLookAndFeelDecorated(true);
	        controlFrame = new JFrame("Control");
	        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        controlFrame.setSize(new Dimension(100, 80));

	        controlPanel = new JPanel(new GridLayout(1, 2));

	        menuBar = new JMenuBar();
	        menu = new JMenu("DJ Control");   
	        
	        
	        
	        startMenuItem = new JMenuItem("Start");
	        menu.add(startMenuItem);
	        startMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	                controller.start();
	            }
	        });
	        stopMenuItem = new JMenuItem("Stop");
	        menu.add(stopMenuItem); 
	        stopMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	                controller.stop();
	            }
	        });
	        JMenuItem exit = new JMenuItem("Quit");
	        exit.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	                System.exit(0);
	            }
	        });
	        menu.add(exit);
	          
	        JMenuItem selectHeart = new JMenuItem("Heart Model");
	        selectHeart.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	                ((StrategyController)controller).changeModel("Heart");
	            }
	        });
	        JMenuItem selectDJ = new JMenuItem("DJ Model");
	        selectDJ.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	((StrategyController)controller).changeModel("DJ");
	            }
	        });
	        
	        JMenuItem selectSmart = new JMenuItem("Smart!");
	        selectSmart.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	((StrategyController)controller).changeModel("Smart");
	            }
	        });
	        
	        JMenu newMenu = new JMenu("Seleccionar Modelo");   
	        
	        newMenu.add(selectSmart);
	        newMenu.add(selectDJ);
	        newMenu.add(selectHeart);
	        menuBar.add(menu);
	        menuBar.add(newMenu);
	        controlFrame.setJMenuBar(menuBar);

	       

	        bpmTextField = new JTextField(2);
	        bpmLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);
	        setBPMButton = new JButton("Set");
	        setBPMButton.setSize(new Dimension(10,40));
	        increaseBPMButton = new JButton(">>");
	        decreaseBPMButton = new JButton("<<");
	        setBPMButton.addActionListener(this);
	        increaseBPMButton.addActionListener(this);
	        decreaseBPMButton.addActionListener(this);

	        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

			buttonPanel.add(decreaseBPMButton);
			buttonPanel.add(increaseBPMButton);

	        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
	        enterPanel.add(bpmLabel);
	        enterPanel.add(bpmTextField);
	        JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
	        insideControlPanel.add(enterPanel);
	        insideControlPanel.add(setBPMButton);
	        insideControlPanel.add(buttonPanel);
	        controlPanel.add(insideControlPanel);
	        
	        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

	        controlFrame.getRootPane().setDefaultButton(setBPMButton);
	        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

	        controlFrame.pack();
	        controlFrame.setVisible(true);
	    }
}
