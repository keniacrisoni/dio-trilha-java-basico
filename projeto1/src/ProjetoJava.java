import java.util.Scanner;

public class ProjetoJava {
    public static void main(String[] args) {
    
        try (Scanner sc = new Scanner(System.in)) {
            int A, B, PROD;           
                  
             //System.out.println("Digite o valor A:");
             A = 3;
             //System.out.println("Diogiteo valor B: ");
             B = 9;

             PROD = A * B;
        
            System.out.println("O produto é : " + PROD);
        }    
        
    }
}
