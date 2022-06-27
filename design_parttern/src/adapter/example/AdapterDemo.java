package adapter.example;

import adapter.example.adapter.WebAdapter;
import adapter.example.client.WebClient;

public class AdapterDemo {
  public static void main(String[] args) {
    WebAdapter adapter = new WebAdapter(new FancyRequester());


    WebClient client = new WebClient(adapter);
    client.doWork();
  }
}
