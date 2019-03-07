package Factory.L32StaticFactory;

interface Shape {

    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rect draw");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rect draw");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle draw");
    }
}
