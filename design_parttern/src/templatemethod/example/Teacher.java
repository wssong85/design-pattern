package templatemethod.example;

abstract public class Teacher {

  public void startClass() {
    
    inside();
    attendance();
    teach();
    outside();
  }

  public void outside() {
    
    System.out.println("선생님이 강의실 밖을 나갑니다.");
  }

  public void teach() {
    
    System.out.println("선생님이 수업합니다.");
  }

  public void attendance() {
    
    System.out.println("선생님이 출석을 부릅니다.");
  }

  public void inside() {
    
    System.out.println("선생님이 강의실을 나갑니다.");
  }
}
