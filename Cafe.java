/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces = 200;
    private int nSugarPackets = 50;
    private int nCreams = 50;
    private int nCups = 50;
    // Constructor for Cafe, takes in name, address, and nFloors from parent class. Initializes nCoffeeOunces, nSugarPackets, nCreams, and nCups
    /**
   * This is the constructor for the cafe
   * @param   name String
   * @param   address String
   * @param   nFloors integer number of floors.
   * @return  Returns a cafe. 
   */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.name = name;
        this.address = address;
        this.nFloors = nFloors;
    }

    /**
   * This is an accessor for the number of ounces of coffee
   * @param   none
   * @return  Returns the number of ounces of coffee. 
   */
    public int getnCoffeeOunces(){
        return this.nCoffeeOunces;
    }
    /**
   * This is an accessor for the number of sugar packets
   * @param   none
   * @return  Returns the number of sugar packets. 
   */
    public int getnSugarPackets(){
        return this.nSugarPackets;
    }
    /**
   * This is an accessor for the number of creams.
   * @param   none
   * @return  Returns the number of creams. 
   */
    public int getnCreams(){
        return this.nCreams;
    }
    /**
   * This is an accessor for the number of cups.
   * @param   none
   * @return  Returns the number of cups.
   */
    public int getnCups(){
        return this.nCups;
    }



    /**
   * This is a method to sell the coffee. Takes in a size, number of sugar packets and number of creams, and subtracts them from the inventory. Throws an exception if one of the items is sold out. Calls restock.
   * @param   size integer
   * @param   nSugarPackets int
   * @param   nCreams int
   * @return  none
   */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (size >= this.nCoffeeOunces){
            throw new RuntimeException("Unfortunately we are out of coffee. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }else if (nSugarPackets>=this.nSugarPackets){
            throw new RuntimeException("Unfortunately we are out of sugar. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }else if (nCreams>=this.nCreams){
            throw new RuntimeException("Unfortunately we are out of cream. Wait a moment while we restock.");
            restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
    }

    // restock method. Takes in nCoffeeOunces, intnSugarPackets, nCreams, nCups, and restocks each so they return to the original inventory level.
    /**
   * This is a method to restock. Takes in number of coffee ounces, number of sugar packets, number of cups, and number of creams, and resets them to their original value. 
   * @param   nCups int
   * @param   nSugarPackets int
   * @param   nCreams int
   * @param   nCoffeeOunces int
   * @return  none
   */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        nCoffeeOunces = 200;
        nSugarPackets = 50;
        nCreams = 50;
        nCups = 50;
    }
}
