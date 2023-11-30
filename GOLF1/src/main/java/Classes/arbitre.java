package Classes;

import java.util.Date;

public class arbitre extends employe {
    private String grade;

    public arbitre() {
    }

    public arbitre(String id, String mdp, String nom, String prenom, Date date_de_naissance, String email, long cin,char sexe, float salaire,String grade) {
        super(id, mdp, nom, prenom, date_de_naissance, email, cin,sexe, salaire);
        this.grade=grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
    
}
