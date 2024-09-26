package lista1;
import java.util.Scanner;
public class quadrado {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int n1, n2, n3, quadrado1, quadrado2, quadrado3, soma;
		System.out.println("Insira o primeiro número");
		n1= ler.nextInt();
		System.out.println("Insira o Segundo número");
		n2= ler.nextInt();
		System.out.println("Insira o Terceiro número");
		n3= ler.nextInt();
		quadrado1= n1*n1;
		quadrado2= n2*n2;
		quadrado3= n3*n3;
		soma= quadrado1+ quadrado2+ quadrado3;
		System.out.println("A soma dos quadrados é: "+soma);
	}
	
}

