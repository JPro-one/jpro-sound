package one.jpro.sound.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JProSoundSample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pin = new VBox();

        pin.getChildren().add(new Label(("Hello!")));

        Scene scene = new Scene(pin);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
