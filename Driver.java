public class Driver{
  public static void main(String[] args){
    SuperArray SA = new SuperArray();
  System.out.println("Created an empty SuperArray \"SA\" with capacity 10\n\n");

  /**************************************************************************/


  System.out.println("SA is empty (should return true):  " + SA.isEmpty());
  System.out.println("SA's size:                         " + SA.size());

  /**************************************************************************/

  SA.add("Foo");
  SA.add("666");
  SA.add("Historicus");
  System.out.println("\nAdded \"Foo\", \"666\", \"Historicus\" to SA");
  System.out.println("SA's current value':               " + SA);

  System.out.println("SA is empty (should return false): " + SA.isEmpty() + "\n");

  SA.set(0, "38");

  SA.add("Greetings!");
  SA.add("beep boop");
  SA.add("i");
  SA.add("like");
  SA.add("coffee");
  SA.add("josina");
  SA.add("peach");
  SA.add("beep boop");
  SA.add("unacceptable");
  System.out.println("SA's current value (should return {38,666,Historicus,Greetings!,beep boop,i,like,coffee,josina,peach,beep boop, unacceptable})':\n                                  " + SA);

  System.out.println("SA's size (should return 12):                         " + SA.size() + "\n");
  }
}
