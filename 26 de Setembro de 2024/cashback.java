package exercicios;
import java.util.Scanner;
public class cashback {

	public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
	double compra, cashback;
	System.out.println("insira o valor da compra");
	 compra= ler.nextDouble();
	  if (compra<=100) {
		  cashback=compra*0.05;
		  System.out.println("Seu cashback é de R$" +cashback);
	  } else {
			 if ((compra>=101) || (compra<=1000)) {
				 cashback=compra*0.08;
				 System.out.println("Seu cashback é de R$" +cashback);
			 } else {
				 if ((compra>=1001) || (compra<=2000)) {
				  cashback=compra*0.10;
				  System.out.println ("Seu cashback é de R$"+cashback);
				 } else {
					 if ((compra>=2001) || (compra<=5000)){
						 cashback=compra*0.125;
						 System.out.println ("Seu cashback é de R$"+cashback);
					 } else {
						 cashback=compra*0.15;
						 System.out.println ("Seu cashback é de R$"+cashback);
					 }
				ler.close();
				 }
		  }
				  
	  }

	}

}
