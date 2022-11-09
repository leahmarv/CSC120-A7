/*
 * Library Class
 * Assignment 7
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Leah Marville
 * @version 8 November 2022
 */


 import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable <String, Boolean> collection;
    
    public Library(String name, String address, int nFloors) {
      super (name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void showOptions(){
        super.showOptions();
        System.out.println("Available options at " + this.name + ":\n + addTitle() \n + removeTitle() \n + checkOut() \n + returnBook() \n + containsTitle() \n + isAvailable() \n + printCollection()");
    }

    public void goToFloor(int floorNum){
        super.goToFloor(floorNum);
        if (this.activeFloor == -1) {
            throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        }
        if (floorNum < 1 || floorNum > this.nFloors) {
            throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
        }
        System.out.println("You are now on floor #" + floorNum + " of " + this.name);
        this.activeFloor = floorNum;
    }

    public void addTitle(String title) {
        collection.put(title, true);
    }

    public String removeTitle(String title) {
        collection.remove(title);
        return title;
    }

    public void checkOut(String title) {
        collection.replace(title, true, false);
    }

    public void returnBook(String title) {
      collection.replace(title, true, false);
    }
  
    public boolean containsTitle(String title) {
      for (int i = 0; i < collection.size() - 1; i++) {
        if (collection.contains(title)) {
          return collection.get(title);
        }
      }
      return false;
    }

    public boolean isAvailable(String title) {
      if (collection.get(title) ==  true) {
        return true;
      } else {
        return false;
      }
    }

    public void printCollection() {
      collection.toString();
    }

    public static void main(String[] args) {
      //new Library();
    }
  
  }