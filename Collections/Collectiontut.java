package Collections;
//Application of the comparator

import java.util.*;


public class Collectiontut {
    
    public static void main(String[] args) {
        
        List<Studnets> ls = new ArrayList<>();
        ls.add(new Studnets(1, 90));
        ls.add(new Studnets(2, 96));
        ls.add(new Studnets(3, 94));
        ls.add(new Studnets(4, 93));
        ls.add(new Studnets(5, 95));
        System.out.print(ls);//o/p-->[Studnets{ Rollno1,Marks90}, Studnets{ Rollno2,Marks96}, Studnets{ Rollno3,Marks94}, Studnets{ Rollno4,Marks93}, Studnets{ Rollno5,Marks95}]
        for (Studnets s : ls) {
            System.out.println(s);
            /*Studnets{ Rollno2,Marks96}
              Studnets{ Rollno3,Marks94}
              Studnets{ Rollno4,Marks93}
              Studnets{ Rollno5,Marks95} */
        }
        //Sorting based on marks of student
        Collections.sort(ls,(s1,s2)->{return s1.marks>s2.marks?-1:s1.marks>s2.marks?1:0;});
        System.out.print(ls);//o/p-->[Studnets{ Rollno2,Marks96}, Studnets{ Rollno5,Marks95}, Studnets{ Rollno3,Marks94}, Studnets{ Rollno4,Marks93}, Studnets{ Rollno1,Marks90}]

    }
}

class Studnets{

    int rollno;
    int marks;
    public Studnets(int rollno, int marks) {
         this.marks=marks;
         this.rollno=rollno;
    }
    @Override
    public String toString() {
        return "Studnets{ Rollno"+rollno+",Marks"+marks+"}";
    }
}