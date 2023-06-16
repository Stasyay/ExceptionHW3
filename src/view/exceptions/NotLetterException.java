package view.exceptions;

public class NotLetterException extends RuntimeException{
    public NotLetterException(){
        super("Здесь могут быть только буквы!");
    }
}
