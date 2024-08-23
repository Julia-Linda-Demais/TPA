import java.util.Scanner;
public class bissexto {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
        int an;
        System.out.println("Insira seu ano de nascimento");
        an= ler.nextInt();
        if (an % 4==0) {
        	System.out.println("O ano em que você nasceu é bissexto");
        } else {
        	System.out.println("O ano em que você nasceu não é Bissexto");
        }
        ler.close();
	}

}
