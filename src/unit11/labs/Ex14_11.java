package unit11.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Ex14_11 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Circle circle = new Circle(100, 100, 100, Color.AQUAMARINE);
        pane.getChildren().add(circle);

        Ellipse eye = new Ellipse(100, 40, 50, 20);
        eye.setFill(Color.AQUAMARINE);
        eye.setStroke(Color.BLACK);
        pane.getChildren().add(eye);

        Circle pupil = new Circle(100, 40, 10, Color.PURPLE);
        pupil.setStroke(Color.BLACK);
        pane.getChildren().add(pupil);

        Arc mouth = new Arc(100, 130, 75, 50, 0, -180);
        pane.getChildren().add(mouth);

        Polygon nose = new Polygon(75.0, 110.0, 100.0, 75.0, 125.0, 110.0);
        nose.setFill(Color.BLACK);
        pane.getChildren().add(nose);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
