package champollion;

public class ServicePrevu {
	// TODO : implémenter cette classe fait
 private int volumeCM;
    private int volumeTP;
    private int volumeTD;
    private Enseignant enseignant;
private UE ue;
public ServicePrevu(int volumeCM, int volumeTP,int  volumeTD, UE ue)
{
    this.volumeCM=volumeCM;
    this.volumeTD=volumeTD;
    this.volumeTP=volumeTP;
    this.ue=ue;
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
}
