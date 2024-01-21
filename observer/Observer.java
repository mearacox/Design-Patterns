package observer;

import java.util.ArrayList;

/**
 * An Observer
 * 
 * @author mearacox
 */
public interface Observer {

    /**
     * Create an abstract notifyObserver
     * 
     * @param location      - string decribing location
     * @param decription    - string describing what was happening at location
     * @param accompliances - ArrayList describing who was at the location
     */
    public void update(String location, String description, ArrayList<String> accompliances);

    /**
     * Create an abstract getLog
     * 
     * @return String describing the log of sightings of the cook
     */
    public String getLog();
}
