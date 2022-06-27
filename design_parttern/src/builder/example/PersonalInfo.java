package builder.example;

public class PersonalInfo {
  private String name;
  private int age;
  private int phoneNumber;

  public PersonalInfo() {

  }

  @Override
  public String toString() {
    return "PersonalInfo{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", phoneNumber=" + phoneNumber +
        '}';
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder{
    private String name;
    private int age;
    private int phoneNumber;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder phoneNUmber(int phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public PersonalInfo build() {
      PersonalInfo personalInfo = new PersonalInfo();
      personalInfo.name = name;
      personalInfo.age = age;
      personalInfo.phoneNumber = phoneNumber;
      return personalInfo;
    }
  }
}
