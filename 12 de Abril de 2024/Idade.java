import java.util.Scanner;
public class Idade {
public static void main (String args[]){
	Scanner ler = new Scanner(System.in);
	int nascimento, atualAno, idade;
	System.out.println("digite seu ano de nascimento");
	nascimento=ler.nextInt();
	
	System.out.println("digite o ano atual");
	atualAno=ler.nextInt();
	idade= atualAno-nascimento;
	System.out.println("a sua idade é:"+idade);
	
	
	
	
	}
}
