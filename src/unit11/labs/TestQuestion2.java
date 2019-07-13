package unit11.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;


public class TestQuestion2 extends Application {
	public void start(Stage primaryStage) {
		BorderPane bp = new BorderPane();
		GridPane gridPane = new GridPane();
		TextField textField = new TextField();
		Button add = new Button("Add");
		bp.setBottom(gridPane);

		gridPane.add(textField, 1, 450);
		gridPane.add(add, 10, 450);

		add.setOnAction(e -> {

			Random rand = new Random();
			Circle circle = new Circle(rand.nextInt(500), rand.nextInt(400), Double.parseDouble(textField.getText()), Color.PURPLE);
			bp.getChildren().add(circle);

			circle.setOnMousePressed(d -> {
				bp.getChildren().remove(circle);
			});

		});


		gridPane.requestFocus();
		Scene scene = new Scene(bp, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
