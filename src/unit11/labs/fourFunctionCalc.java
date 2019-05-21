package unit11.labs;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class fourFunctionCalc extends Application {

	BorderPane borderPane = new BorderPane();
	TextField calculations = new TextField();
	GridPane gridPane = new GridPane();

	public void start(Stage primaryStage) {
		// KEY DOWN BELOW for hex or use normal values like red
		gridPane.setStyle("-fx-background-color: #FF0000");
		borderPane.setTop(calculations);
		borderPane.setCenter(gridPane);
		gridPane.setAlignment(Pos.TOP_LEFT);

		NumberButton new7 = new NumberButton("7");

		//gridPane.setGridLinesVisible(true);
		gridPane.add(new7, 1, 1);
		new7.setStyle("-fx-background-color: #FF0000");


		gridPane.add(new NumberButton("8"), 2, 1);
		gridPane.add(new NumberButton("9"), 3, 1);
		gridPane.add(new NumberButton("/"), 4, 1);
		gridPane.add(new NumberButton("4"), 1, 2);
		gridPane.add(new NumberButton("5"), 2, 2);
		gridPane.add(new NumberButton("6"), 3, 2);
		gridPane.add(new NumberButton("*"), 4, 2);
		gridPane.add(new NumberButton("1"), 1, 3);
		gridPane.add(new NumberButton("2"), 2, 3);
		gridPane.add(new NumberButton("3"), 3, 3);
		gridPane.add(new NumberButton("-"), 4, 3);
		gridPane.add(new NumberButton("0"), 1, 4);
		gridPane.add(new NumberButton("."), 2, 4);
		gridPane.add(new NumberButton("="), 3, 4);
		gridPane.add(new NumberButton("+"), 4, 4);



		borderPane.requestFocus();
		Scene scene = new Scene(borderPane);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	class NumberButton extends Button {

		String value;

		NumberButton(String value) {
			super(value);
			this.value = value;
			prefHeightProperty().bind(gridPane.heightProperty().divide(4));
			prefWidthProperty().bind(gridPane.widthProperty().divide(4));
			setOnAction(e -> {
				calculations.setText(calculations.getText() + this.value);
			});
		}
	}
}
