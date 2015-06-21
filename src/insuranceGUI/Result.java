package insuranceGUI;

import insuranceController.Controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Result extends JFrame implements ActionListener{
	
	private JPanel backGround;
	private JButton display;
	private Color color = new Color(170, 202, 255);
	private Controller controller;
	private JTextArea outputTextArea;

	
	public Result(Controller controller) {
		this.controller = controller;
		backGround = new JPanel(new BorderLayout());
		display = new JButton("Display Insurance Solution for personal automoblie use");
		outputTextArea = new JTextArea();
		
		display.setFont(new Font("Arial", Font.BOLD, 26));
		add(backGround);
		backGround.setBackground(color);
		setSize(1000, 800);
		
		backGround.add(display, BorderLayout.NORTH);
		backGround.add(outputTextArea);
		display.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
