package com.it306.test;

/**
 * This class is responsible for everything that has to happen behind
 * the board. This class create players, set the default paramerters
 * of players and then start the game.
 * 
 * @author Amith Kini
 */

import java.util.ArrayList;


public class GameMaster {
//	private Dice[] dice;
	private int noOfPlayers;
//	private Board gameBoard;
	private int initMoney = 1500;
	private ArrayList<Player> playerList = new ArrayList<Player>();
	private int turn = 0;
	
	public GameMaster() {
	}
	
	public void setPlayers(ArrayList<String> plrs) {
		int i = 0;
		for (String name : plrs) {
			Player x = new Player();
			x.setName(name);
			x.setIndex(i);
			playerList.add(x);
			i = i + 1;
		}
	}
	
	public void switchTurn() {
		turn = (turn + 1) % noOfPlayers;
		Player currPlr = getCurrentPlayer();
		if (currPlr.getIsOut() || currPlr.isInJail()) {
			//This is just a placeholder. Do something here.
		}
		else {
			
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
	
}
