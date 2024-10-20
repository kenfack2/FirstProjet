public class Client {
    public static void main(String[] args) {
        // Créer un directeur
        Directeur directeur = new Directeur();

        // Tester la pizza Reine
        System.out.println("Création d'une Pizza Reine:");
        MonteurPizza monteurPizzaReine = directeur.getMonteur(Directeur.TYPE_PIZZA1);
        monteurPizzaReine.creerNouvellePizza();
        monteurPizzaReine.monterPate();
        monteurPizzaReine.monterSauce();
        monteurPizzaReine.monterGarniture();
        Pizza pizzaReine = monteurPizzaReine.getPizza();
        pizzaReine.print();

        // Tester la pizza Piquante
        System.out.println("\nCréation d'une Pizza Piquante:");
        MonteurPizza monteurPizzaPiquante = directeur.getMonteur(Directeur.TYPE_PIZZA2);
        monteurPizzaPiquante.creerNouvellePizza();
        monteurPizzaPiquante.monterPate();
        monteurPizzaPiquante.monterSauce();
        monteurPizzaPiquante.monterGarniture();
        Pizza pizzaPiquante = monteurPizzaPiquante.getPizza();
        pizzaPiquante.print();

        // Essayer de créer une pizza avec un type inconnu
        try {
            System.out.println("\nTentative de création d'une pizza avec un type inconnu:");
            MonteurPizza monteurInconnu = directeur.getMonteur(3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}