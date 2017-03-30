package com.it306.test;

public class Property extends Cell{
	
	private Player powner;
	
	public Property(String name, int pos, int value, String colourGroup){
		setName(name);
		setPosition(pos);
		setValue(value);
		setColourGroup(colourGroup);
	}

	public Player getPowner() {
		return powner;
	}

	public void setPowner(Player powner) {
		this.powner = powner;
	}
}
