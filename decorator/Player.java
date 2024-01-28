package decorator;

import java.util.ArrayList;

/**
 * A Player
 * 
 * @author mearacox
 */

public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    /**
     * Creates a player
     * 
     * @param lines - ArrayList of Strings that draw the warrior
     * @param name  - String describing name of warrior
     */
    public Player(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
    }

    /**
     * Creates getName - to get name of warrior
     * 
     * @return String describing name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Creates toString
     * 
     * @return String that will draw warrior
     */
    public String toString() {
        String ret = "";

        for (int i = 0; i < lines.size(); i++)
            ret += lines.get(i) + "\n";

        return ret;
    }
}
