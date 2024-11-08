import java.util.*;
public class exerc10 {

	public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
        
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[20];
        int contadorC = 0, i, j, count; 
        
        for (i = 0; i < A.length; i++) {
        	System.out.println("Insira o "+ (i+1)+" valor do vetor A");
    	    A[i]= ler.nextInt();
        }
        for (i = 0; i < B.length; i++) {
        	System.out.println("\nInsira o "+ (i+1)+" valor do vetor B");
            B[i] = ler.nextInt();
        }
        for (i = 0; i < A.length; i++) {
            count = 0;
            for (j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                C[contadorC] = A[i];
                contadorC++;
            }
        }

        for (i = 0; i < B.length; i++) {
            count = 0;
            for (j = 0; j < A.length; j++) {
                if (B[i] == A[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                C[contadorC] = B[i];
                contadorC++;
            }
        }
        System.out.println("A diferença entre A e B é: ");
        if (contadorC > 0) {
            for (i = 0; i < contadorC; i++) {
                System.out.print(C[i] + " ");
            }
        } else {
            System.out.println("Não há elementos exclusivos entre os conjuntos.");
        }

        ler.close();
    }
}
