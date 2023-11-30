package Classes;
import java.util.ArrayList;
import java.util.Date;

public class joueur extends membre{
    private char main_preferee;///g ou d
    private ArrayList<abonnement> abonnement_joueur = new ArrayList<>();

    
    public joueur() {
    }
    
    public joueur(String id, String mdp, String nom, String prenom, Date date_de_naissance, String email, long cin,char sexe,char main_preferee,String abonnement) {
        super(id, mdp, nom, prenom, date_de_naissance, email, cin,sexe);
        this.main_preferee=main_preferee;
        
    }

    public char getMain_preferee() {
        return main_preferee;
    }

    public void setMain_preferee(char main_preferee) {
        this.main_preferee = main_preferee;
    }

    public ArrayList<abonnement> getAbonnement_joueur() {
        return abonnement_joueur;
    }

    public void setAbonnement_joueur(ArrayList<abonnement> abonnement_joueur) {
        this.abonnement_joueur = abonnement_joueur;
    }

    @Override
    public String toString() {
        return "joueur{" + "main_preferee=" + main_preferee + ",abonnement_joueur=" + abonnement_joueur.toString() + '}';
    }
    
    public String view_abonnements() {
		return "abonnements=" + abonnement_joueur.toString();
	}
    
    public void ajouterAbonnement(abonnement a) {
	abonnement_joueur.add(a);
    }
    

    
}
