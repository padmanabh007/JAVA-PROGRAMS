//Inter Thread Communication in java
//Achiving the two thread interaction
//wait is only to be used in Syncronized method else laead to an error
//wait and notify is comes in the object class because wait and notify on the thread is done with object and they wait for thet object
package ThreadinginJava;

public class InterThread {

    public static void main(String[] args) {
        
        T1 t = new T1();
        
        //Creating anonymus calss for both Producer and consumer
        new Producer(t);
        new Consumer(t);
    }
}

class T1 {
    int num;

    //Creeating the boolen va;lue for getting the correct output
    boolean valueSet =false;


    // To put value to num
    public synchronized void Put(int num) {
        
        //when wait() is called the Two threads wait each other until it completes
        while(valueSet){
            try {wait();} catch (Exception e) {e.printStackTrace();}
        }
        System.out.println("Put : "+num);
        this.num = num;
        //to set value set true if it becomes false
        valueSet=true;
        //To notify the Consumer thread
        notify();
    }

    // To grt num value
    public synchronized void Get() {
        //Asking get to wait till fetch the value
        while(!valueSet){
            try {wait();} catch (Exception e) {e.printStackTrace();}
        }
        System.out.println("Get : "+num);
        valueSet=false;
        //To notify the Producer thread
        notify();
    }
}

// For inter thread communication we use Producer and Consumer
// Creating a thread class which produce value
class Producer implements Runnable {

    // creating object of class t1
    T1 t;

    // Creating the constructor for this class
    public Producer(T1 t) {
        this.t = t;
        //For caliing run method we require the thread
        Thread t1 = new Thread(this,"Producer");
        t1.start();
    }

    // Calling the run() method of thread
    public void run() {
        int i = 0;
        // for infinate loop
        while (true) {
            t.Put(i++);// As it works it will change value of num
            // For out we need to make it wait for some second
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }

}
//Consumer which consumes the value created by th producer
class Consumer implements Runnable{
    
     // creating object of class t1
     T1 t;

     // Creating the constructor for this class
     public Consumer(T1 t) {
         this.t = t;
         //For caliing run method we require the thread
         Thread t1 = new Thread(this,"Producer");
         t1.start();
     }

    // Calling the run() method of thread
    public void run(){
        while (true) {
            t.Get();// As it works it will change value of num
            // For out we need to make it wait for some second
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

/*o/p it is not same as the input as we required as if Get:0 Put:0 And If Get:1 Put:1 so on
Get : 0
Put : 0
Put : 1
Get : 0
Put : 2
Get : 2
Put : 3
Get : 3
Put : 4
Get : 3
Get : 4
Put : 5
Put : 6
Get : 5
Get : 6
Put : 7
Get : 7
Put : 8
Get : 8
Put : 9
Get : 9
Put : 10
Put : 11
Get : 10
Get : 11
... */

/*After creating boolen value in chich Producer wait until consumer nitify and wise versa
Put : 0
Get : 0
Put : 1
Get : 1
Put : 2
Get : 2
Put : 3
Get : 3
Put : 4
Get : 4
Put : 5
Get : 5
Put : 6
Get : 6
Put : 7
Get : 7
Put : 8
Get : 8
Put : 9
Get : 9
Put : 10
Get : 10...*/
//This will wait even if the sleep time increases or decreases until the notify() notifies