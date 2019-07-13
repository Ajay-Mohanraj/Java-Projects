package unit11.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import unit10.lessons.TriangleObject.Triangle;


public class TestQuestion1 extends Application {
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Rectangle bigger = new Rectangle(200, 200, 200, 200);
		bigger.setFill(Color.RED);

		Rectangle smaller = new Rectangle(250, 300, 100, 100);
		smaller.setFill(Color.BLUE);
		smaller.setStroke(Color.LIGHTBLUE);

		Polygon triangle = new Polygon(200, 200, 300, 100, 400, 200);
		triangle.setFill(Color.WHITE);
		triangle.setStroke(Color.BLACK);


		double originalWidth = smaller.getStrokeWidth();
		smaller.setOnMouseEntered(e -> {
			smaller.setStrokeWidth(10);
		});
		smaller.setOnMouseExited(e -> {
			smaller.setStrokeWidth(originalWidth);
		});

		pane.getChildren().addAll(bigger, smaller, triangle);

		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
