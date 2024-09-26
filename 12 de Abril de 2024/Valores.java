import java.util.Scanner;
public class Valores {
public static void main (String args[]) { 
	Scanner ler = new Scanner (System.in);
	int a, b, c;
	System.out.println("Digite o primeiro valor");
	a = ler.nextInt();
	System.out.println("Digite o segundo valor");
	b = ler.nextInt();
	c= a;
	a= b;
	b= c;
	System.out.println("seu primeiro valor invertido é:"+a);
	System.out.println("seu segundo valor invertido é:"+b);
	
	
	
 }	
}
