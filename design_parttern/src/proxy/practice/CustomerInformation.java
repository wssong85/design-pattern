package proxy.practice;

public class CustomerInformation implements ApplicationInterface{

  @Override
  public void getMapping(String name) {

    System.out.println(name + "고객 조회합니다.");
  }

  @Override
  public void postMapping(String name) {

    System.out.println(name + "고객 입력합니다.");
  }
}
