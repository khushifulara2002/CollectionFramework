/*
We know arraylist and Linked list is not syncronized
and stack and vector have performance issue
To overcome this: CopyOnWriteArrayList

*/
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class CopyOnWriteArray {
    
    public static void main(String [] args){

    
    CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList <>();

   /*copy on write means whenver a write operation, like adding or removing an element
   instead of directly  modifying the existing list a new copy of the list is created and the modification is applied to that copy
   this ensures that other threads reading the list while it's being modified are unaffected.

   Read: fast and direct,they happen on stable list(w/o interefernce)
   Write: a new copy of list is created for every modificatoions,
   the refernce to the list is then updated so thar subsequent reads use their list

   example notepad--> notepad copy
use: when read is more
   */

// List<String> shop=new ArrayList<>(); //Exception in thread "main" java.util.ConcurrentModificationException

CopyOnWriteArrayList <String> shop= new CopyOnWriteArrayList<>();
shop.add("Milk");
shop.add("strawbery");
shop.add("cinammon");

for(String item: shop){
    System.out.println(item);
if(item.equals("Milk")){
    //trying to modify the list while reading
    shop.add("Butter");
    System.out.println("Added butter while reading");
}
}
System.out.println(shop);  //Exception in thread "main" java.util.ConcurrentModificationException

}
}
