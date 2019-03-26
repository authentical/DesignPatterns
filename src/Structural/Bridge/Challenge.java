package Structural.Bridge;




abstract class IColor{

    abstract void fillWithColour(int borderSize);
}
class Red extends IColor{
    @Override
    void fillWithColour(int borderSize) {
        System.out.println("Red with " +borderSize+ " border");
    }
}
class Green extends IColor{
    @Override
    void fillWithColour(int borderSize) {
        System.out.println("Green with " +borderSize+ " border");

    }
}


abstract class Shape{

    IColor iColor;

    public Shape(IColor iColor) {
        this.iColor = iColor;

    }

    abstract void modifyBorder(int border);
    abstract void drawShape(int border);
}
class Triangle extends Shape{

    public Triangle(IColor iColor) {
        super(iColor);
    }

    @Override
    void modifyBorder(int border) {
        System.out.println("Changed border to thickness "+ border);
        drawShape(border);
    }

    @Override
    void drawShape(int border) {
        System.out.println("Drew a Triangle coloured ");
        iColor.fillWithColour(border);

    }
}
class Recangle extends Shape{

    public Recangle(IColor iColor) {
        super(iColor);
    }

    @Override
    void modifyBorder(int border) {
        System.out.println("Changed border to thickness "+ border);
        drawShape(border);

    }

    @Override
    void drawShape(int border) {
        System.out.println("Drew a Rectangle coloured ");
        iColor.fillWithColour(border);

    }
}












public class Challenge {

    public static void main(String[] args) {

        Shape shape1 = new Triangle(new Red());

        shape1.modifyBorder(14);
        shape1.drawShape(14);




    }
}
