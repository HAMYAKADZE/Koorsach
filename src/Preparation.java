/**
 * Created by ivan on 16.11.2014.
 */
public class Preparation {
    private String Name;
    private String PreparationCode;
    private String FormCode;
    private String CompanyCode;

    public Preparation(String formCode, String name, String preparationCode, String companyCode) {
        FormCode = formCode;
        Name = name;
        PreparationCode = preparationCode;
        CompanyCode = companyCode;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPreparationCode(String preparationCode) {
        PreparationCode = preparationCode;
    }

    public void setFormCode(String formCode) {
        FormCode = formCode;
    }

    public void setCompanyCode(String companyCode) {
        CompanyCode = companyCode;
    }

    public String getName() {

        return Name;
    }

    public String getPreparationCode() {
        return PreparationCode;
    }

    public String getFormCode() {
        return FormCode;
    }

    public String getCompanyCode() {
        return CompanyCode;
    }
}
