//Thread Syncronization
//Synchronized will make thread safe
package ThreadinginJava;

public class Synchro {
    
    public static void main(String[] args) throws Exception{
        
        Counter c = new Counter();
        //c.Increment();
        //System.out.println("Count = "+ c.count);//o/p-->Count = 1

        /*//Insted of main as given we are 1 threads
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    c.Increment();
                }
            }
        });
        t1.start();
        t1.join();//asking main wait till t1 completes job
        System.out.println("Count = "+ c.count);//o/p-->Count = 1000*/

        //Insted of main as given we are 2 threads
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    c.Increment();
                }
            }
        });
        //Insted of main as given we are 1 threads
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    c.Increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        //Before adding syncronization
        //System.out.println("Count = "+ c.count);//o/p-->Count = 1914 we are not getting the correct value because two threads are doing the operation
        //wehere t1 and t2 are working parallely so as t2 reaches t1 would be incompleted as vice versa and hapanning multiple times

        //so make only one method work at a time we need to make it synchronized then when t1 working t2 waits and t2 working t1 should wait
        //After adding syncronization in Increment()
        System.out.println("Count = "+ c.count);//o/p-->Count = 2000
    }
}
class Counter{

    int count;

    //to just increment the count
    public synchronized void Increment(){
        count++;
    }
}