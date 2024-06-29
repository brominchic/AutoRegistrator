package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button button;
    @FXML
    private TextField number;
    @FXML
    private TextField mail;
    @FXML
    private CheckBox mode;
    @FXML
    private Button enterSms;
    @FXML
    private TextField sms;
    @FXML
    private TextField link;

    @FXML
    protected void onButtonClick() throws Exception {

        AutoAccountMaker.enterSMS(sms.getText());
    }

    @FXML
    protected void onHelloButtonClick() throws Exception {
        AutoAccountMaker.main(number.getText(),mail.getText(),mode.isSelected(),link.getText());
        sms.setVisible(true);
        enterSms.setVisible(true);
    }


}