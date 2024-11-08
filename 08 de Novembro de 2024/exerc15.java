import java.util.Scanner;

public class exerc15 {
  //Crescente e Descrescete
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int A[]= new int[10];
		int B[]= new int[10];
		int C[]= new int[10];
		int i, j;
		for (i = 0; i < A.length; i++) {
	     	System.out.println("Insira o "+ (i+1)+"° valor");
	 	    A[i]= ler.nextInt();
	     }
		 for (i = 0; i < A.length; i++) {
	            B[i] = A[i];
	            C[i] = A[i];
	     }
		 for (i = 0; i < B.length - 1; i++) {
	        for (j = i + 1; j < B.length; j++) {
	           if (B[i] > B[j]) {
	              B[i] = B[i] + B[j];
	              B[j] = B[i] - B[j]; 
	              B[i] = B[i] - B[j]; 
	           }
	        }
	   }
		 for (i = 0; i < B.length; i++) {
		       C[i] = B[B.length - 1 - i];
		     }
		 
		 System.out.print("\nB = [");
	        for (i = 0; i < B.length; i++) {
	            System.out.print(B[i]);
	            if (i < B.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	        
	        System.out.print("\nC = [");
	        for (i = 0; i < C.length; i++) {
	            System.out.print(C[i]);
	            if (i < C.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
		 ler.close();
	}
}
