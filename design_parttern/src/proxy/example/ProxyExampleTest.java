package proxy.example;

public class ProxyExampleTest {

  public static void main(String[] args) {

    Database db = new CrudProxy();

    System.out.println("---------Before calling findById----------");
    db.findById(1L);
  }
}
