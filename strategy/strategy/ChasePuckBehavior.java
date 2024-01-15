package strategy;

/**
 * A chase puck behavior for defence behaviors
 * 
 * @author mearacox
 */
public class ChasePuckBehavior implements DefenceBehavior {

	/**
	 * Creates a play
	 * 
	 * @return A string representing the play
	 */
	public String play() {
		return "Chases the puck";
	}
}