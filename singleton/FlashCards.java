import java.util.ArrayList;
import java.util.Random;

/**
 * Create FlashCards
 * 
 * @author Meara Cox
 */

public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    /**
     * Create a FlashCard
     */
    private FlashCards() {
        words = new ArrayList<Word>();
        words = FileReader.getWords();
    }

    /**
     * Create getInstance
     * 
     * @return FlashCard - instance of flashCards
     */
    public static FlashCards getInstance() {
        return flashCards = new FlashCards();
    }

    /**
     * create getWord - randomly chooses a word
     * 
     * @return Word containing randomly chosen word
     */
    public Word getWord() {
        rand = new Random();
        int next = rand.nextInt(words.size());
        currentWord = words.get(next);
        words.remove(words.get(next));
        return currentWord;
    }

}
