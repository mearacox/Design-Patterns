package strategy;

/**
 * A goalie type of player
 * 
 * @author mearacox
 */

public class Goalie extends Player {

	/**
	 * Creates a goalie using their first and last name
	 * 
	 * @param firstName - first name of the goalie
	 * @param lastName  - last name of the goalie
	 */
	public Goalie(String firstName, String lastName) {
		super(firstName, lastName);
		setOffenceBehavior();
		setDefenceBehavior();
	}

	/**
	 * sets the offence behavior
	 */
	public void setOffenceBehavior() {
		this.offenceBehavior = new BlockGoalBehavior();
	}

	/**
	 * sets the defence behavior
	 */
	public void setDefenceBehavior() {
		this.defenceBehavior = new BlockGoalBehavior();
	}

	/**
	 * Creates a string representaion of the goalie
	 * 
	 * @return A string with the goalies name and position
	 */
	public String toString() {
		return super.toString() + " plays the position: Goalie";
	}

}