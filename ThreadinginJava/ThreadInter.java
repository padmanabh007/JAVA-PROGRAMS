package ThreadinginJava;
//Using thread as an interface
public class ThreadInter {
    
    public static void main(String[] args) {
        
        //Creating object of the two classes
        Runnable obj1 = new Hiii();
        Runnable obj2 = new Hellooo();

        //to make it work we need to use the object of thread and pass the object of the runnable implemented class
        Thread t1 =  new Thread(obj1);
        Thread t2 = new Thread(obj2);

        //Strting the  thread
        t1.start();
        t2.start();
    }
}

//using The Runnable Interface
class Hiii implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");

            // For delay we are using the thread.sleep method inside the try catch block
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }

}
class Hellooo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");

            // For delay we are using the thread.sleep method inside the try catch block
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }

}

/* OutPut
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
The output is depend on the thread
 */