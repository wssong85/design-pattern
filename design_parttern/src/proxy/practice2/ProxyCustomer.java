package proxy.practice2;

public class ProxyCustomer implements Create {

  private Customer customer;

  @Override
  public void createCustomerByDbProceudure(String system) {

    // 전처리
    System.out.println(system + "를 사용");

    if (customer == null) {
      customer = new Customer();
    }

    // 사용 시 실 객체 사용
    customer.createCustomerByDbProceudure(system);
  }

  @Override
  public void createCustomerByJdbcTemplate(String system) {

    System.out.println(system + "를 사용");

    if (customer == null) {
      customer = new Customer();
    }

    customer.createCustomerByJdbcTemplate(system);
  }

  @Override
  public void createCustomerByJpa(String system) {

    System.out.println(system + "를 사용");

    if (customer == null) {
      customer = new Customer();
    }

    customer.createCustomerByJpa(system);
  }
}
