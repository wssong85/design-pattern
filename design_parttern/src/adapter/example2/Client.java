package adapter.example2;

public class Client {

  public static void main(String[] args) {
    SamsungFan samsungFan = new SamsungFan();

    LgMultitap lgMultitap = new SamsungToLgAdapter(samsungFan);
    lgMultitap.lgConnect();
    lgMultitap.lgDisconnect();
  }
}
