package decorator.practice;

public class JapanEat extends DecoratorEat{

  public JapanEat(Eat decoratorEat) {
    super(decoratorEat);
  }

  @Override
  public void eat() {
    decoratorEat.eat();
    japanEat();
  }

  private void japanEat() {
    System.out.println("낫토랑 같이 먹는다.");
  }
}
