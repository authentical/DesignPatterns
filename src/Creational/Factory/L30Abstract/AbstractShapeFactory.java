package Creational.Factory.L30Abstract;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();   // Returns a shape

    public Shape getShape(){
        return factoryMethod();
    }
}

class RectangleFactory extends AbstractShapeFactory{

    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class TriangleFactory extends AbstractShapeFactory{

    protected Shape factoryMethod() {
        return new Triangle();
    }
}

class CircleFactory extends AbstractShapeFactory{

    protected Shape factoryMethod() {
        return new Circle();
    }
}