package view.exceptions;

public class FormatPhoneNumberException extends RuntimeException{
    public FormatPhoneNumberException(){
        super("Неправильный формат вводимого номера!");
    }
}
