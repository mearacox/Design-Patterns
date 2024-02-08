/**
 * Create Word
 * 
 * @author Meara Cox
 */
public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * Create a Word
     * 
     * @param word       - String containing the word
     * @param type       - String containing the part of speech
     * @param definition - String containing the definition
     * @param sentence   - String containing a sectence
     */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * Create getWord
     * 
     * @return String containing the word
     */
    public String getWord() {
        return this.word;
    }

    /**
     * Create getDescription
     * 
     * @return String containing the type, definition, and sentence
     */
    public String getDescription() {
        return "Part of Speech: " + this.type + "\nDefinition: " + this.definition +
                "\n" + this.sentence;
    }
}
