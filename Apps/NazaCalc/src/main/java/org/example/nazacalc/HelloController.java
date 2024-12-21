package org.example.nazacalc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField myTextField;
    @FXML
    protected void OneButton() {
        String text = myTextField.getText();
        myTextField.setText(text + "1");
    }
    @FXML
    protected void TwoButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "2");
    }
    @FXML
    protected void ThreeButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "3");
    }
    @FXML
    protected void FourButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "4");
    }
    @FXML
    protected void FiveButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "5");
    }
    @FXML
    protected void SixButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "6");
    }
    @FXML
    protected void SevenButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "7");
    }
    @FXML
    protected void EightButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "8");
    }
    @FXML
    protected void NineButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "9");
    }
    @FXML
    protected void ZeroButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "0");
    }
    @FXML
    protected void PlusButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "+");
    }
    @FXML
    protected void SustractionButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "-");
    }
    @FXML
    protected void MultiplicationButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "*");
    }
    @FXML
    protected void DivisionButton(){
        String text = myTextField.getText();
        myTextField.setText(text + "/");
    }
    @FXML
    protected void EqualButton(){

    }
    @FXML
    protected void DeletelAllButton(){
        String text = myTextField.getText();
        myTextField.setText("");
    }
    @FXML
    protected void DotButton(){
        String text = myTextField.getText();
        myTextField.setText(text + ".");
    }
}