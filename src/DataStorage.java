import java.util.HashMap;

/**
 * Created by ivan on 16.11.2014.
 */
public class DataStorage {
    private HashMap<String,Preparation> PreparationMap;
    private HashMap<String,String> CountryMap;
    private HashMap<String,Company> CompanyMap;
    private HashMap<String,Integer> Storage;

    public DataStorage(){
        HashMap<String,Preparation> PreparationMap = new HashMap<String,Preparation>();
        HashMap<String,String> CountryMap = new HashMap<String,String>();;
        HashMap<String,Company> CompanyMap = new HashMap<String,Company>();;
        HashMap<String,Integer> Storage = new HashMap<String,Integer>();;
    }

    public void addPreparation(Preparation p){
        PreparationMap.put(p.getPreparationCode(),p);
    }

    public void addCountry(String code,String country){
        CountryMap.put(country,code);
    }

    public void addCompany(Preparation p){
        PreparationMap.put(p.getPreparationCode(),p);
    }

    public void addStorage(Preparation p){
        PreparationMap.put(p.getPreparationCode(),p);
    }

}
