package Behavioural.Visitor.CourseExample;

// The visitor
public interface ShoppingCartVisitor {


    int visit(Book book);
    int visit(Fruit fruit);
}

class ShoppingCartVisitorImpl implements ShoppingCartVisitor{


    @Override
    public int visit(Book book) {

        int cost=0;

        if(book.getPricePerUnit() > 50){
            cost = book.getPricePerUnit() - 5;
        }else{

            cost = book.getPricePerUnit();
        }

        System.out.println("ISBN: " + book.getIsbn() + " Cost = " + cost);
        return cost;
    }


    @Override
    public int visit(Fruit fruit) {

        int cost=fruit.getPricePerKg()*fruit.getWeight();


        System.out.println(fruit.getName() + " Cost = " + cost);
        return cost;
    }
}




















