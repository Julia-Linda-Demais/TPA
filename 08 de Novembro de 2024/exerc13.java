import java.util.*;

public class exerc13 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int A[]= new int[10];
		int B[]= new int[10];
		int i;
	
		for (i = 0; i < A.length; i++) {
	     	System.out.println("Insira o "+ (i+1)+"° valor");
	 	    A[i]= ler.nextInt();
	     }
		for(i=0; i<10; i++) {
			if(A[i] % 2 == 0) {
				B[i]= 1;
			} else {
				B[i]= 0;
			}
		}
		System.out.print("\nB = [");
        for (i = 0; i < B.length; i++) {
            System.out.print(B[i]);
            if (i < B.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Par= 1 e Ímpar=0");
		ler.close();
	}
}
