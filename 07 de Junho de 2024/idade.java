import java.util.Scanner;
public class idade {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
        int idade, anoNasc, anoAtual;
        System.out.println("Insira o seu ano de nascimento");
        anoNasc= ler.nextInt();
        System.out.println("Insira o ano atual");
        anoAtual= ler.nextInt();
        idade= anoAtual- anoNasc;
        System.out.println("Sua idade é "+ idade);
        if (idade<=10) {
        	System.out.println("Você é criança");
        } else if (idade<18) {
        	System.out.println("Você é adolescente");
        } else if ((idade >= 18) && (idade<=60)) {
        	System.out.println("Você é adulto");
        } else {
        	System.out.println("Você é idoso");
        }
        ler.close();
	}
     
}
