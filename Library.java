
import java.util.Enumeration;
import java.util.Hashtable;
// Creates library as an extension of building. Initializes the hashtable of books. the key is title and author, the key is a boolean that returns a value for whether or not the book is available.

public class Library extends Building {
    private Hashtable <String, Boolean> collection;
    /**
   * This is the constructor for the library
   * @param   name String
   * @param   address String
   * @param   nFloors integer number of floors.
   * @return  Returns a library. 
   */
    public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a library: 📖");
    this.collection = new Hashtable<String, Boolean>();
    }
    /**
   * Add title method. Takes in the key and value, puts it into the hashtable
   * @param   title String
   * @return  none
   */
  public void addTitle(String title){
    collection.put(title, available);
  }
    /**
   * Remove title method. Takes in key and value. Removes the book from the hashtable
   * @param   title String
   * @return  none
   */
  public void removeTitle(String title){
    if !collection.containsKey(title){
      throw new RuntimeException(title+" does not exist in our collection and cannot be removed.");
    }
    collection.remove(title, available);
  }
    /**
   * Check out method. Takes in key and value. Replaces value with false so the book is no longer available.
   * @param   title String
   * @return  none
   */
  public void checkOut(String title){
    if !collection.containsKey(title){
      throw new RuntimeException(title+" does not exist in our collection and cannot be checked out.");
    }
    available.equals(false);
  }
    /**
   * Return method. Takes in key and value. Replaces the value with true so that the book is available. 
   * @param   title String
   * @return  none
   */
  public void returnBook(String title){
    if collection.containsKey(title){
      throw new RuntimeException(title+" does not exist in our collection and cannot be returned.");
    }
    available.equals(true);
    }
    /**
   * containsTitle method that returns a boolean. Checks if the hashtable contains a book, if not prints a statement, it it does prints a statement.
   * @param   title String
   * @return  boolean
   */
  public void containsTitle(String title){
    if (collection.containsKey(title)){
      System.out.println("It looks like "+title+" is currently in our system");
    }System.out.println("Sorry, for the inconvenience. "+title+" is not currently in our system.");
  }
    /**
   * isAvailable method returns a boolean and prints a statement if the book is available. Prints a statement if the book is not. 
   * @param   title String
   * @return  boolean
   */
  public boolean isAvailable(String title){
    if (collection.get(title).equals(false)){
      System.out.println("Sorry, for the inconvenience "+title+" is not currently available");
    }System.out.println(+title+" is  currently available");

  }
   /**
   * print collection uses hashtable enumeration to print each key (title and author).
   * @param   none
   * @return  none
   */
  public void printCollection(){
    System.out.println("**********Library Collection**********");
    Enumeration enu = collection.keys();
    while (enu.hasMoreElements()){
      System.out.println(enu.nextElement());
    }
  }

    public static void main(String[] args) {
      new Library();
    }
  
  }
