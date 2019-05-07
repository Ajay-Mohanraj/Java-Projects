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
        top.radiusXProperty().bind(pane.widthProperty().divide(2).subtract(10));
        top.centerXProperty().bind(pane.widthProperty().divide(2));
        top.centerYProperty().bind(pane.heightProperty().divide(2));
        pane.getChildren().add(top);

        //Line leftLine = new Line(top.getCenterX()-top.getRadiusX(), top.getCenterY(), top.getCenterX()-top.getRadiusX(), top.getCenterY()+125);
        Line leftLine = new Line();
        leftLine.startXProperty().bind(top.centerXProperty().subtract(top.radiusXProperty()));
        leftLine.startYProperty().bind(top.centerYProperty());
        leftLine.setEndX(0);
        leftLine.setEndY(0);

        pane.getChildren().add(leftLine);


        Line rightLine = new Line(top.getCenterX()+top.getRadiusX(), top.getCenterY(), top.getCenterX()+top.getRadiusX(), top.getCenterY()+125);
        pane.getChildren().add(rightLine);

        Arc lowerArc = new Arc();
        lowerArc.setCenterX(top.getCenterX());
        lowerArc.setCenterY(top.getCenterY()+125);
        lowerArc.setRadiusX(top.getRadiusX());
        lowerArc.setRadiusY(top.getRadiusY());
        lowerArc.setStartAngle(0);
        lowerArc.setLength(-180);
        lowerArc.setType(ArcType.OPEN);
        lowerArc.setFill(Color.WHITE);
        lowerArc.setStroke(Color.BLACK);
        pane.getChildren().add(lowerArc);

        Arc upperArc = new Arc();
        upperArc.setCenterX(top.getCenterX());
        upperArc.setCenterY(top.getCenterY()+125);
        upperArc.setRadiusX(top.getRadiusX());
        upperArc.setRadiusY(top.getRadiusY());
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