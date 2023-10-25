/* This is a stub for the Cafe class */
public class Cafe extends Building {

    // Constructor for Cafe, takes in name, address, and nFloors from parent class. Initializes nCoffeeOunces, nSugarPackets, nCreams, and nCups
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.name = name;
        this.address = address;
        this.nFloors = nFloors;
        private int nCoffeeOunces = 200;
        private int nSugarPackets = 50;
        private int nCreams = 50;
        private int nCups = 50;
    }
    // sellCoffee method takes in a size, number of sugar packets and number of creams, and subtracts them from the inventory. Throws an exception if one of the items is sold out. Calls restock.
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        nCoffeeOunces -= this.size;
        nSugarPackets -= this.nSugarPackets;
        nCreams -= this.nCreams;
        if (nCoffeeOunces == 0){
            throw new RuntimeException("Unfortunately we are out of coffee. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }
    }
    // restock method. Takes in nCoffeeOunces, intnSugarPackets, nCreams, nCups, and restocks each so they return to the original inventory level.
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        nCoffeeOunces = 200;
        nSugarPackets = 50;
        nCreams = 50;
        nCups = 50;
    }
    
    public static void main(String[] args) {
        new Cafe();
    }
    
}
