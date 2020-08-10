package Collections;
//Collections provide dynamic type of array
/*Consist of
1.Set-1.HashSet 2.LinkedHashset etc
2.List-1.ArryList 2.Vector 3.LinkedList
3.Queue-1.LinkedList 2.PriorityQueue */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Collections in java
public class Collect {
    
    public static void main(String[] args) {
        
        //To use collection we need to use the collection interface
        //Arraylist is a class to which the collection is implements
        //It can have any datatype
        Collection c = new ArrayList<>();
        c.add(1);
        c.add("Raj");
        c.add(true);
        /*for (Object object : c) {
            System.out.println(object);//o/p-->1 Raj true
        }*/
        //Else to print 
        Iterator i = c.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
       
         //to make it support only one typre use gnerics(<>)
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(1);
        c1.add(2);
        c1.add(4);
        for (Integer integer : c1) {
            System.out.println(integer);//o/p-->1 2 4
        }
        c1.remove(1);//to remove insde the collction
        for (Integer integer : c1) {
            System.out.println(integer);//o/p-->2 4
        }  
    }
}
/*
1.List Which can have duplicte values
2.Set Which cannot have duplicte values
3.Map is having an jey value relation ship Map<key,value> 
    Key can be int,string etc */