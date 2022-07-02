package decorator.example;

public class Client {

  public static void main(String[] args) {
    Cake cake = new DefaultCake();
    cake.makeCake();
    System.out.println("-----------");

    Cake blueberryCake = new BlueberryCake(new DefaultCake());
    blueberryCake.makeCake();
    System.out.println("-----------");

    Cake strawberryCake = new StrawberryCake(new DefaultCake());
    strawberryCake.makeCake();
  }
}
