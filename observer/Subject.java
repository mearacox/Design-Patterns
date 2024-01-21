package observer;

import java.util.ArrayList;

/**
 * A subject
 * 
 * @author mearacox
 */
public interface Subject {
    /**
     * Create an abstract registerObserver
     * 
     * @param observer - observer object
     */
    public void registerObserver(Observer observer);

    /**
     * Create an abstract removeObserver
     * 
     * @param observer - observer object
     */
    public void removeObserver(Observer observer);

    /**
     * Create an abstract notifyObserver
     * 
     * @param location      - string decribing location
     * @param decription    - string describing what was happening at location
     * @param accompliances - ArrayList describing who was at the location
     */
    public void notifyObserver(String location, String description, ArrayList<String> accomplices);
}