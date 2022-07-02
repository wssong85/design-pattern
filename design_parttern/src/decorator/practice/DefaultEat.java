package decorator.practice;

public class DefaultEat implements Eat {

  @Override
  public void eat() {
    System.out.println("밥을 먹는다.");
  }
}
