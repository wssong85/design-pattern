package adapter.example.adapter;

import adapter.example.FancyRequester;
import adapter.example.target.WebRequester;

public class WebAdapter implements WebRequester {

  private FancyRequester fancyRequester;

  public WebAdapter(FancyRequester fancyRequester) {
    this.fancyRequester = fancyRequester;
  }

  @Override
  public void requestHandler() {
    fancyRequester.fancyRequestHandler();
  }
}
