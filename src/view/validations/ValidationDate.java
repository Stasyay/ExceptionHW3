package view.validations;

import view.exceptions.FormatDateException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidationDate extends Validation {
    public void inputData(String data) {
        checkEmpty(data);
        checkDate(data);
    }
    private void checkDate(String date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
        } catch (ParseException msg) {
            throw new FormatDateException(date);
        }
    }
    

}
