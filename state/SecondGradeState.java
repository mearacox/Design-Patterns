package state;

/**
 * A Second Grade State
 * 
 * @author mearacox
 */

public class SecondGradeState extends State {
    /**
     * Create SecondGradeState
     * 
     * @param spellingList of type SpellingList contating list of words
     */
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        words = FileReader.getWords("state/txt/second.txt");
    }

    /**
     * Create increaseGrade - sets state to next state
     */
    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
        System.out.println("Moving to Third Grade...");
    }

    /**
     * Create decreaseGrade - sets state to lower state
     */
    public void decreaseGrade() {
        spellingList.setState(spellingList.getFirstGradeState());
        System.out.println("Moving to First Grade...");
    }
}
