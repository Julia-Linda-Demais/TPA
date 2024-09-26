
public class ProgramaTabuada {

	public static void main(String[] args) {
		int n = 1, resultado, i;
		while (n <= 10) {
			i = 1;
			while (i <= 10) {
				resultado = n * i;
				System.out.println("Tabuada do " + n + ": " + n + " x " + i + " = " + resultado);
				i++;
			}
			n++;
		}
	}
}

