package view.exceptions;

public class MaxLenghtException extends RuntimeException{
    public MaxLenghtException(int maxLen) {
        super("Количество символов более: " + maxLen);
    }
}
