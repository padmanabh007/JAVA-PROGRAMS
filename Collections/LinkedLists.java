package Collections;
//Linked List
//It follows the concept of double linked list
import java.util.*;


public class LinkedLists {
    
    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList<>();
        ll.add(1);
        ll.add(4);
        ll.add(23);
        System.out.println(ll);//o/p-->1, 4, 23]
        //It uses all other fuctions that in list
        ll.forEach(System.out::println);//used to print values line by line
        /*1
          4
          23 */
    }
}

/*
*In array lsit it is time consuming than the linked list
*Array uses dynamic array and linked list uses double linked list hence faster
*In array it is easy to search by index and hece faster
*It will slow other time */