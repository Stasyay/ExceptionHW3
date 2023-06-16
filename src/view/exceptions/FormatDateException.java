package view.exceptions;

public class FormatDateException extends RuntimeException{
    public FormatDateException(String data){
        super("Не соответствует формату: dd.mm.yyyy");

    }
}
