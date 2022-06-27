package proxy.practice2;

public class Customer implements Create {

  @Override
  public void createCustomerByDbProceudure(String system) {
    System.out.println(system + "에 의 생성");
  }

  @Override
  public void createCustomerByJdbcTemplate(String system) {
    System.out.println(system + "에 의 생성");
  }

  @Override
  public void createCustomerByJpa(String system) {
    System.out.println(system + "에 의 생성");
  }
}
