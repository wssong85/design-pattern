package builder.practice2;

public class Room {

  private String restroom;
  private String desk;
  private String computer;

  @Override
  public String toString() {
    return "Room{" +
        "restroom='" + restroom + '\'' +
        ", desk='" + desk + '\'' +
        ", computer='" + computer + '\'' +
        '}';
  }

  public static of of() {
    return new of();
  }

  public static class of {

    private String restroom;
    private String desk;
    private String computer;

    public of restroom(String restroom) {
      this.restroom = restroom;
      return this;
    }

    public of desk(String desk) {
      this.desk = desk;
      return this;
    }

    public of computer(String computer) {
      this.computer = computer;
      return this;
    }

    public Room build() {
      Room room = new Room();
      room.restroom = restroom;
      room.desk = desk;
      room.computer = computer;
      return room;
    }
  }
}
