package exercicios;
import java.util.Scanner;
public class escolhiha_futebol {

	public static void main(String[] args){
	Scanner ler= new Scanner(System.in);
	int idade, anoNas;
	System.out.println("insira o ano de nascimento do usuário");
	anoNas= ler.nextInt();
	idade= 2024-anoNas;
	if (idade<=6) {
	   System.out.println("Dente de leite");
	} else {
		if (idade<=10) {
		 System.out.println("Infantil 1");
	} else {
		if (idade<=14) {
			System.out.println("infantil 2");
	} else {
		if (idade<=16) {
			System.out.println("juvenil 1");
		} else {
			if (idade==17) {
			System.out.println("juvenil 2");
			} else {
				if (idade>17) {
				System.out.println("Permissão não concedida");
				}
			ler.close();
				
			}
		}
			
		}
	}
		   
	   }
		   
			


	}

}
