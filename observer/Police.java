package observer;

import java.util.ArrayList;

/**
 * A subject
 * 
 * @author mearacox
 */

public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    /**
     * Creates Police
     * 
     * @param cook - cook of tybe subject
     */
    public Police(Subject cook) {
        this.cook = cook;
        locations = new ArrayList<String>();
        people = new ArrayList<String>();
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
        locations.add(location);
        boolean add = true;

        if (notes == null)
            notes = description;
        else
            notes += ", " + description;

        for (int i = 0; i < accomplices.size(); i++) {
            String[] acomps = accomplices.get(i).split(", ");
            for (int m = 0; m < acomps.length; m++) {
                add = true;
                for (int j = 0; j < people.size(); j++) {
                    if (acomps[m].equalsIgnoreCase(people.get(j))) {
                        add = false;
                    }
                }
                if (add)
                    people.add(acomps[m]);
            }
        }
    }

    /**
     * Creates getLog to format sighting information
     * 
     * @return String describing all sightings
     */
    public String getLog() {
        String loc = "";
        for (int i = 0; i < locations.size(); i++) {
            loc += "- " + locations.get(i) + "\n";
        }

        String note = "";
        String[] temp = notes.split(", ");
        for (int i = 0; i < temp.length; i++) {
            note += "- " + temp[i] + "\n";
        }

        String peeps = "";
        for (int i = 0; i < people.size(); i++) {
            peeps += "- " + people.get(i) + "\n";
        }
        return "Locations:\n" + loc + " \nNotes:\n" + note + "\nAccomplices:\n" + peeps;
    }
}
