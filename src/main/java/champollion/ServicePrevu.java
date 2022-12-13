package champollion;

public class ServicePrevu {
	// TODO : implémenter cette classe fait
    private UE ue;
 private int volumeCM;
    private int volumeTP;
    private int volumeTD;
    private Enseignant enseignant;
public ServicePrevu(int volumeCM, int volumeTP,int  volumeTD, Enseignant enseignant, UE ue)
{
    this.volumeCM=volumeCM;
    this.volumeTD=volumeTD;
    this.volumeTP=volumeTP;
    this.ue=ue;
    this.enseignant=enseignant;
    }

    public ServicePrevu(UE ue, Enseignant enseignant, int volumeCM, int volumeTD, int volumeTP) {
    }

    public int getVolumeCM(){
    return volumeCM;
    }
    public int getVolumeTP(){
    return volumeTP;
    }
public int getVolumeTD(){
    return volumeTD;
     }

    public UE getUe() {
        return ue;
    }


    public void setUe(UE ue) {
        this.ue = ue;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }


    public void setVolumeCM(int volumeCM) {
        this.volumeCM = volumeCM;
    }



    public void setVolumeTD(int volumeTD) {
        this.volumeTD = volumeTD;
    }


    public void setVolumeTP(int volumeTP) {
        this.volumeTP = volumeTP;
    }


    // TODO : implémenter cette classe

}


