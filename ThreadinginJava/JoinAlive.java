//About Join and live methods
package ThreadinginJava;

public class JoinAlive {
    
    //We want to print bye at last after every Hi and Hello
    public static void main(String[] args)  throws Exception {//Exception is for Join()
        
        Thread t1 =new Thread(()->{for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }});
        Thread t2 =new Thread(()->{for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }});
        t1.start();
        t2.start();

        //To find if t1 and t2 is alive
        System.out.println(t1.isAlive());//o/p-->true
        System.out.println(t1.isAlive());//o/p-->true

        //doing this will print Bye anywhere  beause it is done by main thread
        //System.out.println("Bye");

        //to print bye at last use join method to ask main to wait until execution is completed
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());//o/p-->false
        System.out.println(t1.isAlive());//o/p-->false
        //The false means main is executing after thread t1 and t2
        System.out.println("Bye");

    }
}
/*Output when Bye used at last
Bye
Hello
Hi
Hello
Hi
Hi
Hello
Hi
Hello
Hi
Hello */

/*After join method
Hello
Hi
Hi
Hello
Hello
Hi
Hello
Hi
Hello
Hi
Bye 
*/