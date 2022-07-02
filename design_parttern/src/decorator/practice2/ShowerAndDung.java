package decorator.practice2;

public class ShowerAndDung implements AddShower {
  private final Shower shower;

  public ShowerAndDung(Shower shower) {
    this.shower = shower;
  }

  @Override
  public void shower() {
    shower.shower();
    addShower();
  }

  @Override
  public void addShower() {
    System.out.println("추가적으로 응가한다.");
  }
}
