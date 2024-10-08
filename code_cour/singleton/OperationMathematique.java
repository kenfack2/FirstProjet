 public final class OperationMathematique {
    private static OperationMathematique instance = null; 
    private int x; 
    private int y;
    private int z;

    private OperationMathematique(){ 
        super(); } 

    private OperationMathematique(int x, int y){ 
        this.x=x; 
        this.y=y;  }
    private OperationMathematique(int x, int y, int z){
        this.x=x;
        this.y=y;       
        this.z=z;

    }

    public static OperationMathematique getInstance() { 
         if (instance == null)  { 
             instance = new OperationMathematique();  }
        return instance; }

    public static OperationMathematique getInstance(int x, int y)  { 
         if (instance == null){
            instance = new OperationMathematique(x, y);  } 
         return instance;} 

    public static OperationMathematique getInstance(int x, int y, int z)  { 
         if (instance == null){
            instance = new OperationMathematique(x, y, z);  } 
         return instance;} 

    public int somme(int x, int y){
         return x+y;  } 
         
    public float moyenne(int x, int y){ 
        return somme(x, y)/2; } 

    public int somme(int x, int y, int z){
        return x+y+z;  } 
         
    public float moyenne(int x, int y, int z){ 
        return somme(x, y, z)/3; }
        
    public void affiche() {
        System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " + this.y); 
    }

    @Override 
    public Object clone() throws CloneNotSupportedException { 
    throw new CloneNotSupportedException(); } 
    }