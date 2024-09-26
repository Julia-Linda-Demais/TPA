package exercicios;
import java.util.Scanner;

public class notass {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int alunos, mb, b, r, i, percMb, percB, percR, percI;
        System.out.println("Insira o total de alunos na turma:");
        alunos = ler.nextInt();
        System.out.println("Insira quantos alunos tiraram MB:");
        mb = ler.nextInt();
        System.out.println("Insira quantos alunos tiraram B:");
        b = ler.nextInt();
        System.out.println("Insira quantos alunos tiraram R:");
        r = ler.nextInt();
        System.out.println("Insira quantos alunos tiraram I:");
        i = ler.nextInt();
        percMb = (mb * 100) / alunos;
        percB = (b * 100) / alunos;
        percR = (r * 100) / alunos;
        percI = (i * 100) / alunos;
        ler.nextLine(); 
        System.out.println("Insira qual percentual de notas você quer ver. Ex: mb, b, r, i:");
        String notas = ler.nextLine().toLowerCase();
        switch (notas) {
            case "mb":
                System.out.println("Percentual de alunos com MB: " + percMb + "%");
                break;
            case "b":
                System.out.println("Percentual de alunos com B: " + percB + "%");
                break;
            case "r":
                System.out.println("Percentual de alunos com R: " + percR + "%");
                break;
            case "i":
                System.out.println("Percentual de alunos com I: " + percI + "%");
                break;
            default:
                System.out.println("Nota inválida.");
        }

        ler.close();
    }
}
