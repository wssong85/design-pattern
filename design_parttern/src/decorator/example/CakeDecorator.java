package decorator.example;

abstract public class CakeDecorator implements Cake{

  protected Cake decoratedCake;

  public CakeDecorator(Cake decoratedCake) {
    this.decoratedCake = decoratedCake;
  }
}
