package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		System.out.println("=== Beverage Decorator Pattern Demo ===\n");

		// Basic beverages
		System.out.println("--- Basic Beverages ---");
		Beverage cappuccino = new Cappuccino();
		System.out.println(cappuccino + " costs: " + cappuccino.cost());
		
		Beverage latte = new Latte();
		System.out.println(latte + " costs: " + latte.cost());

		// Single decorators
		System.out.println("\n--- Single Add-ons ---");
		Beverage cappuccinoWithMilk = new MilkDecorator(new Cappuccino());
		System.out.println(cappuccinoWithMilk + " costs: " + cappuccinoWithMilk.cost());

		Beverage latteWithSugar = new SugarDecorator(new Latte());
		System.out.println(latteWithSugar + " costs: " + latteWithSugar.cost());

		// Multiple decorators
		System.out.println("\n--- Multiple Add-ons ---");
		Beverage cappuccinoWithMilkAndSugar = new SugarDecorator(
			new MilkDecorator(new Cappuccino())
		);
		System.out.println(cappuccinoWithMilkAndSugar + " costs: " + cappuccinoWithMilkAndSugar.cost());

		Beverage latteWithWhippedCreamAndExtraShot = new ExtraShotDecorator(
			new WhippedCreamDecorator(new Latte())
		);
		System.out.println(latteWithWhippedCreamAndExtraShot + " costs: " + latteWithWhippedCreamAndExtraShot.cost());

		// Complex combinations
		System.out.println("\n--- Premium Combinations ---");
		Beverage premiumCappuccino = new WhippedCreamDecorator(
			new ExtraShotDecorator(
				new SugarDecorator(
					new MilkDecorator(new Cappuccino())
				)
			)
		);
		System.out.println(premiumCappuccino + " costs: " + premiumCappuccino.cost());

		Beverage deluxeLatte = new ExtraShotDecorator(
			new WhippedCreamDecorator(
				new MilkDecorator(
					new SugarDecorator(new Latte())
				)
			)
		);
		System.out.println(deluxeLatte + " costs: " + deluxeLatte.cost());

		// Runtime composition demonstration
		System.out.println("\n--- Runtime Composition ---");
		Beverage customOrder = new Cappuccino();
		System.out.println("Starting with: " + customOrder + " costs: " + customOrder.cost());
		
		customOrder = new MilkDecorator(customOrder);
		System.out.println("Add milk: " + customOrder + " costs: " + customOrder.cost());
		
		customOrder = new SugarDecorator(customOrder);
		System.out.println("Add sugar: " + customOrder + " costs: " + customOrder.cost());
		
		customOrder = new ExtraShotDecorator(customOrder);
		System.out.println("Add extra shot: " + customOrder + " costs: " + customOrder.cost());
	}

}