/* This is a stub for the Library class */
import java.util.Enumeration;
import java.util.Hashtable;
// Creates library as an extension of building. Initializes the hashtable of books. the key is title and author, the key is a boolean that returns a value for whether or not the book is available.
public class Library extends Building {
    public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a library: 📖");
    Hashtable<String, Boolean>collection = new Hashtable<String, Boolean>();
    }
    // Add title method. Takes in the key and value, puts it into the hashtable
  public void addTitle(String title, Boolean available){
    collection.put(title, available);
  }
  // Remove title method. Takes in key and value. Removes the book from the hashtable
  public void removeTitle(String title, Boolean available){
    collection.remove(title, available);
  }
  // Check out method. Takes in key and value. Replaces value with false so the book is no longer available.
  public void checkOut(String title, Boolean available){
    collection.replace(title, available.equals(true), available.equals(false));
  }
  // Return method. Takes in key and value. Replaces the value with true so that the book is available. 
  public void returnBook(String title, Boolean available){
    collection.replace(title, available.equals(false), available.equals(true));
  }
  // containsTitle method that returns a boolean. Checks if the hashtable contains a book, if not prints a statement, it it does prints a statement.
  public boolean containsTitle(String title){
    Hashtable.containsKey(this.title);
    if (containsTitle(title).equals(false)){
      System.out.println("Sorry, for the inconvenience. "+title+"is not in our system");
    }else{
      System.out.println(title+" is in our system.");
    }
  }
// isAvailable method returns a boolean and prints a statement if the book is available. Prints a statement if the book is not. 
public boolean isAvailable(String title){
  if (collection.contains(title, false)){
    System.out.println("Sorry, for the inconvenience. "+title+"is not currently available.");
  }else{
    System.out.println(title+" is currently available.");
  }
}
// print collection uses hashtable enumeration to print each key (title and author).
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