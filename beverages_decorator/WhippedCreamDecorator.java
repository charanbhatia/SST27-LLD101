package beverages_decorator;

public class WhippedCreamDecorator extends BeverageDecorator {
    
    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 5; 
    }

    @Override
    public String toString() {
        return beverage.toString() + " + Whipped Cream";
    }
}
