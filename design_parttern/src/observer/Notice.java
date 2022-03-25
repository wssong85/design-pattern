package observer;

import java.util.ArrayList;
import java.util.List;

public class Notice {

  public List<Observer> observers = new ArrayList<>();

  // 옵저버 추가
  public void attach(Observer observer) {
    observers.add(observer);
  }

  // 옵저버 제거
  public void detach(Observer observer) {
    observers.remove(observer);
  }

  // 옵저버들에게 알림
  public void notifyObservers(String msg) {
    for (Observer o : observers) {
      o.receive(msg);
    }
  }
}
