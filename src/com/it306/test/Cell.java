package com.it306.test;

/**
 * This is an abstract class which describes the property needed for a
 * cell on the board. Colour group and owner is in the ArrayList type.
 * 
 * @author Amith Kini
 */


public abstract class Cell {
	private int position;
	private String name;
	private int value = 0;
	private int rent = 0;
	private String owner = "Bank";		//The default value for all property at the start
	private String colourGroup;
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the rent
	 */
	public int getRent() {
		return rent;
	}
	/**
	 * @param rent the rent to set
	 */
	public void setRent(int rent) {
		this.rent = rent;
	}
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * @return the colourGroup
	 */
	public String getColourGroup() {
		return colourGroup;
	}
	/**
	 * @param colourGroup the colourGroup to set
	 */
	public void setColourGroup(String colourGroup) {
		this.colourGroup = colourGroup;
	}
}
