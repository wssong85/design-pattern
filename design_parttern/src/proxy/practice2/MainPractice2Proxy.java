package proxy.practice2;

public class MainPractice2Proxy {

  public static void main(String[] args) {

    Create create = new ProxyCustomer();

    // 아직 실 객체 사용전
    System.out.println("create = " + create);

    // 메소드 사용시만 실 객체 사용 (lazy)
    create.createCustomerByDbProceudure("프로시저");
  }
}
