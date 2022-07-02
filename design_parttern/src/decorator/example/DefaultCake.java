package decorator.example;

public class DefaultCake implements Cake{

  @Override
  public void makeCake() {
    System.out.println("Baking");
    System.out.println("Add cream");
  }
}
