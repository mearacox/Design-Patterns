package iterator;

/**
 * Create TaskList
 * 
 * @author Meara Cox
 */

public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * Create a TaskList
     * 
     * @param name - String containing name of ticket
     */
    public TaskList(String name) {
        tickets = new Ticket[100];
        this.count = 0;
        this.name = name;
    }

    /**
     * Create addTicket - add ticket to tickets array
     * 
     * @param name       - String describing name of ticket
     * @param teamMember - String describing team member responsible for ticket
     * @param difficulty - int describing difficulty of ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        if (count >= 100)
            System.out.println("Ticket list is full");
        tickets[count] = new Ticket(name, teamMember, difficulty);
        count++;
    }

    /**
     * create addTicket to ticket from to-do to doing to done
     * 
     * @param ticket - type Ticket containing ticket info
     */
    public void addTicket(Ticket ticket) {
        tickets[count] = ticket;
        count++;
    }

    /**
     * create getTicket - gets and removes ticket based on name
     * 
     * @param name - String containing name of ticket
     * @return Ticket at current position
     */
    public Ticket getTicket(String name) {
        Ticket temp;
        for (int i = 0; i <= count; i++) {
            if (tickets[i].getName().equalsIgnoreCase(name)) {
                temp = tickets[i];
                remove(i);
                return temp;
            }
        }
        return null;
    }

    /**
     * Create remove - remove ticket from array and most elements over
     * 
     * @param pos - integer containing position to remove and move elements
     */
    private void remove(int pos) {
        for (int i = pos; i <= count; i++) {
            tickets[i] = tickets[(i + 1)];
            tickets[(i + 1)] = null;
        }
        count--;
    }

    /**
     * Create createIterator
     * 
     * @return TaskListIterator
     */
    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }

    /**
     * create toString - to print each ticket
     * 
     * @return String containing all the tickets of a list
     */
    public String toString() {
        String ret = "";
        TaskListIterator iterator = createIterator();
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            ret += " - " + ticket.toString() + "\n";
        }
        return ret;
    }
}
