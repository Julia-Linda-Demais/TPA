import java.util.Scanner;

public class exerc09 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int i, j, k, contadorC=0;
		int a[]= new int[10];
		int b[]= new int[10];
		int c[]= new int[10];
	for (i=0; i<10; i++) {
	    System.out.println("Insira o "+ (i+1)+" valor do vetor a");
	    a[i]= ler.nextInt();
	}
	for (j=0; j<10; j++) {
	    System.out.println("\nInsira o "+ (j+1)+" valor do vetor b");
	    b[j]= ler.nextInt();
	} 
	for (i = 0; i < a.length; i++) {
        for (j = 0; j < b.length; j++) {
            if (a[i] == b[j]) {
                int vezesEncontrado = 0;
                for (k = 0; k < contadorC; k++) {
                    if (c[k] == a[i]) {
                        vezesEncontrado++;
                    }
                }
                if (vezesEncontrado == 0) {
                    c[contadorC] = a[i];
                    contadorC++;
                }
                break;
            }
        }
    }

    System.out.println("Interseção de A e B:");
    if (contadorC > 0) {
        for (i = 0; i < contadorC; i++) {
            System.out.print(c[i] + " ");
        }
    } else {
        System.out.println("Não há valores em comum entre A e B");
    }
    ler.close();
}
	}		

