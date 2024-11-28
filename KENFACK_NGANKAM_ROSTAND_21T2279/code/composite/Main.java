public class Main {
    public static void main(String[] args) {
        // Création de dossiers et fichiers
        DossierComposite dossierPrincipal = new DossierComposite("MonDossier");

        FichierBase fichier1 = new FichierBase("document1.txt", "txt");
        FichierBase fichier2 = new FichierBase("image1.pdf", "pdf");
        DossierComposite sousDossier = new DossierComposite("SousDossier");

        // Ajouter des fichiers et des sous-dossiers
        sousDossier.ajouter(fichier1);
        dossierPrincipal.ajouter(sousDossier);
        dossierPrincipal.ajouter(fichier2);

        // Afficher la description du dossier principal
        System.out.println(dossierPrincipal.decrire());
    }
}
