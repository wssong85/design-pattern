package decorator.practice2;

public class Practice2Client {

  public static void main(String[] args) {
//    Shower shower = new ShowerImpl();
//    shower.shower();
//    System.out.println("-----------------");
//
    Shower showerAndDung = new ShowerAndDung(new ShowerImpl());
    showerAndDung.shower();
    System.out.println("----------------");
  }
}
