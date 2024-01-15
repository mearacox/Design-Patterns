package strategy;

import java.util.Random;

/**
 * A forward type of player
 * 
 * @author mearacox
 */

public class Forward extends Player {

	/**
	 * Create a forward with their first name and last name
	 * 
	 * @param firstName - first name of the player
	 * @param lastName  - last name of the player
	 */
	public Forward(String firstName, String lastName) {
		super(firstName, lastName);
		setOffenceBehavior();
		setOffenceBehavior();
	}

	/**
	 * Sets the offence behavior to one of two behaviors
	 */
	public void setOffenceBehavior() {
		Random random = new Random();
		int choice = random.nextInt(2);

		if (choice == 0)
			this.offenceBehavior = new ShootBehavior();
		else
			this.offenceBehavior = new PassBehavior();
	}

	/**
	 * Sets the defence behavior to one of two behaviors
	 */
	public void setDefenceBehavior() {
		Random random1 = new Random();
		int choice = random1.nextInt(2);

		if (choice == 0)
			this.defenceBehavior = new ChasePuckBehavior();
		else
			this.defenceBehavior = new BlockBehavior();
	}

	/**
	 * Creates a string representation of the player
	 * 
	 * @return A string with the players name and position
	 */
	public String toString() {
		return super.toString() + " plays the position: Forward";
	}

}