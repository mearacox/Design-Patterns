package observer;

import java.util.ArrayList;

/**
 * A subject
 * 
 * @author mearacox
 */

public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    /**
     * Creates Sighting
     * 
     * @param location    - String description of location
     * @param details     - String description of what was happening
     * @param accomplices - ArrayList of strings of who was at sighting
     */
    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    /**
     * Creates getLocation
     * 
     * @return - String describing location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Creates getDetails
     * 
     * @return String describing details of sighting
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Creates getAccomplices
     * 
     * @return - String describing who was seen at sighting
     */
    public String getAccomplices() {
        String ret = "";
        for (String accomplices : accomplices) {
            ret = accomplices;
        }
        return ret;
    }
}
