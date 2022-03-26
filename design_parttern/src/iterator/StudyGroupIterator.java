package iterator;

public class StudyGroupIterator implements Iterator{

  private StudyGroup studyGroup;
  private int index;


  public StudyGroupIterator(StudyGroup studyGroup) {
    this.studyGroup = studyGroup;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    if (index < studyGroup.getLength()) {
      return true;
    }

    return false;
  }

  @Override
  public Object next() {
    Object student = studyGroup.getStudent(index);
    index++;
    return student;
  }
}
