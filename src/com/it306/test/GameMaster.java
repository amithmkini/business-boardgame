package com.it306.test;

/**
 * This class is responsible for everything that has to happen behind
 * the board. This class create players, set the default paramerters
 * of players and then start the game.
 * 
 * @author Amith Kini
 */

import com.it306.test.UI.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GameMaster {
	private int noOfPlayers;
	// This is a static class as this should be instantiated only once.
	private static GameMaster gameMaster;
	// The gameboard
	private Board gameBoard;
	// Initial money assigned to each player
	private int initMoney = 1500;
	private int bailAmt = 500;
	// The list of players in the game. Made public so that other classes
	// can access it.
	public ArrayList<Player> playerList = new ArrayList<Player>();
	private int turn = 0;
	public ArrayList<JLabel> pLabels = new ArrayList<JLabel>();
	public ArrayList<Object> cellList = new ArrayList<Object>();
	public ArrayList<Card> chanceCards;
	public ArrayList<Card> communityCards;
	
	
	public static GameMaster instance() {
		if (gameMaster == null) {
			gameMaster = new GameMaster();
		}
		return gameMaster;
	}
	
	private GameMaster() {
		chanceCards = new ChanceBuilder().build();
		communityCards = new CommunityBuilder().build();

		cellList = new CellBuilder().read();
	}
	
	public void setPlayers(ArrayList<String> plrs) {
		int i = 0;
		pLabels.add(gameBoard.p0);
		pLabels.add(gameBoard.p1);
		pLabels.add(gameBoard.p2);
		pLabels.add(gameBoard.p3);
		for (String name : plrs) {
			JLabel lbl = pLabels.get(i);
			Player x = new Player(lbl);
			x.setName(name);
			x.setIndex(i);
			playerList.add(x);
			i = i + 1;
		}
		noOfPlayers = playerList.size();
	}
	
	public void switchTurn() {
		turn = (turn + 1) % noOfPlayers;
		Player currPlr = getCurrentPlayer();
		if (currPlr.getIsOut()) {
			switchTurn();
		}
		else {
			//This is just a placeholder. Do something here.
			play();
		}
	}
	
	public Player getCurrentPlayer() {
		return playerList.get(turn);
	}
	
	public Player checkWinner() {
		Player plr = null;
		//This is just a placeholder. Actual method must come.
		return plr;
	}
	
	public void initPlayers() {
		if (playerList.size() != 0) {
			for (Player x : playerList) {
				x.addMoney(initMoney);
				x.setPosition(0);
			}
		}
		else {
			System.out.println("No players yet!");
		}
	}
	
	public void startGame() {
		initPlayers();
		gameBoard.frame.setVisible(true);
		gameBoard.label_1.setText(getCurrentPlayer().getName());
		play();
	}
	
	public void play() {
		Player plr = getCurrentPlayer();
		System.out.println(plr.getMoney());
		gameBoard.label_1.setText(plr.getName());
		
//		The button enablers should come here actually.
//		No matter where you are, you are always eligible for rolling a dice.
		gameBoard.btnPlay.setEnabled(true);
		// Check for the jail parameter
		if (plr.isInJail()) {
			gameBoard.btnPayBail.setEnabled(true);
		}
	}
	
	public void disableAllButtons() {
		gameBoard.btnPlay.setEnabled(false);
		gameBoard.btnPickCard.setEnabled(false);
		gameBoard.btnPayBail.setEnabled(false);
		gameBoard.btnBuyProperty.setEnabled(false);
		gameBoard.btnEndTurn.setEnabled(false);
	}
	
	public Object getCellAtPos(int pos) {
		return cellList.get(pos);
	}
	
	public void btnPlayClicked() {
		gameBoard.turnStarted = true;
		gameBoard.btnPlay.setEnabled(false);
		Player plr = getCurrentPlayer();
		ArrayList<Integer> value = plr.rollDice();
		String msg = "You rolled ";
		msg = msg + String.valueOf(value.get(0)) + " and " + String.valueOf(value.get(1));
		JOptionPane.showMessageDialog(null, msg,
				"Message", JOptionPane.INFORMATION_MESSAGE);
		int pos = plr.getPosition();
		if (plr.isInJail()) {
			if (value.get(3) == 1) {
				JOptionPane.showMessageDialog(null, "You are out of Jail!",
						"Message", JOptionPane.INFORMATION_MESSAGE);
				plr.setInJail(false);
				gameBoard.btnPayBail.setEnabled(false);
				int new_pos = (pos + value.get(2)) % 40;
				if (pos + value.get(2) >= 40) {
					plr.addMoney(200);
				}
				plr.setPosition(new_pos);
				gameBoard.setPlayerPos(new_pos, plr);
			}
			else {
				JOptionPane.showMessageDialog(null, "You are stuck in Jail!",
						"Message", JOptionPane.INFORMATION_MESSAGE);
				disableAllButtons();
				gameBoard.btnEndTurn.setEnabled(true);
			}
		}
		else {
			int new_pos = (pos + value.get(2)) % 40;
			if (pos + value.get(2) >= 40) {
				//Collect Go!
				plr.addMoney(200);
			}
			else if (new_pos == 30) {
				JOptionPane.showMessageDialog(null, "You are in Jail!",
						"Message", JOptionPane.INFORMATION_MESSAGE);
				disableAllButtons();
				plr.setInJail(true);
				gameBoard.btnEndTurn.setEnabled(true);
			}
			plr.setPosition(new_pos);
			gameBoard.setPlayerPos(new_pos, plr);
		}
		
		
		if (!plr.isInJail()) {
			gameBoard.btnEndTurn.setEnabled(true);
			Cell current = (Cell) getCellAtPos(plr.getPosition());
			if (current.getOwner() == "Bank" && current.isBuyable()) {
				gameBoard.btnBuyProperty.setEnabled(true);
			}
			else if (current.isChance() || current.isCommunity_chest()) {
				gameBoard.btnPickCard.setEnabled(true);
				gameBoard.btnEndTurn.setEnabled(false);
			}
			else if (current.isTaxCollection()) {
				payTax(plr);
			}
			else if (current.getOwner() != "Bank") {
				Property prop = (Property) getCellAtPos(plr.getPosition());
				payRent(plr,prop);
			}
		}
		
	}

	public void btnBuyPropertyClicked() {
		Player plr = getCurrentPlayer();
		Property p = (Property) getCellAtPos(plr.getPosition());
//		If the property is not buyable, then raise an 'error'.		
		if (p.getOwner() != "Bank") {
			JOptionPane.showMessageDialog(null, "This is already owned!",
					"Message", JOptionPane.INFORMATION_MESSAGE);
		}
//		Else, check for sufficient funds in the Player wallet.
		else {
			int value = p.getValue();
			if (plr.getMoney() < value) {
				JOptionPane.showMessageDialog(null, "You have insufficient funds!",
						"Message", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
//				Subtract the money from the player's chest
				plr.subMoney(value);
				plr.addProperty(p);
				p.setPowner(plr);
				p.setOwner(plr.getName());
				JOptionPane.showMessageDialog(null, "Successfully bought!",
						"Message", JOptionPane.INFORMATION_MESSAGE);
				gameBoard.btnBuyProperty.setEnabled(false);
			}
		}
	}
	
	public void btnTradeClicked() {
		
	}
	
	public void btnPickCardClicked() {
		Player plr = getCurrentPlayer();
		int value = plr.getMoney();
		Cell x = (Cell) getCellAtPos(plr.getPosition());
		Card picked = null;
		int card_num = -1;
		if (x.isChance()) {
			card_num = ThreadLocalRandom.current().nextInt(0, chanceCards.size());
			picked = chanceCards.get(card_num);
			JOptionPane.showMessageDialog(null, picked.message,
					"Chance", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			card_num = ThreadLocalRandom.current().nextInt(0, communityCards.size());
			picked = communityCards.get(card_num);
			JOptionPane.showMessageDialog(null, picked.message,
					"Community Chest", JOptionPane.INFORMATION_MESSAGE);
		}
		boolean f = true;
		while (f) {
			if (picked.pos == -1) {
				if (value < - picked.value) {
					JOptionPane.showMessageDialog(null, "You have insufficient funds!",
							"Message", JOptionPane.INFORMATION_MESSAGE);
//					Open a trade dialogue to help him out
//					But before that, check if he can manage to pay money..
					int total_value = 0;
					for (Property p : plr.getPropertyList()) {
						total_value = total_value + p.getValue();
					}
					if (total_value + plr.getMoney() < - picked.value) {
						JOptionPane.showMessageDialog(null, "You have insufficient funds and you "
								+ "cannot pay the money!",
								"Message", JOptionPane.INFORMATION_MESSAGE);
						plr.setOut(true);
						plr.destroy();
						f = false;
					}
					trader();
					continue;
				}
				else {
					plr.addMoney(picked.value);
					f = false;
				}
			}
			else {
//					Movement of player happens here.
				if (plr.getPosition() > picked.pos) {
					//Collect GO money
					plr.addMoney(200);
				}
				int new_pos = picked.pos;
				plr.setPosition(new_pos);
				gameBoard.setPlayerPos(new_pos, plr);
				if (new_pos == 30) {
					plr.setInJail(true);
				}
				f = false;
			}
		}
		
		disableAllButtons();
		gameBoard.btnEndTurn.setEnabled(true);
	}
	
	private void trader() {
		// TODO Auto-generated method stub
		
	}

	public void btnPayBailClicked() {
		Player plr = getCurrentPlayer();
		int funds = plr.getMoney();
		if (bailAmt > funds) {
			JOptionPane.showMessageDialog(null, "You have insufficient funds!",
					"Message", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			plr.subMoney(bailAmt);
			JOptionPane.showMessageDialog(null, "You are out of the jail!",
					"Message", JOptionPane.INFORMATION_MESSAGE);
			plr.setInJail(false);
			disableAllButtons();
			gameBoard.btnPlay.setEnabled(true);
		}
	}
	
	public void btnEndTurnClicked() {
		disableAllButtons();
		switchTurn();
	}

	public void setGameBoard(Board b) {
		this.gameBoard = b;
	}

	private void payTax(Player plr) {
		
		gameBoard.btnEndTurn.setEnabled(true);
	}

	private void payRent(Player plr, Property p) {
		
		disableAllButtons();
		gameBoard.btnEndTurn.setEnabled(true);
	}
	
}
