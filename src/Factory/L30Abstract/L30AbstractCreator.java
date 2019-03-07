package Factory.L30Abstract;

public class L30AbstractCreator {

    public static void main(String[] args) {

        /*
        * This FRAMEWORK is useful for e.g. presenting multiple documents to the user
        *
        * */

        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        Shape shape2 = new TriangleFactory().getShape();
        shape2.draw();
    }
}
