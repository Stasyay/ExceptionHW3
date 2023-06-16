package model.exceptions;

import java.io.IOException;

public class NotCreatedFileException extends IOException {
    public NotCreatedFileException(String fileName) {
        super("Файл " + fileName + " не создан");
    }
}
