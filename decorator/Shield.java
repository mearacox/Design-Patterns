package decorator;

/**
 * A shield
 * 
 * @author mearacox
 */
public class Shield extends PlayerDecorator {

    /**
     * Creates Shield
     * 
     * @param player - player of type Player
     */
    public Shield(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/shield.txt"));
    }
}
