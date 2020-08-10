package Collections;
//Comparator Interface

import java.util.*;

public class Compa {
    
    public static void main(String[] args) {
        
        List<Integer> val = new ArrayList<>();
        val.add(301);
        val.add(567);
        val.add(998);
        val.add(236);
        val.add(880);
        System.out.print(val);//o/p-->[301, 567, 998, 236, 880]
        Collections.sort(val);
        System.out.print(val);//o/p-->[236, 301, 567, 880, 998]

        //To specify the way of sorting in the comparator where the object of comparator is passed inside the sort()
        Comparator<Integer> co = new Compara();

        //To sort in normal way use if(o1>o2)
        //Collections.sort(val,co);
        //System.out.print(val);//o/p-->[236, 301, 567, 880, 998]

        //To sort with respect to the last digit of the number
        Collections.sort(val,co);
        System.out.print(val);//o/p-->[880, 301, 236, 567, 998]

       /* //Else use
        Comparator<Integer> col= new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {

             //if o1>o2 is greater than it will swap if we return 1
                if(o1%10>o2%10)
                    return 1;
                return -1; 
            }
        };
        Collections.sort(val, col);
        System.out.print(val);//o/p-->[880, 301, 236, 567, 998]*/

        /*//Else using lambda expression
        Comparator<Integer> col =(o1,o2)->{
            if(o1%10>o2%10)
                    return 1;
                return -1; 
        };
        Collections.sort(val, col);
        System.out.print(val);//o/p-->[880, 301, 236, 567, 998]*/
    }
}
//Since the comparator is an interface its object cannot be created so we are defining a class so that it can be inherited
class Compara implements Comparator<Integer>{

    // Since it is to be worked as the comparator these methods to be overrided
    @Override
    public int compare(Integer o1, Integer o2) {

        //if o1>o2 is greater than it will swap if we return 1
        if(o1%10>o2%10)
            return 1;
        return -1;
    }

}


//We can use terinary operator
/*
Collections.sort(values,(o1,o2)->{return o1%10>o2%10}); */