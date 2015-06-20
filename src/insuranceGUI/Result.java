package insuranceGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Result extends JFrame{
	
	private JPanel backGround;
	private JLabel text;
	private Color color = new Color(170, 202, 255);
	
	public Result() {
		backGround = new JPanel(new BorderLayout());
		text = new JLabel("No egg use!!!No egg use!!!\nNo egg use!!!No egg use!!!\nNo egg use!!!No egg use!!!\nNo egg use!!!No egg use!!!\n");
		
		text.setFont(new Font("Arial", Font.BOLD, 26));
		add(backGround);
		backGround.setBackground(color);
		setSize(1000, 800);
		
		backGround.add(text, BorderLayout.CENTER);
		setVisible(true);
	}

}
