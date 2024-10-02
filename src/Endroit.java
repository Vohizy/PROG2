abstract class Endroit {
    private int identifiant;
    private String nom;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    abstract int immeuble(int etage);

    abstract int quartier(int immebl);
}
