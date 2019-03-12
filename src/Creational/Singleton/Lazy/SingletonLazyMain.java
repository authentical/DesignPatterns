package Creational.Singleton.Lazy;

// Not thread safe

public class SingletonLazyMain{

    public static void main(String[] args) {


        SingletonLazy one = SingletonLazy.getInstance();


        System.out.println(System.identityHashCode(one));

        SingletonLazy two = SingletonLazy.getInstance();

        System.out.println(System.identityHashCode(two));

    }

}


class SingletonLazy {


    private static SingletonLazy instance = null;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){


                                // Thread 1 gets interrupted here before instantiation
                                // Thread 2 gets through and instantiation occurs
                                // Thread 1 is unlocked and gets a new instance
                                // Thread 2's instance is gone. Pointer is the same but state of
                                // object is different that it's expecting (provided the obj isn't stateless)
        if(instance==null){ instance = new SingletonLazy();}
        return instance;

    }
}
