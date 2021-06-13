package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class Controller {
    @FXML
    private Label labelOne;
    @FXML
    private Label labelTwo;
    @FXML
    private Label labelThree;
    @FXML
    private TextField TextFieldOne;
    @FXML
    private TextField TextFieldTwo;
    @FXML
    private Button buttonOne;

    String user = "airisykt";
    String pw = "skeerlet_yo_hanson2!";
    String checkUser, checkPw;

    @FXML
    private void click1(ActionEvent eventOne){
            checkUser = TextFieldTwo.getText().toString();
            checkPw = TextFieldOne.getText().toString();
            if(checkUser.equals(user) && checkPw.equals(pw)){
                labelOne.setText("Hello Admin!");
            }
            else{
                labelOne.setText("Ошибка авторизации!");
            }
            TextFieldOne.setText("");
            TextFieldTwo.setText("");
        }
    };



