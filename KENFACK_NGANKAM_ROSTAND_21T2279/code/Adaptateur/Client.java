public class Client {  
    public static void main(String[] args) {  
        float c = 4; // Définir la longueur du côté  
        Carre carre = new AdapterRectangle(c); // Créer un carré  

        // Appeler les méthodes sans paramètres  
        System.out.println("Aire du carré : " + carre.aire()); // Affiche l'aire  
        System.out.println("Périmètre du carré : " + carre.perimetre()); // Affiche le périmètre  
    }  
}