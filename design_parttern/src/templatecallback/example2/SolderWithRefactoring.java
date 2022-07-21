package templatecallback.example2;

public class SolderWithRefactoring {

  void runContext(String strategySound) {
    System.out.println("배틀 그라운드 시작");
    execute(strategySound).runStrategy();
    System.out.println("배틀 종료");
  }

  private Strategy execute(final String strategySound) {
    return new Strategy() {
      @Override
      public void runStrategy() {
        System.out.println(strategySound);
      }

      @Override
      public void runStrategy2() {
        System.out.println(strategySound);
      }
    };
  }
}
