package vetores;
import java.util.Scanner;
public class quadrado {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int i;
		int a[]= new int[10];
		int b[]= new int[10];
		for (i=0; i<10; i++) {
		System.out.println("Insira o "+(i+1)+" valor do vetor a");
		a[i]= ler.nextInt();
		b[i]= a[i]*a[i];
		}
		System.out.print("a[]= ");
		for (i=0; i<10; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.print("\n");
		
		System.out.print("b[]= ");
		for (i=0; i<10; i++) {
			System.out.print(b[i]+ " ");
		}
	}
}