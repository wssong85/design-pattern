package templatemethod.practice;

public class Study {

  public void excute() {
    start();
    readBook();
    end();
  }

  public void start() {
    System.out.println("공부 끝.");
  }

  public void readBook() {
    System.out.println("책을 읽는다.");
  }

  public void end() {

    System.out.println("공부 시작");
  }
}
