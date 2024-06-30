package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        InputStream iconStream = getClass().getResourceAsStream("skull.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("view.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}