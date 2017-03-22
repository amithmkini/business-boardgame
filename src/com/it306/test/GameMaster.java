package com.it306.test;
import com.it306.test.UI.*;

import java.util.ArrayList;

public class GameMaster {
	private static GameMaster gameMaster;
	private final int MAX_PLAYERS = 8;
	private Dice[] dice;
	private Board gameBoard;
	private int initMoney;
	private ArrayList<Player> players = new ArrayList<Player>();
	private int turn = 0;
	
	public static GameMaster instance() {
		if (gameMaster == null) {
			gameMaster = new GameMaster();
		}
		return gameMaster;
	}
	
	public GameMaster() {
		initMoney = 1500;
		dice = new Dice[]{new Dice(), new Dice()};
	}
	
	
	
}
