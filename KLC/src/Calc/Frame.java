package Calc;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
public Frame() {
		
		super("Super engeniring calc");
	   
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel panel = new Panel();
		add(panel);
		pack();
	}

}
