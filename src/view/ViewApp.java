package view;

import controller.ControllerApp;
import view.validations.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewApp implements Commands {
    ValidationDate validationDate;
    ValidationFI validationFI;
    ValidationSurname validationSurname;
    ValidationPhoneNumber validationPhoneNumber;
    ValidationGender validationGender;
    ControllerApp controllerApp;

    public ViewApp(ControllerApp controllerApp, ValidationDate validationDate, ValidationFI validationFI,
                   ValidationSurname validationSurname, ValidationPhoneNumber validationPhoneNumber, ValidationGender validationGender) {
        this.controllerApp = controllerApp;
        this.validationDate = validationDate;
        this.validationFI = validationFI;
        this.validationSurname = validationSurname;
        this.validationPhoneNumber = validationPhoneNumber;
        this.validationGender = validationGender;
    }

    public void run() {

        ArrayList<String> data = new ArrayList<>();

        inputSecondName(data);
        inputFirstName(data);
        inputSurname(data);
        inputBirthday(data);
        inputPhoneNumber(data);
        inputGender(data);
        String fileName = data.get(0);
        controllerApp.controllerSave(fileName, data);
    }

    private void inputSecondName(ArrayList<String> data) {
        String secondName = "Введите фамилию: ";
        data.add(viewCheckFIO(secondName));
    }

    private void inputFirstName(ArrayList<String> data) {
        String firstName = "Введите имя: ";
        data.add(viewCheckFIO(firstName));
    }

    private void inputSurname(ArrayList<String> data) {
        String surname = "Введите отчество: ";
        data.add(viewCheckSurname(surname));
    }

    private void inputBirthday(ArrayList<String> data) {
        String birthday = "Введите дату рождения в формате dd.mm.yyyy: ";
        data.add(viewCheckDate(birthday));
    }

    private void inputPhoneNumber(ArrayList<String> data) {
        String phoneNumber = "Введите номер телефона в формате 87771234567: ";
        data.add(viewCheckPhoneNumber(phoneNumber));
    }

    private void inputGender(ArrayList<String> data) {
        String Sex = "Введите пол (f или m): ";
        data.add(viewCheckGender(Sex));
    }

    @Override
    public String prompt(String text) {
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        return in.nextLine();
    }

    @Override
    public String viewCheckFIO(String text) {
        String data = "";
        while(true) {
            try{
                data = prompt(text);
                validationFI.inputData(data);
                return data;
            } catch (RuntimeException msg) {
                System.out.println(msg.getMessage());
            }
        }

    }
    @Override
    public String viewCheckSurname(String text) {
        String data = "";
        while(true) {
            try{
                data = prompt(text);
                validationSurname.inputData(data);
                return data;
            } catch (RuntimeException msg) {
                System.out.println(msg.getMessage());
            }
        }
    }

    @Override
    public String viewCheckDate(String text) {
        String data = "";

        while (true) {
            try {
                data = prompt(text);
                validationDate.inputData(data);
                return data;
            } catch (RuntimeException msg) {
                System.out.println(msg.getMessage());

            }
        }
    }

    @Override
    public String viewCheckPhoneNumber(String text) {
        String data = "";

        while (true) {
            try {
                data = prompt(text);
                validationPhoneNumber.inputData(data);
                return data;
            } catch (RuntimeException msg) {
                System.out.println(msg.getMessage());

            }
        }
    }

    @Override
    public String viewCheckGender(String text) {
        String data = "";

        while (true) {
            try {
                data = prompt(text);
                validationGender.inputData(data);
                return data;
            }
            catch(RuntimeException message) {
                System.out.println(message.getMessage());
            }
        }
    }



//    public ViewApp(AppController appController) {
//        this.appController = appController;
//    }



}

