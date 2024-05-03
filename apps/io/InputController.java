package apps.io;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InputController {

  @FXML
  private TextField inputTextField;
  private Model model;

  @FXML
  public void goToOutput(ActionEvent event) throws IOException {
    String input = inputTextField.getText();

    model = Model.getInstance();
    model.setInput(input);

    Parent root = FXMLLoader.load(getClass().getResource("OutputView.fxml"));
    Scene scene = new Scene(root);
    Node node = (Node) event.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    stage.setScene(scene);
    stage.show();
  }

}
