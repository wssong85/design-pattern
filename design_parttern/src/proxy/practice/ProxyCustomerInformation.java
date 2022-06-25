package proxy.practice;

import java.util.Objects;

public class ProxyCustomerInformation implements ApplicationInterface {

  private CustomerInformation customerInformation;

  @Override
  public void getMapping(String name) {

    if (Objects.isNull(customerInformation)) {
      customerInformation = new CustomerInformation();
    }

    customerInformation.getMapping(name);
  }

  @Override
  public void postMapping(String name) {

    if (Objects.isNull(customerInformation)) {
      customerInformation = new CustomerInformation();
    }

    customerInformation.postMapping(name);
  }
}
