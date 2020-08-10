package Collections;
//System.currentTimeMillis in java
import java.util.ArrayList;

public class CurrentTime {

    public static void main(String[] args) {

        //To know thwe time taken to do the process 
        long start=System.currentTimeMillis();
        
        ArrayList a = new ArrayList<>();

        //adding 1000000 the values
        for (int i = 0; i < 1000000; i++) {
            a.add(i);
        }
        long stop=System.currentTimeMillis();
        System.out.println(stop-start);//o/p-->36 milliseconds

        long values=System.currentTimeMillis();//o/p-->1597056238286 it is the tiemafter midnight,1st Jan 1970
        System.out.println(values);
    }
    
}

