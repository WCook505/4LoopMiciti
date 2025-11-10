package edu.utsa.cs3443.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // *** THIS IS THE IMPORTANT CHANGE ***
            // We are now loading our new "MainScreen.fxml"
            // instead of the old "ItemView.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));

            Parent root = loader.load();
            Scene scene = new Scene(root);

            // I also changed the window title
            primaryStage.setTitle("My Info App");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // The main method stays exactly the same
    public static void main(String[] args) {
        launch(args);
    }
}