package view.validations;
public class ValidationFI extends Validation {

    public void inputData(String data){
        checkEmpty(data);
        checkSymbol(data);
    }

}
