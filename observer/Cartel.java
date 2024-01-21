package observer;

import java.util.ArrayList;

/**
 * A subject
 * 
 * @author mearacox
 */

public class Cartel implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;

    /**
     * Creates Cartel
     * 
     * @param cook - cook of type Subject
     */
    public Cartel(Subject cook) {
        this.cook = cook;
        sightings = new ArrayList<Sighting>();
        cook.registerObserver(this);
    }

    /**
     * Creates update - adds all the information from the sighting
     * 
     * @param location    - String describing the location of sigting
     * @param description - String describing what was happening during sighting
     * @param accomplics  - ArrayList of Strings of who was seen at sighting
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting sighting = new Sighting(location, description, accomplices);
        sightings.add(sighting);
    }

    /**
     * Creates getLog to format sighting information
     * 
     * @return String describing all sightings
     */
    public String getLog() {
        String ret = "";
        for (int i = 0; i < sightings.size(); i++) {
            Sighting sighting = sightings.get(i);
            String loc = sighting.getLocation();
            String desc = sighting.getDetails();
            String accomp = sighting.getAccomplices();

            ret = ret + "\n" + loc + " (" + desc + "), with " + accomp;
        }
        return ret;
    }
}
