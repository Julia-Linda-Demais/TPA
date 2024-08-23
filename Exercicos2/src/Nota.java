import java.util.Scanner;
public class Nota {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double nota1, nota2, media, novaMedia, notaExame;
		System.out.println("Insira sua primeira Nota");
		nota1= ler.nextDouble();
		System.out.println("Insira sua segunda nota");
		nota2=ler.nextDouble();
		media= (nota1+nota2)/2;
		if (media>=6) {
			System.out.println("Aprovado");
		} else if (media<=3){
			System.out.println("Reprovado");
		} else if (media>=3 && media<6) {
			System.out.println("Sua média foi baixa faça um novo exame para tentar aumentar"
		    + " sua média" + media);
			System.out.println("Insira a nota do exame");
			notaExame= ler.nextDouble();
			novaMedia= (media+notaExame)/2;
			if (novaMedia>=6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
		}
	} else {
		}
    ler.close();
}}
