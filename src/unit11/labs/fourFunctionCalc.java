package unit11.labs;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class fourFunctionCalc extends Application {
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		FlowPane flowPane = new FlowPane();
		TextField calculations = new TextField();

		pane.getChildren().addAll(calculations, flowPane);
		calculations.setAlignment(Pos.CENTER);
		flowPane.setAlignment(Pos.BOTTOM_CENTER);

		flowPane.requestFocus();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
