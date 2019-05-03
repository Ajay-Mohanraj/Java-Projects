package unit11.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Ex14_6 extends Application {
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                Rectangle r = new Rectangle();
                r.widthProperty().bind(pane.widthProperty().divide(8));
                r.heightProperty().bind(pane.heightProperty().divide(8));
                r.xProperty().bind(pane.widthProperty().divide(8).multiply(column));
                r.yProperty().bind(pane.heightProperty().divide(8).multiply(row));
                r.setFill(Color.BLUE);
                if ((row + column) % 2 == 0) {
                    r.setFill(Color.CORNFLOWERBLUE);
                }
                pane.getChildren().add(r);
            }
        }


        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
