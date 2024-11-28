public class FichierBase extends Composant {

    public FichierBase(String nom, String type) {
        super(nom, type);
    }

    @Override
    public String decrire() {
        return "Fichier - Nom: " + nom + ", Type: " + type;
    }

}
