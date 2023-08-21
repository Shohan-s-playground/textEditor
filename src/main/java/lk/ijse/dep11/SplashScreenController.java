package lk.ijse.dep11;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class SplashScreenController {
    public AnchorPane rootSplash;
    public Button btnPush;
    public void start(Stage primaryStage)throws IOException {
        AnchorPane root= FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
        Scene mainScene=new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Undecorated Window");

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        root.setBackground(Background.fill(Color.TRANSPARENT));
        mainScene.setFill(Color.TRANSPARENT);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public void btnPushOnAction(ActionEvent actionEvent)throws IOException {
        AnchorPane scene2Root = FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
        Scene scene2 = new Scene(scene2Root);

        Stage primaryStage = (Stage) rootSplash.getScene().getWindow();
        primaryStage.setScene(scene2);
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();

        TranslateTransition translate = new TranslateTransition(Duration.millis(200), scene2Root);
        translate.setFromX(-100);
        translate.setToX(0);
        translate.playFromStart();


    }
}
