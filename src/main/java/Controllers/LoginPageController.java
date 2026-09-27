package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPageController {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btnSubmit;

    @FXML
    void btn1OnAction(ActionEvent event) {
        System.out.println("BTN1 Clicked");
    }

    @FXML
    void btn2OnAction(ActionEvent event) {
        System.out.println("BTN2 Clicked");
    }

    @FXML
    void btn3OnAction(ActionEvent event) {
        System.out.println("BTN3 Clicked");
    }

    @FXML
    void btnSubmitOnAction(ActionEvent event) {
        System.out.println("Submit Clicked");
    }

}
