package decorator;

/**
 * A Sword
 * 
 * @author mearacox
 */
public class Sword extends PlayerDecorator {

    /**
     * Creates Sword
     * 
     * @param player - player of type Player
     */
    public Sword(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/sword.txt"));

    }
}
