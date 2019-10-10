package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField ageTextField;

    @FXML
    private TextField maxTextField;

    @FXML
    private TextField targetTextField;

    @FXML
    private Button calculateButton;

    @FXML
    public void calculateButtonPressed(ActionEvent event) {
        try {
            Integer age = new Integer(ageTextField.getText());
            Integer max = 220 - age;
            Double tarmax = max * 0.85;
            Double tarmin = max * 0.5;


            String plus = (Math.round(tarmin) + "-" + Math.round(tarmax));

            maxTextField.setText(max.toString());

            targetTextField.setText(plus.toString());
        }
        catch (NumberFormatException e){
            ageTextField.setText("Enter age please");
        }
    }
}