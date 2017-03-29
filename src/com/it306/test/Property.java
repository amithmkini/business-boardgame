package com.it306.test;

public class Property extends Cell{
	
	private Player powner;
	
	public Property(){
		
	}

	/**
	 * @return the owner, as the Player class
	 */
	public Player getPowner() {
		return powner;
	}

	/**
	 * @param powner the owner to set as the Player class
	 */
	public void setPowner(Player powner) {
		this.powner = powner;
	}
}
