package adapter.example2;

public class SamsungFan implements SamsungMultitap{

  @Override
  public void samsungConnect() {
    System.out.println("삼성 선풍기 연결");
  }

  @Override
  public void samsungDisconnect() {
    System.out.println("삼성 선풍기 연결해제");
  }
}
