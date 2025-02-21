/*
 * CampusMap Class
 * Assignment 7
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Leah Marville
 * @version 8 November 2022
 */

import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new House("Ziskind House", "1 Henshaw Ave, Northampton, MA 01063", 3, true));
        myMap.addBuilding(new House("Cutter House", "1 Henshaw Ave, Northampton, MA 01063", 3, true));
        myMap.addBuilding(new House("Gillett House", "49 Elm St, Northampton, MA 01063", 5, true));
        myMap.addBuilding(new House("Northrop House", "49 Elm St, Northampton, MA 01063", 5, true));
        myMap.addBuilding(new House("Duckett House", "41 Elm St, Northampton, MA 01063", 5, true));
        myMap.addBuilding(new Cafe("Campus Center Cafe", "100 Elm St, Northampton, MA 01063", 1, 1000, 1000, 1000, 1000));
        myMap.addBuilding(new Cafe("Compass Cafe", "100 Elm St, Northampton, MA 01063", 1, 1000, 1000, 1000, 1000));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Dr, Northampton, MA 01063", 4));
        myMap.addBuilding(new Library("Josten Library", "7 Neilson Dr, Northampton, MA 01063", 4));
        myMap.addBuilding(new Library("Hillyer Library", "7 Neilson Dr, Northampton, MA 01063", 4));

        System.out.println(myMap);
    }
    
}
