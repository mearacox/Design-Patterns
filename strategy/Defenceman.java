package strategy;

import java.util.Random;

/**
 * A defenceman type of player
 * 
 * @author mearacox
 */

public class Defenceman extends Player {

	/**
	 * Creates a defenceman with their first name and last name
	 * 
	 * @param firstName - first name of player
	 * @param lastName  - last name of player
	 */
	public Defenceman(String firstName, String lastName) {
		super(firstName, lastName);
		setOffenceBehavior();
		setDefenceBehavior();
	}

	/**
	 * sets the offence behavior to one of two behaviors
	 */
	public void setOffenceBehavior() {
		Random random2 = new Random();
		int choice = random2.nextInt(10);

		if (choice != 9)
			this.offenceBehavior = new PassBehavior();
		else
			this.offenceBehavior = new SlapShotBehavior();
	}

	/**
	 * sets the defence behavior to one of two behaviors
	 */
	public void setDefenceBehavior() {
		Random random3 = new Random();
		int choice = random3.nextInt(2);

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
		return super.toString() + " plays the position: Defenceman";
	}

}