public class GestionRectangle {  
    public float longueuer;  
    public float largeur;  

    // Constructeur  
    public GestionRectangle(float L, float l) {  
        if (L > 0 && l > 0) { // Vérification dans le constructeur  
            this.largeur = l;  
            this.longueuer = L;  
        } else {  
            throw new IllegalArgumentException("Les valeurs fournies doivent être positives. Valeur fournie : " + L + " " + l);  
        }  
    }  

    // Méthode pour calculer le périmètre  
    public float Perimetre() {  
        return (this.longueuer + this.largeur) * 2; // Utilise les attributs de l'instance  
    }  

    // Méthode pour calculer l'aire  
    public float Aire() {  
        return this.longueuer * this.largeur; // Utilise les attributs de l'instance  
    }  
}