package Behavioural.Visitor.Challenge;

public interface ShippingPostageCostVisitor {

    void visit(GfxCard gfxCard);
    void visit(Book book);
    void visit(BerfJerky jerky);

    double getTotalPostage();

}

class NAPostageVisitor implements ShippingPostageCostVisitor{

    private double totalPostage = 0;


    @Override
    public void visit(Book book) {

        totalPostage+=  book.getWeight()*2>20?0.0:book.getWeight()*2;
    }
    @Override
    public void visit(GfxCard gfxCard) {

        totalPostage+= gfxCard.getWeight()*2.5>20?0.0:gfxCard.getWeight()*2.5;
    }
    @Override
    public void visit(BerfJerky jerky) {

        totalPostage+=  jerky.getWeight()*3>20?0.0:jerky.getWeight()*3;
    }

    public double getTotalPostage() {
        return totalPostage;
    }
}

class SAPostageVisitor implements ShippingPostageCostVisitor{

    private double totalPostage = 0;


    @Override
    public void visit(Book book) {
        totalPostage+=  book.getWeight()*4>30?0.0:book.getWeight()*4;
    }
    @Override
    public void visit(GfxCard gfxCard) {

        totalPostage+=  gfxCard.getWeight()*5>30?0.0:gfxCard.getWeight()*5;
    }
    @Override
    public void visit(BerfJerky jerky) {
        totalPostage+=  jerky.getWeight()*6>30?0.0:jerky.getWeight()*6;
    }


    public double getTotalPostage() {
        return totalPostage;
    }
}