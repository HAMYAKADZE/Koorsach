/**
 * Created by ivan on 16.11.2014.
 */
public class Company {
    private String Name;
    private String CountryCode;

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public Company(String name, String countryCode) {

        Name = name;
        CountryCode = countryCode;
    }

}
