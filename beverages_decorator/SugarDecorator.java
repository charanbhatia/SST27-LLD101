package beverages_decorator;


public class SugarDecorator extends BeverageDecorator {
    
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 1; // Sugar costs 1 unit
    }

    @Override
    public String toString() {
        return beverage.toString() + " + Sugar";
    }
}
