package apps.io;

public class Model {

  private static Model instance;

  private Model() {}

  public static Model getInstance() {
    if (instance == null) {
      instance = new Model();
    }
    return instance;
  }

  private String input;

  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

}
