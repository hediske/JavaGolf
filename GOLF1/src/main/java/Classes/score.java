package Classes;
public class score {
    private joueur joueur;
    private competition competition;
    private float score;

    public score() {
    }

    public score(joueur joueur, competition competition, float score) {
        this.joueur = joueur;
        this.competition = competition;
        this.score = score;
    }

    public joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(joueur joueur) {
        this.joueur = joueur;
    }

    public competition getCompetition() {
        return competition;
    }

    public void setCompetition(competition competition) {
        this.competition = competition;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    
    
}
