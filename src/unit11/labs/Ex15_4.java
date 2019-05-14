package unit11.labs;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex15_4 extends Application {
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        FlowPane centerFlowPane = new FlowPane(20, 20);
        borderPane.setCenter(centerFlowPane);
        centerFlowPane.setAlignment(Pos.CENTER);
        HBox buttonHolder = new HBox(20);
        borderPane.setBottom(buttonHolder);
        buttonHolder.setAlignment(Pos.CENTER);

        Label number1 = new Label("Number 1: ");
        TextField numberOne = new TextField();

        Label number2 = new Label("Number 2: ");
        TextField numberTwo = new TextField();

        Label result = new Label("Result: ");
        TextField output = new TextField();

        Button add = new Button("Add");
        Button subtract = new Button("Subtract");
        Button multiply = new Button("Multiply");
        Button divide = new Button("Divide");

        centerFlowPane.getChildren().addAll(number1, numberOne, number2, numberTwo, result, output);
        buttonHolder.getChildren().addAll(add, subtract, multiply, divide);


        add.setOnAction(e -> {
            double num1 = Double.parseDouble(numberOne.getText());
            double num2 = Double.parseDouble(numberTwo.getText());
            output.setText(String.format("%.2f", num1+num2));
        });

        subtract.setOnAction(e -> {
            double num1 = Double.parseDouble(numberOne.getText());
            double num2 = Double.parseDouble(numberTwo.getText());
            output.setText(String.format("%.2f", num1-num2));
        });

        multiply.setOnAction(e -> {
            double num1 = Double.parseDouble(numberOne.getText());
            double num2 = Double.parseDouble(numberTwo.getText());
            output.setText(String.format("%.2f", num1*num2));
        });

        divide.setOnAction(e -> {
            double num1 = Double.parseDouble(numberOne.getText());
            double num2 = Double.parseDouble(numberTwo.getText());
            output.setText(String.format("%.2f", num1/num2));
        });

        Scene scene = new Scene(borderPane, 900, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
        borderPane.requestFocus();
    }
}
