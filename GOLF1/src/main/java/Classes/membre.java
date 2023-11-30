
package Classes;
import java.util.*;

public class membre {
    private String id;
    private String mdp;
    private String nom;
    private String prenom;
    private Date date_de_naissance;
    private String email;
    private long cin;  
    private char sexe;
    
    public membre() {
    }

    
    
    public membre(String id, String mdp, String nom, String prenom, Date date_de_naissance, String email, long cin,char sexe) {
        this.id = id;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.email = email;
        this.cin = cin;
        this.sexe=sexe;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "membre{" + "id=" + id + ", mdp=" + mdp + ", nom=" + nom + ", prenom=" + prenom + ", date_de_naissance=" + date_de_naissance + ", email=" + email + ", cin=" + cin + '}';
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }
        
    
}
