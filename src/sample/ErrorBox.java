package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ErrorBox {
    public void errorDisplay()
    {
        Stage errorBox=new Stage();
        errorBox.initModality(Modality.APPLICATION_MODAL);
        errorBox.setTitle("Error");
        errorBox.setMaxWidth(550);
        errorBox.setMaxHeight(250);
        errorBox.setMinWidth(550);
        errorBox.setMinHeight(250);
        Label message=new Label("You cannot divide by zero, please enter a number bigger than zero.");
        message.setStyle("-fx-font-size: 16px; -fx-text-fill: white; -fx-font-weight: bold; ");
        Button buttonok=new Button("OK");
        buttonok.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;  -fx-border-radius: 20;");
        buttonok.setOnAction(e-> errorBox.close());
        VBox layout=new VBox(10);
        layout.setStyle("-fx-background-color: grey");
        layout.getChildren().addAll(message,buttonok);
        layout.setAlignment(Pos.CENTER);
        Scene scene=new Scene(layout);
        errorBox.setScene(scene);
        errorBox.showAndWait();
    }
}
