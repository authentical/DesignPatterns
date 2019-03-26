package Creational.AbstractFactory;

public class L36Main {

    public static void main(String[] args) {


        try {

            AbstractProductFactory laptopFactory = FactoryProducer.getFactory("LAPTOPPC");
            AbstractProductFactory desktopFactory = FactoryProducer.getFactory("DESKTOPCHAIR");
            LaptopPC laptopPC = laptopFactory.getLaptopPC("NOTVALID");

            laptopPC.TestBattery();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
