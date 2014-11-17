/**
 * Created by ivan on 16.11.2014.
 */
public class Form {
    private String Name;
    private String Dosage;

    public Form(String name, String dosage) {
        Name = name;
        Dosage = dosage;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    public String getName() {

        return Name;
    }

    public String getDosage() {
        return Dosage;
    }
}
