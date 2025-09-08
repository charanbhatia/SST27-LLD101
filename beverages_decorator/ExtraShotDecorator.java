package beverages_decorator;


public class ExtraShotDecorator extends BeverageDecorator {
    
    public ExtraShotDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 7; // Extra shot costs 7 units
    }

    @Override
    public String toString() {
        return beverage.toString() + " + Extra Shot";
    }
}
