package decorator.practice;

public class KoreanEat extends DecoratorEat{

  public KoreanEat(Eat decoratorEat) {
    super(decoratorEat);
  }

  @Override
  public void eat() {
    decoratorEat.eat();
    koreanEat();
  }

  private void koreanEat() {
    System.out.println("김치랑 같이 먹는다");
  }
}
