/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

// Initializes a boolean whether or not the house has a dining room. Initializes an array list of resident names.
    /**
   * Constructor for the house.
   * @param   name string
   * @param   address string
   * @param   nFloors int
   * @param   hasDiningRoom boolean
   * @return  a house
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super (name, address, nFloors);
    System.out.println("You have built a house: 🏠");
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;
  }

    /**
   *Accessor for the private boolean has dining room 
   * @param   none
   * @return  boolean hasDiningRoom
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
    /**
   *Accessor for the private int nResidents 
   * @param   none
   * @return  int nResidents
   */
  public int nResidents(){
    return this.residents.size();
  }
    /**
   *Adds a student to the array list, residents.
   * @param   none
   * @return  none
   */
  public void moveIn(student.name){
    if this.residents.contains(String student.name){
      throw new RuntimeException(student.name+" already lives in this house and cannot be moved in.");
    }
    residents.add(this.name);
  }
    /**
   *Removes a student from the array list, residents
   * @param   none
   * @return  none
   */
  public void moveOut(){
    if !this.residents.contains(String student.name){
      throw new RuntimeException(student.name+" does not live in this house and cannot be moved out.");
    }
    residents.remove(this.name);
  }
    /**
   *A boolean that will confirm whether or not a particular resident lives in a particular house.
   * @param   name String
   * @return  boolean
   */
  public boolean isResident(String student.name){
    return this.residents.contains(student.name);
  }

}
