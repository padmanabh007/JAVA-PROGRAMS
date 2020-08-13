//thread function using lambda
//Since runnable is a functional interface we can use lambda expression
package ThreadinginJava;

public class ThreadLambda {

    public static void main(String[] args) {

        // Executing the thread using runnable
        /*//Method 1
        Runnable r1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
            }};
        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
            }}; 
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();*/
        
        //Method 2
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
    }
}
/*Output-1
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi */

/*Output-2
Hello
Hi
Hi
Hello
Hello
Hi
Hi
Hello
Hello
Hi */