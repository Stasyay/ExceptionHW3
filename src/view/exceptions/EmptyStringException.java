package view.exceptions;

public class EmptyStringException extends RuntimeException{
    public EmptyStringException() {
        super("Пустую строку вводить нельзя!");
    }
}
