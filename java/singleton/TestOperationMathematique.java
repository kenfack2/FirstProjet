 public class TestOperationMathematique {
    public static void main(String[] args) {
        int som = OperationMathematique.getInstance().somme(2, 5);
        System.out.printf("la somme est %d",som);
        OperationMathematique O1 = OperationMathematique.getInstance(8, 3); 
        O1.affiche();
        OperationMathematique O2 = OperationMathematique.getInstance(5, 9);
        O2.affiche();
    }
} 