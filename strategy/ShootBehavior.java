package strategy;

/**
 * A shoot offence behavior
 * 
 * @author mearacox
 */
public class ShootBehavior implements OffenceBehavior {
	/**
	 * Creates a play
	 * 
	 * @return A string decribing the type of play
	 */
	public String play() {
		return "Shoots at the goal";
	}
}