package com.it306.test.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class BuyGUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyGUI window = new BuyGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BuyGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 683, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Buy");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(320, 51, 56, 31);
		frame.getContentPane().add(label);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(256, 127, 172, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel label_1 = new JLabel("Select a player");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(83, 122, 137, 31);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Enter money");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_2.setBounds(83, 286, 125, 42);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(214, 298, 116, 22);
		frame.getContentPane().add(textField);
	}

}
