package exercicios;
import java.util.Scanner;
public class futebol {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int idade;
		System.out.println("Insira sua idade");
		idade= ler.nextInt();
		switch(idade) {
		case 6:
			System.out.println("Sua categoria é Dente de leite");
		break;
		case 7:
			System.out.println("Sua categoria é Júnior");
		break;
		case 8:
			System.out.println("Sua categoria é Júnior max");
		break;
		case 9:
			System.out.println("Sua categoria é Júnior master");
		break;
		case 10:
		    System.out.println("Sua categoria é Master");
		break;
		default:
			System.out.println("Não temos categoria para sua idade.");
		}
     ler.close();
	}

}
