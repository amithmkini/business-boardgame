package com.it306.test;

public class LuxuryTaxCell extends Cell {
	
	public LuxuryTaxCell(int pos, int value) {
		setPosition(pos);
		setName("Luxury Tax");
		setBuyable(false);
		setColourGroup("None");
		setRent(value);
	}
	
}