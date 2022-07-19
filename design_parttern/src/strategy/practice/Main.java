package strategy.practice;

public class Main {

  public static void main(String[] args) {

    // OCP
    Client client = new Client(new JavaStudy()); // -> new Client(new JavascriptStudy());
    client.test();
  }
}
