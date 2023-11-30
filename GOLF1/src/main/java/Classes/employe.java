
package Classes;

import java.util.Date;


public class employe extends membre{
    private float salaire;

    public employe() {
    }

    public employe(String id, String mdp, String nom, String prenom, Date date_de_naissance, String email, long cin,char sexe,float salaire) {
        super(id, mdp, nom, prenom, date_de_naissance, email, cin,sexe);
        this.salaire=salaire;
    }
    

   
    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
    
    
}

