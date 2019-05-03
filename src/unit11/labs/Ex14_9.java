package unit11.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Ex14_9 extends Application {
    public void start(Stage ps) {
        GridPane pane = new GridPane();
        pane.add(new FanPane(), 0, 0);
        pane.add(new FanPane(), 0, 1);
        pane.add(new FanPane(), 1, 0);
        pane.add(new FanPane(), 1, 1);

        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(50);
        pane.getColumnConstraints().add(cc);
        pane.getColumnConstraints().add(cc);

        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(50);
        pane.getRowConstraints().add(rc);
        pane.getRowConstraints().add(rc);

        Scene scene = new Scene(pane, 400, 400);
        ps.setScene(scene);
        ps.show();
    }
}

class FanPane extends Pane {

    public FanPane() {

        Ellipse e = new Ellipse();
        e.radiusXProperty().bind(widthProperty().divide(2).subtract(10));
        e.radiusYProperty().bind(heightProperty().divide(2).subtract(10));
        e.centerXProperty().bind(widthProperty().divide(2));
        e.centerYProperty().bind(heightProperty().divide(2));
        e.setStrokeWidth(3);
        e.setStroke(Color.ORANGE);
        e.setFill(Color.WHITE);
        getChildren().add(e);

        Arc a = new Arc();
        a.setStartAngle(30);
        a.setLength(45);
        a.radiusXProperty().bind(widthProperty().divide(2).subtract(20));
        a.radiusYProperty().bind(heightProperty().divide(2).subtract(20));
        a.centerXProperty().bind(widthProperty().divide(2));
        a.centerYProperty().bind(heightProperty().divide(2));
        a.setStrokeWidth(3);
        a.setStroke(Color.ORANGE);
        a.setFill(Color.ORANGE);
        a.setType(ArcType.ROUND);
        getChildren().add(a);

        drawArc(120);
        drawArc(210);
        drawArc(300);

    }

    public void drawArc(int startAngle) {
        Arc a = new Arc();
        a.setStartAngle(startAngle);
        a.setLength(45);
        a.radiusXProperty().bind(widthProperty().divide(2).subtract(20));
        a.radiusYProperty().bind(heightProperty().divide(2).subtract(20));
        a.centerXProperty().bind(widthProperty().divide(2));
        a.centerYProperty().bind(heightProperty().divide(2));
        a.setStrokeWidth(3);
        a.setStroke(Color.ORANGE);
        a.setFill(Color.ORANGE);
        a.setType(ArcType.ROUND);
        getChildren().add(a);
    }
}