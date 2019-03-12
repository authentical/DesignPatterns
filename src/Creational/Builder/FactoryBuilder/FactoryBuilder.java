package Creational.Builder.FactoryBuilder;


interface CoffeeAttributes {

    void setName(String name);
    void setAcidity(int acidity);
    void setSweetness(int sweetness);
    void setRoastType(String roastType);
    void setAromatic(int aromatic);
    void setQuality(String quality);
    void setPriceInDollarsPer100g(int priceInDollarsPer100g);
}

class Coffee implements CoffeeAttributes {

    private String name;
    private int acidity;
    private int sweetness;
    private String roastType;
    private int aromatic;
    private String quality;
    private int priceInDollarsPer100g;

    public void setName(String name) {
        this.name = name;
    }

    public void setAcidity(int acidity) {
        this.acidity = acidity;
    }

    public void setSweetness(int sweetness) {
        this.sweetness = sweetness;
    }

    public void setRoastType(String roastType) {
        this.roastType = roastType;
    }

    public void setAromatic(int aromatic) {
        this.aromatic = aromatic;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setPriceInDollarsPer100g(int priceInDollarsPer100g) {
        this.priceInDollarsPer100g = priceInDollarsPer100g;
    }
}


interface CoffeeBuilder{

    public void buildName();
    public void buildAcidity();
    public void buildSweetness();
    public void buildRoastType();
    public void buildAromatic();
    public void buildQuality();
    public void buildPriceInDollarsPer100g();

    public Coffee getCoffee();
}


class ZestyFrenchRoast implements CoffeeBuilder{

    private Coffee coffee;


    public ZestyFrenchRoast(){
        this.coffee = new Coffee();
    }


    public void buildName() {
        this.coffee.setName("Zesty French Flave");
    }


    public void buildAcidity() {
        this.coffee.setAcidity(3);
    }


    public void buildSweetness() {
        this.coffee.setSweetness(10);
    }


    public void buildRoastType() {
        this.coffee.setRoastType("French");
    }


    public void buildAromatic() {
        this.coffee.setAromatic(7);
    }


    public void buildQuality() {
        this.coffee.setQuality("Medium");
    }


    public void buildPriceInDollarsPer100g() {
        this.coffee.setPriceInDollarsPer100g(3);
    }


    public Coffee getCoffee() {
        return this.coffee;
    }
}


class CoffeeMaker{

    private CoffeeBuilder coffeeBuilder;

    public CoffeeMaker(CoffeeBuilder coffeeBuilder){

        this.coffeeBuilder = coffeeBuilder;
    }

    public Coffee getCoffee(){
        return this.coffeeBuilder.getCoffee();
    }

    public void makeCoffee(){

        this.coffeeBuilder.buildName();
        this.coffeeBuilder.buildAcidity();
        this.coffeeBuilder.buildAromatic();
        this.coffeeBuilder.buildPriceInDollarsPer100g();
        this.coffeeBuilder.buildQuality();
        this.coffeeBuilder.buildRoastType();
        this.coffeeBuilder.buildSweetness();
    }
}



public class FactoryBuilder{


    public static void main(String[] args) {

        CoffeeBuilder coffeeToBuild = new ZestyFrenchRoast();

        CoffeeMaker coffeeMaker = new CoffeeMaker(coffeeToBuild);

        coffeeMaker.makeCoffee();

        Coffee coffee = coffeeMaker.getCoffee();

        System.out.println("The barista hands you a delicious cup of some kind of " +
                "coffee but because there are no getters in this pattern we have no idea " +
                "what it is. " + "Please pick it up at " + coffee);
    }
}