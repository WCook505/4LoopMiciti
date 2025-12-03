package com.example.miciti_demo;

import com.example.miciti_demo.model.AccountSystem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class AccountRecordController {

    AccountSystem accounts;

    @FXML
    private Button backToMain;

    @FXML
    private RadioButton deleteRadio;

    @FXML
    private RadioButton findRadio;

    @FXML
    private Button goButton;

    @FXML
    private Label outputLabel;

    @FXML
    private ToggleGroup searchGroup;

    @FXML
    private TextField searchTxtField;

    @FXML
    void backToMainClicked(ActionEvent event) {


        try {

            Parent loginRoot = FXMLLoader.load(getClass().getResource("layouts/Home.fxml"));
            Scene loginScene = new Scene(loginRoot);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(loginScene);
            stage.show();

        }

        catch (IOException e) {

            e.printStackTrace();

        }



    }

    @FXML
    void goButtonClicked(ActionEvent event) {

        String username = searchTxtField.getText();

        if(deleteRadio.isSelected()) {

            accounts.removeAccount(username);

            outputLabel.setWrapText(true);

            outputLabel.setText(accounts.toString());

            System.out.println("This works");

        }

        if(findRadio.isSelected()) {


            outputLabel.setWrapText(true);

            outputLabel.setText(accounts.findAccount(username).toString());

        }

    }

    @FXML
    private void initialize() {

        accounts = HelloApplication.getAccountSystem();

        System.out.println("Array: " + accounts.getAccountList().size());

    }

}
