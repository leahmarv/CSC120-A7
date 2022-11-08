/*
 * House Class
 * Assignment 6
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Leah Marville
 * @version 1 November 2022
 */

import java.util.ArrayList;

public class House extends Building {


  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super (name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    if (hasDiningRoom = true) {
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

  public String moveOut(String name) {
      for (int i = 0; i < residents.size() - 1; i++) {
        if (residents.contains(name)) {
          return residents.get(i);
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
    Chapin.hasDiningRoom();
  
  }

}