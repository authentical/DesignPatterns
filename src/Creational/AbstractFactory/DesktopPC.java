package Creational.AbstractFactory;

public interface DesktopPC {


    public boolean TestGraphics();
}

class FastPC implements DesktopPC{


    @Override
    public boolean TestGraphics() {
        System.out.println("FastPC Graphics test passed");
        return true;
    }
}


class EcoPC implements DesktopPC{


    @Override
    public boolean TestGraphics() {
        System.out.println("EcoPC Graphics test passed");
        return true;
    }
}