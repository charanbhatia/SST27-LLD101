package beverages_decorator;


public class MilkDecorator extends BeverageDecorator {
    
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 3; // Milk costs 3 units
    }

    @Override
    public String toString() {
        return beverage.toString() + " + Milk";
    }
}
