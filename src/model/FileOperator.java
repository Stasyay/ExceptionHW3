package model;
import model.exceptions.NoRecordInFileException;
import model.exceptions.NotCreatedFileException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileOperator {
    TemplateForSave templateForSave;

    public FileOperator(TemplateForSave templateForSave) {
        this.templateForSave = templateForSave;
    }

    public void createFile(String fileName) throws NotCreatedFileException {

        try (FileWriter writer = new FileWriter(fileName + ".txt", true)) {
            writer.flush();
        } catch (IOException message) {
            throw new NotCreatedFileException(fileName);
        }
    }

    public void writeDataInFile(String fileName, ArrayList<String> data) throws NoRecordInFileException {

        try (FileWriter writer = new FileWriter(fileName + ".txt", true)) {
            writer.write(templateForSave.template(data) + "\n");
            writer.flush();
        }
        catch (IOException message) {
            throw new NoRecordInFileException(fileName);
        }
    }
}
