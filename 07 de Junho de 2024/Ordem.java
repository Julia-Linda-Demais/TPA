import java.util.Scanner;
public class Ordem {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira um número inteiro");
		a= ler.nextInt();
		System.out.println("Insira mais um número inteiro");
		b= ler.nextInt();
		System.out.println("Insira outro número inteiro");
		c= ler.nextInt();
		if (a<b && b<c) {
			System.out.println("Os Números em ordem crescente são:"+a);
			System.out.println(""+b);
			System.out.println(""+c);
		} else if (a<c && c<b) {
			System.out.println("Os Números em ordem crescente são:"+a);
			System.out.println(""+c);
			System.out.println(""+b);
		} else if (c<a && a<b) {
			System.out.println("Os Números em ordem crescente são:"+c);
			System.out.println(""+a);
			System.out.println(""+b);
		} else if (b<a && a<c) {
			System.out.println("Os Números em ordem crescente são:"+b);
			System.out.println(""+a);
			System.out.println(""+c);
		} else if (b<c && c<a) {
			System.out.println("Os Números em ordem crescente são:"+b);
			System.out.println(""+c);
			System.out.println(""+a);
		} else {
			System.out.println("Os Números em ordem crescente são:"+c);
			System.out.println(""+b);
			System.out.println(""+a);
		}
         ler.close(); 
	}

}
