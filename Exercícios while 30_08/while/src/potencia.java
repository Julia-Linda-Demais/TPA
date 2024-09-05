import java.util.Scanner;
public class potencia {
  public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
	int base, expoente, potencia=1, i=0;	
     System.out.println("Insira um número de base");
     base= ler.nextInt();
     System.out.println("Insira um número de expoente");
     expoente= ler.nextInt();
     while (i<expoente) {
    	potencia= base*potencia;
    	i++;
     }
     System.out.println(potencia);
     ler.close();
	}

}
