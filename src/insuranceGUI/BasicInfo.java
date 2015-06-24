package insuranceGUI;

import insuranceController.Controller;
import insuranceModel.BasicInfoModel;
import insuranceModel.MyValidationException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.MatteBorder;

public class BasicInfo extends JFrame implements ActionListener{
	private JPanel backGround;
	private JTextField firstName;
	private JTextField middleName;
	private JTextField lastName;
	private JTextField suffix;
	private JTextField mailing;
	private JTextField apt;
	private JComboBox<String> state;
	private JTextField city;
	private JTextField postCode;
	private JCheckBox sMailing;
	private JLabel age;
	private JTextField mm;
	private JButton button1;
	private Color color = new Color(170, 202, 255);
	private Controller controller;
//	private JTextField dd;
//	private JTextField yyyy;
	
	public BasicInfo(){
		basic();
	    controller = new Controller();
	}
	
	public void basic() {
		backGround = new JPanel(new GridBagLayout());
		backGround.setBackground(color);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		firstName = new JTextField("First Name");
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.weightx = 1.1;
		c.weighty = 0.5;
		c.insets = new Insets(40,20,0,0); 
		c.ipadx = 400;
		c.ipady = 45;
		c.gridx = 0;
		c.gridy = 0;
		backGround.add(firstName, c);
		
		middleName = new JTextField("Middle Name");
		c.insets = new Insets(40,20,0,20); 
		c.weightx = 0.6;
		c.ipadx = 500;
		c.gridx = 1;
		c.gridy = 0;
		backGround.add(middleName, c);
		
		lastName = new JTextField("Last Name");
		c.insets = new Insets(40,0,0,20); 
		c.weightx = 0.4;
		c.ipadx = 400;
		c.gridx = 2;
		c.gridy = 0;
		backGround.add(lastName, c);
		
		suffix = new JTextField("Suffix");

		c.insets = new Insets(40,0,0,20);
		c.weightx = 1;
		c.gridx = 3;
		c.gridy = 0;
		backGround.add(suffix, c);
		
		mailing = new JTextField("Mailing Address");
		c.weightx = 1.5;
		c.insets = new Insets(40,20,0,20);
		c.ipadx = 800;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 3;
		backGround.add(mailing, c);
		
		apt = new JTextField("APT");
		c.insets = new Insets(40,0,0,20);
		c.weightx = 0.3;
		c.gridx = 3;
		c.gridy = 1;
		c.gridwidth = 1;
		backGround.add(apt, c);
		
		String[] stateList = new String[]{"  AL", "  AK", "  AZ", "  AR", "  CA", "  CO", "  CT", "  DE", "  FL", "  GA", "  HI", "  ID", "  IL", "  IN", "  IA", "  KS", "  KY", "  LA", "  ME", "  MD", "  MA", "  MI", "  MN", "  MS", "  MO", "  MT", "  NE", "  NV", "  NH", "  NJ", "  NM", "  NY", "  NC", "  ND", "  OH", "  OK", "  OR", "  PA", "  RI", "  SC", "  SD", "  TN", "  TX", "  UT", "  VT", "  VA", "  WA", "  WV", "  WI", "  WY"};
		stateList = new String[]{"  Alabama",
		"  Alaska",
		"  Arizona",
		"  Arkansas", 
		"  California", 
		"  Colorado",
		"  Connecticut", 
		"  Delaware", 
		"  Florida", 
		"  Georgia", 
		"  Hawaii", 
		"  Idaho", 
		"  Illinois",
		"  Indiana",
		"  Iowa", 
		"  Kansas", 
		"  Kentucky", 
		"  Louisiana", 
		"  Maine", 
		"  Maryland", 
		"  Massachusetts", 
		"  Michigan", 
		"  Minnesota", 
		"  Mississippi", 
		"  Missouri", 
		"  Montana",
		"  Nebraska", 
		"  Nevada", 
		"  New Hampshire", 
		"  New Jersey", 
		"  New Mexico", 
		"  New York", 
		"  North Carolina", 
		"  North Dakota", 
		"  Ohio", 
		"  Oklahoma", 
		"  Oregon", 
		"  Pennsylvania",
		"  Rhode Island",
		"  South Carolina", 
		"  South Dakota", 
		"  Tennessee",
		"  Texas", 
		"  Utah",
		"  Vermont", 
		"  Virginia", 
		"  Washington",
		"  Washington,D.C.",
		"  West Virginia",
		"  Wisconsin",
		"  Wyoming"};
		state = new JComboBox<String>(stateList);
		c.insets = new Insets(40,20,0,0);
		c.gridx = 0;
		c.gridy = 2;
		backGround.add(state, c);
		
		city = new JTextField("City");
		c.insets = new Insets(40,20,0,0);
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 2;
		backGround.add(city, c);
		
		postCode = new JTextField("XXXXX");
		c.insets = new Insets(40,20,0,20);
		c.gridx = 3;
		c.gridy = 2;
		backGround.add(postCode, c);
		
		sMailing = new JCheckBox("P.O.Box / Military Address");
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(30,20,20,20);
		backGround.add(sMailing, c);
		
		//birth = new JLabel("Date of Birth");
		age = new JLabel("Age");
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 2;
		c.insets = new Insets(0,35,50,20);
		backGround.add(age, c);
		
		mm = new JTextField("age");
		c.gridx = 1;
		c.gridy = 4;
		c.insets = new Insets(0,20,50,80);
		backGround.add(mm, c);
		
//		dd = new JTextField("dd");
//		c.gridx = 2;
//		c.gridy = 4;
//		c.insets = new Insets(0,0,50,70);
//		backGround.add(dd, c);
//		
//		yyyy = new JTextField("yyyy");
//		c.gridx = 3;
//		c.gridy = 4;
//		c.insets = new Insets(0,00,50,20);
//		backGround.add(yyyy, c);
		
		button1 = new JButton("Save and continue");
		c.gridx = 1;
		c.gridy = 5;
		c.insets = new Insets(0,20,30,20);
		backGround.add(button1, c);
		
		sMailing.setAlignmentY(JCheckBox.RIGHT_ALIGNMENT);
		sMailing.setBackground(color);
		sMailing.setFont(new Font("Arial", Font.BOLD, 20));
		sMailing.setSize(400, 120);

		fontSetJT(firstName);
		fontSetJT(middleName);
		fontSetJT(lastName);
		fontSetJT(suffix);
		fontSetJT(mailing);
		fontSetJT(apt);
		fontSetJT(city);
		fontSetJT(postCode);
		fontSetJT(mm);
//		fontSetJT(dd);
//		fontSetJT(yyyy);
		state.setFont(new Font("Arial", Font.BOLD, 20));
		age.setFont(new Font("Arial", Font.BOLD, 20));
		button1.setFont(new Font("Arial", Font.BOLD, 20));
		button1.setHorizontalAlignment(JLabel.CENTER);
		button1.addActionListener(this);
		
		add(backGround);
		setSize(1000, 800);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			controller.saveBasicInfo(
					// fn, mn, ln, suf
					firstName.getText(),middleName.getText(),lastName.getText(),suffix.getText(),
					// mailing-street, apt
					mailing.getText(),apt.getText(),
					// mailing-state, city, zip
					(String)state.getSelectedItem(), city.getText(), postCode.getText(),
					// mailing-isPOBox
					sMailing.isSelected(),
					// age
					Integer.parseInt(mm.getText()));
		} catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(this,e1.toString());
			//e1.printStackTrace();
			return;
		} catch (MyValidationException e1) {
			JOptionPane.showMessageDialog(this,e1.toString());
			e1.printStackTrace();
			return;
		}
		setVisible(false);
		new Vehicles(controller);
	}
	
	public void fontSetJT(JTextField jt) {
		jt.setFont(new Font("Arial", Font.BOLD, 18));
		jt.setHorizontalAlignment(JLabel.CENTER);
	}
	
	public void fontSetJL(JLabel jl) {
		jl.setFont(new Font("Arial", Font.BOLD, 18));
		jl.setHorizontalAlignment(JLabel.CENTER);
	}

	public static void main(String[] args) {
		new BasicInfo();
	}

}
