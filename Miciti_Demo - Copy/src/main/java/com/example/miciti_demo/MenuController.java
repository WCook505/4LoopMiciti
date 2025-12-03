package com.example.miciti_demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private Button accountRecords;

    @FXML
    private Button foodButton;

    @FXML
    private Button lodgingButton;

    @FXML
    private Button signOutButton;

    @FXML
    private Button spotsButton;

    @FXML
    private Button transportationButton;

    @FXML
    void switchToFood(ActionEvent event) {

        {

            try {

                Parent loginRoot = FXMLLoader.load(getClass().getResource("layouts/food.fxml"));
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

    @FXML
    void switchToLodging(ActionEvent event) {

        {

            try {

                Parent loginRoot = FXMLLoader.load(getClass().getResource("layouts/lodging.fxml"));
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

    @FXML
    void switchToRecords(ActionEvent event) {

        try {

            Parent loginRoot = FXMLLoader.load(getClass().getResource("layouts/AccountRecord.fxml"));
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
    void switchToSignIn(ActionEvent event) {

        {

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

    }

    @FXML
    void switchToSpots(ActionEvent event) {

        {

            try {

                Parent loginRoot = FXMLLoader.load(getClass().getResource("layouts/spots.fxml"));
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

    @FXML
    void switchToTransportation(ActionEvent event) {


        {

            try {

                Parent loginRoot = FXMLLoader.load(getClass().getResource("layouts/transportation.fxml"));
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