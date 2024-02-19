package iterator;

import java.util.Iterator;

/**
 * Create TaskListIterator
 * 
 * @author Meara Cox
 */

public class TaskListIterator implements Iterator {
    private Ticket[] tickets;
    private int position;

    /**
     * Create a TaskListIterator
     * 
     * @param tickets - array list of Ticket
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
    }

    /**
     * Create hasNext - to see if there are more tickets in array
     * 
     * @return boolean of if there are more tickets
     */
    public boolean hasNext() {
        if (position >= tickets.length || tickets[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * create next
     * 
     * @return Ticket - containing next ticket in array
     */
    public Ticket next() {
        return tickets[position++];
    }
}