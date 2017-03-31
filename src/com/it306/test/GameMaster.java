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


public class GameMaster {
	private int noOfPlayers;
	private Board gameBoard;
	private int initMoney = 1500;
	private ArrayList<Player> playerList = new ArrayList<Player>();
	private int turn = 0;
	public ArrayList<JLabel> pLabels = new ArrayList<JLabel>();
	
	public GameMaster(ArrayList<String> plrs) {
		try {
			gameBoard = new Board(plrs);
			gameBoard.frame.setVisible(true);
			setPlayers(plrs);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	
	public void movePlayer(int pos) {
		Player plr = getCurrentPlayer();
		plr.setPosition(pos);
		gameBoard.setPlayerPos(pos, plr);
	}
	
	public void play() {
		@SuppressWarnings("unused")
		PlayerChoices dialog = new PlayerChoices(this);
		
	}
	
	public void getCellAtPos(int pos) {
		
	}
	
	
}
