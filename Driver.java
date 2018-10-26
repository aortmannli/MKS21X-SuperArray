public class Driver{
  // this Driver is built on Tejas' driver
  public static void main(String[] args){
    SuperArray SA = new SuperArray();
  System.out.println("Created an empty SuperArray \"SA\" with capacity 10\n\n");

  /**************************************************************************/


  System.out.println("SA is empty (should return true):  " + SA.isEmpty());
  System.out.println("SA's size:                         " + SA.size());

  /**************************************************************************/
  System.out.println("Testing add and resize.");
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
  SA.add("coffee");
  SA.add("peach");
  SA.add("beep boop");
  SA.add("unacceptable");
  System.out.println("SA's current value (should return {38,666,Historicus,Greetings!,beep boop ,i,like,coffee,coffee,peach,beep boop, unacceptable})':\n                                  " + SA);

  System.out.println("SA's size (should return 12):                         " + SA.size() + "\n");

  /***************************************************************************/
  System.out.println("Testing get.");
  System.out.println("Index: 0 (should return 38)   Value:" + SA.get(0));
  System.out.println("Index: 11 (should return unacceptable)   Value:" + SA.get(11));

  /***************************************************************************/
  System.out.println("Testing contains.");
  System.out.println("Does SA contain beep boop (should return true)?     "+SA.contains("beep boop"));
  System.out.println("Does SA contain beep yeet (should return false)?    "+SA.contains("yeet")+ "\n \n");


  /***************************************************************************/
  System.out.println("Testing index methods.");
  System.out.println("Value: coffee         Index(should print 7):            " + SA.indexOf("coffee"));
  System.out.println("Value: beep boop      Index(should print 4):            " + SA.indexOf("beep boop"));
  System.out.println("Value: 38             Index(should print 0):            " + SA.indexOf("38"));
  System.out.println("Value: yeet           Index(should print -1):          " + SA.indexOf("yeet")+"\n");

  System.out.println("Value: beep boop      Last Index(should print 10):      " + SA.lastIndexOf("beep boop"));
  System.out.println("Value: coffee         Last Index(should print 8):       " + SA.lastIndexOf("coffee"));
  System.out.println("Value: peach          Last Index(should print 9):       " + SA.lastIndexOf("peach"));
  System.out.println("Value: yeet           Last Index(should print -1):      " + SA.lastIndexOf("yeet")+ "\n \n");



  /***************************************************************************/
  System.out.println("Testing add with index.");

  System.out.println(SA);
  System.out.println("SA's size (should return 12):                         " + SA.size() + "\n");
  SA.add(3,"yeet");
  System.out.println("Index 3 should be yeet \n" + SA);
  System.out.println("SA's size (should return 13):                         " + SA.size() + "\n");
  SA.add(0,"yote");
  System.out.println("Index 0 should be yote \n" + SA);
  System.out.println("SA's size (should return 14):                         " + SA.size() + "\n \n \n");

  /***************************************************************************/
  System.out.println("Testing remove.");
  System.out.println(SA);
  System.out.println(SA.remove(5)+"\n"+ SA);
  System.out.println("Index: 90 should print null Value: "+SA.remove(90)+"\n"+ SA);
  System.out.println("\n \n");
  System.out.println(SA);
  System.out.println("Value removed: yeet" + SA.remove("yeet")+"\n"+ SA+"\n");
  System.out.println("Value removed: 666" + SA.remove("666")+"\n"+ SA+"\n");
  System.out.println("Value: line should return false           "+SA.remove("line")+"\n"+ SA);
  }
}
