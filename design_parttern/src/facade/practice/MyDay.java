package facade.practice;

public class MyDay {

  public void behavior() {

    Sleep sleep = new Sleep();
    Eat eat = new Eat();
    Restroom restroom = new Restroom();

    eat.breakfast();
    restroom.dung();
    restroom.shower();
    eat.lunch();
    sleep.nap();
    restroom.dung();
    eat.dinner();
    restroom.dung();
    restroom.shower();
    sleep.sleepAtNight();
  }
}
