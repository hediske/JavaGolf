package Classes;
public class terrain {
    private int id_terrain;
    private int nb_trous;
    private float espace;
    private String nom;

    public terrain(int id_terrain, int nb_trous, float espace, String nom) {
        this.id_terrain = id_terrain;
        this.nb_trous = nb_trous;
        this.espace = espace;
        this.nom = nom;
    }

    
    public int getId_terrain() {
        return id_terrain;
    }

    public void setId_terrain(int id_terrain) {
        this.id_terrain = id_terrain;
    }

    public int getNb_trous() {
        return nb_trous;
    }

    public void setNb_trous(int nb_trous) {
        this.nb_trous = nb_trous;
    }

    public float getEspace() {
        return espace;
    }

    public void setEspace(float espace) {
        this.espace = espace;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
    
    
}

