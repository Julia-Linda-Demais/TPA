import java.util.Scanner;
public class numerosFatorados {

	public static void main(String[] args) {
     Scanner ler= new Scanner(System.in);
     int n, n2;
     int i;
     int fatoraçao= 0;
      System.out.println("Insira um número");
       n= ler.nextInt();
       i=n-1;
       n2=n;
       while (n2>1) {
    	   fatoraçao=n*i;
    	   n2=n2-1;
       }
       System.out.println("A fatoração é " + fatoraçao);
       ler.close();
	}
	
}
