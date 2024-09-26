package prova;
import java.util.Scanner;
public class peixe {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
       double peso, valor; 
       System.out.println("Insira o peso de seu peixe, obs:não adicione 'kg'");
       peso= ler.nextDouble();  
       if (peso<=3) {  
    	   valor= peso*25;
    	   System.out.println("Seu peixe custa R$"+valor);
       } else if (peso>3 && peso<=5) { 
    	   valor= peso*24;
    	   System.out.println("Seu peixe custa R$"+valor);
       } else if (peso>5 && peso<=10) {
    	   valor= peso*23;
    	   System.out.println("Seu peixe custa R$"+valor);
       } else {
    	   valor= peso*20;
    	   System.out.println("Seu peixe custa R$"+valor);
       }
       ler.close();
	}

}
