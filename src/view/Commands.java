package view;

public interface Commands {
    void run();
    String prompt(String text);
    String viewCheckFIO(String text);
    String viewCheckSurname(String text);
    String viewCheckDate(String text);
    String viewCheckPhoneNumber(String text);

     String viewCheckGender(String text);
}
