package adapter.example2;

public class SamsungToLgAdapter implements LgMultitap{

  private final SamsungMultitap samsungMultitap;

  public SamsungToLgAdapter(SamsungMultitap samsungMultitap) {
    this.samsungMultitap = samsungMultitap;
  }

  @Override
  public void lgConnect() {
    System.out.println("Use Adapter");
    samsungMultitap.samsungConnect();
  }

  @Override
  public void lgDisconnect() {
    System.out.println("Use Adapter");
    samsungMultitap.samsungDisconnect();
  }
}
