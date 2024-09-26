package exercicios;
import java.util.Scanner;
public class cantina {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int cod;
		System.out.println("Insira o código do produto");
		cod= ler.nextInt();
		switch(cod) {
		case 1:
			System.out.println("Cachorro-Quente R$8,00");
		break;
		case 2:
			System.out.println("CheeseBurguer R$12,00");
		break;
		case 3:
			System.out.println("X-Salada R$15,00");
		break;
		case 4:
			System.out.println("Misto quente R$11,00");
		break;
		default:
			if (cod==5) {
				System.out.println("Pão na chapa R$6,00");
			} else {
				System.out.println("Código inválido");
			}
		}
		ler.close();
	}
}
