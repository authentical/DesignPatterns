package Behavioural.Visitor.CourseExample;

// Entry point so an object can be visited
public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}

class Book implements ItemElement{

    private int pricePerUnit;
    private String isbn;

    public Book(int price, String isbn) {
        this.pricePerUnit = price;
        this.isbn = isbn;
    }

    public int getPricePerUnit() {
        return pricePerUnit;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class Fruit implements ItemElement{

    private int pricePerKg;
    private String name;
    private int weight;

    public Fruit(int pricePerKg, String name, int weight) {
        this.pricePerKg = pricePerKg;
        this.name = name;
        this.weight = weight;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}