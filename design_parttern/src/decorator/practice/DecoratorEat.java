package decorator.practice;

abstract public class DecoratorEat implements Eat{

  protected Eat decoratorEat;

  public DecoratorEat(Eat decoratorEat) {
    this.decoratorEat = decoratorEat;
  }
}
