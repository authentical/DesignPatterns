package Behavioural.Visitor.Challenge;

import java.util.ArrayList;
import java.util.List;


public class Client {

    static List<Item> items = new ArrayList<>();


    static double calculateTotal(ShippingPostageCostVisitor visitor) {

        double totalPostage = 0.0;


        for (Item item : items) {

            item.accept(visitor);
        }


        return visitor.getTotalPostage();

    }


    public static void main(String[] args) {


        items.add(new GfxCard(1.45, 2.01));
        items.add(new Book(3.00, 5.02));
        items.add(new BerfJerky(3.33, 10));



        NAPostageVisitor naPostageVisitor = new NAPostageVisitor();
        System.out.format("%.2f\n", calculateTotal(naPostageVisitor));

        SAPostageVisitor saPostageVisitor = new SAPostageVisitor();
        System.out.format("%.2f\n", calculateTotal(saPostageVisitor));

    }
}
