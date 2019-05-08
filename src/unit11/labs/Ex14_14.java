package unit11.labs;

import javafx.application.Application;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Ex14_14 extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SIDE = 150.0;

        Pane pane = new Pane();

        Rectangle r1 = new Rectangle(SIDE/2, 0, SIDE, SIDE);
        r1.widthProperty().bind(pane.widthProperty().subtract(SIDE/2));
        r1.heightProperty().bind(pane.heightProperty().subtract(SIDE));
        r1.setFill(Color.TRANSPARENT);
        r1.setStroke(Color.BLACK);

        Rectangle r2 = new Rectangle(0, SIDE / 2, SIDE, SIDE);
        r2.widthProperty().bind(pane.widthProperty().subtract(SIDE / 2));
        r2.heightProperty().bind(pane.heightProperty().subtract(SIDE / 1));
        r2.setFill(Color.TRANSPARENT);
        r2.setStroke(Color.BLACK);
        r1.getStrokeDashArray().addAll(6.0, 21.0);

        Line line1 = new Line(r2.getX(), r2.getY(), r1.getX(), r1.getY());

        Line line2 = new Line();
        line2.setStartX(r2.getX());
        line2.setEndX(r1.getX());
        line2.startYProperty().bind(r2.yProperty().add(r2.heightProperty()));
        line2.endYProperty().bind(r1.yProperty().add(r1.heightProperty()));

        Line line3 = new Line();
        line3.setStartY(r2.getY());
        line3.setEndY(r1.getY());
        line3.startXProperty().bind(r2.xProperty().add(r2.widthProperty()));
        line3.endXProperty().bind(r1.xProperty().add(r1.widthProperty()));

        Line line4 = new Line();
        line4.startXProperty().bind(r2.xProperty().add(r2.widthProperty()));
        line4.startYProperty().bind(r2.yProperty().add(r2.heightProperty()));
        line4.endXProperty().bind(r1.xProperty().add(r1.widthProperty()));
        line4.endYProperty().bind(r1.yProperty().add(r1.heightProperty()));
        pane.getChildren().addAll(r1, r2, line1, line2, line3, line4);

        StackPane sPane = new StackPane();
        sPane.setAlignment(Pos.CENTER);
        sPane.setPadding(new Insets(20));
        sPane.getChildren().add(pane);

        Scene scene = new Scene(sPane, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}