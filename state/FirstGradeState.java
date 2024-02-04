package state;

/**
 * A First Grade State
 * 
 * @author mearacox
 */

public class FirstGradeState extends State {

    /**
     * Creates FirstGradeState
     * 
     * @param spellingList of type SpellingList contating list of words
     */
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        words = FileReader.getWords("state/txt/first.txt");
    }

    /**
     * Create increaseGrade - sets state to next state
     */
    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("Moving to Second Grade...");
    }

    /**
     * Create decreaseGrade - tells user there is no lower state
     */
    public void decreaseGrade() {
        System.out.println("You can't go below First Grade...");
    }
}
