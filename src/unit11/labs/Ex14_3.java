package unit11.labs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class Ex14_3 extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();

        String path1 = "";
        String path2 = "";
        String path3 = "";

        Random rand = new Random();
        int a = rand.nextInt(55);
        int b = rand.nextInt(55);
        int c = rand.nextInt(55);

        path1 += ("image/card/" + a + ".png");
        path2 += ("image/card/" + b + ".png");
        path3 += ("image/card/" + c + ".png");

        Image image1 = new Image(path1);
        Image image2 = new Image(path2);
        Image image3 = new Image(path3);

        pane.add(new ImageView(image1), 0, 0);
        pane.add(new ImageView(image2), 1, 0);
        pane.add(new ImageView(image3), 2, 0);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}