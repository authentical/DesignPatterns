package Creational.AbstractFactory;

public interface LaptopPC {


    public boolean TestBattery();
}

class FastLaptop implements LaptopPC{


    @Override
    public boolean TestBattery() {

        System.out.println("FastLaptop Battery test passed");
        return true;
    }
}

class EcoLaptop implements LaptopPC{


    @Override
    public boolean TestBattery() {

        System.out.println("EcoLaptop Battery test passed");
        return true;
    }
}
