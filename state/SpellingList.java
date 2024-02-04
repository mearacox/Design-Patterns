package state;

/**
 * A Spelling List
 * 
 * @author mearacox
 */

public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * Creates a SpellingList
     */
    public SpellingList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        setState(firstGradeState);
    }

    /**
     * Creates getNextWord - get the next word from the list
     * 
     * @return String of the next word
     */
    public String getNextWord() {
        return state.getNextWord();
    }

    /**
     * Create increaseGrade - increases the grade
     */
    public void increaseGrade() {
        state.increaseGrade();
    }

    /**
     * Create decreaseGrade - decreases the grade
     */
    public void decreaseGrade() {
        state.decreaseGrade();
    }

    /**
     * Create getFirstGradeState
     * 
     * @return State of firstGradeState
     */
    public State getFirstGradeState() {
        return firstGradeState;
    }

    /**
     * Create getSecondGradeState
     * 
     * @return State of secondGradeState
     */
    public State getSecondGradeState() {
        return secondGradeState;
    }

    /**
     * create getThirdGradeState
     * 
     * @return State of thirdGradeState
     */
    public State getThirdGradeState() {
        return thirdGradeState;
    }

    /**
     * Create setState
     * 
     * @param state - type State contating the state it should be set to
     */
    public void setState(State state) {
        this.state = state;
    }
}
