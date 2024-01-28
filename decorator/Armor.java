package decorator;

/**
 * An Armor
 * 
 * @author mearacox
 */
public class Armor extends PlayerDecorator {

    /**
     * Creates Armor
     * 
     * @param player - player of type Player
     */
    public Armor(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/armor.txt"));
    }
}
