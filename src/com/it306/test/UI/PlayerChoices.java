package com.it306.test.UI;

/**
 * The dialog box which shows the options for the players during
 * their turn. If the player is in jail, they can pay the bail.
 * 
 * @author Amith Kini
 */


import com.it306.test.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class PlayerChoices {

	private JFrame frame;
//	private int value;
//	public boolean doubles = false;
//	private boolean turnStarted = false;

	JButton btnPlay;
	JButton btnEndTurn;
	JButton btnTrade;
	JButton btnPayBail;
	JButton btnPickCard;
	JButton btnBuyProperty;
	
	/**
	 * The main loop of the application. The loop ends when the "End Turn"
	 * button is pressed.
	 */
	
	
	
	/**
	 * Create the application.
	 */
	public PlayerChoices(GameMaster gameMaster) {
		Player plr = gameMaster.getCurrentPlayer();
		initialize(plr);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Player plr) {
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
		
		JLabel label = new JLabel(plr.getName());
		label.setBounds(116, 13, 166, 26);
		frame.getContentPane().add(label);
	}
}
