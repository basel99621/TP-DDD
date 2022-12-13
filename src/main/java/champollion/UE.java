package champollion;

import java.util.ArrayList;
import java.util.List;
public class UE {
    private int heuresCM;
    private int  heuresTD;
    private int heuresTP;
    private ArrayList<ServicePrevu> intervenants;
    public UE(int heuresCM, int heuresTD, int heuresTP, String myIntitule) {
        this.heuresCM = heuresCM;
        this.heuresTD = heuresTD;
        this.heuresTP = heuresTP;
        this.myIntitule = myIntitule;
        this.intervenants=new ArrayList<>();
    }
public List<ServicePrevu> getIntervenants(){
        return this.intervenants;
}
    private final String myIntitule;

    public UE(String intitule) {
        myIntitule = intitule;
    }

    public String getIntitule() {
        return myIntitule;
    }

    
}
