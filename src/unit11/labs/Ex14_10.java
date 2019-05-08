package unit11.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex14_10 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Ellipse top = new Ellipse(100, 100, 50, 25);
        top.setFill(Color.WHITE);
        top.setStroke(Color.BLACK);
        top.radiusXProperty().bind(pane.widthProperty().divide(4).subtract(10));
        top.centerXProperty().bind(pane.widthProperty().divide(2));
        top.centerYProperty().bind(pane.heightProperty().divide(4));
        pane.getChildren().add(top);

        Arc lowerArc = new Arc();
        lowerArc.centerXProperty().bind((top.centerXProperty()));
        lowerArc.centerYProperty().bind(top.centerYProperty().multiply(3));
        lowerArc.radiusXProperty().bind(top.radiusXProperty());
        lowerArc.radiusYProperty().bind(top.radiusYProperty());
        lowerArc.setStartAngle(0);
        lowerArc.setLength(-180);
        lowerArc.setType(ArcType.OPEN);
        lowerArc.setFill(Color.WHITE);
        lowerArc.setStroke(Color.BLACK);
        pane.getChildren().add(lowerArc);

        Line leftLine = new Line();
        leftLine.startXProperty().bind(top.centerXProperty().subtract(top.radiusXProperty()));
        leftLine.startYProperty().bind(top.centerYProperty());
        leftLine.endXProperty().bind(lowerArc.centerXProperty().subtract(lowerArc.radiusXProperty()));
        leftLine.endYProperty().bind(lowerArc.centerYProperty());

        Line rightLine = new Line();
        rightLine.startXProperty().bind(top.centerXProperty().add(top.radiusXProperty()));
        rightLine.startYProperty().bind(top.centerYProperty());
        rightLine.endXProperty().bind(lowerArc.centerXProperty().add(lowerArc.radiusXProperty()));
        rightLine.endYProperty().bind(lowerArc.centerYProperty());

        pane.getChildren().addAll(leftLine, rightLine);



        Arc upperArc = new Arc();
        upperArc.centerXProperty().bind((top.centerXProperty()));
        upperArc.centerYProperty().bind(top.centerYProperty().multiply(3));
        upperArc.radiusXProperty().bind(top.radiusXProperty());
        upperArc.radiusYProperty().bind(top.radiusYProperty());
        upperArc.setStartAngle(0);
        upperArc.setLength(180);
        upperArc.setType(ArcType.OPEN);
        upperArc.setFill(Color.WHITE);
        upperArc.setStroke(Color.BLACK);
        upperArc.getStrokeDashArray().addAll(6.0, 21.0);
        pane.getChildren().add(upperArc);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}