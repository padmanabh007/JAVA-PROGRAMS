//thread using anonymus class
package ThreadinginJava;

public class ThreadAnonym {
    
    public static void main(String[] args) {
        
        //Using anonymus class of runnable for printing Hi and Hello
        Runnable r1 = new Runnable(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi");
                    try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
                }
            }
        };
        Runnable r2 = new Runnable(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    try {Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
                }
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
/*
Hello
Hi
Hello
Hi
Hello
Hi
Hi
Hello
Hi
Hello 
 */