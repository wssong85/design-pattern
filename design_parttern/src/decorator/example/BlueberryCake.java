package decorator.example;

public class BlueberryCake extends CakeDecorator{

  public BlueberryCake(Cake decoratedCake) {
    super(decoratedCake);
  }

  @Override
  public void makeCake() {
    decoratedCake.makeCake();
    addBlueberry();
  }

  private void addBlueberry() {
    System.out.println("Add blueberry");
  }
}
