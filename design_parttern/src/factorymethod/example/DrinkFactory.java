package factorymethod.example;

public class DrinkFactory {

  public Drink create(DrinkType drinkType) {

    Drink drink = null;

    switch (drinkType) {
      case COKE -> drink = new Coke();
      case COFFEE -> drink = new Coffee();
    }

    return drink;
  }
}
