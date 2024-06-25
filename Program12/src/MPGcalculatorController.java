//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/30/2024 01:25 pm
//      Assignment Completion : 05/31/2024 10:30 pm
// Total Hours for Assignment : 8 hours

import java.math.BigDecimal;
import java.math.RoundingMode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MPGcalculatorController {

    @FXML
    private TextField gallonsTextField;

    @FXML
    private TextField milesTextField;

    @FXML
    private TextField mpgTextField;
    
    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try {
            BigDecimal miles = new BigDecimal(milesTextField.getText());
            BigDecimal gallons = new BigDecimal(gallonsTextField.getText());

            // Check if gallons is zero to avoid division by zero
            if (gallons.compareTo(BigDecimal.ZERO) == 0) {
                throw new ArithmeticException("Division by zero");
            }

            // Calculate MPG with 2 decimal places rounding
            BigDecimal MPG = miles.divide(gallons, 2, RoundingMode.HALF_UP);

            mpgTextField.setText(MPG.toString());
        } catch (NumberFormatException ex) {
            milesTextField.setText("Enter amount");
            milesTextField.selectAll();
            milesTextField.requestFocus();
        } catch (ArithmeticException ex) {
            mpgTextField.setText("Cannot divide by zero");
        }

    }
    
    public void initialize(){}
}
