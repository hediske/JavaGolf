package Classes;

import java.util.Date;

public class entraineur extends employe{

    public entraineur(String id, String mdp, String nom, String prenom, Date date_de_naissance, String email, long cin,char sexe, float salaire) {
        super(id, mdp, nom, prenom, date_de_naissance, email, cin,sexe, salaire);
    }
    
    
    
}
