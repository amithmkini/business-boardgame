package com.it306.test.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Start {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBusiness = new JLabel("Business!");
		lblBusiness.setForeground(Color.RED);
		lblBusiness.setFont(new Font("Tahoma", Font.BOLD, 51));
		lblBusiness.setBounds(226, 31, 268, 86);
		frame.getContentPane().add(lblBusiness);
		
		JLabel lblPlayer = new JLabel("Player 1");
		lblPlayer.setBounds(370, 181, 56, 16);
		frame.getContentPane().add(lblPlayer);
		
		textField = new JTextField();
		textField.setBounds(370, 211, 130, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPlr1 = new JLabel("");
		lblPlr1.setBounds(519, 217, 56, 16);
		frame.getContentPane().add(lblPlr1);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setBounds(370, 246, 56, 16);
		frame.getContentPane().add(lblPlayer_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(370, 275, 130, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPlr2 = new JLabel("");
		lblPlr2.setBounds(519, 278, 56, 16);
		frame.getContentPane().add(lblPlr2);
		
		JButton btnStart = new JButton("Start!");
		btnStart.setBounds(370, 333, 97, 25);
		frame.getContentPane().add(btnStart);
		
		JButton btnRules = new JButton("Rules");
		btnRules.setBounds(40, 333, 97, 25);
		frame.getContentPane().add(btnRules);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(171, 333, 97, 25);
		frame.getContentPane().add(btnAbout);
	}
}
