package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class MainFormController {
    public AnchorPane root1;
    public ProgressBar pb;
    public Button btnNew;
    public Button btnCut;
    public Button btnUserGuide;
    public Button btnOpen;
    public Button btnCopy;
    public Button btnAboutUs;
    public Button btnSave;
    public Button btnPaste;
    public Button btnSaveAs;
    public Button btnSelectAll;
    public Button btnPrint;
    public Button btnExit;

    public void initialize() throws  IOException{

    }

    public void btnNewOnAction(ActionEvent actionEvent) throws IOException{
        AnchorPane new1=FXMLLoader.load(getClass().getResource("/view/HTMLEditor.fxml"));
        Scene newScene=new Scene(new1);
        Stage primaryStage = (Stage) root1.getScene().getWindow();
        primaryStage.setScene(newScene);
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();





    }

    public void btnCutOnAction(ActionEvent actionEvent) {
    }

    public void btnUserGuideOnAction(ActionEvent actionEvent) {
    }

    public void btnOpenOnAction(ActionEvent actionEvent) {
    }

    public void btnCopyOnAction(ActionEvent actionEvent) {
    }

    public void btnAboutUsOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
    }

    public void btnPasteOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveAsOnAction(ActionEvent actionEvent) {
    }

    public void btnSelectAllOnAction(ActionEvent actionEvent) {
    }

    public void btnPrintOnAction(ActionEvent actionEvent) {
    }

    public void btnExitOnAction(ActionEvent actionEvent) {
    }
}