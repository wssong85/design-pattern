package observer;

public class Main {

  public static void main(String[] args) {
    Notice notice = new Notice();
    User1 user1 = new User1("유저1");
    User2 user2 = new User2("유저2");

    // attach
    notice.attach(user1);
    notice.attach(user2);

    String msg = "공지사항입니다~!";
    notice.notifyObservers(msg);

    // detach
    notice.detach(user1);

    msg = "안녕하세요~";
    notice.notifyObservers(msg);
  }
}
