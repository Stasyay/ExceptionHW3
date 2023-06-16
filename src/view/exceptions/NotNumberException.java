package view.exceptions;

public class NotNumberException extends RuntimeException{
    public NotNumberException(){
        super("Нужно вводить цифры!");
    }
}
