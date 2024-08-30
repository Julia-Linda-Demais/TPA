package exercicios_while;
import java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int i=1;
		int n, resultado;
		System.out.println("Insira um número para saber seus múltiplos");
        n= ler.nextInt();
        while (i<=10) {
        	resultado= n * i;
        	System.out.println(resultado);
        	i++;
        }
        ler.close();
	}

}
