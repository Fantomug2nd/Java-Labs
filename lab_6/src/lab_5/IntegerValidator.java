package lab_5;

//import validator.InvalidValueException;
//import validator.Validator;

public class IntegerValidator{
    int minValue;
    int maxValue;

    public IntegerValidator(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    
    public void valid(Object o) throws InvalidValueException {
        if (o instanceof String) {
            int n;
            try {
                n = Integer.parseInt((String) o);
            } catch (Exception e) {
                throw new InvalidValueException("Expected integer, get " + o + "\n");
            }
            if (n < minValue || n > maxValue) {
                throw new InvalidValueException("Integer should be in range [" + minValue + "; " + maxValue + "]");
            }
        } else {
            throw new InvalidValueException("Invalid object type: String expected\n");
        }
    }
}

