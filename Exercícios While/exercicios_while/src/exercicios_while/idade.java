package exercicios_while;
import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		  int anoNasc, anoAtual, idade;
		  int i=0;
		  while(i<=6) {
             System.out.println("Insira seu ano de nascimento");
             anoNasc= ler.nextInt();
             System.out.println("Insira o ano atual");
             anoAtual= ler.nextInt();
             idade= anoAtual-anoNasc;
             if (idade<18) {
            	 System.out.println("Você é menor de idade");
             } else {
            	 System.out.println("Você é maior de idade");
             }
             i++;
		  }
	}
}
