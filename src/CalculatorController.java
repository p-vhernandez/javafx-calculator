import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class CalculatorController {
    
    @FXML
    private Label result;
    @FXML
    private Label operationText;
    
    //Determine if next digit belongs to a new number (true) or not (false)
    private boolean newData = true;
    private String pendingOperation="";
    //True indicates that a new operation will be made 
    private boolean newOperation = true;
    //to make calculations
    private CalculatorModel calculator = new CalculatorModel();
    
    @FXML
    void digitClick(ActionEvent event) {
        Double number = 0.0;
        
    	if (!newData){
            //it is not new number
    	    number = Double.parseDouble(
            result.getText());
    	} else{
    		newData = false;
    	}
    		
    	//Convert text into number
    	//This code only works with natural numbers!!
    	int mult = (result.getText().equals("0"))?
    			1 : 10;
    	number = mult * number + Double.parseDouble(((Button) event.getSource()).getText());
    	result.setText(number.toString());
    }

    @FXML
    void operatorClick(ActionEvent event) {
    	//A new operation is required
    	String operation = ((Button) event.getSource()).getText();
    	//if there is pending operations it is done
    	processOperation(pendingOperation);
    	//The new operation is stored until the next number is provided
    	pendingOperation = operation;
    	String text = operationText.getText();
    	text += pendingOperation;
    	operationText.setText(text);
    }
    
    @FXML
    void equalClick(ActionEvent event) {
    	if (!pendingOperation.isEmpty()) {
    		processOperation(pendingOperation);
    		pendingOperation="";
    		this.result.setText("" + calculator.getAccumulator());
    		newOperation = true;
    	}
    }
	
    private void processOperation(String op){
    	double data = Double.parseDouble(result.getText());	
    	Double calculateResult = calculator.calculate(op, data);
    	String text = (newOperation) ? "" :operationText.getText();
    	newOperation = false;
    	text += data;
    	operationText.setText(text);
    	this.result.setText(calculateResult.toString());
    	newData = true;
    }
}
