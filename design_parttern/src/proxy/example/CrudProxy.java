package proxy.example;

public class CrudProxy implements Database{

  private Database database;

  @Override
  public void findById(Long id) {

    if (database == null) {
      database = new Crud();
    }

    database.findById(id);
  }
}
