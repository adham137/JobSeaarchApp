package com.example.seekerapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("seeker.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Job Seeker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Controller.createAmazonJobs();
        Controller.createIBMJobs();
        Controller.createGoogleJobs();
        Controller.createMicrosoftJobs();
        Controller.createSiemensJobs();
        launch();



    }
}