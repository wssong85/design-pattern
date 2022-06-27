package factorymethod.example;

public class factorymethodDemo {

  public static void main(String[] args) {

    DrinkFactory drinkFactory = new DrinkFactory();
//    Drink coffee = drinkFactory.create(DrinkType.COFFEE);
//    System.out.println("coffee.info() = " + coffee.info());
//    Drink coke = drinkFactory.create(DrinkType.COKE);
//    System.out.println("coke.info() = " + coke.info());

    DrinkType drinkType = args.length > 0 ? DrinkType.COFFEE : DrinkType.COKE;

    Drink drink = drinkFactory.create(drinkType);

    System.out.println("drink.info() = " + drink.info());
  }
}
