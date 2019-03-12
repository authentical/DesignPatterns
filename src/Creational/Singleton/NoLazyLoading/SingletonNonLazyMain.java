package Creational.Singleton.NoLazyLoading;


// Avoid this for large classes or FS, DB mgmt classes


public class SingletonNonLazyMain{


    public static void main(String[] args) {


        SingletonNonLazy one = SingletonNonLazy.getInstance();

    }

}


class SingletonNonLazy {

    private static SingletonNonLazy instance = new SingletonNonLazy();

    private SingletonNonLazy(){}

    public static SingletonNonLazy getInstance(){

        return instance;

    }

}


/*

JAVAP -C
Compiled from "SingletonNonLazyMain.java"
class Creational.Singleton.NoLazyLoading.SingletonNonLazy {
  public static Creational.Singleton.NoLazyLoading.SingletonNonLazy getInstance();
    Code:
       0: getstatic     #2                  // Field instance:LSingleton/NoLazyLoading/SingletonNonLazy;
       3: areturn

  static {};
    Code:
       0: new           #3                  // class Creational.Singleton/NoLazyLoading/SingletonNonLazy /// address is pushed on top of stack
       3: dup                                /// duplicates the data at the top of the stack
       4: invokespecial #4                  // Method "<init>":()V
       7: putstatic     #2                  // Field instance:LSingleton/NoLazyLoading/SingletonNonLazy;
      10: return


 */