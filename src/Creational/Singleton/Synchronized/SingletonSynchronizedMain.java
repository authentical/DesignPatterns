package Creational.Singleton.Synchronized;


// Synchronizing can cause a bottle neck. But it's a pretty necessary bottleneck isn't it?

public class SingletonSynchronizedMain {

    private static int runs = 0;

    public static void main(String[] args) {

        while(true) {
            Thread t1 = new Thread(new RunnableTask1());
            t1.start();

            Thread t2 = new Thread(new RunnableTask2());
            t2.start();
        }

    }
}


class SingletonSynchronized {

    private static SingletonSynchronized instance = null;

    int data;

    private SingletonSynchronized() { }

    public synchronized static SingletonSynchronized getInstance() {

        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}


class RunnableTask1 extends Thread {


    public void run() {
        SingletonSynchronized s1 = SingletonSynchronized.getInstance();

        s1.setData(10);


    }
}

class RunnableTask2 extends Thread {


    public void run() {

            SingletonSynchronized s2 = SingletonSynchronized.getInstance();

            s2.setData(5);


    }
}