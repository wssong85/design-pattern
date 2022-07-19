package templatemethod.practice;

public class Main {

  public static void main(String[] args) {

    Study javaStudy = new JavaStudy();
    javaStudy.excute();

    System.out.println("---------------");

    Study javascriptStudy = new JavascriptStudy();
    javascriptStudy.excute();
  }
}
