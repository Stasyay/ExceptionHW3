package view.validations;

import view.exceptions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    protected void checkMaxLenght(String data, int maxQuantity){
        if ( data.length() > maxQuantity){
            throw new MaxLenghtException(maxQuantity);
        }
    }

    protected void checkMinLenght(String data, int minQuantity){
        if ( data.length() < minQuantity){
            throw new MinLenghtException(minQuantity);
        }
    }

    protected void checkEmpty(String data) {
        if (data.isEmpty()) {
            throw new EmptyStringException();
        }
    }
    protected void checkSpace(String data){
        if ( data.contains(" ") ) {
            throw new SpaceException();
        }
    }

    protected void checkSymbol(String data) {
        Pattern pattern = Pattern.compile("[0-9!@#$%^&*()_+\\=\\[\\]{};':\"\\\\|,.<>/?]");
        Matcher matcher = pattern.matcher(data);

        if (matcher.find()) {
            throw new NotLetterException();
        }
    }

}
