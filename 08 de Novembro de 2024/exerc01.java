import java.util.*;
public class exerc01 {
	//Parte 1 ao 7, Agatha
	  public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	      
	    int i = 0;
	      
	    final int TAM=10;
	    int a[] = new int [TAM];
	    int b[] = new int [TAM];

	    
	    for (i=0; i<TAM; i++){
	      System.out.print("Digite os valores de A: ");
	      a[i] = input.nextInt();
	    }
	    for(i=0; i<TAM; i++) {
			if(a[i] % 2 == 0) {
				b[i]= a[i];
			} else {
				a[i]= a[i];
			}
		}
	      
	    System.out.print("\nA = [");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

	   
	    System.out.print("\nB = [");
        for (i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i < b.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        input.close();
	  }
	}
