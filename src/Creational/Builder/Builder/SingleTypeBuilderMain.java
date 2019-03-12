package Creational.Builder.Builder;

public class SingleTypeBuilderMain {


    public static void main(String[] args) {


        Coffee frenchCoffee = new Coffee.Builder("Texmex French")
                .setAcidity(10)
                .setAromatic(5)
                .build();





    }
}
