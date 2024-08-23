import java.util.Scanner;
public class salario {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double salario, desc, novoSalario;
		System.out.println("Insira o valor de seu salário");
		salario= ler.nextInt();
		if (salario>=1434.60 && salario<=2150) {
		     desc=(salario*7.5)/100-107.59;
		     novoSalario=salario-desc;
		     System.out.println("Seu salário líquido é de" + novoSalario);
		     System.out.println("Foi descontado de seu salário bruto R$" + desc);
		} else if (salario>=2150.01  && salario<=2866.70) {
			desc=(salario*15)/100-268.84;
			novoSalario=salario-desc;
			System.out.println("Seu salário líquido é de" + novoSalario);
		    System.out.println("Foi descontado de seu salário bruto R$" + desc);
		} else if (salario>=2866.71 || salario<=3582) {
			desc=(salario*22.5)/100-483.84;
			novoSalario=salario-desc;
			System.out.println("Seu salário líquido é de" + novoSalario);
		    System.out.println("Foi descontado de seu salário bruto R$" + desc);
		} else {
			desc=(salario*27.5)/100-662.94;
			novoSalario=salario-desc;
			System.out.println("Seu salário líquido é de" + novoSalario);
		    System.out.println("Foi descontado de seu salário bruto R$" + desc);
		}
		ler.close();
	}

}
