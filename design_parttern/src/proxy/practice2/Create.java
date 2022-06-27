package proxy.practice2;

public interface Create {

  void createCustomerByDbProceudure(String system);

  void createCustomerByJdbcTemplate(String system);

  void createCustomerByJpa(String system);
}
