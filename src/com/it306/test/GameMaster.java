package com.it306.test;

/**
 * This class is responsible for everything that has to happen behind
 * the board. This class create players, set the default paramerters
 * of players and then start the game.
 * 
 * @author Amith Kini
 */

import com.it306.test.UI.*;

import java.util.ArrayList;
import javax.swing.JLabel;
//import javax.swing.JPanel;

public class GameMaster {
	private int noOfPlayers;
	private static GameMaster gameMaster;
	private Board gameBoard;
	private int initMoney = 1500;
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
	
	public GameMaster() {
		chanceCards = new ChanceBuilder().build();
		communityCards = new CommunityBuilder().build();
//		cellList = new CellBuilder().read();
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
			//play();
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
		gameBoard.frame.setVisible(true);
		gameBoard.label_1.setText(getCurrentPlayer().getName());
		play();
	}
	
	public void play() {
		Player plr = getCurrentPlayer();
		gameBoard.label_1.setText(plr.getName());
		
		// The button enablers should come here actually
		// No matter where you are, you are always eligible for
		// rolling a dice.
		gameBoard.btnPlay.setEnabled(true);
		// Check for the jail parameter
		if (plr.isInJail()) {
			gameBoard.btnPayBail.setEnabled(true);
			
		}
		
		
	}
	
	public void disableAllButtons() {
		gameBoard.btnPlay.setEnabled(false);
		gameBoard.btnTrade.setEnabled(false);
		gameBoard.btnPickCard.setEnabled(false);
		gameBoard.btnPayBail.setEnabled(false);
		gameBoard.btnBuyProperty.setEnabled(false);
		gameBoard.btnEndTurn.setEnabled(false);
	}
	
	public Object getCellAtPos(int pos) {
		return cellList.get(pos);
	}
	
	public void btnPlayClicked() {
		
	}
	
	public void btnBuyPropertyClicked() {
		
	}
	
	public void btnTradeClicked() {
		
	}
	
	public void btnPickCardClicked() {
		
	}
	
	public void btnPayBailClicked() {
		
	}
	
	public void btnEndTurnClicked() {
		
	}

	public void setGameBoard(Board b) {
		this.gameBoard = b;
	}
	
}
