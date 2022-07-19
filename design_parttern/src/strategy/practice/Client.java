package strategy.practice;

public class Client {

  private final Study study;

  public Client(Study study) {
    this.study = study;
  }

  public void test() {
    study.study();
  }
}
