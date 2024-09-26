package lista1;

import java.util.Scanner;

public class ipva {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double ipva, veiculo;
		System.out.println("Insira o valor de seu veículo");
		veiculo= ler.nextInt();
		ipva= veiculo* 0.04;
		System.out.println("O valor de seu IPVA será: "+ ipva);
	
	}

}
