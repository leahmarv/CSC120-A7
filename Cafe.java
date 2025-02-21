/*
 * Cafe Class
 * Assignment 7
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Leah Marville
 * @version 8 November 2022
 */

public class Cafe extends Building {

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
        super (name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces = coffee;
        this.nSugarPackets = sugar;
        this.nCreams = cream;
        this.nCups = cups;
    }

    public Cafe(String name, String address, int nFloors) {
        super (name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces = 0;
        this.nSugarPackets = 0;
        this.nCreams = 0;
        this.nCups = 0;
    }
    
    public void goToFloor(int floor){
        
    }

    public void showOptions(){
        super.showOptions();
        System.out.println("Available options at " + this.name + ":\n + sellCoffee() \n + restock()");
    }
    
    public void sellCoffee(int size, int sugar, int cream) {
        
        nCoffeeOunces -= size;
        nSugarPackets -= sugar;
        nCreams -= cream;
        nCups -= 1;

        if (nCoffeeOunces < 1 || nSugarPackets < 1 || nCreams < 1 || nCups < 1) {
            restock(size, sugar, cream, 1);
        }
    }


    public void sellCoffee(int size, int cream){
        nCoffeeOunces -= size;
        nCreams -= cream;
        nCups -= 1;

        if (nCoffeeOunces < 1 || nSugarPackets < 1 || nCreams < 1 || nCups < 1) {
            restock(size, 0, cream, 1);
        }
    }

    private void restock(int coffee, int sugar, int cream, int cups) {
        nCoffeeOunces += coffee;
        nSugarPackets += sugar;
        nCreams += cream;
        nCups += cups;
    }

    public static void main(String[] args) {
        //new Cafe();
    }
    
}