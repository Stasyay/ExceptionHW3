package model.exceptions;

import java.io.IOException;

public class NoRecordInFileException extends IOException {
    public NoRecordInFileException(String fileName) {
        super("Данные не записаны в файл: " + fileName);
    }
}
