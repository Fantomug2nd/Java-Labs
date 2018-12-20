package lab_5;



public class StringValidator {
    private String regex;
    private String errMsg;

    public StringValidator(String regex, String errMsg) {
        this.regex = regex;
        this.errMsg = errMsg;
    }

  
    public void valid(Object o) throws InvalidValueException {
        if (o instanceof String) {
            String obj = (String) o;
            if (!obj.matches(regex)) {
                if (errMsg == null) {
                    throw new InvalidValueException("Value does not match requirements\n");
                }
                throw new InvalidValueException(errMsg);
            }
        } else {
            throw new InvalidValueException("Invalid object type: String expected\n");
        }
    }
}
