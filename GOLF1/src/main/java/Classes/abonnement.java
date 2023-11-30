package Classes;
import java.util.*;
public class abonnement {
    private float prix;
    private String type;
    private Date date_deb ;
    private Date date_fin ;

    public abonnement() {
    }

    
    public abonnement(float prix, String type, Date date_deb, Date date_fin) {
        this.prix = prix;
        this.type = type;
        this.date_deb = date_deb;
        this.date_fin = date_fin;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate_deb() {
        return date_deb;
    }

    public void setDate_deb(Date date_deb) {
        this.date_deb = date_deb;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    @Override
    public String toString() {
        return "abonnement{" + "prix=" + prix + ", type=" + type + ", date_deb=" + date_deb + ", date_fin=" + date_fin + '}';
    }
    
    
}

