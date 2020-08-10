package Collections;

import java.util.*;

public class Lists {

    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList<>();
       l.add(1);
        l.add(10);
        l.add(15);
        System.out.println(l);//To print all values toghether o/p-->[1, 10, 15]
        l.add(1, 5);//To add values between the numbers which cannot be done by numbers
        System.out.println(l);//o/p--->[1, 5, 10, 15]
        Collections.sort(l);//To sort elements inside the list
        System.out.println(l);//o/p--.[1, 5, 10, 15]
        Collections.reverse(l);//To reverse
        System.out.println(l);//o/p-->[15, 10, 5, 1]
        Collections.shuffle(l);//To shuffle list
        System.out.println(l);//o/p-->[5, 1, 10, 15]
        l.remove(3);//To remove all the values at a specified position
        System.out.println(l);//o/p-->[1, 5, 10]
        System.out.println(l.hashCode());//o/p-->958442
        l.clear();//TO CLEAR ALL
        System.out.println(l);//o/p-->[]

       /* //To add random values command above before using it
        Random r = new Random();
        for (int i = 1; i <=10; i++) {
            l.add(r.nextInt(1000));
        }
        System.out.println(l);//o/p-->[204, 121, 959, 787, 399, 841, 64, 441, 563, 130]*/
    }
    
}

//To add the values at time of instansation
/*use-->List<Integer> a = Array.asList(1,2,3);
By Anonymus inner class
List<Integer> a = new ArrayList<Integer>(){{
    add(1);
    add(2);
    add(3);
}};
*/