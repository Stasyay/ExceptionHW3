package view.exceptions;

public class SpaceException extends RuntimeException{
    public SpaceException(){
        super("Пробелы вводить нельзя!");
    }
}
