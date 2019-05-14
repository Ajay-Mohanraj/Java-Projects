package unit11.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex15_12 extends Application {
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		Circle circle = new Circle(100, 60, 50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		pane.getChildren().add(circle);

		Text inside = new Text();
		pane.add(inside, 100, 100);

		circle.setOnMouseEntered(e -> {
			inside.setText("Mouse point is inside the circle");
		});
		circle.setOnMouseExited(e -> {
			inside.setText("Mouse point is outside the circle");
		});


		Scene scene = new Scene(pane, 500, 200);

		primaryStage.setScene(scene);
		primaryStage.show();

		pane.requestFocus();
	}
}
