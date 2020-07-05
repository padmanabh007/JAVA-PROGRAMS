//import java.io.*;
import java.util.*;
class Multiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c,s=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        System.out.println("The multiplication table for the given number is\n");

        //Gives the first 15 multiplicats of the given number
        for(int i=1;i<=15;i++){
            s=i*n;
            System.out.println(i+"X"+n+"="+s);
        }sc.close();
    }
}



//to read we can use
//BufferReader sc=new BufferReader(newInputStreamReader(Syustem.in))
//int n
//n=Integerparseint(in.readline())