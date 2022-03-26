package iterator;

public class Main {

  public static void main(String[] args) {
    StudyGroup studyGroup = new StudyGroup(5);
    studyGroup.addStudent(new Student("이기택", 27));
    studyGroup.addStudent(new Student("최민수", 27));
    studyGroup.addStudent(new Student("원빈", 27));
    studyGroup.addStudent(new Student("홍길동", 27));
    studyGroup.addStudent(new Student("나비", 27));

    Iterator iterator = studyGroup.iterator();

    while (iterator.hasNext()) {
      Student student = (Student) iterator.next();
      System.out.println("이름:" + student.getName());
      System.out.println("나이:" + student.getAge());
      System.out.println("==========================");
    }
  }
}
