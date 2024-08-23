import java.util.Scanner;
public class rodizio {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int placa;
	System.out.println("insira o último número da sua placa");
	placa = in.nextInt();
	switch(placa) {
	   case 1:
	   case 2:
		   System.out.println("Segunda-feira");
       break;
	   case 3:
	   case 4:
		   System.out.println("Terça-feira");
	   break;   
	   case 5:
	   case 6:
		   System.out.println("Quarta-feira");
	   break;
	   case 7:
	   case 8:
		   System.out.println("Quinta-feira");
	   break;
	   case 9:
	   case 10:
		   System.out.println("Sexta-feira");
		   break;
		   default:
			   System.out.println("Número inválido");
	   
		   
		   
	}

	}

}
