package templatecallback.example2;

public class Client {

  public static void main(String[] args) {

    SolderWithRefactoring rambo = new SolderWithRefactoring();

    rambo.runContext("탕! 탕탕탕!");

    System.out.println("\n");

    rambo.runContext("수류탕 투척~! 쾅!!");
  }
}
