public class Driver{
  public static void main(String[] args){
    SuperArray SA = new SuperArray();
  System.out.println("Created an empty SuperArray \"SA\" with capacity 10\n\n");

  /**************************************************************************/


  System.out.println("SA is empty (should return true):  " + SA.isEmpty());
  System.out.println("SA's size:                         " + SA.size());

  /**************************************************************************/

  SA.add("Fish");
  SA.add("45");
  SA.add("Fortnite");
  System.out.println("\nAdded \"Fish\", \"45\", \"Fortnite\" to SA");
  System.out.println("SA's current value':               " + SA.toString());
  
  System.out.println("SA is empty (should return false): " + SA.isEmpty());
  }
}
