package unit11.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();

        Image canada = new Image("image/canada.bmp");
        Image china = new Image("image/china.gif");
        Image uk = new Image("image/uk.gif");
        Image usa = new Image("image/us.gif");

        pane.add(new ImageView(canada), 1, 1);
        pane.add(new ImageView(china), 2, 1);
        pane.add(new ImageView(uk), 1, 2);
        pane.add(new ImageView(usa), 2, 2);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
