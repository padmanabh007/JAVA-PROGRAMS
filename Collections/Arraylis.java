package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//ArrayList in java
public class Arraylis {
    
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Raj");
        names.add("Vic");
        names.add("Arjun");
        names.add("Akshay");
        System.out.println(names+"\n");//o/p-->[Raj, Vic, Arjun, Akshay]

        //To print only duplicate values inside the array list
        names.add("Raj");
        System.out.println(names+"\n");//o/p-->[Raj, Vic, Arjun, Akshay, Raj]
        //To print raj we use set since set takes only unique elements
        Set<String> str = new HashSet<>();
        for (String name : names) {
            if (str.add(name)==false) {
               System.out.println(name); //o/p-->Raj
            }
        }
    }
}