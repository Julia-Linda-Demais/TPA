import java.util.Scanner;
public class Combustivel {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
        int km, litros;
        double gasto;
        System.out.println("Insira quantos km você rodou");
	    km= ler.nextInt();
	    System.out.println("Insira a capacidade máxima em litros do seu tanque");
	    litros= ler.nextInt();
	    gasto= km/litros;
	    System.out.println("Seu gasto médio de combustível é "+ gasto);
	    if (gasto>10) {
	    	System.out.println("Seu carro é econômico");
	    } else {
	    	System.out.println("Seu carro não é econômico");
	    }
	    ler.close();
	}

}
