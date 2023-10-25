/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{

// Constructor takes in the name, address, and nFloors from parent class
// Initializes a boolean whether or not the house has a dining room. Initializes an array list of resident names.
  public House(String name, String address, int nFloors) {
    super (name, address, nFloors);
    System.out.println("You have built a house: 🏠");
    private ArrayList<String> residents;
    private boolean hasDiningRoom;
    this.name = name;
    this.address = address;
    this.nFloors = nFloors;
  }
// accesses the private boolean has dining room 
  public boolean hasDiningRoom(){

  }
// Accesses the number of residents
  public int nResidents(){

  }
// Adds a student to the array list, residents.
  public void moveIn(){
    residents.add(this.name);
  }
// Removes a student from the array list, residents
  public void moveOut(){
    residents.remove(this.name);
  }
// A boolean that will confirm whether or not a particular resident lives in a particular house.
  public boolean isResident(){
    if (resident.contains(this.name)){
      System.out.println("Yes! " +this.name + "lives in the house.");
    }
  }

  public static void main(String[] args) {
    new House();
  }

}
