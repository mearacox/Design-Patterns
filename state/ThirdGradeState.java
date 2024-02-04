package state;

/**
 * A Third Grade State
 * 
 * @author mearacox
 */

public class ThirdGradeState extends State {
    /**
     * Create SecondGradeState
     * 
     * @param spellingList of type SpellingList contating list of words
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        words = FileReader.getWords("state/txt/third.txt");
    }

    /**
     * Create increaseGrade - tells user there is no next state
     */
    public void increaseGrade() {
        System.out.println("Sorry, we currently only have up to third grade in our system...");
    }

    /**
     * Create decreaseGrade - sets state to lower state
     */
    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("Moving to Second Grade...");
    }
}
