import controller.ControllerApp;
import model.FileOperator;
import model.TemplateForSave;
import view.ViewApp;
import view.validations.*;


public class Main {
    public static void main(String[] args) {
        TemplateForSave templateForSave = new TemplateForSave();
        FileOperator fileOperator = new FileOperator(templateForSave);
        ControllerApp controllerApp = new ControllerApp(fileOperator);
        ValidationDate validationDate = new ValidationDate();
        ValidationFI validationFI = new ValidationFI();
        ValidationSurname validationSurname = new ValidationSurname();
        ValidationPhoneNumber validationPhoneNumber = new ValidationPhoneNumber();
        ValidationGender validationGender = new ValidationGender();
        ViewApp viewApp = new ViewApp(controllerApp, validationDate, validationFI, validationSurname,
                validationPhoneNumber, validationGender);
        viewApp.run();
    }
}