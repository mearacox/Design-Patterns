package iterator;

/**
 * Create SCRUMBoard
 * 
 * @author Meara Cox
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    /**
     * Create a SCRUMBoard
     * 
     * @param projectName - String containing name of project
     */
    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        todo = new TaskList("To-DO");
        doing = new TaskList("Doing");
        done = new TaskList("Done");
    }

    /**
     * Create addTicket - adds ticket to todo list
     * 
     * @param name       - String describing name of ticket
     * @param teamMember - String describing team member responsible for ticket
     * @param difficulty - int describing difficulty of ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        todo.addTicket(name, teamMember, difficulty);
    }

    /**
     * Create startTicket - moves ticket to doing list
     * 
     * @param name - String containing name of ticket
     * @return boolean - if ticket was moved
     */
    public boolean startTicket(String name) {
        Ticket temp = todo.getTicket(name);
        doing.addTicket(temp);
        return true;
    }

    /**
     * create finishTicket - moves ticket to done list
     * 
     * @param name - String containing name of ticket
     * @return boolean - if ticket was moved
     */
    public boolean finishTicket(String name) {
        Ticket temp = doing.getTicket(name);
        done.addTicket(temp);
        return true;
    }

    /**
     * create toString
     * 
     * @return String containing name of project and all the tickets
     */
    public String toString() {
        return "***** " + projectName + " *****\n" +
                "ToDo: \n" + todo +
                "\nDoing: \n" + doing +
                "\nDone: \n" + done;
    }

}
