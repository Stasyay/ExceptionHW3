package view.validations;

import view.exceptions.GenderException;

public class ValidationGender extends Validation {
    public void inputData(String data){
        checkEmpty(data);
        checkGender(data);
        checkMaxLenght(data,1);

    }
    private void checkGender(String data){

        if(! (data.contains("m") || data.contains("f"))) {
            throw new GenderException(data);
        }
    }
}
