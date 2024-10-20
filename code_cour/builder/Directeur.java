public class Directeur {
    public static final int TYPE_PIZZA1 = 1;
    public static final int TYPE_PIZZA2 = 2;

    public MonteurPizza getMonteur(int typePizza1){
        MonteurPizza monteurPizza = null;

        switch (typePizza1) {
            case TYPE_PIZZA1:
                
                monteurPizza = new MonteurPizzaReine();
                break;
        
            case TYPE_PIZZA2:
                monteurPizza = new MonteurPizzaPiquante();
                break;

            default:
                System.out.println("type de pizza inconnu");
        }
        return monteurPizza;
    }
}
