package templatecallback.example;

public class Solider {

  void runContext(Strategy strategy) {
    System.out.println("배틀 그라운드 시작");
    strategy.runStrategy();
    System.out.println("배트 종료");
  }
}
