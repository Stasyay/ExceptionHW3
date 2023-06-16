package view.exceptions;

public class DateException extends RuntimeException{
    public DateException(String data) {
        super("Не корректная дата!");
    }

}
