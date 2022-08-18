package com.scahill2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Swingbasics {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JLabel lblradiolabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swingbasics window = new Swingbasics();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class RadioListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton btnclicked = (JRadioButton)e.getSource();
			lblradiolabel.setText(btnclicked.getText());
		}
		
	}

	/**
	 * Create the application.
	 */
	public Swingbasics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		textField = new JTextField();
		textField.setBounds(55, 67, 116, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblName.setBounds(10, 70, 45, 13);
		frame.getContentPane().add(lblName);
		
		JLabel lblempty = new JLabel("");
		lblempty.setBounds(26, 196, 376, 13);
		frame.getContentPane().add(lblempty);
		
		JButton btnTextChanged = new JButton("Text \nChanged");
		btnTextChanged.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnTextChanged.setBounds(172, 66, 116, 35);
		frame.getContentPane().add(btnTextChanged);
		btnTextChanged.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblempty.setText("Hi "+textField.getText());
			}
		});
		

		JLabel lbloffonlabel = new JLabel("off");
		lbloffonlabel.setBounds(49, 157, 45, 13);
		frame.getContentPane().add(lbloffonlabel);
		
		JCheckBox chckbxonoff = new JCheckBox("toggle on/off");
		chckbxonoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = (chckbxonoff.isSelected()) ? "on":"off";
				lbloffonlabel.setText(text);
			}
		});
		chckbxonoff.setBounds(39, 130, 93, 21);
		frame.getContentPane().add(chckbxonoff);
		
		RadioListener listener = new RadioListener();
		
		JRadioButton rdbtnRadio1 = new JRadioButton("radio1");
		buttonGroup.add(rdbtnRadio1);
		rdbtnRadio1.setBounds(299, 51, 103, 21);
		frame.getContentPane().add(rdbtnRadio1);
		rdbtnRadio1.addActionListener(listener);
		
		JRadioButton rdbtnRadio2 = new JRadioButton("radio2");
		buttonGroup.add(rdbtnRadio2);
		rdbtnRadio2.setBounds(299, 70, 103, 21);
		frame.getContentPane().add(rdbtnRadio2);
		rdbtnRadio2.addActionListener(listener);
		
		JRadioButton rdbtnRadio3 = new JRadioButton("radio3");
		buttonGroup.add(rdbtnRadio3);
		rdbtnRadio3.setBounds(299, 93, 103, 21);
		frame.getContentPane().add(rdbtnRadio3);
		rdbtnRadio3.addActionListener(listener);
		
		lblradiolabel.setBounds(299, 120, 93, 13);
		frame.getContentPane().add(lblradiolabel);
		
		
		
//		JButton btnCreatelabel = new JButton("Create Label");
//		btnCreatelabel.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JLabel lblCreate = new JLabel("Create label");
//				lblCreate.setBounds(124, 240, 79, 13);
//				frame.getContentPane().add(lblCreate);
//				frame.revalidate();
//				frame.repaint();
//			}
//		});
//		btnCreatelabel.setBounds(10, 236, 104, 21);
//		frame.getContentPane().add(btnCreatelabel);
		JLabel lblCreate = new JLabel("Create label");
		lblCreate.setBounds(124, 240, 79, 13);
		frame.getContentPane().add(lblCreate);
		
		JButton btndeletelabel = new JButton("Delete Label");
		btndeletelabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(lblCreate);
				frame.validate();
				frame.repaint();  
			}
		});
		btndeletelabel.setBounds(10, 236, 104, 21);
		frame.getContentPane().add(btndeletelabel);
		
		
		
		
	}
}
