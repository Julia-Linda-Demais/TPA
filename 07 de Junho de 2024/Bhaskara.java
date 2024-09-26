import java.util.Scanner;
public class Bhaskara {

	public static void main(String[] args) {
			Scanner ler= new Scanner(System.in);
		double	delta, a, b, c, raiz, raiz1,raiz2;
		System.out.println("Insira o valor de A");
		a= ler.nextDouble();
		System.out.println("Insira o valor de B");
		b= ler.nextDouble();
		System.out.println("Insira o valor de C");
		c= ler.nextDouble();
		delta= (b * b)-4*(a * c);
		if (delta<0) {
			System.out.println("A raíz da sua equação é inexistente");
		} else if (delta==0) {
			raiz=(-b-Math.sqrt(delta))/2*a;
			System.out.println("Sua equação só contém uma ráiz:"+ raiz);
		} else {
			raiz1=(-b+Math.sqrt(delta))/2*a;
			raiz2=(-b-Math.sqrt(delta))/2*a;
			System.out.println("As raízes de sua equação são:"+raiz1);
			System.out.println(""+raiz2);
		}
			ler.close();
	}

}
