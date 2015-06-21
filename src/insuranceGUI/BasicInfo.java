package insuranceGUI;

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
	
	public BasicInfo() {
		basic();
	}
	
	public void basic() {
		backGround = new JPanel(new GridBagLayout());
		backGround.setBackground(color);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		firstName = new JTextField("First Name");
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.weightx = 0.45;
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
		c.ipadx = 100;
		c.gridx = 1;
		c.gridy = 0;
		backGround.add(middleName, c);
		
		lastName = new JTextField("Last Name");
		c.insets = new Insets(40,0,0,20); 
		c.weightx = 0.45;
		c.ipadx = 400;
		c.gridx = 2;
		c.gridy = 0;
		backGround.add(lastName, c);
		
		suffix = new JTextField("Suffix");

		c.insets = new Insets(40,0,0,20); 
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
		c.gridwidth = 1;
		c.insets = new Insets(0,35,50,20);
		backGround.add(age, c);
		
		mm = new JTextField("age");
		c.gridx = 1;
		c.gridy = 4;
		c.insets = new Insets(0,20,50,80);
		backGround.add(mm, c);
		
		/*dd = new JTextField("dd");
		c.gridx = 2;
		c.gridy = 4;
		c.insets = new Insets(0,0,50,70);
		backGround.add(dd, c);
		
		yyyy = new JTextField("yyyy");
		c.gridx = 3;
		c.gridy = 4;
		c.insets = new Insets(0,00,50,20);
		backGround.add(yyyy, c);*/
		
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
		//fontSetJT(dd);
		//fontSetJT(yyyy);
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
		setVisible(false);
		new Vehicles();
		BasicInfoModel bif= new BasicInfoModel();
		bif.setFirstName(firstName.getText());
		bif.setMiddleName(middleName.getText()); 
		bif.setLastName(lastName.getText());
		bif.setSuffix(suffix.getText()); 
		//String email = mailing.getText();
		bif.setMaApt(apt.getText());
		bif.setState((String)state.getSelectedItem()); 
		try {
			bif.setAge(Integer.parseInt(mm.getText()));
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MyValidationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
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
