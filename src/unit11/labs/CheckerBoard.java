package unit11.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CheckerBoard extends Application {
	GridPane gridPane = new GridPane();

	public void start(Stage primaryStage) {

		for (int column = 1; column <= 8; column++) {
			for (int row = 1; row <= 8; row++) {
				gridPane.add(new CheckerPane(column, row), column, row);
			}
		}

		Scene scene = new Scene(gridPane);
		gridPane.requestFocus();
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	class CheckerPane extends Pane {

		String defaultString = "-fx-background-color: ";
		String color;
		int column;
		int row;


		CheckerPane(int column, int row) {

			this.row = row;
			this.column = column;

			if (column % 2 != 0 && row % 2 != 0 || column % 2 == 0 && row % 2 == 0) {
				this.color = defaultString + "#FF0000";
			}

			else {
				this.color = defaultString + "#32CD32";
			}


			setStyle(this.color);
			prefHeightProperty().bind(gridPane.heightProperty().divide(8));
			prefWidthProperty().bind(gridPane.widthProperty().divide(8));



			setOnMouseEntered(e -> {
				if (this.color.equals(defaultString + "#32CD32")) {
					setStyle(defaultString + "#00FF00");
				}
				else {
					setStyle(defaultString + "#FF6347");
				}
			});

			setOnMouseExited(e -> {
				setStyle(this.color);
			});

			Circle checker = new Circle(30, Color.BLACK);
			checker.radiusProperty().bind(widthProperty().divide(6));
			checker.centerXProperty().bind(widthProperty().divide(2));
			checker.centerYProperty().bind(heightProperty().divide(2));

			setOnMouseClicked(e -> {
				if (getChildren().contains(checker)) {
					getChildren().remove(checker);
				}
				else {
					getChildren().add(checker);
				}
			});
		}
	}
}
