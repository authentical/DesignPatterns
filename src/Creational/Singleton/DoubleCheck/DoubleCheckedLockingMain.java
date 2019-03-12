package Creational.Singleton.DoubleCheck;


/* First time a thread encounters the null class, there may be a fight
over who instantiates it but after that, no thread will ever have to
wait on the synchronized block

 */

public class DoubleCheckedLockingMain {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DoubleCheckedLocking.getInstance("Thread-1"); // Get reference OR instantiate on heap
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DoubleCheckedLocking.getInstance("Thread-2"); // Get reference OR instantiate on heap
            }
        });

        t1.start(); t2.start();

    }
}



class DoubleCheckedLocking{

    private volatile static DoubleCheckedLocking instance = null;

    private DoubleCheckedLocking(){}


    // no sync on method
    public static DoubleCheckedLocking getInstance(String threadID){


        if(instance==null){
            System.out.println(threadID + " sees " + DoubleCheckedLocking.class + " instance was null");
            synchronized(DoubleCheckedLocking.class) {
                System.out.println(threadID + " got the lock");
                if(instance==null){
                    System.out.println(threadID + " sees instance was null inside synchronized block");
                    instance = new DoubleCheckedLocking();
                    System.out.println(threadID + " tripped the instantiation");
                } else {
                    System.out.println(threadID + " sees " + DoubleCheckedLocking.class + " was already instantiated");
                }
            }
        }
        return instance;

    }
}
