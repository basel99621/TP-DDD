package champollion;
import java.util.ArrayList;
import java.util.List;
public class Enseignant extends Personne {

    // TODO : rajouter les autres méthodes présentes dans le diagramme UML fait
private ArrayList<ServicePrevu> cours;


    public Enseignant(String nom, String email) {
        super(nom, email);
        this.cours = new ArrayList<>();
    }
    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        // TODO: Implémenter cette méthode fait
        int heuresPrevues=0;
      for (int i=0; i<this.cours.size(); i++ ) {
            int heuresCM = this.cours.get(i).getVolumeCM();
            int heuresTP =this.cours.get(i).getVolumeTP();
            int heuresTD=this.cours.get(i).getVolumeTD();
          int  heuresTotalesEquivalentTD= (int) (heuresCM*1.5 + heuresTP*0.75 + heuresTD);
          heuresPrevues=heuresTotalesEquivalentTD;
        }
        return heuresPrevues;
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        // TODO: Implémenter cette méthode fait
        int heuresPrevuesPourUE =0;
        for (int i=0; i<this.cours.size(); i++ ) {
            if (this.cours.get(i).getUe()==ue) {
                int heuresCM = this.cours.get(i).getVolumeCM();
                int heuresTP = this.cours.get(i).getVolumeTP();
                int heuresTD = this.cours.get(i).getVolumeTD();
                int heuresTotalesEnTDUE = (int) (heuresCM * 1.5 + heuresTP * 0.75 + heuresTD);
                heuresPrevuesPourUE += heuresTotalesEnTDUE;
            }
        }
        return heuresPrevuesPourUE;
    }


    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) throws IllegalArgumentException{
        // TODO: Implémenter cette méthode fait
        if (volumeCM<0 || volumeTD<0 || volumeTP<0){
            throw new IllegalArgumentException("Un des volumes horaires  n'est pas valable (inférieur à 0)");
        }
        ServicePrevu sp= new ServicePrevu(ue, this, volumeCM, volumeTD, volumeTP);
        this.cours.add(sp);
        ue.getIntervenants().add(sp);
    }
    public boolean enSousService() {
        int heuresTotales = this.heuresPrevues();

        if(heuresTotales >= 192) {
            return false;
        }
        else {
            return true;
        }
    }

}


