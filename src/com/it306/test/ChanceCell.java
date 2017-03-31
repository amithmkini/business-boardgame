package com.it306.test;

public class ChanceCell extends Cell {

	public ChanceCell(int pos) {
		setPosition(pos);
		setName("Chance");
		setBuyable(false);
		setColourGroup("None");
		setChance(true);
	}
	
}
