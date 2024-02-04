package state;

import java.util.ArrayList;
import java.util.Random;

/**
 * A State
 * 
 * @author mearacox
 */

public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    /**
     * Creates State
     * 
     * @param spellingList of type SpellingList contains a list of words
     */
    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        words = new ArrayList<String>();
        rand = new Random();
    }

    /**
     * Creates getNextWord - randomly chooses next word from list
     * 
     * @return String contating the word
     */
    public String getNextWord() {
        int random = rand.nextInt(words.size());
        return words.get(random);
    }

    /**
     * Create abstract increaseGrade
     */
    abstract public void increaseGrade();

    /**
     * Create abstract decreaseGrade
     */
    abstract public void decreaseGrade();

}
