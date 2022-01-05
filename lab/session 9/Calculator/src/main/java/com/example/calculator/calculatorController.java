package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class calculatorController {
    @FXML
    private Label res;
    private double num1 = 0;
    private String op = "";
    private boolean start = true;

    @FXML
    private void processNumbers(ActionEvent event) {
        if (start) {
            res.setText("");
            start = false;
        }
        String temp = (((Button) event.getSource()).getText());
        res.setText(res.getText() + temp);
    }

    @FXML
    private void processOperators1(ActionEvent event) {
        String temp = ((Button) event.getSource()).getText();
        if (!temp.equals("=")) {
            if (res.getText().isEmpty() || res.getText().equals("divide to zero!"))
                return;
            op = temp;
            num1 = Double.parseDouble(res.getText());
            res.setText("");
        } else {
            if (op.isEmpty())
                return;
            double num2 = Double.parseDouble(res.getText());
            String out = calculateTwoOperations(num1, num2, op);
            res.setText(out);
            if (!out.equals("divide to zero!"))
                num1 = Double.parseDouble(out);
            op = "";
            start = true;
        }

    }

    @FXML
    private void processOperators2(ActionEvent event) {
        String temp = ((Button) event.getSource()).getText();
        if (res.getText().isEmpty() || res.getText().equals("tangent of this angle does not exist"))
            return;
        op = temp;
        num1 = Double.parseDouble(res.getText());
        String out = calculateOneOperation(num1, op);
        res.setText(out);
        if (!out.equals("tangent of this angle does not exist"))
            num1 = Double.parseDouble(out);
        op = "";
        start = true;
    }

    @FXML
    private void deleteRes(ActionEvent event) {
        res.setText("");
        op = "";
        start = true;
        num1 = 0;
    }

    private String calculateOneOperation(double num1, String op) {
        switch (op) {
            case "sin":
                return String.valueOf(Math.sin(num1));
            case "cos":
                return String.valueOf(Math.cos(num1));
            case "tan":
                if (Math.cos(num1) == 0)
                    return "tangent of this angle does not exist";
                return String.valueOf(Math.tan(num1));
        }
        return "";
    }

    private String calculateTwoOperations(double num1, double num2, String op) {
        switch (op) {
            case "/":
                if (num2 == 0)
                    return "divide to zero!";
                return String.valueOf(num1 / num2);
            case "x":
                return String.valueOf(num1 * num2);
            case "-":
                return String.valueOf(num1 - num2);
            case "+":
                return String.valueOf(num1 + num2);
            case "^":
                return String.valueOf(Math.pow(num1, num2));
            default:
                break;
        }
        return "";
    }
}
