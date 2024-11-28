import java.util.ArrayList;
import java.util.List;

public class DossierComposite extends Composant {
    private List<Composant> composants;

    public DossierComposite(String nom) {
        super(nom, "Dossier");
        this.composants = new ArrayList<>();
    }

    @Override
    public String decrire() {
        StringBuilder description = new StringBuilder("Dossier - Nom: " + nom + "\nContenu:\n");
        for (Composant composant : composants) {
            description.append("  ").append(composant.decrire()).append("\n");
        }
        return description.toString();
    }

    public void ajouter(Composant composant) {
        composants.add(composant);
    }

    public void supprimer(Composant composant) {
        composants.remove(composant);
    }

    public Composant obtenir(int index) {
        return composants.get(index);
    }
}
