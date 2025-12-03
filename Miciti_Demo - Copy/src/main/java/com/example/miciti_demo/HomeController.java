package com.example.miciti_demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class HomeController {

    @FXML
    private Button signInButton;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField passwordTextField;



    @FXML
    void switchToMenu(ActionEvent event) {


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
    void switchToSignUp(ActionEvent event) {

        {

            try {

                Parent loginRoot = FXMLLoader.load(getClass().getResource("layouts/SignUp.fxml"));
                Scene loginScene = new Scene(loginRoot);

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(loginScene);
                stage.show();

            }

            catch (IOException e) {

                e.printStackTrace();

            }

        }

    }

}
