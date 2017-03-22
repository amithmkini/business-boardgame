package com.it306.test.UI;

/** 
 * The is the main splash screen of the game.
 * @author Amith Kini
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;
//import javax.swing.LookAndFeel;
//import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;

public class Start {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblPlayer_2;
	private JLabel lblPlayer_3;
	private static Integer[] plrs = {2,3,4};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
					//The main code goes here
					JComboBox<Integer> comboBox = new JComboBox<Integer>(plrs);
					comboBox.setBounds(226, 145, 65, 22);
					window.frame.getContentPane().add(comboBox);
					
					comboBox.addItemListener(new ItemListener(){

						@Override
						public void itemStateChanged(ItemEvent arg0) {
							if ((int)arg0.getItem() == 2) {
								window.lblPlayer_2.setVisible(false);
								window.textField_2.setVisible(false);
								window.lblPlayer_3.setVisible(false);
								window.textField_3.setVisible(false);
							}
							else if ((int)arg0.getItem() == 3) {
								window.lblPlayer_2.setVisible(true);
								window.textField_2.setVisible(true);
								window.lblPlayer_3.setVisible(false);
								window.textField_3.setVisible(false);
							}
							else if ((int)arg0.getItem() > 3) {
								window.lblPlayer_2.setVisible(true);
								window.textField_2.setVisible(true);
								window.lblPlayer_3.setVisible(true);
								window.textField_3.setVisible(true);
							}
						}
						
					});
					
					//Ends here
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
		  try {         
	          	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());     
	     	}catch (ClassNotFoundException e) {
	     	        e.printStackTrace();     
	        }catch (InstantiationException e) {   
	                e.printStackTrace();     
	        }catch (IllegalAccessException e) {         
	        		e.printStackTrace();
	        } catch (UnsupportedLookAndFeelException e) {
	                e.printStackTrace();
	        }
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBusiness = new JLabel("Business!");
		lblBusiness.setForeground(Color.RED);
		lblBusiness.setFont(new Font("Tahoma", Font.BOLD, 51));
		lblBusiness.setBounds(226, 31, 268, 86);
		lblBusiness.setPreferredSize(lblBusiness.getPreferredSize());
		frame.getContentPane().add(lblBusiness);
		
		JLabel lblPlayer = new JLabel("Player 1");
		lblPlayer.setBounds(370, 148, 56, 16);
		frame.getContentPane().add(lblPlayer);
		
		textField = new JTextField();
		textField.setBounds(370, 181, 130, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setBounds(370, 216, 56, 16);
		frame.getContentPane().add(lblPlayer_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(370, 245, 130, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnStart = new JButton("Start!");
		btnStart.setBounds(370, 434, 108, 73);
		frame.getContentPane().add(btnStart);
		
		JButton btnRules = new JButton("Rules");
		btnRules.setBounds(42, 458, 97, 25);
		frame.getContentPane().add(btnRules);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(174, 458, 97, 25);
		frame.getContentPane().add(btnAbout);
		
		JLabel lblSelectTheNo = new JLabel("Select the no. of players");
		lblSelectTheNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelectTheNo.setBounds(40, 141, 183, 29);
		frame.getContentPane().add(lblSelectTheNo);
		
		lblPlayer_2 = new JLabel("Player 3");
		lblPlayer_2.setVisible(false);
		lblPlayer_2.setBounds(370, 283, 56, 16);
		frame.getContentPane().add(lblPlayer_2);
		
		textField_2 = new JTextField();
		textField_2.setVisible(false);
		textField_2.setColumns(10);
		textField_2.setBounds(370, 313, 130, 22);
		frame.getContentPane().add(textField_2);
		
		lblPlayer_3 = new JLabel("Player 4");
		lblPlayer_3.setVisible(false);
		lblPlayer_3.setBounds(370, 348, 56, 16);
		frame.getContentPane().add(lblPlayer_3);
		
		textField_3 = new JTextField();
		textField_3.setVisible(false);
		textField_3.setColumns(10);
		textField_3.setBounds(370, 377, 130, 22);
		frame.getContentPane().add(textField_3);
		
		JLabel label = new JLabel("");
		label.setBounds(54, 230, 237, 137);
		frame.getContentPane().add(label);
	}
}
