package view.exceptions;

public class MinLenghtException extends RuntimeException{
    public MinLenghtException(int miтLen) {
        super("Количество символов менее: " + miтLen);
    }
}
