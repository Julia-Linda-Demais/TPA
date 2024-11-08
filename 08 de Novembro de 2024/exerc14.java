import java.util.Scanner;

public class exerc14 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int A[]= new int[10];
		int B[]= new int[10];
		int C[]= new int[10];
		int i;
	
		for (i = 0; i < A.length; i++) {
	     	System.out.println("Insira o "+ (i+1)+"° valor");
	 	    A[i]= ler.nextInt();
	     }
		for (i = 0; i < B.length; i++) {
	     	System.out.println("\nInsira o "+ (i+1)+"° valor do segundo vetor");
	 	    B[i]= ler.nextInt();
	     }
		
		for(i=0; i< A.length; i++) {
			if(A[i]< B[i]) {
				C[i]= -1;
			} else if (A[i]> B[i]) {
				C[i]= 1;
			} else {
				C[i]= 0;
			}
		}
		System.out.print("\nC = [");
        for (i = 0; i < C.length; i++) {
            System.out.print(C[i]);
            if (i < C.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Valor 1 maior que valor 2= 1 \nValor 1 menor que valor 2= -1 \nValor 1 igual a valor 2= 0");
        ler.close();
	}
}
