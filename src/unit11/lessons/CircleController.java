package unit11.lessons;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleController extends Application {

    private Circle c = new Circle(5);

    public void start(Stage ps) {

        Pane pane = new Pane();

        pane.setOnMousePressed(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                c.setRadius(c.getRadius()+1);
            }
            else if (e.getButton() == MouseButton.SECONDARY) {
                c.setRadius(c.getRadius()-1);
            }
        });

        pane.setOnKeyPressed(e -> {
            if (e.getText().equals("0")) {
                c.setFill(Color.CHARTREUSE);
            }
            else if (e.getText().equals("1")) {
                c.setFill(Color.BLANCHEDALMOND);
            }
            else if (e.getCode() == KeyCode.UP) {
                c.setRadius(c.getRadius()+1);
            }
            else if (e.getCode() == KeyCode.DOWN) {
                c.setRadius(c.getRadius()-1);
            }
            else {
                c.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
            }
        });
        pane.getChildren().add(c);
        c.setFill(Color.BLACK);
        c.setFill(Color.BLACK);

        c.centerXProperty().bind(pane.widthProperty().divide(2));
        c.centerYProperty().bind(pane.heightProperty().divide(2));

        Scene scene = new Scene(pane, 400, 400);
        ps.setScene(scene);
        ps.show();
        pane.requestFocus();
    }
}
