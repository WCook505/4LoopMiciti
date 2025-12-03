package com.example.miciti_demo;

import com.example.miciti_demo.model.AccountSystem;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static final AccountSystem accounts = new AccountSystem();

    public static AccountSystem getAccountSystem() { return accounts; }

    @Override
    public void start(Stage stage) throws IOException {

        accounts.loadAccount();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layouts/Home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Miciti");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}