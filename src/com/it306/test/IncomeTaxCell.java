package com.it306.test;

public class IncomeTaxCell extends Cell {
	
	public IncomeTaxCell(int pos, int value) {
		setPosition(pos);
		setName("Income Tax");
		setBuyable(false);
		setColourGroup("None");
		setRent(value);
	}
	
}
