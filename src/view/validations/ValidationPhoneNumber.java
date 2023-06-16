package view.validations;

import view.exceptions.NotNumberException;

public class ValidationPhoneNumber extends Validation {
    public void inputData(String data) {
        checkEmpty(data);
        checkMaxLenght(data,11);
        checkMinLenght(data, 11);
        checkNotNumber(data);
    }

    private void checkNotNumber(String data) {

        for (int i = 0; i<data.length(); i++) {
            if(!Character.isDigit(data.charAt(i))) {
                throw new NotNumberException();
            }
        }
    }
}
