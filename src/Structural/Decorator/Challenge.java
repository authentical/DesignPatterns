package Structural.Decorator;


interface Shape{    // Component  interface

    void draw();
}
class Rectangle implements Shape{   // Concrete Component

    @Override
    public void draw() {
        System.out.println("Drew a Rectangle");
    }
}
class Circle implements Shape{  // Concrete Component

    @Override
    public void draw() {
        System.out.println("Drew a Circle");
    }
}


// The Decorator has to have all the methods of the real interface
abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
class TransparentShapeDecorator extends ShapeDecorator{


    public TransparentShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        deleteWhite(decoratedShape);
    }

    private void deleteWhite(Shape decoratedShape){

        System.out.println("Making shape transparent");
    }
}



public class Challenge{

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape transparentShape = new TransparentShapeDecorator(circle);



        transparentShape.draw();

    }

}
