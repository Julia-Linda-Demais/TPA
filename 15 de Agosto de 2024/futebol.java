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
			System.out.println("Sua categoria � Dente de leite");
		break;
		case 7:
			System.out.println("Sua categoria � J�nior");
		break;
		case 8:
			System.out.println("Sua categoria � J�nior max");
		break;
		case 9:
			System.out.println("Sua categoria � J�nior master");
		break;
		case 10:
		    System.out.println("Sua categoria � Master");
		break;
		default:
			System.out.println("N�o temos categoria para sua idade.");
		}
     ler.close();
	}

}
