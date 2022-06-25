package proxy.example;

public class Crud implements Database{

  public Crud() {
    System.out.println("Create Crud object!");
  }

  @Override
  public void findById(Long id) {
    System.out.println("Search completed with " + id);
  }
}
