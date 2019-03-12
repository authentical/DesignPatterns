package Creational.Factory.L32StaticFactory;

interface Shape {

    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rect poke");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rect poke");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle poke");
    }
}
