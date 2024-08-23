import java.util.Scanner;
public class multiplo {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int n;
		System.out.println("Insira um número inteiro");
		n= ler.nextInt();
		if (n%10==0) {
			System.out.println("Seu número é múltiplo de 10");
		} else {
			System.out.println("Seu número não é múltiplo de 10");
		}
      ler.close();
	}

}
