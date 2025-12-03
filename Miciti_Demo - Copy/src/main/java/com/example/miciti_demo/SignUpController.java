package com.example.miciti_demo;
import com.example.miciti_demo.model.Account;
import com.example.miciti_demo.model.AccountSystem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {

    AccountSystem accounts;

    @FXML
    private Button addAccountButton;

    @FXML
    private ImageView image;

    @FXML
    private Label passwordLabel;

    @FXML
    private TextArea passwordTextArea;

    @FXML
    private Label signUpLabel;

    @FXML
    private TextArea userTextArea;

    @FXML
    private Label usernameLabel;

    public void setAccountSystem(AccountSystem accounts) {
        this.accounts = accounts;
    }

    @FXML
    void addAccountClicked(ActionEvent event) {

        String username = userTextArea.getText();
        String password = passwordTextArea.getText();

        Account user = new Account(username, password, "Today" );

        accounts.addAccount(user);

        System.out.println("This works");

        try {

            Parent loginRoot = FXMLLoader.load(getClass().getResource("layouts/Menu.fxml"));
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
    private void initialize() {

        accounts = HelloApplication.getAccountSystem();

        System.out.println("Array: " + accounts.getAccountList().size());

    }



}
