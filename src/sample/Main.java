package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setMinHeight(785);
        primaryStage.setMinWidth(525);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setFullScreen(true);
        primaryStage.setOpacity(0.96554);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
