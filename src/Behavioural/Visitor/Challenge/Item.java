package Behavioural.Visitor.Challenge;

public interface Item {

    void accept(ShippingPostageCostVisitor visitor);

}
class Book implements Item{

    private double price;
    private double weight;

    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Get Shipping cost for this
    public void accept(ShippingPostageCostVisitor visitor){

        visitor.visit(this);
    }
}
class GfxCard implements Item{

    private double price;
    private double weight;

    public GfxCard(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Get Shipping cost for this
    public void accept(ShippingPostageCostVisitor visitor){

        visitor.visit(this);
    }
}
class BerfJerky implements Item{

    private double price;
    private double weight;

    public BerfJerky(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Get Shipping cost for this
    public void accept(ShippingPostageCostVisitor visitor){

        visitor.visit(this);
    }
}