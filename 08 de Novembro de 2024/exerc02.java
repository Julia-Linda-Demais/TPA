import java.util.*;
public class exerc02 {
	   public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	  
	    int i = 0;
	    int n = 0;
	    int r;
	    final int TAM=5;
	    int a[]= new int[TAM];

	    for (i=0; i<TAM; i++) {
	      System.out.println("Insira o valor de 'a: ");
	      a[i] = input.nextInt();
	    }
	    
	    for (i=0; i<TAM; i++) {
	        System.out.println("Tabuada do número "+a[i]+": ");
	    }
	         for (n=1; n<10; n++){
	          r = a[i] * n;
	            System.out.println(a[i] + " x " + n + " = " + r);
	         }
	         input.close();
	}
	}
