package templatemethod.example;

public class Main {

  public static void main(String[] args) {

    Teacher koreanTeacher = new KoreanTeacher();
    koreanTeacher.startClass();

    System.out.println("----------------------");
    Teacher mathTeacher = new MathTeacher();
    mathTeacher.startClass();
  }
}
