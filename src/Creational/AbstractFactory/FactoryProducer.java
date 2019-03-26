package Creational.AbstractFactory;

public class FactoryProducer {

    public static AbstractProductFactory getFactory(String productType) throws Exception{

        if(productType.equals("DESKTOPPC")){

            return new DesktopPCFactory();

        } else if(productType.equals("LAPTOPPC")){

            return new LaptopPCFactory();

        }else {

            throw new Exception("No factory available named " + productType);

        }
    }
}
