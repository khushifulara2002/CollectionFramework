//It extend vector class

import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList;

public class StackDemo{

public static void main(String args[]){

    Stack<Integer> s1= new Stack<>();
    s1.push(1); //add the elements
    s1.push(2);
    s1.push(3);
    s1.push(4);
    s1.push(5);
    s1.push(6);
    System.out.println(s1);
    Integer removedElem =s1.pop();//remove latest added element
    System.out.println(s1);
    
    //get last added elememt top eleemmt
    Integer peek=s1.peek();
    System.out.println(peek);

    System.out.println(s1.size());
    System.out.println(s1.search(3)); //1st indexing

   //We can implement  LinkedList Class as stack
   LinkedList<Integer>list=new LinkedList<>();
   list.addLast(1);
   list.addLast(2);
   list.addLast(3);
   list.getLast();//peek
   
//array list as stack
  ArrayList<Integer> list1=new ArrayList<>();
  list1.add(1);
  list1.add(2);
  list1.add(3);
list1.get(list1.size()-1); //peek
list1.remove(list1.size()-1); //pop

//it is not a good practice to implement stack via LL ,AL classes
//so we use stack



    //extends vector : includes vector methods







}

}

/*
1.LIFO : last in first out
2.Syncornized and thread safe as it extned vector
3.stack is sub class of vector , it inherits all features of dynamic array but constained by LIFO



*/