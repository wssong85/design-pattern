package builder.example;

public class Main {

  public static void main(String[] args) {
    String toString = PersonalInfo.builder().name("이름").age(1).phoneNUmber(023213333).build().toString();
    System.out.println("toString = " + toString);
  }
}
