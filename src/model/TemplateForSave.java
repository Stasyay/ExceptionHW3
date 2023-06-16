package model;

import java.util.ArrayList;

public class TemplateForSave {

    public String template(ArrayList<String> data) {

        String dataForSave = "<"+data.get(0)+">"+"<"+data.get(1)+">"+
                "<"+data.get(2)+">"+"<"+data.get(3)+">"+
                "<"+data.get(4)+">"+"<"+data.get(5)+">";
        return dataForSave;
    }

}
