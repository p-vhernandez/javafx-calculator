public class CalculatorModel {
    
    private double accumulator = 0;

    public CalculatorModel() { }
 
    public CalculatorModel(double initValue) {
        this.accumulator = initValue;
    }

    public double calculate (String operation, double data) {
        switch (operation ){
            case "+":
            accumulator += data;
            break;
            case "-":
                accumulator -= data;
                break;
            case "*":
                accumulator *= data;
                break;
            case "/":
                accumulator /= data;
                break;
            case "":
                // Set accumulator value: there is not pending operation,
                // so accumulator value must be set to data
                accumulator = data;
                break;
            default:
                accumulator = data;
                break;
        }

        return accumulator;
    }

    public double getAccumulator() {
        return this.accumulator;
    }
}
