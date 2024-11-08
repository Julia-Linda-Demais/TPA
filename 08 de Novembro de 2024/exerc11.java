import java.util.*;
public class exerc11 {

	public static void main(String[] args) {
	 Scanner ler= new Scanner(System.in);
	 int a[]= new int[10];
	 int vezesEncontrado=0, i, X;
	 for (i = 0; i < a.length; i++) {
     	System.out.println("Insira o "+ (i+1)+"° valor");
 	    a[i]= ler.nextInt();
     }
	 System.out.println("\nInsira o elemento que você procura");
	    X= ler.nextInt();
	 for (i=0; i< a.length; i++) {
		 if(X== a[i]) {
			 vezesEncontrado++;
		 }
	 }
	 if (vezesEncontrado>0) {
	 System.out.println("O elemento está armazenado "+vezesEncontrado+" vezes em nosso sistema");
	 } else {
		 System.out.println("O elemento não está armazenado em nosso sistema");
	 }
	 ler.close();
	}

}
