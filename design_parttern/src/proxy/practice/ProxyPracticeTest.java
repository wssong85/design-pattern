package proxy.practice;

public class ProxyPracticeTest {

  public static void main(String[] args) {

    ApplicationInterface api = new ProxyCustomerInformation();

    api.getMapping("김이름");
    api.postMapping("송이름");
  }
}
