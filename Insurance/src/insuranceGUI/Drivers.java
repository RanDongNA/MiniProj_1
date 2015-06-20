package insuranceGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;


public class Drivers extends JFrame{

	private JPanel backGround;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private JLabel maritalL;
	private JTextField marital;
	private JLabel educationL;
	private JComboBox<String> education;
	private JLabel employmentL;
	private JTextField employment;
	private JLabel ssnL;
	private JTextField ssn;
	private JLabel primaryResidenceL;
	private JTextField primaryResidence;
	private JLabel licenseL;
	private JTextField license;
	private JLabel yearL;
	private JTextField year;
	private JLabel damage;
	private JRadioButton damageY;
	private JRadioButton damageN;
	private JLabel ticket;
	private JRadioButton ticketY;
	private JRadioButton ticketN;
	JButton button1;
	Color color = new Color(170, 202, 255);
	
	public Drivers(){
		DriverInfo();
	}
	
	public void DriverInfo(){
		backGround = new JPanel(new GridBagLayout());
		backGround.setBackground(color);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		gender = new JLabel("Gender");
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.weightx = 0.5;
		c.weighty = 0.5;
		c.insets = new Insets(10,20,0,40); 
		c.ipady = 20;
		c.gridx = 0;
		c.gridy = 0;
		backGround.add(gender, c);
		
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		ButtonGroup bp1 = new ButtonGroup();
		bp1.add(male);
		bp1.add(female);
		male.setSelected(true);
		c.weightx = 1;
		c.gridx = 1;
		c.gridy = 0;
		backGround.add(male, c);
		c.gridx = 2;
		c.gridy = 0;
		backGround.add(female, c);
		
		maritalL = new JLabel("Marital Status");
		c.gridx = 0;
		c.gridy = 1;
		backGround.add(maritalL, c);
		
		marital = new JTextField();
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 2;
		backGround.add(marital, c);
		
		educationL = new JLabel("Education");
		c.gridx = 0;
		c.gridy = 2;
		backGround.add(educationL, c);
		
		String[] educationList = new String[]{"Come on, seriously?!", "High School", "Bachelor", "Master", "PHD"};
		education = new JComboBox<String>(educationList);
		c.gridx = 1;
		c.gridy = 2;
		backGround.add(education, c);

		employmentL = new JLabel("Employment Status");
		c.gridx = 0;
		c.gridy = 3;
		backGround.add(employmentL, c);
		
		employment = new JTextField();
		c.gridx = 1;
		c.gridy = 3;
		backGround.add(employment, c);
		
		ssnL = new JLabel("SSN");
		c.gridx = 0;
		c.gridy = 4;
		backGround.add(ssnL, c);
		
		ssn = new JTextField();
		c.gridx = 1;
		c.gridy = 4;
		backGround.add(ssn, c);
		
		primaryResidenceL = new JLabel("Primary Residence");
		c.gridx = 0;
		c.gridy = 5;
		backGround.add(primaryResidenceL, c);
		
		primaryResidence = new JTextField();
		c.gridx = 1;
		c.gridy = 5;
		backGround.add(primaryResidence, c);
		
		licenseL = new JLabel("US License Status");
		c.gridx = 0;
		c.gridy = 6;
		backGround.add(licenseL, c);
		
		license = new JTextField();
		c.gridx = 1;
		c.gridy = 6;
		backGround.add(license, c);
		
		yearL = new JLabel("Years Licensed");
		c.gridx = 0;
		c.gridy = 7;
		backGround.add(yearL, c);
		
		year = new JTextField();
		c.gridx = 1;
		c.gridy = 7;
		backGround.add(year, c);

		damage = new JLabel("Accidents, claims, damage");
		c.gridx = 0;
		c.gridy = 8;
		backGround.add(damage, c);
		
		damageY = new JRadioButton("Yes");
		damageN = new JRadioButton("No");
		ButtonGroup bp2 = new ButtonGroup();
		bp2.add(damageY);
		bp2.add(damageN);
		damageY.setSelected(true);
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 8;
		backGround.add(damageY, c);
		c.gridx = 2;
		c.gridy = 8;
		backGround.add(damageN, c);
		
		ticket = new JLabel("Tickets or Violations");
		c.gridx = 0;
		c.gridy = 9;
		backGround.add(ticket, c);
		
		ticketY = new JRadioButton("Yes");
		ticketN = new JRadioButton("No");
		ButtonGroup bp3 = new ButtonGroup();
		bp3.add(ticketY);
		bp3.add(ticketN);
		ticketY.setSelected(true);
		c.gridx = 1;
		c.gridy = 9;
		backGround.add(ticketY, c);
		c.gridx = 2;
		c.gridy = 9;
		backGround.add(ticketN, c);
		
		button1 = new JButton("Save and continue");
		c.gridx = 1;
		c.gridy = 10;
		c.insets = new Insets(10,20,0,200); 
		backGround.add(button1, c);
		
		fontSetJL(gender);
		fontSetJL(maritalL);
		fontSetJT(marital);
		fontSetJL(educationL);
		fontSetJL(employmentL);
		fontSetJT(employment);
		fontSetJL(ssnL);
		fontSetJT(ssn);
		fontSetJL(primaryResidenceL);
		fontSetJT(primaryResidence);
		fontSetJL(licenseL);
		fontSetJT(license);
		fontSetJL(yearL);
		fontSetJT(year);
		fontSetJL(damage);
		fontSetJL(ticket);
		
		education.setFont(new Font("Arial", Font.BOLD, 20));
		male.setBackground(color);
		male.setFont(new Font("Arial", Font.BOLD, 20));
		female.setBackground(color);
		female.setFont(new Font("Arial", Font.BOLD, 20));
		damageY.setBackground(color);
		damageY.setFont(new Font("Arial", Font.BOLD, 20));
		damageN.setBackground(color);
		damageN.setFont(new Font("Arial", Font.BOLD, 20));
		ticketY.setBackground(color);
		ticketY.setFont(new Font("Arial", Font.BOLD, 20));
		ticketN.setBackground(color);
		ticketN.setFont(new Font("Arial", Font.BOLD, 20));
		button1.setFont(new Font("Arial", Font.BOLD, 20));
		button1.setHorizontalAlignment(JLabel.CENTER);
		
		add(backGround);
		setSize(1000, 800);
		setVisible(true);
	}
	
	public void fontSetJT(JTextField jt) {
		jt.setFont(new Font("Arial", Font.BOLD, 18));
		jt.setHorizontalAlignment(JLabel.CENTER);
	}
	
	public void fontSetJL(JLabel jl) {
		jl.setFont(new Font("Arial", Font.BOLD, 18));
	}

}
