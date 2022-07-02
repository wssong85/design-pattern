package decorator.example;

public class StrawberryCake extends CakeDecorator{

  public StrawberryCake(Cake decoratedCake) {
    super(decoratedCake);
  }

  @Override
  public void makeCake() {
    decoratedCake.makeCake();
    addStrawberry();
  }

  private void addStrawberry() {
    System.out.println("Add strawberry");
  }
}
