
import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {
public static void main(String [] args){
    Vector<Integer> vector =new Vector<>(5,3);//customized increment other wise it will be doubled
    System.out.println(vector.capacity());//double capacity
   
    

    //add 
    vector.add(1);
     vector.add(2);
      vector.add(3);
       vector.add(4);
        vector.add(15);
    
    //add(idx,element)
    vector.add(2,4);

    //get(idx)
    vector.get(1);

    //set(idx,elem)
    vector.set(2,4);

    //remove the first occ of spec element
    ///vector.remove(object);

    //remove the element
    vector.remove(3);

    //size-size()
   //isEmpty
   //conatins(object o)
   //clear()


//Array list is not syncronized
// ArrayList<Integer> list=new ArrayList<>();
Vector<Integer> list=new Vector<>();
Thread t1=new Thread(()->{
    for(int i=0;i<1000;i++){
        list.add(i);
    }
});

Thread t2=new Thread(()->{
    for(int i=0;i<1000;i++){
        list.add(i);
    }
});
t1.start();
t2.start();
try{
    t1.join();
    t2.join();
}catch(InterruptedException e){
    e.printStackTrace();
}
System.out.println(list.size()); //output 2000-->1459(for arraylist not sybcronized)




}

    
}

/*
1.synchronized , thread safe(jdk 1.0)before collection framewoek
2.due to synch overhead good to use other classes
3.Like arrayL, vector is a dynamic array that grows automatically, when more elements are added than its current capacity.
4.all methods in vector are synchronized, which makes it thread safe , this means multiple threads can work on vector without risk of corrupting the data.
5.Legacy class: part of java's original release.
6.random access

grows--> double the size


all methods are synchronized-->
only 1 thread can access the vector at a time, thread safe but
can introduce performance issue .

*/
