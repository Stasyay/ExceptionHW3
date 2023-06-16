package controller;

import model.FileOperator;
import model.exceptions.NoRecordInFileException;
import model.exceptions.NotCreatedFileException;

import java.util.ArrayList;

public class ControllerApp {
    FileOperator fileOperator;

    public ControllerApp(FileOperator fileOperator) {
        this.fileOperator = fileOperator;
    }

    public void controllerSave(String fileName, ArrayList<String> data) {

        attemptRepeatTwiceCreateFile(fileName);

        attemptRepeatTwiceWriteDataInFile(fileName, data);
    }
    private void attemptRepeatTwiceCreateFile(String fileName) {

        boolean stopFlag = true;

        int count = 0;

        while (stopFlag) {

            count++;

            try {
                fileOperator.createFile(fileName);
                stopFlag = false;
            }
            catch (NotCreatedFileException message) {
                message.printStackTrace();
                //System.out.println(message.getMessage() + " попытка создать файл №: " + count);
            }

            if (count == 2) {
                stopFlag = false;
            }
        }
    }

    private void attemptRepeatTwiceWriteDataInFile(String fileName, ArrayList<String> data) {

        boolean stopFlag = true;

        int count = 0;

        while (stopFlag) {

            count++;

            try {
                fileOperator.writeDataInFile(fileName, data);
                stopFlag = false;
            }
            catch (NoRecordInFileException message) {
                message.printStackTrace();
                System.out.println(message.getMessage() + " попытка записать данные №: " + count);
            }

            if (count == 2) {
                stopFlag = false;
            }
        }
    }

}
