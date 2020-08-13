package ThreadinginJava;
//Thread is a unit of process

//Thread is an inbuilt class inside the java
//Every thread has a method called as run() which is required for process
//Start() is a method is used to run()
//In a program if extending one class with two other calsses hich is not possible at that time we use the runnable interface to make coustomize thread

public class Multi {

    public static void main(String[] args) {

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        // Print Hi and Hello 5 times one after the other
        obj1.Show();// o/p-->Hi Hi Hi Hi Hi
        obj2.Show();// o/p-->Hello Hello Hello Hello Hello
    }
}

class Hi {

    /* //To print hi 5 times normally 
    public void Show(){ 
        for (int i = 0; i < 5;i++) 
            System.out.println("Hi"); 
    }
    */

    // to print Hi with a delay of 1 second
    public void Show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");

            // For delay we are using the thread.sleep method inside the try catch block
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}//The seconds is in Milliseconds
        }
    }
}
class Hello{

    /*//To print Hello 5 times normally
    public void Show(){
        for (int i = 0; i < 5; i++) 
            System.out.println("Hello");
    }*/

     // to print Hello with a delay of 1 second
     public void Show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");

            // For delay we are using the thread.sleep method inside the try catch block
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}//1000millisecond=1s
        }
    }
}










/*Uses
 * We can use all cores in an an machine whic make process eassier 
 * While creating web applictation in java using servlet then the servlet can make multiple thread
 * we can use in an synchronized way
 */