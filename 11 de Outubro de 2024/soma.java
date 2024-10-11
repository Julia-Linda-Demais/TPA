package vetores;
import java.util.Scanner;
public class soma {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int i;
		int a[]= new int[10];
		int b[]= new int[10];
		int c[]= new int[10];
       for (i=0; i<10; i++) {
    	   System.out.println("Insira o "+ (i+1)+" valor do vetor a");
    	   a[i]= ler.nextInt();
       }
       System.out.print("\n");
       for (i=0; i<10; i++) {
    	   System.out.println("Insira o "+ (i+1)+" valor do vetor b");
    	   b[i]= ler.nextInt();
    	   c[i]= a[i] + b[i];
       }
       System.out.print("\n");
       System.out.print("c[]= ");
       for (i=0; i<10; i++) {
    	   System.out.print(c[i]+" ");
       }
	}
}
