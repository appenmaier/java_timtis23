package apps.io;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class OutputController implements Initializable {

  @FXML
  private Label inputLabel;
  private Model model;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    model = Model.getInstance();
    String input = model.getInput();
    inputLabel.setText(input);
  }

}
