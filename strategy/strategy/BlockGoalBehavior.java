package strategy;

import java.util.Random;

/**
 * A block goal behavior for defence and offence behaviors
 * 
 * @author mearacox
 */

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {

	/**
	 * Creates a new play
	 * 
	 * @return A string representing the play, describing how the goalie made the
	 *         block
	 */
	public String play() {
		Random random4 = new Random();
		int choice = random4.nextInt(4);

		if (choice == 0)
			return "blocks puck with stick";
		else if (choice == 1)
			return "hand blocks the puck";
		else if (choice == 2)
			return "blocks puck with knee pads";
		else
			return "catches the puck";

	}
}