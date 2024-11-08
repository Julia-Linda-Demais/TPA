import java.util.*;
public class exerc12 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
       int A[]=new int [10];
       int i;
		for (i = 0; i < A.length; i++) {
	     	System.out.println("Insira o "+ (i+1)+"° valor");
	 	    A[i]= ler.nextInt();
	     }
		if(A[0] == A[9] && A[1] == A[8] && A[2] == A[7] && A[3] == A[6] && A[4] == A[5]) {
			System.out.println("Seu cojunto de números é políndromo");
		} else {
			System.out.println("Seu cojunto de números não é políndromo");
		} 
		ler.close();
	}

}
