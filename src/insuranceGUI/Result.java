package insuranceGUI;

import insuranceController.Controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.*;

public class Result extends JFrame{
	
	private JPanel backGround;
	private JLabel text;
	private Color color = new Color(170, 202, 255);
	private Controller controller;
	private JTextArea outputTextArea;
	
	public Result(Controller controller) {
		this.controller = controller;
		backGround = new JPanel(new BorderLayout());
		text = new JLabel("Insurance Solution for personal automoblie use");
		outputTextArea = new JTextArea();
		
		text.setFont(new Font("Arial", Font.BOLD, 26));
		add(backGround);
		backGround.setBackground(color);
		setSize(1000, 800);
		
		backGround.add(text, BorderLayout.NORTH);
		backGround.add(outputTextArea);
		setVisible(true);
	}

}
