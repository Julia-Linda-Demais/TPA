import java.util.Scanner;
public class programaInss {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
        double salario, desc, sl, desc2, sl2;
        System.out.println("Insira o Valor de seu Sálario bruto");
        salario= ler.nextDouble();
        if (salario<2500) {
        	desc= salario* 0.09;
        	sl= salario-desc;
        	System.out.println("Seu salário líquido, após o desconto do INSS é:"+sl);
        } else {
        	desc2= salario* 0.11;
        	sl2= salario-desc2;
        	System.out.println("Seu salário líquido, após o desconto do INSS é:"+sl2);
        }
        ler.close();
	}	
	}


