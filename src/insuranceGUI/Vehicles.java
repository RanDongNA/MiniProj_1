package insuranceGUI;

import insuranceModel.DriverInfoModel;
import insuranceModel.VehicleInfoModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Vehicles extends JFrame implements ActionListener{

	private JPanel backGround;
	private JTextField year;
	private JTextField make;
	private JTextField model;
	private JTextField bodyType;
	private JTextField primaryUse;
	private JLabel yearL;
	private JLabel makeL;
	private JLabel modelL;
	private JLabel bodyTypeL;
	private JLabel primaryUseL;
	private JLabel ownOrLease;
	private JLabel alarm;
	private JRadioButton own;
	private JRadioButton lease;
	private JRadioButton alarmYes;
	private JRadioButton alarmNo;
	private JButton button1;
	private ButtonGroup bp1;
	private ButtonGroup bp2;
	private Color color = new Color(170, 202, 255);
	
	public Vehicles(){
		vehicleInfo();
	}
	
	public void vehicleInfo(){
		backGround = new JPanel(new GridBagLayout());
		backGround.setBackground(color);
		GridBagConstraints c = new GridBagConstraints();
		
		yearL = new JLabel("Year");
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.weightx = 0.9;
		c.weighty = 0.5;
		c.insets = new Insets(10,20,0,40); 
		c.ipady = 25;
		c.gridx = 0;
		c.gridy = 0;
		backGround.add(yearL, c);
		
		year = new JTextField();
		c.weightx = 0.5;
		c.ipadx = 800;
		c.gridx = 1;
		c.gridy = 0;
		backGround.add(year, c);
		
		makeL = new JLabel("Make");
		c.gridx = 0;
		c.gridy = 1;
		backGround.add(makeL, c);
		
		make = new JTextField();
		c.gridx = 1;
		c.gridy = 1;
		backGround.add(make, c);
		
		modelL = new JLabel("Model");
		c.gridx = 0;
		c.gridy = 2;
		backGround.add(modelL, c);
		
		model = new JTextField();
		c.gridx = 1;
		c.gridy = 2;
		backGround.add(model, c);

		bodyTypeL = new JLabel("Body Type");
		c.gridx = 0;
		c.gridy = 3;
		backGround.add(bodyTypeL, c);
		
		bodyType = new JTextField();
		c.gridx = 1;
		c.gridy = 3;
		backGround.add(bodyType, c);
		
		primaryUseL = new JLabel("Primary Use");
		c.gridx = 0;
		c.gridy = 4;
		backGround.add(primaryUseL, c);
		
		primaryUse = new JTextField();
		c.gridx = 1;
		c.gridy = 4;
		backGround.add(primaryUse, c);
		
		ownOrLease = new JLabel("Own or Lease");
		c.gridx = 0;
		c.gridy = 5;
		backGround.add(ownOrLease, c);

		own = new JRadioButton("Own");
		lease = new JRadioButton("Lease");
	    bp1 = new ButtonGroup();
		bp1.add(own);
		bp1.add(lease);
		own.setSelected(true);
		c.gridx = 1;
		c.gridy = 5;
		backGround.add(own, c);
		c.gridx = 1;
		c.gridy = 6;
		backGround.add(lease, c);
		
		alarm = new JLabel("Passive alarm");
		c.gridx = 0;
		c.gridy = 7;
		backGround.add(alarm, c);
		
		alarmYes = new JRadioButton("Yes");
		alarmNo = new JRadioButton("No");
	    bp2 = new ButtonGroup();
		bp2.add(alarmYes);
		bp2.add(alarmNo);
		alarmYes.setSelected(true);
		c.gridx = 1;
		c.gridy = 7;
		backGround.add(alarmYes, c);
		c.gridx = 1;
		c.gridy = 8;
		backGround.add(alarmNo, c);
		
		button1 = new JButton("Save and continue");
		c.gridx = 1;
		c.gridy = 9;
		c.insets = new Insets(10,20,0,180); 
		backGround.add(button1, c);
		
		fontSetJT(year);
		fontSetJT(make);
		fontSetJT(model);
		fontSetJT(bodyType);
		fontSetJT(primaryUse);
		fontSetJL(yearL);
		fontSetJL(makeL);
		fontSetJL(modelL);
		fontSetJL(bodyTypeL);
		fontSetJL(primaryUseL);
		fontSetJL(ownOrLease);
		fontSetJL(alarm);
		
		own.setBackground(color);
		own.setFont(new Font("Arial", Font.BOLD, 20));
		lease.setBackground(color);
		lease.setFont(new Font("Arial", Font.BOLD, 20));
		alarmYes.setBackground(color);
		alarmYes.setFont(new Font("Arial", Font.BOLD, 20));
		alarmNo.setBackground(color);
		alarmNo.setFont(new Font("Arial", Font.BOLD, 20));
		button1.setFont(new Font("Arial", Font.BOLD, 20));
		button1.setHorizontalAlignment(JLabel.CENTER);
		button1.addActionListener(this);
		
		add(backGround);
		setSize(1000, 800);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Drivers();
		VehicleInfoModel vif = new VehicleInfoModel();
		vif.setBodyType(bodyType.getText());
		vif.setHasPassiveAlarm(bp2.getSelection().isSelected());
		vif.setIsLease(bp1.getSelection().isSelected());
		vif.setMake(make.getText());
		vif.setModel(model.getSelectedText());
		vif.setPrimaryUse(primaryUse.getSelectedText());
		vif.setYear(Integer.parseInt(year.getText()));
	}
	
	public void fontSetJT(JTextField jt) {
		jt.setFont(new Font("Arial", Font.BOLD, 18));
		jt.setHorizontalAlignment(JLabel.CENTER);
	}
	
	public void fontSetJL(JLabel jl) {
		jl.setFont(new Font("Arial", Font.BOLD, 18));
	}
}
