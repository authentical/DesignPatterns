package Structural.Bridge;


abstract class Workshop{

    abstract public void work();
}
class Produce extends Workshop{

    @Override
    public void work() {
        System.out.println("Produced by: "+ this.getClass().getCanonicalName());
    }
}
class Assemble extends Workshop{

    @Override
    public void work() {
        System.out.println("Assembled by: " + this.getClass().getCanonicalName());
    }
}



abstract class Vehicle{

    protected Workshop workshop1;
    protected Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract public void manufacture();
}
class Car extends Vehicle{

    public Car(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    @Override
    public void manufacture() {

        System.out.println("Car manufactured");
        workshop1.work();
        workshop2.work();
    }
}
class Bike extends Vehicle{

    public Bike(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    @Override
    public void manufacture() {

        System.out.println("Bike manufactured");
        workshop1.work();
        workshop2.work();
    }
}




public class BridgeMain {

    public static void main(String[] args) {

        Vehicle v1 = new Car(new Produce(), new Assemble());
        v1.manufacture();

        Vehicle v2 = new Bike(new Produce(),new Assemble());
        v2.manufacture();
    }
}
