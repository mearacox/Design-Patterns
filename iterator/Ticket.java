package iterator;

/**
 * Create Ticket
 * 
 * @author Meara Cox
 */

public class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;

    /**
     * Create a Ticket
     * 
     * @param name       - String describing name of ticket
     * @param teamMember - String describing team member responsible for ticket
     * @param difficulty - int describing difficulty of ticket
     */
    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * Create getName
     * 
     * @return String containing name of ticket
     */
    public String getName() {
        return this.name;
    }

    /**
     * Create toString
     * 
     * @return String describing ticket
     */
    public String toString() {
        return this.name + "(" + this.difficulty + ") - " + this.teamMember;
    }
}
