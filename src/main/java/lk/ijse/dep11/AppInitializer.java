package lk.ijse.dep11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane root1= FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
        Scene mainScene=new Scene(root1);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Welcome to Easy-textEditor");
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
}
