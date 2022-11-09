/*
 * House Class
 * Assignment 7
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Leah Marville
 * @version 8 November 2022
 */

import java.util.ArrayList;

public class House extends Building {


  private ArrayList<String> residents;
  private boolean hasElevator;

  public House(String name, String address, int nFloors, boolean hasElevator) {
    super (name, address, nFloors);
    this.hasElevator =  hasElevator;
    this.residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  public void showOptions(){
    super.showOptions();
    System.out.println("Available options at " + this.name + ":\n + hasDiningRoom() \n + nResidents() \n + moveIn() \n + isResident()");
}

public void goToFloor(int floorNum){
    super.goToFloor(floorNum);
    if (this.hasElevator == false) {
        throw new RuntimeException("This house does not have an elevator.");
    }
    if (this.activeFloor == -1) {
        throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
    }
    if (floorNum < 1 || floorNum > this.nFloors) {
        throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
    }
    System.out.println("You are now on floor #" + floorNum + " of " + this.name);
    this.activeFloor = floorNum;
}

public void goToFloor(){
    throw new RuntimeException("Please specify a floor.");
}

  public boolean hasElevator() {
    if (hasElevator = true) {
      return true;
    } else {
        return false;
    }
  }

  public int nResidents() {
    return residents.size();
  }

  public void moveIn(String name) {
    residents.add(name);
  }

  public void moveIn(Integer ID) {
    residents.add(ID.toString());
  }

  public String moveOut(String name) {
      for (int i = 0; i < residents.size() - 1; i++) {
        if (residents.contains(name)) {
          return residents.get(i);
        }
      }
      return "Resident not found.";
  }

  public String moveOut(Integer ID) {
        for (int c = 0; c < residents.size() - 1; c++) {
        if (residents.contains(ID.toString())) {
          return residents.get(c);
        }
      }
      return "Resident not found.";
  }

  public boolean isResident(String person){
    for (int i = 0; i < residents.size() - 1; i++) {
      if (residents.contains(person)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    House Chapin = new House("Chapin", "1 Chapin Way", 4, true);
    Chapin.hasElevator();
  
  }

}