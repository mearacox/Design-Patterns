package strategy;

/**
 * A slapshot offence behavior
 * 
 * @author mearacox
 */
public class SlapShotBehavior implements OffenceBehavior {
	/**
	 * Creates a play
	 * 
	 * @return A string describing the type of play
	 */
	public String play() {
		return "Shoots the puck from the blue line";
	}
}