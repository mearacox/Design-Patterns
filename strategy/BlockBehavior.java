package strategy;

import java.util.Random;

/**
 * A block defence behavior
 * 
 * @author mearacox
 */
public class BlockBehavior implements DefenceBehavior {

	/**
	 * Creates a new play
	 * 
	 * @return A string representing the type of play made, describing how the block
	 *         happened
	 */
	public String play() {
		Random random5 = new Random();
		int choice = random5.nextInt(3);

		if (choice == 1)
			return "blocks player from passing";
		else if (choice == 2)
			return "blocks player from shooting";
		else
			return "checks player with puck";
	}
}