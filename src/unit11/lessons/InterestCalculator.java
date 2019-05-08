package unit11.lessons;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

    private Button btCalculate = new Button("Calculate");

    public void start(Stage ps) {

        GridPane p = new GridPane();

        p.add(new Label("Principal"), 0, 0);
        p.add(txtPrincipal, 1, 0);

        p.add(new Label("Annual Interest"), 0, 1);
        p.add(txtInterest, 1, 1);

        p.add(new Label("# Compounding"), 0, 2);
        p.add(txtCompounding, 1, 2);

        p.add(new Label("Years"), 0, 3);
        p.add(txtYears, 1, 3);

        p.add(new Label("Total"), 0, 4);
        p.add(txtTotal, 1, 4);
        txtTotal.setEditable(false);
        //txtTotal.setDisable(true);

        p.add(btCalculate, 1, 5);

        btCalculate.setOnAction(e -> calcInterest());

        Scene scene = new Scene(p);
        ps.setScene(scene);
        ps.show();


    }

    private void calcInterest() {
        double prin = Double.parseDouble(txtPrincipal.getText());
        double n = Double.parseDouble(txtCompounding.getText());
        double r = Double.parseDouble(txtInterest.getText()) / 100;
        double t = Double.parseDouble(txtYears.getText());
        double a = prin * Math.pow(1 + r/n, n*t);

        txtTotal.setText(String.format("$%,.2f", a));
    }
}
