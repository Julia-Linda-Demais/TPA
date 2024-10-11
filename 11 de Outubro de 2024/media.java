package vetores;
import java.util.Scanner;
public class media {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int i, media=0;
		int a[]= new int[10];
		for (i=0; i<10; i++) {
		//lendo vetor a
		System.out.println("Insira o "+(i+1)+" o valor do vetor a");
		a[i]= ler.nextInt();
		//somando valores do vetor
		media= media + a[i];
		}
		//dividindo valores do vetor
		media= media/10;
		System.out.println("Sua média é: "+media );
	}

}
