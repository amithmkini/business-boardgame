package com.it306.test.UI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.it306.test.*;

public class PlayerPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblPlayer;
	private JLabel label_1;
	private JButton btnPlay;
	private JButton btnBuyProperty;
	private JButton btnTrade;
	private JButton btnPickCard;
	private JButton btnPayBail;
	private JButton btnEndTurn;
	
	public PlayerPanel(Player player) {
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		
		lblPlayer = new JLabel("Player:");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayer.setBounds(12, 13, 56, 16);
		panel_1.add(lblPlayer);
		
		label_1 = new JLabel(player.getName());
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(80, 14, 104, 16);
		panel_1.add(label_1);
		
		btnPlay = new JButton("Roll the dice!");
		btnPlay.setBounds(12, 42, 172, 25);
		panel_1.add(btnPlay);
		
		btnBuyProperty = new JButton("Buy Property");
		btnBuyProperty.setBounds(12, 80, 172, 25);
		panel_1.add(btnBuyProperty);
		
		btnTrade = new JButton("Trade");
		btnTrade.setBounds(12, 118, 172, 25);
		panel_1.add(btnTrade);
		
		btnPickCard = new JButton("Pick a card");
		btnPickCard.setBounds(12, 156, 172, 25);
		panel_1.add(btnPickCard);
		
		btnPayBail = new JButton("Pay Bail");
		btnPayBail.setBounds(12, 194, 172, 25);
		panel_1.add(btnPayBail);
		
		btnEndTurn = new JButton("End Turn");
		btnEndTurn.setBounds(12, 232, 172, 25);
		panel_1.add(btnEndTurn);
		
//		btnPlay.setEnabled(false);
//		btnBuyProperty.setEnabled(false);
//		btnTrade.setEnabled(false);
//		btnPickCard.setEnabled(false);
//		btnPayBail.setEnabled(false);
//		btnEndTurn.setEnabled(false);
		
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GameMaster.instance().btnPlayClicked();
			}
		});
		
		btnBuyProperty.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnBuyPropertyClicked();
            }
        });
		
		btnTrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameMaster.instance().btnTradeClicked();
			}
		});
		
		btnPickCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameMaster.instance().btnPickCardClicked();
			}
		});
		
		btnPayBail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameMaster.instance().btnPayBailClicked();
			}
		});
		
		btnEndTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameMaster.instance().btnEndTurnClicked();
			}
		});
	}
	
	
	
}
