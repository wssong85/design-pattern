package strategy.example;

public class RailLoadStrategy implements MovableStrategy{

  @Override
  public void move() {
    System.out.println("선로를 통해 이동");
  }
}
