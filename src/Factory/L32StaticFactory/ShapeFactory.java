package Factory.L32StaticFactory;


public class ShapeFactory {


    public static Shape getShape(String shapeType){

        if(shapeType == null){
            return null;

        }else if(shapeType.equals(Shapes.CIRCLE)){

            return new Circle();

        }else if(shapeType.equals(Shapes.TRIANGLE)){

            return new Triangle();

        }else if(shapeType.equals(Shapes.RECTANGLE)){

            return new Rectangle();
        }

        return null;

    }
}
