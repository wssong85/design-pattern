package builder.practice;


public class School {

  private String classroom;
  private String teacher;
  private String student;

  @Override
  public String toString() {
    return "School{" +
        "classroom='" + classroom + '\'' +
        ", teacher='" + teacher + '\'' +
        ", student='" + student + '\'' +
        '}';
  }

  public static of of() {
    return new of();
  }

  public static class of {

    private String classroom;
    private String teacher;
    private String student;

    public of classroom(String classroom) {
      this.classroom = classroom;
      return this;
    }

    public of teacher(String teacher) {
      this.teacher = teacher;
      return this;
    }

    public of student(String student) {
      this.student = student;
      return this;
    }

    public School build() {
      School school = new School();
      school.classroom = classroom;
      school.teacher = teacher;
      school.student = student;
      return school;
    }
  }
}
