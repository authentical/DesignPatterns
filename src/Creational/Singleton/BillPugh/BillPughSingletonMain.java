package Creational.Singleton.BillPugh;

public class BillPughSingletonMain {

    public static void main(String[] args) {


        BillPughSingleton s1 = BillPughSingleton.getInstance();

        System.out.println(System.identityHashCode(s1));


        BillPughSingleton s2 = BillPughSingleton.getInstance();

        System.out.println(System.identityHashCode(s2));

    }
}


/* Want to avoid instantiating singletons until client needs it but it
 has to be thread safe. Before Java 5, other Creational.Singleton
 implementations caused failures in a multi-threaded projects.


Static keyword (Variables and inner classes) and are created atomically
so this following Bill Pugh method is widely used and trusted.

First time a thread asks for getInstance, this singleton blocks until
it is instantiated.

*/


class BillPughSingleton{

    private BillPughSingleton(){}

    private static class init{

        private static final BillPughSingleton instance = new BillPughSingleton();

    }

    public static BillPughSingleton getInstance(){
        return init.instance;
    }



}
