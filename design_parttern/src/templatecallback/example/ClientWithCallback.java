package templatecallback.example;

public class ClientWithCallback {

  public static void main(String[] args) {

    Solider rambo = new Solider();

    rambo.runContext(() -> System.out.println("템플릿 콜백버전: 탕! 타탕!!"));

    System.out.println("\n");

    rambo.runContext(new Strategy() {
      @Override
      public void runStrategy() {
        System.out.println("템플릿 콜백버전: 수류탕 투척~! 쾅!");
      }
    });
  }
}
