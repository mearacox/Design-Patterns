package decorator;

/**
 * A Warrior
 * 
 * @author mearacox
 */

public class Warrior extends Player {

    /**
     * Creates Warrior
     * 
     * @param name - String describing warrior name
     */
    public Warrior(String name) {
        super(FileReader.getLines("decorator/txt/warrior.txt"), name);
    }
}
