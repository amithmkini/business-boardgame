package com.it306.test;

public class CommunityChestCell extends Cell {
	
	public CommunityChestCell(int pos) {
		setPosition(pos);
		setName("Community Chest");
		setBuyable(false);
		setColourGroup("None");
		setCommunity_chest(true);
	}
		
}
