import java.util.Scanner;
public class parImpar {

	public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
    int n;
    System.out.println("Insira um número inteiro");
    n= ler.nextInt();
    if(n % 2==0) {
    	System.out.println ("seu número é par");
    } else {
    	System.out.println ("Seu número é ímpar");
    	}
    ler.close();
	}

}
