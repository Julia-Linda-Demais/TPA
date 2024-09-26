package lista1;
import java.util.Scanner;
public class antecessor {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int n, antecessor, sucessor;
		System.out.println("Insira um número");
		n= ler.nextInt();
		System.out.println("Insira um número");
		antecessor= n-1;
		sucessor= n+1;
		System.out.println("O antecessor do seu número é: " +antecessor+ " E o Sucessor é: "+sucessor);

	}

}
