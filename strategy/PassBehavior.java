package strategy;

/**
 * A pass offence behavior
 * 
 * @author mearacox
 */
public class PassBehavior implements OffenceBehavior {
	/**
	 * Creates a play
	 * 
	 * @return A string describing the type of play
	 */
	public String play() {
		return "Passes to a forward";
	}
}