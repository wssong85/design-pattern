package adapter.example.client;

import adapter.example.target.WebRequester;

public class WebClient {

  private WebRequester webRequester;

  public WebClient(WebRequester webRequester) {
    this.webRequester = webRequester;
  }

  public void doWork() {
    webRequester.requestHandler();
  }
}
