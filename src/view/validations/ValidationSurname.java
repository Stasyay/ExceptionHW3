package view.validations;

public class ValidationSurname extends Validation{

    public void inputData(String data){
        checkSpace(data);
        checkSymbol(data);
    }

}
