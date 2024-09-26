import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double salario, dividas, resto;
		System.out.println("Insira seu salário atual");
		salario= ler.nextDouble();
		System.out.println("Insira o valor das suas dívidas");
		dividas= ler.nextDouble();
		resto= salario-dividas;
		if(resto<0) {
			System.out.println("Você ainda deverá R$"+resto);
		} else {
			System.out.println("Restam R$"+resto);
		}
		 ler.close();
	}
	
}
