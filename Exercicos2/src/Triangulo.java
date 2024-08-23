import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
       int a, b, c;
       System.out.println("Insira a primeira medida do lado de seu triângulo");
       a= ler.nextInt();
       System.out.println("Insira a segunda medida do lado de seu triângulo");
       b= ler.nextInt();
       System.out.println("Insira a terceira medida do lado de seu triângulo");
       c= ler.nextInt();
       if (a>b+c || b>a+c || c>b+a) {
    	   System.out.println("Não se caracteriza como triângulo");
       } else if (a==b && b==c) {
    	   System.out.println("Seu triângulo é equilátero");  
       } else if (a!=b && b!=c && a!=c) {
    	   System.out.println("Seu triângulo é Escaleno");
       } else {
    	   System.out.println("Seu triângulo é isósceles");
       }
       ler.close();
	}

}
