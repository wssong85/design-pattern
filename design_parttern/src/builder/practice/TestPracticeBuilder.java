package builder.practice;

public class TestPracticeBuilder {

  public static void main(String[] args) {

    School school = School.of()
        .classroom("1반")
        .student("학생1")
        .teacher("선생1")
        .build();

    System.out.println("school = " + school.toString());
  }
}
