package view.exceptions;

public class GenderException extends RuntimeException{
    public GenderException(String data){
        super("Введите m или f");
    }
}
