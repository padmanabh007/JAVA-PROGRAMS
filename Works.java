import java.io.*;
public class Works{
    public static void main(String[] args){
        int WorkPerNurse[]={8,10,9,8,7,12};
        int n=0;
        int i=0;
        n=WorkPerNurse.length;
        int Total_work=0;
        float Avg_work=0;
        for(i=0;i<n;i++){
           Total_work=Total_work + WorkPerNurse[i];
            System.out.println(Total_work);
        } 
        Avg_work=Total_work/n;
        System.out.println("Average work per nurse on this day ="+Avg_work);
    }
}