package Structural.Adapter.ObjectAdapter;



// Want to adapt a Turkey to a Duck

interface Duck{

    void quack();
    void fly();


}


class Mallard implements Duck{

    @Override
    public void quack() {
        System.out.println(this.getClass().getName() + " quacked.");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getName() + " is flying.");

    }
}


interface Turkey{

    void gobble();
    void fly();

}


class WildTurkey implements Turkey {


    @Override
    public void gobble() {
        System.out.println(this.getClass().getName() + " gobbled.");

    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getName() + " flies a few meters.");

    }
}




class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() { // Fly as much as a short adventure for a duck
        turkey.fly();
        turkey.fly();
        turkey.fly();
        turkey.fly();
        turkey.fly();
    }
}







public class ObjectAdapterMain {

    public static void main(String[] args) {

        Duck mallard = new Mallard();

        Turkey wildTurkey = new WildTurkey();
        Duck duckCompatibleTurkey = new TurkeyAdapter(wildTurkey);

        // Use Duck methods
        duckCompatibleTurkey.fly();
        duckCompatibleTurkey.quack();

        mallard.quack();
        mallard.fly();


    }
}















