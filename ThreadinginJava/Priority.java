
//to getting thread priority
package ThreadinginJava;

public class Priority {
    
    public static void main(String[] args) {
        
        Thread t1 =new Thread(()->{for (int i = 0; i < 5; i++) {
            System.out.println("Hi"+Thread.currentThread().getPriority());
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }});
        Thread t2 =new Thread(()->{for (int i = 0; i < 5; i++) {
            System.out.println("Hello"+Thread.currentThread().getPriority());
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }});
        //To get the thread name
        //System.out.println(t1.getName());//o/p-->Thread-0
        //System.out.println(t2.getName());//o/p-->Thread-1

        //to change thread name
        t1.setName("Hi Thread");
        t2.setName("Hello Thread");
        System.out.println(t1.getName());//o/p-->Hi Thread
        System.out.println(t2.getName());//o/p-->Hello Thread

        //To get priority of thread where 1=Least Priority 5=Normal Priority 10=Highest priority
        //System.out.println(t1.getPriority());//o/p-->5
        //System.out.println(t2.getPriority());//o/p-->5

        //To change the priority
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println(t1.getPriority());//o/p-->1
        System.out.println(t2.getPriority());//o/p-->10
        //else
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());//o/p-->1
        System.out.println(t2.getPriority());//o/p-->10

        t1.start();
        t2.start();
    }
}

//After inserting Thread.currentThread().getPriority() before setting priority
/*
Hello5
Hi5
Hi5
Hello5
Hi5
Hello5
Hi5
Hello5
Hi5
Hello5 */

//After setting priority
/*
Hello10
Hi1
Hello10
Hi1
Hello10
Hi1
Hello10
Hi1
Hello10
Hi1
 */
