import java.io.*;
class Bus{
    int Total(int Pass_Per_Day,int NumDays){
        int n=1200000;
        if(NumDays==1){
            return Pass_Per_Day;
        }
        else{
            Pass_Per_Day=Pass_Per_Day+n;
            NumDays--;
            return Total(Pass_Per_Day,NumDays);
        }
    }
    public static void main(String[] args){
        Bus b=new Bus();
        int NumDays=365;
        int Pass_Per_Day=1200000;
        int s=0;
        s=b.Total(Pass_Per_Day,NumDays);
        System.out.println("Total Passangers in an year is "+s);
    }
}