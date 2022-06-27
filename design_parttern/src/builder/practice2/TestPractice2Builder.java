package builder.practice2;

public class TestPractice2Builder {

  public static void main(String[] args) {

    Room room = Room.of()
        .restroom("수세식")
        .computer("맥북")
        .desk("높은책상")
        .build();

    System.out.println("room.toString() = " + room.toString());
  }
}
