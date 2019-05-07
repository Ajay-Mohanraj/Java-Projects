package unit11.lessons;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class InterestCalculator extends Application {

    private TextField txtPrincipal = new TextField();
    private TextField txtInterest = new TextField();
    private TextField txtCompounding = new TextField();
    private TextField txtYears = new TextField();
    private TextField txtTotal = new TextField();

    public void start(Stage ps) {

        GridPane p = new GridPane();
        p.add(new Label("Principal"), 0, 0);
        p.add(txtPrincipal, 1, 0);

    }
}
