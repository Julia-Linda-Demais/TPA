package lista1;
import java.util.Scanner;
public class quilometros {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
         int quilometro, metros;
         System.out.println("Insira os metros");
         metros= ler.nextInt();
         quilometro= metros/100;
         System.out.println(quilometro+ "m");
	}
 
}
