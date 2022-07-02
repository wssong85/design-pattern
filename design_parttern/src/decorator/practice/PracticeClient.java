package decorator.practice;

public class PracticeClient {

  public static void main(String[] args) {

    Eat eat = new DefaultEat();
    eat.eat();
    System.out.println("---------");

    Eat koreanEat = new KoreanEat(new DefaultEat());
    koreanEat.eat();
    System.out.println("---------");

    Eat japanEat = new JapanEat(new DefaultEat());
    japanEat.eat();

  }
}
