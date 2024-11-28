public abstract class Composant {
    protected String nom;
    protected String type;

    public Composant(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public abstract String decrire();

}
