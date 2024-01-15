package strategy;

import java.util.Random;

/**
 * A player
 * 
 * @author mearacox
 */

public abstract class Player {
	private String firstName;
	private String lastName;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	protected Random Rand;

	/**
	 * Create a player using their name
	 * 
	 * @param firstName - first name of the player
	 * @param lastName  - last name of the player
	 */
	public Player(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		setOffenceBehavior();
		setDefenceBehavior();
	}

	/**
	 * Create abstract set defence behavior
	 */
	abstract public void setDefenceBehavior();

	/**
	 * Create abstract set offence behavior
	 */
	abstract public void setOffenceBehavior();

	/**
	 * create play depending on if the team has possession or not
	 * 
	 * @param possession - if the team has possession
	 * @return A string describing the play based on their possession of the puck
	 */
	public String play(boolean possession) {
		if (possession) {
			setOffenceBehavior();
			return offenceBehavior.play();
		} else {
			setDefenceBehavior();
			return defenceBehavior.play();
		}
	}

	/**
	 * Create a string representing the player
	 * 
	 * @return A string with their first and last name
	 */
	public String toString() {
		return firstName + " " + lastName;
	}
}