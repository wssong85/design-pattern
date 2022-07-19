package strategy.example;

public class Client {

  public static void main(String[] args) {

    Moving train = new Train();
    Moving bus = new Bus();


    train.setMovableStrategy(new RailLoadStrategy());
    bus.setMovableStrategy(new LoadStrategy());

    train.move();
    bus.move();

    System.out.println("-------------버스 변경-----------");

    bus.setMovableStrategy(new RailLoadStrategy());
    bus.move();
  }
}
