package Collections;
//Using comparable

import java.util.*;
public class Comparab {
    
    public static void main(String[] args) {
        
        List<Studnetsss> ls = new ArrayList<Studnetsss>();
        ls.add(new Studnetsss(1, 90));
        ls.add(new Studnetsss(2, 96));
        ls.add(new Studnetsss(3, 94));
        ls.add(new Studnetsss(4, 93));
        ls.add(new Studnetsss(5, 95));

        //Sorthing using comparable based on the marks
        Collections.sort(ls);
        System.out.print(ls);//o/p-->[Studnets{ Rollno2,Marks96}, Studnets{ Rollno5,Marks95}, Studnets{ Rollno3,Marks94}, Studnets{ Rollno4,Marks93}, Studnets{ Rollno1,Marks90}]
        //Sorted using the funcion comparable
    }
}
class Studnetsss implements Comparable<Studnetsss>{

    int rollno;
    int marks;
    public Studnetsss(int rollno, int marks) {
         this.marks=marks;
         this.rollno=rollno;
    }
    @Override
    public String toString() {
        return "Studnets{ Rollno"+rollno+",Marks"+marks+"}";
    }

    //To run thr comparable the function is required
	@Override
	public int compareTo(Studnetsss s) {
		
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
}