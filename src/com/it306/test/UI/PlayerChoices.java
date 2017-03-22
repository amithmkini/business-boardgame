package com.it306.test.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class PlayerChoices {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerChoices window = new PlayerChoices();
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
	public PlayerChoices() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 357, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPlay = new JButton("Roll the dice");
		btnPlay.setBounds(31, 60, 106, 55);
		frame.getContentPane().add(btnPlay);
		
		JButton btnEndTurn = new JButton("End turn");
		btnEndTurn.setEnabled(false);
		btnEndTurn.setBounds(201, 60, 106, 55);
		frame.getContentPane().add(btnEndTurn);
		
		JButton btnTrade = new JButton("Trade");
		btnTrade.setEnabled(false);
		btnTrade.setBounds(31, 138, 106, 55);
		frame.getContentPane().add(btnTrade);
		
		JButton btnPayBail = new JButton("Pay Bail");
		btnPayBail.setEnabled(false);
		btnPayBail.setBounds(201, 138, 106, 55);
		frame.getContentPane().add(btnPayBail);
		
		JButton btnPickCard = new JButton("Pick a Card");
		btnPickCard.setEnabled(false);
		btnPickCard.setBounds(31, 219, 106, 55);
		frame.getContentPane().add(btnPickCard);
		
		JButton btnBuyProperty = new JButton("Buy Property");
		btnBuyProperty.setEnabled(false);
		btnBuyProperty.setBounds(201, 219, 106, 55);
		frame.getContentPane().add(btnBuyProperty);
		
		JLabel lblPlayer = new JLabel("Player:");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayer.setBounds(31, 13, 57, 26);
		frame.getContentPane().add(lblPlayer);
		
		// This label should display the name of the player in control.
		
		JLabel label = new JLabel("");
		label.setBounds(116, 13, 166, 26);
		frame.getContentPane().add(label);
	}
}
