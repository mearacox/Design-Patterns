package decorator;

import java.util.ArrayList;

/**
 * A Player Decorator
 * 
 * @author mearacox
 */

public abstract class PlayerDecorator extends Player {
    private Player player;

    /**
     * Creates PlayerDecorator
     * 
     * @param player - player of type Player
     */
    public PlayerDecorator(Player player) {
        super(player.lines, player.name);
        this.player = player;
    }

    /**
     * Creates integrateDecor - adds decor to the warrior
     * 
     * @param decor - ArrayList of strings used to decorate the warrior
     */
    protected void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < lines.size(); i++) {
            String temp = "";
            String tempLines = lines.get(i);
            String tempDecor = decor.get(i);
            int lengthLines = tempLines.length();
            int lengthDecor = tempDecor.length();
            int length = lengthLines;

            if (lengthDecor > lengthLines) {
                length = lengthDecor;
                for (int m = lengthLines; m < lengthDecor; m++)
                    tempLines += " ";
            } else {
                for (int m = lengthDecor; m < lengthLines; m++)
                    tempDecor += " ";
            }

            for (int j = 0; j < length; j++) {
                if (tempLines.charAt(j) != tempDecor.charAt(j)) {
                    if (tempLines.charAt(j) != ' ' && tempDecor.charAt(j) == ' ')
                        temp += tempLines.charAt(j);

                    else
                        temp += tempDecor.charAt(j);
                } else if (tempLines.charAt(j) == tempDecor.charAt(j))
                    temp += tempLines.charAt(j);
            }
            lines.remove(i);
            lines.add(i, temp);
        }
    }
}
