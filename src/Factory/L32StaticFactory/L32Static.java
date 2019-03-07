package Factory.L32StaticFactory;

public class L32Static {

    public static void main(String[] args) {



        Shape shape1 = ShapeFactory.getShape(Shapes.TRIANGLE);


        shape1.draw();
    }
}
