package Clc;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


	class Panel extends JPanel {
		private JButton display;
		private JPanel panel;
		private double result;
		private String lastCommand;
		private boolean start;
		
		public int i=0;
		
		
		
		public Panel() {
			setLayout(new BorderLayout());
	 
			
			result = 0;
			lastCommand = "=";			
			start=true;
	 
			display = new JButton("0");
			display.setEnabled(false);
			add(display, BorderLayout.NORTH);
	 
			ActionListener insert = new InsertAction();
			ActionListener command = new CommandAction();
	 
			panel = new JPanel();
			panel.setLayout(new GridLayout(4, 4));
	 
			addButton("7", insert);
			addButton("8", insert);
			addButton("9", insert);
			addButton("/", command);
	 
			addButton("4", insert);
			addButton("5", insert);
			addButton("6", insert);
			addButton("*", command);
	 
			addButton("1", insert);
			addButton("2", insert);
			addButton("3", insert);
			addButton("-", command);
	 
			addButton("0", insert);
			addButton(".", insert);
			addButton("=", command);
			addButton("+", command);
	 
			add(panel, BorderLayout.CENTER);
		}
		private void addButton(String label, ActionListener listener) {
			JButton button = new JButton(label);
			button.addActionListener(listener);
			panel.add(button);
		}
		private class InsertAction implements ActionListener 
		{
			public void actionPerformed(ActionEvent event) 
			{
				String input = event.getActionCommand();
				if(start==true) {
					display.setText("");
					start = false;
				}
				display.setText(display.getText() + input);
				
			}
		}
		private class CommandAction implements ActionListener 
		{
			public void actionPerformed(ActionEvent event) 
			{
				String command = event.getActionCommand();
				
				if(start==true) 
				{
					if(command.equals("-")) 
					{
						display.setText(command);
						start = false;
					}
					else lastCommand = command;
				}
				else 
				{
					calculate(Double.parseDouble(display.getText()));
					lastCommand = command;
					start=true;
					
				}
			}	
		}
		public void calculate(double x)
		{
			Cashe ch = new Cashe();	
			switch (lastCommand)
			
			{
			case "+": result +=x; break;
			case "-": result -=x;break;
			case "*": result *=x; break;
			case "/": result /=x; break;
			case "=": result = x; break;
			}
			
			display.setText("" + result);										
			ch.file(lastCommand+x);
			//if (i>2) {
				//ch.file("="+result);
				//ch.file("\n");
			//}
			
		}
		
		
	}
	

