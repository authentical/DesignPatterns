package Creational.AbstractFactory;

class DesktopPCFactory extends AbstractProductFactory{


    @Override
    DesktopPC getDesktopPC(String desktopPC) throws Exception {
        if(desktopPC.equals("FastPC")){

            return new FastPC();

        } else if(desktopPC.equals("EcoPC")){

            return new EcoPC();

        } else {
            throw new Exception("Can not instantiate a " + desktopPC);
        }
    }


    @Override
    LaptopPC getLaptopPC(String laptopPC) {
        return null;
    }
}
