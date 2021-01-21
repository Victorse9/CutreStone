package paquete;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Partida.fxml"));
        primaryStage.setTitle("CARTAS");
        primaryStage.setScene(new Scene(root, 1300, 830));
        primaryStage.setResizable(false);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }

}
