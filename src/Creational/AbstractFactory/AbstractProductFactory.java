package Creational.AbstractFactory;

public abstract class AbstractProductFactory {

    abstract DesktopPC getDesktopPC(String desktopPC) throws Exception;

    abstract LaptopPC getLaptopPC(String laptopPC) throws Exception;

}


