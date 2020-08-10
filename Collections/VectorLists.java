package Collections;
//Wher vector is a type of list

import java.util.ArrayList;
import java.util.Vector;

public class VectorLists {
    
    public static void main(String[] args) {
        
        Vector v = new Vector<>();
        v.add(1);
        v.add(7);
        //it is the default capacity as number of values become greater then 10 changes to 20 and then changes to 40
        System.out.println(v.capacity());//Will give the capacity of the vector o/p-->10 
        System.out.println(v);//o/p-->[1, 7]


        //ArrayList
        //ArrayList<Integer> al = new ArrayList<Integer>();

    }
}



/*    Vector          v/s           Array 
   It uses lots of        There will not be any  
   memory                 waste of memory
   They are thread        They are not thread 
   safe                   safe
   They are slow          They are fast
   since they are         since they are
   thread safe            thread safe 
*/