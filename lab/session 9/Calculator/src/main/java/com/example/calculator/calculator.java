package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class calculator extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(calculator.class.getResource("calculatorView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 300);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
}