package ThreadinginJava;
//To print hi and hello alternatively
/*Multi Threading*/

public class MultiDemo {

    public static void main(String[] args) {

        Hii obj1 = new Hii();
        Helloo obj2 = new Helloo();
        obj1.start();
        obj2.start();//To run the tread extended class
        
    }
}
//To print it is required to extend the thread
class Hii extends Thread {
    //Changing show method to run
    //By just extending thread we cannot use the class as thread for that we required to override the run method
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");

            // For delay we are using the thread.sleep method inside the try catch block
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
class Helloo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");

            // For delay we are using the thread.sleep method inside the try catch block
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
/*OutPut
Hello
Hi
Hi
Hello
Hi
Hello
Hello
Hi
Hello
Hi */