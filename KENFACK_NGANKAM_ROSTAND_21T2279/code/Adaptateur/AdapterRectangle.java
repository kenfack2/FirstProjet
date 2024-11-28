public class AdapterRectangle implements Carre {
    private float side;
    private GestionRectangle rectangle;

    public AdapterRectangle(float side) {
        if (side > 0) {
            this.side = side;
            this.rectangle = new GestionRectangle(side, side); // Créer l'instance du rectangle ici  
        } else {
            throw new IllegalArgumentException("La valeur doit être positive. Valeur fournie : " + side);  
        }
    }

    @Override
    public float perimetre() {
        return rectangle.Perimetre(); // Pas besoin de paramètre  
    }

    @Override
    public float aire() {
        return rectangle.Aire(); // Pas besoin de paramètre  
    }

    // Optionnel : une méthode pour obtenir la valeur du côté  
    public float getSide() {
        return side;
    }

}