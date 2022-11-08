/*
 * Library Class
 * Assignment 6
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Leah Marville
 * @version 2 November 2022
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