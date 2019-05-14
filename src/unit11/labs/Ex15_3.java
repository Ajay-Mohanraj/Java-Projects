package unit11.labs;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ex15_3 extends Application {

    private final double radius = 20;
    private double x = radius, y = radius;
    private double dx = 5, dy = 5;

    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        Pane pane = new Pane();
        HBox buttonHolder = new HBox(20);

        Circle ball = new Circle(x, y, radius);
        ball.setFill(Color.WHITE);
        ball.setStroke(Color.BLACK);
        pane.getChildren().add(ball);

        borderPane.setCenter(pane);
        borderPane.setBottom(buttonHolder);
        buttonHolder.setAlignment(Pos.CENTER);



        Button left = new Button("Left");
        Button right = new Button("Right");
        Button up = new Button("Up");
        Button down = new Button("Down");
        buttonHolder.getChildren().addAll(left, right, up, down);

        left.setOnAction(e -> {

            if (x > 0) {
                x -= dx;
                ball.setCenterX(x);
            }
        });

        right.setOnAction(e -> {

            if (x < pane.getWidth()) {
                x += dx;
                ball.setCenterX(x);
            }
        });

        up.setOnAction(e -> {

            if (y >= 0) {
                y -= dy;
                ball.setCenterY(y);
            }
        });

        down.setOnAction(e -> {

            if (y <= pane.getHeight()) {
                y += dy;
                ball.setCenterY(y);
            }
        });

        Scene scene = new Scene(borderPane, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
        borderPane.requestFocus();
    }
}
