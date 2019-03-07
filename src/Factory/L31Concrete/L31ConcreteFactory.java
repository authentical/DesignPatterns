package Factory.L31Concrete;


public class L31ConcreteFactory {

    public static void main(String[] args) {


        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(Shapes.CIRCLE);

        shape1.draw();


    }
}
