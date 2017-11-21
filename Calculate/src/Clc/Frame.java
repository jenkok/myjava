package Clc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalculatorFrame extends JFrame {
	public CalculatorFrame() {
		
		super("Super engeniring calc");
	   
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel panel = new Panel();
		add(panel);
		pack();
	}
}

