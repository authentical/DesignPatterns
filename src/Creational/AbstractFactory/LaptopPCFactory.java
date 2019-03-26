package Creational.AbstractFactory;

public class LaptopPCFactory extends AbstractProductFactory {

    @Override
    DesktopPC getDesktopPC(String desktopPC) {
        return null;
    }

    @Override
    LaptopPC getLaptopPC(String laptopPC) throws Exception {
        if(laptopPC.equals("FASTLAPTOP")){

            return new FastLaptop();

        } else if(laptopPC.equals("ECOLAPTOP")){

            return new EcoLaptop();

        } else {

            throw new Exception("Can not instantiate a " + laptopPC);
        }
    }
}
