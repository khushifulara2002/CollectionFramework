import java.util.LinkedList;
import java.util.Arrays;

/*
1.Linked list is a linear data structure where each element
is a separate object called a node. Each node conatins
two parts:
   a. data:the value stored in the node.
   b.pointers:2 pointers,one pointing to the next node
   and other pointing to previous nodes.

1. insertions and deletions: LL is better fopr frequent deletions and insertions in the middle
of the list because no shifting as in AL

2.Random access: LL has slower random access(get(int (idx))
bcz it has to traverse the list from beginning 
to reach the desired index.

3.memory overhead: LL requires more memory than array list because each node
requires extra memory to store refernces to next and prev node




*/



public class LinkList{

    public static void main(String args[]){

        LinkedList<Integer> link=new LinkedList<>();
        link.add(1);
        link.add(2);
        link.add(3);
        link.get(2); //O(n)
        link.addLast(4); //O(1)
        link.addFirst(0); //O(1)
        link.getFirst();
        link.getLast();
        System.out.println(link);


        LinkedList<String> animals= new LinkedList<>(Arrays.asList("cat","Dog","Elephant"));
        LinkedList<String> animalsToRemove= new LinkedList<>(Arrays.asList("cat","Goat","buffalo"));
    animals.removeAll(animalsToRemove);
    System.out.println(animals);
    }




}



/*
node--> data, pointer
|1|->| |2|->| |3->| null

Implements the List Interface, a linked list stores
its elements as nodes in a doubly linked list.





public class LinkedList {
public static void main(String [] args){
    Node node1= new Node();
    Node node2=new Node();
    node2.value=2;
    node1.value=1;

    node1.next=node2;
    node2.next = null;
}

    
}

class Node{

    public int value;
    public Node next;//refernece to next node.
}
*/
