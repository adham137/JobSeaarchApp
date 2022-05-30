package com.example.seekerapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Seeker {
    @FXML
    private Button browseAndApply;
    @FXML
    private Button updateResume;
    @FXML
    private Button removeApplication;
    public void openbrowseAndApply() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("browse.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Browse");
        stage.setScene(scene);
        stage.show();
    }
    public void openupdateResume() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("upDateResume.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Update Resume");
        stage.setScene(scene);
        stage.show();
    }
    public void openRemoveApplication() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("deleteApplication.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Remove Application");
        stage.setScene(scene);
        stage.show();
    }
}
