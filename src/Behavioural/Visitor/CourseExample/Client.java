package Behavioural.Visitor.CourseExample;

public class Client {



    public static int calculatePrice(ItemElement[] items){

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;

        for(ItemElement item : items){
            item.accept(visitor);
            sum+= item.accept(visitor);
        }


        return sum;

    }

    public static void main(String[] args) {


        ItemElement[] items = new ItemElement[]{
                new Book(20,"127834981"),
                new Book(50,"727834981"),
                new Book(150,"527834983"),

                new Fruit(10, "Arugula", 1),
                new Fruit(1, "Potatos", 30),
                new Fruit(15, "Garlic", 4)
        };


        int total = calculatePrice(items);
        System.out.println("Total cost $" + total);

    }
}
