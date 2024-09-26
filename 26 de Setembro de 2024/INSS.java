package exercicios;
import java.util.Scanner;
public class INSS {

	public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        double salario, inss, salarioliq;

	        System.out.println("Insira o valor do seu salário:");
	        salario = ler.nextDouble();

	        if (salario <= 1412) {
	            inss = salario * 0.075;
	        } else if (salario <= 2666.68) {
	            inss = salario * 0.09;
	        } else if (salario <= 4000.03) {
	            inss = salario * 0.12;
	        } else {
	            inss = salario * 0.14;
	        }

	        salarioliq = salario - inss;
	        System.out.printf("Seu salário líquido é: %.2f%n", salarioliq);

	        ler.close();
	    }
	}
