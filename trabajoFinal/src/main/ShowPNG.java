package main;

import java.awt.*;  
import javax.swing.*;  

@SuppressWarnings("serial") 
public class ShowPNG extends JFrame {   

  public ShowPNG(String argx) { 
    
     argx = "/main/resources/Images/LOGO_ORGINAL.png";

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 this.setSize(500,640);
    JPanel panel = new JPanel();  
    //panel.setSize(500,640);
    panel.setBackground(Color.CYAN);  
    ImageIcon icon = new ImageIcon(argx);  
    JLabel label = new JLabel();  
    label.setIcon(icon);  
    panel.add(label); 
    this.getContentPane().add(panel);    
  } 

  public static void main(String[] args) { 
      new ShowPNG(args.length == 0 ? null : args[0]).setVisible(true);
  } 

}