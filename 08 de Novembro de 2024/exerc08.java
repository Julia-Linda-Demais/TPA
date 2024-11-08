import java.util.Scanner;
public class exerc08 {
    //Somatória
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int i, j=0, soma=0;
		int a[]= new int[10];
		int b[]= new int[10];
	for (i=0; i<10; i++) {
	    System.out.println("Insira o "+ (i+1)+" valor do vetor a");
	    a[i]= ler.nextInt();
	} 
	for (i = 0; i < a.length; i++) {
		 soma= 0;
		for (j = i; j < a.length; j++) {
             soma = soma+ a[j];
         }
		 b[i] = soma;
	} 
	System.out.println("A somatória dos vetores a e b é:");
	for (i = 0; i < a.length; i++) {
        System.out.println("a[" + i + "] = " + a[i] + " -> b[" + i + "] = " + b[i]);
    }
	ler.close();
	}
}