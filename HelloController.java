package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField salesInput;

    @FXML
    private TextField forecastPeriodInput;

    @FXML
    private Label predictedSalesLabel;

    @FXML
    protected void onPredictButtonClick() {
        try {
            double sales = Double.parseDouble(salesInput.getText());
            int forecastPeriod = Integer.parseInt(forecastPeriodInput.getText());

            // Perform sales forecasting calculation (a simple example)
            double predictedSales = sales * Math.pow(1.1, forecastPeriod);

            // Display the predicted sales
            predictedSalesLabel.setText("Predicted Sales: " + predictedSales);
        } catch (NumberFormatException e) {
            predictedSalesLabel.setText("Invalid input. Please enter valid numbers.");
        }
    }
}
