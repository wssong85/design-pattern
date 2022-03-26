package iterator;

public class StudyGroup implements Aggregate{

  private Student[] students;
  private int num = 0;

  public StudyGroup(int num) {
    this.students = new Student[num];
  }

  public Student getStudent(int index) {
    return students[index];
  }

  public void addStudent(Student student) {
    this.students[num] = student;
    num++;
  }

  public int getLength() {
    return num;
  }

  @Override
  public StudyGroupIterator iterator() {
    return new StudyGroupIterator(this);
  }
}
