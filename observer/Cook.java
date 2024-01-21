package observer;

import java.util.ArrayList;

/**
 * A subject
 * 
 * @author mearacox
 */

public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Creates a new cook
     * 
     * @param name - name of cook
     */
    public Cook(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * Registers/adds an observer to observers ArrayList
     * 
     * @param observer - observer of type Observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from observers ArrayList
     * 
     * @param observer - observer of type Observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Creates notifyObserver - calls update
     * 
     * @param location    - String describing location of sighting
     * @param description - String describing what was happening during sighting
     * @param accomplices - ArrayList of Strings describing who was seen at sighting
     */
    public void notifyObserver(String location, String description, ArrayList<String> accomplices) {
        for (Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    /**
     * Creates enterSighting - calls notifyObserver
     * 
     * @param location    - String describing the sighting
     * @param description - String describing what was happening during sighting
     * @param accomplices - String describing who was seen at sighting
     */
    public void enterSighting(String location, String description, String accomplices) {
        ArrayList<String> temp = new ArrayList<String>();
        temp.add(accomplices);
        notifyObserver(location, description, temp);
    }

    /**
     * Creates getName - getName of cook
     * 
     * @return - String describing name of cook
     */
    public String getName() {
        return this.name;
    }
}
